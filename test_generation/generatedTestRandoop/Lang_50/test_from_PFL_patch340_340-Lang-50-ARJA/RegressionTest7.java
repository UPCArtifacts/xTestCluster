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
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone9, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.lang.String str13 = fastDateFormat11.getPattern();
        int int14 = fastDateFormat11.getMaxLengthEstimate();
        boolean boolean15 = fastDateFormat11.getTimeZoneOverridesCalendar();
        java.util.Locale locale16 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone7, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(14, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "M/d/yy" + "'", str13, "M/d/yy");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone14, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int25 = fastDateFormat24.getMaxLengthEstimate();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone26, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone14, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone7, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale33);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", locale38);
        java.lang.Object obj40 = fastDateFormat39.clone();
        java.lang.String str41 = fastDateFormat39.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "h:mm:ss a z" + "'", str41, "h:mm:ss a z");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone6, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone6);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(0L, stringBuffer20);
        java.util.TimeZone timeZone22 = fastDateFormat18.getTimeZone();
        java.lang.String str23 = fastDateFormat18.toString();
        java.lang.StringBuffer stringBuffer25 = null;
        java.lang.StringBuffer stringBuffer26 = fastDateFormat18.format((long) ' ', stringBuffer25);
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat18.format((long) 3, stringBuffer28);
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
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FastDateFormat[]" + "'", str23, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer26);
        org.junit.Assert.assertNull(stringBuffer29);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone23, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone7);
        java.util.Calendar calendar32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = fastDateFormat31.format(calendar32);
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
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(14, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MMMM d, yyyy" + "'", str3, "MMMM d, yyyy");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(100L, stringBuffer4);
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(calendar7, stringBuffer8);
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat2.format(calendar10, stringBuffer11);
        int int13 = fastDateFormat2.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FastDateFormat[]" + "'", str6, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.lang.String str6 = fastDateFormat4.getPattern();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat4.format((long) (byte) -1, stringBuffer9);
        boolean boolean11 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.lang.String str12 = fastDateFormat4.toString();
        int int13 = fastDateFormat4.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FastDateFormat[]" + "'", str12, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone7, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        java.lang.String str11 = fastDateFormat9.getPattern();
        int int12 = fastDateFormat9.getMaxLengthEstimate();
        boolean boolean13 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.Locale locale14 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone5, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0);
        java.lang.String str21 = fastDateFormat19.format((long) (short) 10);
        java.util.Locale locale22 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone5, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone34, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone34, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone50, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone34, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone34);
        boolean boolean70 = fastDateFormat24.equals((java.lang.Object) fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "M/d/yy" + "'", str11, "M/d/yy");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "January 1, 1970 1:00:00 AM CET" + "'", str21, "January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
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
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
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
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
// flaky:         org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.String str7 = fastDateFormat5.getPattern();
        boolean boolean8 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat1.format(calendar9);
        int int11 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str13 = fastDateFormat1.format((long) 100);
        java.util.TimeZone timeZone14 = fastDateFormat1.getTimeZone();
        java.util.Calendar calendar15 = null;
        java.lang.String str16 = fastDateFormat1.format(calendar15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone22, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone22, locale32);
        boolean boolean34 = fastDateFormat33.getTimeZoneOverridesCalendar();
        java.lang.String str36 = fastDateFormat33.format((long) '4');
        java.lang.String str37 = fastDateFormat33.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone42, locale47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        boolean boolean50 = fastDateFormat33.equals((java.lang.Object) locale49);
        java.lang.String str52 = fastDateFormat33.format((long) 33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = fastDateFormat1.format((java.lang.Object) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6, "MMMM d, yyyy h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str7, "MMMM d, yyyy h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
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
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1:00:00 AM CET" + "'", str36, "1:00:00 AM CET");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "h:mm:ss a z" + "'", str37, "h:mm:ss a z");
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
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1:00:00 AM CET" + "'", str52, "1:00:00 AM CET");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.lang.String str20 = fastDateFormat17.format((long) '4');
        java.lang.String str21 = fastDateFormat17.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone26, locale31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        boolean boolean34 = fastDateFormat17.equals((java.lang.Object) locale33);
        java.util.Locale locale35 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale35);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1:00:00 AM CET" + "'", str20, "1:00:00 AM CET");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h:mm:ss a z" + "'", str21, "h:mm:ss a z");
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
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale12);
        java.lang.String str15 = fastDateFormat13.format((long) 31);
        java.lang.String str16 = fastDateFormat13.toString();
        boolean boolean17 = fastDateFormat4.equals((java.lang.Object) fastDateFormat13);
        int int18 = fastDateFormat13.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "January 1, 1970 1:00:00 AM CET" + "'", str15, "January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z]" + "'", str16, "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale8);
        java.lang.String str12 = fastDateFormat10.format((long) (byte) 100);
        java.lang.String str13 = fastDateFormat10.toString();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance();
        boolean boolean15 = fastDateFormat14.getTimeZoneOverridesCalendar();
        java.lang.Object obj16 = fastDateFormat14.clone();
        boolean boolean17 = fastDateFormat10.equals(obj16);
        java.util.TimeZone timeZone18 = fastDateFormat10.getTimeZone();
        java.util.Locale locale19 = fastDateFormat10.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[]" + "'", str13, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone4, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale7);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.lang.String str6 = fastDateFormat4.getPattern();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat4.format((long) (short) -1, stringBuffer8);
        java.lang.String str11 = fastDateFormat4.format((long) (byte) 100);
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = fastDateFormat4.format(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone13, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone29, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone13, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.util.TimeZone timeZone43 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone43, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0, timeZone13, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 1, timeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(39, timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
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
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(50, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 2, timeZone20, locale33);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        java.util.Locale locale51 = fastDateFormat49.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone46, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone41, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone36, locale51);
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, timeZone36, locale57);
        boolean boolean59 = fastDateFormat58.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone60 = fastDateFormat58.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a", timeZone60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone60, locale70);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(100, timeZone7, locale70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
// flaky:         org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
// flaky:         org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
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
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone5, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone5, locale31);
        java.lang.StringBuffer stringBuffer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = fastDateFormat32.format((long) (byte) 10, stringBuffer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
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
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone11, locale19);
        java.lang.String str22 = fastDateFormat20.format((long) 21);
        java.util.Locale locale23 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = fastDateFormat28.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone26, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MMMM d, yyyy" + "'", str5, "MMMM d, yyyy");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "January 1, 1970" + "'", str22, "January 1, 1970");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone5, locale6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
        java.util.Locale locale9 = fastDateFormat7.getLocale();
        java.util.Locale locale10 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(21, (-1), locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
        java.util.TimeZone timeZone9 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone16, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int27 = fastDateFormat26.getMaxLengthEstimate();
        java.util.TimeZone timeZone28 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone28, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone16, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone9, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone49);
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone44, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone58 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone58, locale59);
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        java.util.Locale locale62 = fastDateFormat60.getLocale();
        boolean boolean63 = fastDateFormat56.equals((java.lang.Object) locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone54, locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone70);
        java.util.Locale locale72 = fastDateFormat71.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale72);
        boolean boolean74 = fastDateFormat64.equals((java.lang.Object) locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone9, locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone79 = fastDateFormat78.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone79);
        java.util.Locale locale81 = fastDateFormat80.getLocale();
        java.util.Locale locale82 = fastDateFormat80.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9, locale82);
        java.util.Locale locale84 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone9, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone9);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(timeZone79);
// flaky:         org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        boolean boolean2 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str4 = fastDateFormat1.format((long) 21);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format(calendar6, stringBuffer7);
        java.util.Locale locale9 = fastDateFormat1.getLocale();
        java.lang.String str10 = fastDateFormat1.toString();
        java.util.Date date11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = fastDateFormat1.format(date11, stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[]" + "'", str10, "FastDateFormat[]");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int24 = fastDateFormat23.getMaxLengthEstimate();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone13, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone6, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone6);
        java.lang.String str37 = fastDateFormat36.toString();
        java.lang.String str38 = fastDateFormat36.toString();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
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
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str37, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str38, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8, locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(6, 0, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
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
        org.junit.Assert.assertNotNull(fastDateFormat31);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone6);
        int int19 = fastDateFormat18.getMaxLengthEstimate();
        int int20 = fastDateFormat18.getMaxLengthEstimate();
        java.util.TimeZone timeZone21 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale30);
        java.lang.String str34 = fastDateFormat32.format((long) (byte) 100);
        java.lang.String str35 = fastDateFormat32.toString();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance();
        boolean boolean37 = fastDateFormat36.getTimeZoneOverridesCalendar();
        java.lang.Object obj38 = fastDateFormat36.clone();
        boolean boolean39 = fastDateFormat32.equals(obj38);
        boolean boolean40 = fastDateFormat18.equals((java.lang.Object) fastDateFormat32);
        java.util.Calendar calendar41 = null;
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat32.format(calendar41, stringBuffer42);
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
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 18 + "'", int19 == 18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "FastDateFormat[]" + "'", str35, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
// flaky:         org.junit.Assert.assertEquals(obj38.toString(), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(stringBuffer43);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int16 = fastDateFormat15.getMaxLengthEstimate();
        java.util.TimeZone timeZone17 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int35 = fastDateFormat34.getMaxLengthEstimate();
        java.util.TimeZone timeZone36 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone36, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone24, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone17, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale43);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone6, locale48);
        java.lang.Object obj51 = fastDateFormat50.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        java.lang.String str56 = fastDateFormat54.format((-1L));
        java.lang.String str58 = fastDateFormat54.format((long) 'a');
        boolean boolean59 = fastDateFormat50.equals((java.lang.Object) fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
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
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
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
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "FastDateFormat[h:mm:ss a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "FastDateFormat[h:mm:ss a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "FastDateFormat[h:mm:ss a]");
        org.junit.Assert.assertNotNull(fastDateFormat54);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Thursday, January 1, 1970 12:59:59 AM CET" + "'", str56, "Thursday, January 1, 1970 12:59:59 AM CET");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str58, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int24 = fastDateFormat23.getMaxLengthEstimate();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone13, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone6, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone6);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        boolean boolean38 = fastDateFormat36.getTimeZoneOverridesCalendar();
        int int39 = fastDateFormat36.getMaxLengthEstimate();
        java.util.Date date40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = fastDateFormat36.format(date40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
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
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone14);
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone19, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone14, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        int int38 = fastDateFormat35.getMaxLengthEstimate();
        java.util.Locale locale39 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 0, timeZone8, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        java.lang.Object obj45 = fastDateFormat42.clone();
        java.lang.Object obj46 = null;
        boolean boolean47 = fastDateFormat42.equals(obj46);
        boolean boolean48 = fastDateFormat42.getTimeZoneOverridesCalendar();
        java.util.Locale locale49 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone8, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone63 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone63);
        java.util.TimeZone timeZone68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone73 = fastDateFormat72.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone73);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone77 = fastDateFormat76.getTimeZone();
        java.util.Locale locale78 = fastDateFormat76.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone73, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone68, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone63, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone57, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone85 = fastDateFormat84.getTimeZone();
        java.util.Locale locale86 = fastDateFormat84.getLocale();
        int int87 = fastDateFormat84.getMaxLengthEstimate();
        java.util.Locale locale88 = fastDateFormat84.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 0, timeZone57, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale88);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 14, timeZone8, locale88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
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
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 14 + "'", int38 == 14);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj45);
// flaky:         org.junit.Assert.assertEquals(obj45.toString(), "FastDateFormat[MMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "FastDateFormat[MMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "FastDateFormat[MMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
// flaky:         org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
// flaky:         org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
// flaky:         org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(timeZone77);
// flaky:         org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(timeZone85);
// flaky:         org.junit.Assert.assertEquals(timeZone85.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 14 + "'", int87 == 14);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone11, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone26);
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone36, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone31, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone26, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
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
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
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
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        java.lang.String str11 = fastDateFormat10.toString();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str11, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str2 = fastDateFormat1.toString();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.Object obj4 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str2, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 1:00:00 AM CET", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy");
        java.lang.String str2 = fastDateFormat1.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str2, "FastDateFormat[MMMM d, yyyy]");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale20);
        boolean boolean22 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone23 = fastDateFormat21.getTimeZone();
        java.util.TimeZone timeZone24 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = fastDateFormat15.format((java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70");
        java.lang.String str3 = fastDateFormat2.toString();
        boolean boolean4 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[1/1/70]" + "'", str3, "FastDateFormat[1/1/70]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[1/1/70]" + "'", str5, "FastDateFormat[1/1/70]");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance();
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone11, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone11, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone11, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone11);
        boolean boolean36 = fastDateFormat2.equals((java.lang.Object) timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone43, locale53);
        boolean boolean55 = fastDateFormat54.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone56 = fastDateFormat54.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy", timeZone56, locale60);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, (-1), timeZone11, locale60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
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
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone10, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        java.util.Locale locale20 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone10, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone10);
        java.lang.String str46 = fastDateFormat45.getPattern();
        java.util.TimeZone timeZone47 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone52 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone52, locale53);
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        java.util.Locale locale56 = fastDateFormat54.getLocale();
        boolean boolean57 = fastDateFormat50.equals((java.lang.Object) locale56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale56);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        java.util.Locale locale60 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone47, locale60);
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
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
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
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1/1/70" + "'", str46, "1/1/70");
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.lang.Object obj7 = null;
        boolean boolean8 = fastDateFormat3.equals(obj7);
        boolean boolean9 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.util.Locale locale10 = fastDateFormat3.getLocale();
        java.util.Locale locale11 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) '#', locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[MMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "FastDateFormat[MMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "FastDateFormat[MMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.lang.String str14 = fastDateFormat12.getPattern();
        int int15 = fastDateFormat12.getMaxLengthEstimate();
        boolean boolean16 = fastDateFormat12.getTimeZoneOverridesCalendar();
        java.util.Locale locale17 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone33, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone33, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, 1, timeZone8, locale43);
        java.lang.Object obj47 = fastDateFormat46.clone();
        java.util.TimeZone timeZone48 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone48);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "M/d/yy" + "'", str14, "M/d/yy");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(obj47);
// flaky:         org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.String str7 = fastDateFormat5.getPattern();
        boolean boolean8 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat1.format(calendar9);
        int int11 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str13 = fastDateFormat1.format((-1L));
        java.util.Date date14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = fastDateFormat1.format(date14, stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6, "MMMM d, yyyy h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str7, "MMMM d, yyyy h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.TimeZone timeZone1 = null;
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone5, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone1, locale11);
        java.lang.String str13 = fastDateFormat12.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str13, "EEEE, MMMM d, yyyy");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0);
        java.lang.String str6 = fastDateFormat4.format((long) (short) 10);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January 1, 1970 1:00:00 AM CET" + "'", str6, "January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[EEEE, MMMM d, yyyy]");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        java.lang.String str12 = fastDateFormat10.format((long) 10);
        java.util.Locale locale13 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5, locale13);
        boolean boolean15 = fastDateFormat14.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str4, "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.lang.String str10 = fastDateFormat6.format((long) (short) -1);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12:59:59 AM CET" + "'", str10, "12:59:59 AM CET");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone5, locale15);
        boolean boolean17 = fastDateFormat16.getTimeZoneOverridesCalendar();
        java.lang.String str19 = fastDateFormat16.format((long) '4');
        java.lang.String str20 = fastDateFormat16.getPattern();
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fastDateFormat16.parseObject("January 1, 1970 1:00 AM", parsePosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1:00:00 AM CET" + "'", str19, "1:00:00 AM CET");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h:mm:ss a z" + "'", str20, "h:mm:ss a z");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone38);
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale40);
        java.lang.Class<?> wildcardClass43 = locale40.getClass();
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
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
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
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(100L, stringBuffer4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        int int8 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat2.format(calendar9);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat2.format((long) (short) 1, stringBuffer12);
        java.util.TimeZone timeZone14 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fastDateFormat2.parseObject("FastDateFormat[MMM d, yyyy]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone14, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int25 = fastDateFormat24.getMaxLengthEstimate();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone26, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone14, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone7, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone42, locale50);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone56 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone56, locale57);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        java.util.Locale locale60 = fastDateFormat58.getLocale();
        boolean boolean61 = fastDateFormat54.equals((java.lang.Object) locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone52, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale70);
        boolean boolean72 = fastDateFormat62.equals((java.lang.Object) locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone7, locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone7);
        java.util.Calendar calendar75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = fastDateFormat74.format(calendar75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone9, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone4, locale14);
        boolean boolean17 = fastDateFormat16.getTimeZoneOverridesCalendar();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        boolean boolean24 = fastDateFormat16.equals((java.lang.Object) locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z]", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fastDateFormat25);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone6, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone6);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone22, locale23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        java.util.Locale locale26 = fastDateFormat24.getLocale();
        boolean boolean27 = fastDateFormat20.equals((java.lang.Object) locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]", timeZone17, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fastDateFormat28);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str6 = fastDateFormat4.format((long) 50);
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) str6);
        boolean boolean8 = fastDateFormat1.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1:00:00 AM CET" + "'", str6, "1:00:00 AM CET");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 1:00:00 AM CET");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", locale1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("Thursday, January 1, 1970 12:59:59 AM CET");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M/d/yy" + "'", str3, "M/d/yy");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) (short) 0, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone7);
        java.util.Date date23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = fastDateFormat22.format(date23, stringBuffer24);
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
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 2, timeZone6, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", timeZone23);
        java.lang.String str25 = fastDateFormat24.getPattern();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MMMM d, yyyy h:mm:ss a" + "'", str25, "MMMM d, yyyy h:mm:ss a");
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(100L, stringBuffer5);
        java.util.Calendar calendar7 = null;
        java.lang.String str8 = fastDateFormat3.format(calendar7);
        java.lang.String str9 = fastDateFormat3.toString();
        java.lang.Object obj10 = fastDateFormat3.clone();
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat3.format(calendar11, stringBuffer12);
        java.lang.String str15 = fastDateFormat3.format((long) (short) 100);
        java.util.TimeZone timeZone16 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone16);
        java.lang.Class<?> wildcardClass18 = timeZone16.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FastDateFormat[]" + "'", str9, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str4 = fastDateFormat1.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4, "MMM d, yyyy");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone11, locale19);
        java.lang.String str22 = fastDateFormat20.format((long) 21);
        java.util.Locale locale23 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MMMM d, yyyy" + "'", str5, "MMMM d, yyyy");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "January 1, 1970" + "'", str22, "January 1, 1970");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        boolean boolean2 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("h:mm:ss a z", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[1/1/70]", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(date5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
    }
}
