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
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 50);
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1:00:00 AM CET" + "'", str3, "1:00:00 AM CET");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone19, locale20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        boolean boolean24 = fastDateFormat17.equals((java.lang.Object) locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone15, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale33);
        boolean boolean35 = fastDateFormat25.equals((java.lang.Object) locale33);
        java.lang.String str36 = fastDateFormat25.toString();
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
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str36, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70");
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.lang.String str3 = fastDateFormat1.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[1/1/70]" + "'", str3, "FastDateFormat[1/1/70]");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone21, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone16, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", timeZone10, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int44 = fastDateFormat43.getMaxLengthEstimate();
        java.util.TimeZone timeZone45 = fastDateFormat43.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone52);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        java.util.Locale locale57 = fastDateFormat55.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone52, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone52);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int63 = fastDateFormat62.getMaxLengthEstimate();
        java.util.TimeZone timeZone64 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone68);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        java.util.Locale locale71 = fastDateFormat69.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone64, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone52, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone45, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale71);
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy", timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
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
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(timeZone64);
// flaky:         org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone18);
        java.util.TimeZone timeZone21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone21, locale22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18, locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = fastDateFormat26.format((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
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
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone14, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone14, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone30, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone14, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        java.util.Locale locale49 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone44, locale49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone53 = fastDateFormat52.getTimeZone();
        java.util.Locale locale54 = fastDateFormat52.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone44, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        java.util.Locale locale65 = fastDateFormat63.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone60, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone44, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone14, locale65);
        boolean boolean69 = fastDateFormat2.equals((java.lang.Object) timeZone14);
        java.util.TimeZone timeZone72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone77 = fastDateFormat76.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone77);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone81 = fastDateFormat80.getTimeZone();
        java.util.Locale locale82 = fastDateFormat80.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone77, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone72, locale82);
        boolean boolean85 = fastDateFormat84.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone89 = fastDateFormat88.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone89);
        java.util.Locale locale91 = fastDateFormat90.getLocale();
        boolean boolean92 = fastDateFormat84.equals((java.lang.Object) locale91);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone14, locale91);
        java.lang.Object obj94 = fastDateFormat93.clone();
        java.lang.String str95 = fastDateFormat93.toString();
        java.lang.String str96 = fastDateFormat93.getPattern();
        java.util.Locale locale97 = fastDateFormat93.getLocale();
        boolean boolean98 = fastDateFormat93.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
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
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
// flaky:         org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(timeZone77);
// flaky:         org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(timeZone81);
// flaky:         org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(timeZone89);
// flaky:         org.junit.Assert.assertEquals(timeZone89.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(obj94);
// flaky:         org.junit.Assert.assertEquals(obj94.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj94), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj94), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str95, "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals("'" + str96 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str96, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(locale97);
        org.junit.Assert.assertEquals(locale97.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fastDateFormat1.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone4);
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
        java.util.Calendar calendar17 = null;
        java.lang.String str18 = fastDateFormat1.format(calendar17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale4);
        boolean boolean6 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat5.getTimeZone();
        java.util.Locale locale9 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale9);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone9, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.lang.String str13 = fastDateFormat11.getPattern();
        int int14 = fastDateFormat11.getMaxLengthEstimate();
        boolean boolean15 = fastDateFormat11.getTimeZoneOverridesCalendar();
        java.util.Locale locale16 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone7, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone7, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, timeZone7);
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
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone14, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int25 = fastDateFormat24.getMaxLengthEstimate();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone26, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone14, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 1, timeZone7, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale33);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale38);
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
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone6, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone6);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17);
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
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone7, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone23, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone7);
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
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, locale4);
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
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
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
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone3);
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
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone7, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        java.lang.String str11 = fastDateFormat9.getPattern();
        int int12 = fastDateFormat9.getMaxLengthEstimate();
        boolean boolean13 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.Locale locale14 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone5, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0);
        java.lang.String str21 = fastDateFormat19.format((long) (short) 10);
        java.util.Locale locale22 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone5, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone34, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone34, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone50, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone34, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 0, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone34);
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
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone4);
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
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone22, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone22, locale32);
        boolean boolean34 = fastDateFormat33.getTimeZoneOverridesCalendar();
        java.lang.String str36 = fastDateFormat33.format((long) '4');
        java.lang.String str37 = fastDateFormat33.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone42, locale47);
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
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone6, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone6, locale16);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.lang.String str20 = fastDateFormat17.format((long) '4');
        java.lang.String str21 = fastDateFormat17.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone26, locale31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        boolean boolean34 = fastDateFormat17.equals((java.lang.Object) locale33);
        java.util.Locale locale35 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale35);
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
}
