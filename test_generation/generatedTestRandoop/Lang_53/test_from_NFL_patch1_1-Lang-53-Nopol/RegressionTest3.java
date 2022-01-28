import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date14, (int) (short) 100);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date21, 4, 1001);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date24, 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date26, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Mar 09 00:00:00 CET 2089");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Mar 09 00:00:00 CET 2089");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Mar 09 00:00:00 CET 2089");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date3, 1001);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date3, 1001);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date3, 3);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.truncate(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 60000);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) 'a');
        java.lang.Class<?> wildcardClass36 = date31.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Nov 11 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Jan 04 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Jan 04 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Jan 04 16:40:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Nov 14 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 10);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 0);
        java.lang.Class<?> wildcardClass31 = date30.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:10 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) -1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 1000);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 6);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date18, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.add(date20, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 01 16:40:00 CET 1980");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 16:40:00 CET 1980");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Jan 11 16:40:00 CET 1980");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 60000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 16:40:00 CET 1");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (byte) 10, (int) (byte) 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Apr 01 00:00:00 CET 1970");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) -1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate(date24, (int) (short) 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 1001);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addHours(date24, 60000);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date33, (int) (short) -1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date33, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Nov 04 23:00:00 CET 1976");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Fri Nov 05 00:00:04 CET 1976");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) (byte) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (byte) 100);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1000);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Iterator iterator29 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date27, 5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Mar 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Mar 11 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Dec 05 00:00:00 CET 2072");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date8, 60000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date10, 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, (int) (short) 10);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date22);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date16, (int) (short) 1, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 1, (int) (byte) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, 86400000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (byte) -1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 6, (int) (byte) 0);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date36);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addYears(date45, (int) (short) 10);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addWeeks(date47, 0);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date47, (int) (byte) 1, 6);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (short) 10);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date57, 0, (int) '#');
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, 2);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date36, date62);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date68 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date62, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 CET 61970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 61970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date26, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date26, (int) (byte) 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date30, (int) (short) 100);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Apr 11 00:00:00 CEST 3602134");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Apr 11 00:00:00 CEST 3602134");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Jan 05 04:00:00 CET 1");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:01:40 CET 1");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date44, 3600000);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (short) 10);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date55);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) (byte) 10);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date59, 60000);
        java.util.Iterator iterator63 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date59, 6);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addWeeks(date59, (int) (byte) 100);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addYears(date65, (int) (byte) 0);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addMinutes(date65, 60000);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addDays(date69, 1000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date73 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date71, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 10:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 10:01:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Dec 02 10:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Dec 02 10:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 13 02:00:00 CET 1972");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Wed Oct 09 02:00:00 CET 1974");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 86400000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameDay(date24, date30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date30, 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date30, (int) (byte) 1, 6);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, (int) (short) 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date40, 0, (int) '#');
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date30, date45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addHours(date45, (int) (byte) -1);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date20, (int) (short) 10);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date51, (int) (byte) 10);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, 86400000);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addDays(date55, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Mon Jul 21 01:00:00 CEST 2397");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Oct 26 01:00:00 CEST 2397");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 0);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date17, 2);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 3, (int) 'a');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (short) 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date30, 100);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMonths(date32, 3600000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Sep 27 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Aug 06 00:00:00 CEST 1992");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Oct 04 00:00:00 CET 1990");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Sep 03 00:00:00 CEST 1992");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Sep 03 00:00:00 CEST 301992");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date16, 10, (-1));
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date16, 5);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date27, (int) (byte) 10);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date45);
        java.util.Iterator iterator48 = org.apache.commons.lang.time.DateUtils.iterator(date16, 2);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addYears(date56, (int) (short) 10);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date52, date58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addWeeks(date58, 0);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.round(date61, 2);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addHours(date61, 0);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date61, 5);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date61);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addYears(date61, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date72 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date61, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Dec 31 23:00:00 CET 2069");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 05 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Tue Jan 01 00:00:00 CET 1980");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date15, 3600000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date19, 2);
        java.lang.Class<?> wildcardClass22 = date21.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 08 01:00:00 CEST 2396");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Sep 08 01:00:00 CEST 2396");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Sep 01 00:00:00 CEST 2396");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 86400000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameDay(date24, date30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date30, 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date30, (int) (byte) 1, 6);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, (int) (short) 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date40, 0, (int) '#');
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date30, date45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addHours(date45, (int) (byte) -1);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, 3600000);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, 1);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, (-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 22:59:59 CET 1969");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 2);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addHours(date61, (-1));
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMonths(date63, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date67 = org.apache.commons.lang.time.DateUtils.truncate(date65, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:02 CET 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 23:00:02 CET 1969");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Wed Dec 31 23:00:02 CET 7201969");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) 10, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date25, (int) (short) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date31, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date31, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 02:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) (short) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, 0, (int) '#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date30, (int) (short) 10);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date32);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date41);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date26);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (short) 10);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.add(date53, 0, (int) '#');
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addMonths(date58, (int) (short) 10);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date58);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addYears(date58, 3600000);
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addYears(date67, (int) (short) 10);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date63, date69);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date69);
        java.util.Iterator iterator73 = org.apache.commons.lang.time.DateUtils.iterator(date26, (int) (byte) 1);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) 100);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addDays(date26, 1000);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date77);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, (int) (byte) 10);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.add(date80, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Wed Sep 27 00:00:00 CET 1972");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Tue Jan 01 00:10:00 CET 1980");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Tue Jan 01 00:10:00 CET 1980");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date44, 3600000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date12, date44);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, (int) (short) 10);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date54, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addWeeks(date60, 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.add(date60, (int) (byte) 1, 6);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addYears(date70, (int) (short) 10);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date70, 0, (int) '#');
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date60, date75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMinutes(date75, 2);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date75, 5);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date44, date80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.round(date44, (int) (byte) 1);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date3, 4);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date3, (int) (short) -1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, 3);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMinutes(date28, 5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1974");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Jan 01 00:00:00 CET 1973");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 23:59:59 CET 1969");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 22 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 22 00:05:00 CET 1970");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMonths(date36, (int) (short) 10);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date36);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMonths(date36, (int) (byte) -1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date36, 0, 10);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, 60000);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addHours(date44, (int) ' ');
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, 10);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addSeconds(date44, (int) (byte) 0);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, 10);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addYears(date59, (int) (short) 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.add(date59, 0, (int) '#');
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date64, 60000);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date53, date64);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 29 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Jan 02 08:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 CET 61970");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date14, 3600000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) ' ');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 10);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addYears(date32, (int) (short) 10);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameDay(date28, date34);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameDay(date28, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date28, (int) (byte) 10);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addHours(date28, (int) '#');
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMinutes(date48, (int) (short) 0);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, 100);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date48, (int) (short) 1, (int) (byte) 1);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, (int) (short) 100);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, (int) (byte) -1);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addYears(date59, 1000);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date59);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMonths(date64, (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Mar 12 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sat Jan 02 11:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Jan 02 11:01:40 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Fri Dec 26 11:01:40 CET 1969");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Dec 26 11:01:40 CET 2969");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Fri Sep 01 00:00:00 CEST 3601972");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, 3, (int) '4');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate(date20, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date20, 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date24, 100);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Sep 26 00:00:00 CET 1989");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Sep 26 00:00:00 CET 1989");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Jan 01 00:00:00 CET 1989");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu May 01 00:00:00 CEST 1997");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Jan 01 00:00:00 CET 1989");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Jan 01 00:00:00 CET 1989");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date16, 10, (-1));
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date16, 5);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date27, (int) (byte) 10);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addYears(date54, (int) (short) 10);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date50, date56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date56, 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date56, (int) (byte) 1, 6);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, 86400000);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date64, (-1));
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date45, date66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, (int) (byte) 10);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.add(date45, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date74 = org.apache.commons.lang.time.DateUtils.round(date45, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 1000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Dec 31 23:00:00 CET 2069");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 05 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, 3600000);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addYears(date22, (int) (short) 10);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date24);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, (int) (byte) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date14, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 10);
        java.util.Iterator iterator41 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date14, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(iterator41);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) 'a');
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 100);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, 1000);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date60, 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date62, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Apr 08 00:01:40 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Apr 08 00:01:40 CEST 2970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Apr 08 00:00:00 CEST 2970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Apr 08 00:00:00 CEST 2970");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) -1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addHours(date34, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, 86400000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Dec 31 23:59:00 CET 1");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Jan 01 01:00:00 CET 1");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed May 01 00:00:00 CET 9");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri May 01 00:00:00 CEST 7200009");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, 60000);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date59 = org.apache.commons.lang.time.DateUtils.round(date36, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Feb 11 16:00:00 CET 1");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date9, 5, 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, (int) (byte) 10);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, (int) (byte) 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addYears(date66, 1001);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Jan 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Fri Jan 11 00:00:00 CET 2971");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) -1);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date31, 0, 3);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date39, (int) (byte) 100);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 2);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 6);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.truncate(date27, 1001);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addYears(date56, (int) (short) 10);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date52, date58);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addYears(date63, (int) (short) 10);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.add(date63, 0, (int) '#');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addHours(date63, (-1));
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date58, date63);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, (int) (short) 1);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addWeeks(date63, (int) '4');
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date75, (int) (byte) 10);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addDays(date75, (int) '#');
        boolean boolean80 = org.apache.commons.lang.time.DateUtils.isSameDay(date48, date75);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 23:00:06 CET 1969");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Tue Dec 16 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Dec 31 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Dec 31 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Feb 04 00:00:00 CET 1971");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date12, (int) (byte) 10);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) '#');
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date32, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date32, 100);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) '#');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, (int) 'a');
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date41, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Sep 03 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Sep 03 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Sep 03 00:00:00 CET 1970");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date3, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 04 16:00:00 CET 1970");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 1, (int) (byte) 0);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date27, 0, (int) (byte) 100);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) (short) 1);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date43);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Apr 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round(date31, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:01:00 CET 1970");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 2);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray64);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addYears(date65, (int) (short) 10);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.add(date65, 0, (int) '#');
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addHours(date65, (-1));
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date72);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addYears(date72, (int) (byte) 100);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date72, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:02 CET 1970");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Tue Dec 31 23:00:00 CET 2069");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Wed Dec 31 23:00:00 CET 1969");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date3, (int) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date11, 0, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 3);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date11, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (byte) 10, 1);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date21);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 23:59:59 CET 1969");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Feb 01 00:00:00 CET 1970");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date14, 3600000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) ' ');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 10);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, (int) (byte) 10);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMonths(date26, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date26, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Mar 12 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Mar 12 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Sep 12 00:00:00 CEST 3601970");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (short) 10);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date62);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date71);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date56);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 1);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 5);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addMinutes(date56, (int) (short) 0);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addYears(date79, (int) '#');
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addWeeks(date81, 0);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addMonths(date83, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Fri Apr 01 00:00:00 CEST 2005");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        boolean boolean24 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date28, 0, (int) '#');
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date28, (-1));
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date28);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date23);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date41, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Feb 05 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Mon Feb 11 16:00:00 CET 1974");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) '#');
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Feb 05 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date24);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date3, 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date36, (int) (short) 10);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date38);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date32, (int) (byte) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addHours(date32, (int) '#');
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (short) 1);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date3, 3);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Wed Apr 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Apr 01 00:00:00 CET 1970");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, (int) (short) 10);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addWeeks(date6, 3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:10 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 22 00:00:00 CET 1970");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (byte) 0);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 10);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) ' ');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 0);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.truncate(date22, 2);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:32 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 23:59:00 CET 1969");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.round(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) 'a');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMonths(date7, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 01 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 01 00:00:00 CET 1980");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date5, 2, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date5, (int) (short) -1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addSeconds(date5, 1000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.truncate(date5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Feb 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Dec 31 23:59:59 CET 1979");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:16:40 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date22, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator30 = org.apache.commons.lang.time.DateUtils.iterator(date22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 08 01:00:00 CEST 2380");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Apr 08 00:00:00 CET 1970");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date16, 10, (-1));
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date16, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) ' ');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date25, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate(date27, (int) (byte) 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Dec 31 23:00:00 CET 2069");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 05 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Jan 01 00:00:00 CET 2102");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Dec 31 23:59:59 CET 1");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (short) 10);
        boolean boolean18 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date17);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date11, (int) (byte) 10);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date29);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) (short) 10);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date34, 0, (int) '#');
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date34, 0, 3);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMinutes(date42, (int) (byte) 100);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Iterator iterator12 = org.apache.commons.lang.time.DateUtils.iterator(date8, (int) (byte) 1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, (int) (short) 10);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (byte) 1, 6);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) ' ');
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameInstant(date8, date22);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, 6);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date22, 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, (int) (byte) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate(date37, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Jan 02 08:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:06:00 CET 1980");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(obj0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date14, 3600000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:01:00 CET 3601970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Feb 05 00:00:00 CET 3601970");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date44, 3600000);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (short) 10);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date55);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) (byte) 10);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date12, (int) (short) 10);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMonths(date61, 10);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.add(date63, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 10:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Nov 05 01:00:00 CET 1970");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date24);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date3, 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date36, (int) (short) 10);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date38);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date32, (int) (byte) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addHours(date32, (int) '#');
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (short) 1);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:01 CET 1970");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date12, (int) (byte) 10);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) '#');
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date32, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date32, 100);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date36);
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator(date3, 3);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, 86400000);
        java.util.Iterator iterator43 = org.apache.commons.lang.time.DateUtils.iterator(date41, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Apr 11 01:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(iterator43);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) '#');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 1001);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addYears(date25, 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date33, (int) (short) 10);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (byte) -1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.add(date44, 0, 10);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date52, 60000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMonths(date52, (int) (short) 10);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date52, 10);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date62, (int) (short) 10);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.add(date62, 0, (int) '#');
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addHours(date67, (int) (byte) -1);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameInstant(date58, date67);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date67);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Mar 09 00:00:00 CET 2024");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:10 CET 1970");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date3, (int) (byte) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (byte) 10, 1000);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMinutes(date18, (int) (short) 1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date18, 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addHours(date22, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:01:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date44, 3600000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date12, date44);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, (int) (short) 10);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date54, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addWeeks(date60, 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.add(date60, (int) (byte) 1, 6);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addYears(date70, (int) (short) 10);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date70, 0, (int) '#');
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date60, date75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMinutes(date75, 2);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date75, 5);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date44, date80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addYears(date80, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Tue Jan 01 00:00:00 CET 1974");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date3, 1001);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date3, 1001);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, 60000);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date33, (int) (short) 10);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date33, 0, (int) '#');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.add(date33, 0, 3);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date41, 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date51, (int) (short) 10);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date53);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, (int) (short) 10);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.add(date58, 0, (int) '#');
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addHours(date58, (-1));
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date53, date58);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameInstant(date41, date53);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addDays(date41, (int) '#');
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray72);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addYears(date73, (int) (short) 10);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.add(date73, 0, (int) '#');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMonths(date78, (int) (short) 10);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addDays(date78, (int) 'a');
        boolean boolean83 = org.apache.commons.lang.time.DateUtils.isSameDay(date69, date82);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addHours(date82, 60000);
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date82);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date82, 60000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Nov 11 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Feb 05 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Feb 10 00:00:00 CET 1977");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Wed Apr 08 00:01:00 CET 1970");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.round(date12, 2);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addHours(date12, 0);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date12, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:01:00 CET 1980");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMonths(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date5, (int) (short) 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date5, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date11, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 01 00:00:00 CET 1982");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Dec 03 00:00:00 CET 3129");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) (byte) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date16, 3);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:03 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 08 00:00:03 CET 1970");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.util.Date date0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date8, (int) (short) 10);
        boolean boolean11 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date10, (int) (byte) 1, 6);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (short) 10);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (byte) 1, 6);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date10, (int) (short) 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameDay(date0, date35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Fri Dec 31 23:59:00 CET 1");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) -1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addHours(date34, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Dec 31 23:59:00 CET 1");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Jan 01 01:00:00 CET 1");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed May 01 00:00:00 CET 9");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed May 01 00:00:00 CET 9");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Apr 24 00:00:00 CET 9");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) 10, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date25, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date25, 4);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addYears(date43, (int) (short) 10);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date43, 0, (int) '#');
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMonths(date48, (int) (short) 10);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date39, date48);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date48, 3600000);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date53);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Jan 02 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 02:00:00 CET 1974");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date15, 3600000);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date21, 0, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMonths(date26, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) 'a');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, 3600000);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, (int) (short) 10);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date42);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date36, (int) (byte) 10);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameInstant(date32, date54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.truncate(date54, (int) (short) 10);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date54);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addHours(date17, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 08 01:00:00 CEST 2396");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Sep 12 05:00:00 CEST 2396");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date3, 5, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 5");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Sep 28 00:00:00 CET 1972");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date3, 1001);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date3, 1001);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, 60000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Nov 11 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Apr 11 00:10:00 CEST 2134");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date3, 4);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date3, (int) (short) 1, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date3, (int) (short) -1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date26, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1974");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Jan 01 00:00:00 CET 1973");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 23:59:59 CET 1969");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(obj0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        boolean boolean24 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date28, 0, (int) '#');
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date28, (-1));
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date28);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date23);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date11, (int) '4');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addDays(date11, 1001);
        java.lang.Class<?> wildcardClass42 = date11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Jan 03 04:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Sep 28 00:00:00 CET 1972");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (short) 10);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date62);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date71);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date56);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 1);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 5);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addWeeks(date77, 1001);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addWeeks(date79, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Mar 09 00:00:00 CET 1989");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Mar 09 00:00:00 CET 1989");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) (byte) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 86400000);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 60000);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date35, (int) (short) 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date35, 0, (int) '#');
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) (short) 10);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addYears(date40, 3600000);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addYears(date49, (int) (short) 10);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date45, date51);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date51);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addHours(date23, 86400000);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date55, 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMinutes(date55, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Mar 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Dec 05 00:00:00 CET 1972");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Dec 05 00:00:00 CET 6972");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun May 24 01:00:00 CEST 11829");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sun May 24 01:00:00 CEST 11829");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) -1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round(date24, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) 'a');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Nov 11 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Nov 11 00:00:10 CET 1971");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date24);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date3, 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, (int) (short) 0, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Jan 10 23:59:59 CET 1970");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date13, 0, (int) '#');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date13, 0, 3);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date9, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date26, 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date3, (int) (byte) 10);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 CET 2067");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 0);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date17, 2);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 3, (int) 'a');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Sep 27 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Aug 06 00:00:00 CEST 1992");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Oct 04 00:00:00 CET 1990");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Sep 27 00:00:00 CEST 1990");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date21);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, (int) (byte) 10);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) (short) 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date37, 0, (int) '#');
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date50, (int) (short) 10);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date52);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date61);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date46);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date46);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date46, 2);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (short) 0);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Wed Feb 11 16:00:00 CET 1970");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 2);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addHours(date61, (-1));
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, (int) ' ');
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addHours(date65, 86400000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:02 CET 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 23:00:02 CET 1969");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sun Feb 01 23:00:02 CET 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sat Jul 22 00:00:02 CEST 11826");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.util.Date date0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date8, (int) (short) 10);
        boolean boolean11 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 1, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date14, (int) (short) 1, (int) (byte) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, (int) (short) 10);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date31, (int) (byte) 1, 6);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date41, (int) (short) 10);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date41, 0, (int) '#');
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addHours(date46, (int) (byte) -1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Apr 12 01:00:00 CEST 2233");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 1, (int) (byte) 0);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date27, 0, (int) (byte) 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, 0);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addDays(date23, 60000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Mon Apr 12 11:00:00 CEST 2134");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date34, 5);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, 3600000);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMonths(date56, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sun Dec 05 00:00:00 CET 1976");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, 4);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date33, (int) (byte) 1, 6);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addYears(date43, (int) (short) 10);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date43, 0, (int) '#');
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addHours(date48, (int) (byte) -1);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, (int) (short) 10);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date55, 0, (int) '#');
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.add(date55, 0, 3);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMinutes(date63, (int) (byte) 100);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.truncate(date63, 2);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date51, date67);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 6);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date51);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) '4');
        java.lang.Class<?> wildcardClass74 = date73.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 29 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 29 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 23:00:06 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sat Jan 31 04:00:00 CET 1970");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date5, (int) (short) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 1001);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:40:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Mar 09 01:40:00 CET 1989");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 02 01:40:00 CET 1989");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (byte) 10, (int) (byte) 0);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date57, date65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addMonths(date57, 3);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addWeeks(date68, 5);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addDays(date70, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date74 = org.apache.commons.lang.time.DateUtils.truncate(date72, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Wed Apr 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed May 06 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Tue Aug 11 00:00:00 CET 1970");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.util.Date date0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, (int) (byte) 10);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (short) 10);
        boolean boolean21 = org.apache.commons.lang.time.DateUtils.isSameDay(date14, date20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, 0);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date20, (int) (byte) 1, 6);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date30, (int) (short) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.add(date30, 0, (int) '#');
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addHours(date35, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date8, date35);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addHours(date35, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 10:00:00 CET 1970");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date5, 2, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date5, (int) (short) -1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addSeconds(date5, 1000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate(date12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Feb 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Dec 31 23:59:59 CET 1979");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:16:40 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Jan 02 08:16:40 CET 1980");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date3, 1);
        java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Feb 01 00:00:00 CET 1970");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (byte) 10, (int) (byte) 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date34, 100);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.round(date34, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date63 = org.apache.commons.lang.time.DateUtils.truncate(date61, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Dec 02 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date34, 5);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date34, 5);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addYears(date66, (int) (short) 10);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date66, 0, (int) '#');
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addMonths(date71, (int) (short) 10);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameDay(date62, date71);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date71, (int) (short) 1);
        boolean boolean77 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date76);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 86400000);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:00 CET 7201970");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 100);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date23, (int) (short) 1, (int) (byte) 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date23, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = org.apache.commons.lang.time.DateUtils.truncate(date32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 02 11:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Fri Jan 02 00:00:00 CET 1970");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 02 08:00:00 CET 1980");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date27, (int) (byte) 10);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) (short) 10);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date39, (int) (byte) 1, 6);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (short) 10);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addWeeks(date55, 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.add(date55, (int) (byte) 1, 6);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date39, date61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.round(date39, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date64, (int) 'a');
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addMinutes(date66, 6);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addYears(date68, 86400000);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date68);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date27, 5);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addMonths(date73, (int) '4');
        java.util.Iterator iterator77 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date75, 5);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addMinutes(date75, (int) (byte) 100);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.truncate(date79, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Mon Jan 01 00:06:00 CET 98");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Jan 01 00:06:00 CET 86400098");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Wed May 01 00:00:00 CET 1974");
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Wed May 01 01:40:00 CET 1974");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addHours(date3, 1000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 11 16:00:00 CET 1970");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMonths(date36, (int) (short) 10);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date36);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMonths(date36, (int) (byte) -1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date36, 0, 10);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, 60000);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addHours(date44, (int) ' ');
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.round(date49, (int) (byte) 10);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.round(date49, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 29 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Jan 02 08:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Fri Jan 02 08:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date9, 5, 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date62, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMonths(date62, (int) (short) 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addHours(date66, 2);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMinutes(date66, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sun Jan 11 02:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sun Jan 11 00:01:00 CET 1970");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        boolean boolean24 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date28, 0, (int) '#');
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date28, (-1));
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date28);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date23);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) '4');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date11, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:52:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date8, 3);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator(date14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 22 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon May 22 00:00:00 CEST 1978");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date9, 5, 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, (int) (byte) 10);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, (int) (byte) 0);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.add(date62, 2, 0);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addMinutes(date62, (int) (byte) 10);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addDays(date62, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date75 = org.apache.commons.lang.time.DateUtils.round(date73, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Jan 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Sun Jan 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sun Jan 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Wed Jan 21 00:00:00 CET 1970");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, 3600000);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addYears(date22, (int) (short) 10);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date24);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, (int) (byte) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date14, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 10);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.truncate(date14, 10);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date41, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Fri Nov 05 00:00:00 CET 1976");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date3, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, 0);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, (int) (short) -1);
        java.util.Iterator iterator40 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date33, 4);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addYears(date46, (int) (short) 10);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.add(date46, 0, (int) '#');
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date46, 0, 3);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameInstant(date33, date54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.truncate(date54, 2);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, 100);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date57);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Dec 02 00:00:00 CET 1971");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) -1);
        java.util.Iterator iterator29 = org.apache.commons.lang.time.DateUtils.iterator(date27, 5);
        java.lang.Class<?> wildcardClass30 = iterator29.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, (int) (short) 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date24, 5);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Jun 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Mon Jun 01 00:00:00 CET 1970");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) 'a');
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 100);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, 1000);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray67);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addYears(date68, (int) (short) 10);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date64, date70);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addWeeks(date70, 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.add(date70, (int) (byte) 1, 6);
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray79);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addYears(date80, (int) (short) 10);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.add(date80, 0, (int) '#');
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameDay(date70, date85);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addMinutes(date85, 2);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date85, 5);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addMinutes(date90, 2);
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date90, 4);
        boolean boolean95 = org.apache.commons.lang.time.DateUtils.isSameInstant(date60, date94);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Apr 08 00:01:40 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Apr 08 00:01:40 CEST 2970");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date14, 4);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date14, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 04:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) -1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round(date24, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) 'a');
        java.lang.Class<?> wildcardClass32 = date31.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Nov 11 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addDays(date5, 10);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date5, 6);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, 100);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date13, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 11 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jul 01 00:00:00 CEST 1980");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Jul 01 00:00:00 CEST 1981");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Oct 09 00:00:00 CET 1981");
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date3, (int) (byte) -1);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date3, (int) (short) 10);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, 10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 23:59:59 CET 1969");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:04:00 CET 1970");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 0);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date17, 2);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 3, (int) 'a');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date25, 2);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date25, 1);
        java.lang.Class<?> wildcardClass33 = date32.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Sep 27 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Aug 06 00:00:00 CEST 1992");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Sep 29 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Mon Jan 01 00:00:00 CET 1990");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) 'a');
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 100);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, 1000);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMinutes(date60, (int) ' ');
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date60, 60000);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.round(date60, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Apr 08 00:01:40 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Apr 08 00:01:40 CEST 2970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Apr 08 00:33:40 CEST 2970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Apr 08 16:41:40 CEST 2970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Mon Jan 01 00:00:00 CET 2970");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 0);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date17, 2);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 3, (int) 'a');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (short) 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date30, 0);
        java.lang.Class<?> wildcardClass33 = date30.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Sep 27 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Aug 06 00:00:00 CEST 1992");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Oct 04 00:00:00 CET 1990");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Oct 04 00:00:00 CET 1990");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 10);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date21);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date15, (int) (short) 1, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date15, 0, (int) (byte) 100);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date28, (int) (short) 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date35, (int) (short) 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date35, 0, (int) '#');
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.add(date35, 0, 3);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMonths(date35, (int) (byte) 1);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date35, (int) (byte) 10, 1000);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, (int) (byte) 0);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMinutes(date50, (int) (short) 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date50, (int) (short) 0);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameDay(date28, date50);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMinutes(date28, (int) ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Apr 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:01:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:32:00 CET 1970");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, 3600000);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (short) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date24, 0, (int) '#');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date29, (int) (short) 10);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date29);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addYears(date29, 3600000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date34, 0, (int) ' ');
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date37, (int) (byte) 1);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date47, (int) (short) 10);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addWeeks(date49, 0);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, (int) (short) -1);
        java.util.Iterator iterator56 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date49, 4);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, 0);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date62, (int) (short) 10);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.add(date62, 0, (int) '#');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.add(date62, 0, 3);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date49, date70);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date70);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date14, date70);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addYears(date14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date77 = org.apache.commons.lang.time.DateUtils.round(date75, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Sat Nov 05 00:00:00 CET 1977");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: ");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) -1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addSeconds(date14, 1000);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (short) 10);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (byte) 1, 6);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, (int) (short) 10);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date42, 0);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date42, (int) (byte) 1, 6);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.round(date26, (int) (short) 0);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date51, (int) 'a');
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, (-1));
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addDays(date57, 86400000);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date14, date57);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 01 00:15:40 CET 1980");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Dec 31 23:59:00 CET 97");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Mar 01 00:00:00 CET 236653");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Dec 02 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Dec 02 00:00:00 CET 1971");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (byte) 1, 6);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 86400000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (-1));
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (-1));
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Mon Sep 26 23:59:58 CET 1988");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Sep 27 00:01:39 CET 1988");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date23, (int) (byte) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date23, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date3, (int) (short) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, (int) (short) 10);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date35, (int) (short) 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date35, 0, (int) '#');
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) (short) 10);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date40);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) (byte) -1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, 4);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date51, (int) (short) 10);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (short) 10);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date57, 0, (int) '#');
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMonths(date62, (int) (short) 10);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameDay(date51, date62);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMonths(date62, (int) (byte) -1);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.add(date62, 0, 10);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addDays(date70, 60000);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date70);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addHours(date70, (int) ' ');
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.round(date75, (int) (byte) 10);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date77);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addHours(date25, (int) '#');
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date80, (-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 29 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Fri Jan 02 08:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Fri Jan 02 08:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Fri Jan 02 11:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Fri Jan 02 11:00:00 CET 1970");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date8, 60000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date10, 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, (int) (short) 10);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date22);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date16, (int) (short) 1, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 1, (int) (byte) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, 86400000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (byte) -1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 6, (int) (byte) 0);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 CET 61970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 61970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Apr 12 01:00:00 CEST 2233");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Apr 12 01:00:00 CEST 2234");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 CET 61970");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (short) 10);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date62);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date71);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date56);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 1);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 5);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addYears(date77, (int) (byte) 1);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addDays(date77, 6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:01 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Fri Jan 01 00:00:00 CET 1971");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Wed Jan 07 00:00:00 CET 1970");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) 'a');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMinutes(date36, (-1));
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date38, 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 4");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Dec 31 23:59:00 CET 97");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Dec 31 00:00:00 CET 1");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date24, 100);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 3600000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:01:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Jun 21 00:00:00 CEST 11926");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Jan 29 00:00:00 CET 2070");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addDays(date5, 10);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date5, 3600000);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, 5);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (short) 10);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date21, 0, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMonths(date26, (int) (short) 10);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date26, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date31, (int) (byte) 100);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addSeconds(date33, 86400000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, 60000);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date37);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 11 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 3601980");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 3601985");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Mar 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Dec 05 00:00:00 CET 1972");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 21 16:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, (-1));
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 4");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 23:59:00 CET 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 23:59:00 CET 1969");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) 'a');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMinutes(date36, 6);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMonths(date36, (int) '#');
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date36, (int) (short) 100);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addDays(date36, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Jan 01 00:06:00 CET 98");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Dec 01 00:00:00 CET 100");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Apr 11 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 11 00:00:00 CET 98");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date15);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date46);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date40);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date40);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date5, date9);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date5, 6);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addSeconds(date61, (int) (short) 100);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, 1001);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addHours(date63, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator69 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on  ");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Jan 01 00:01:40 CET 1980");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Sep 28 00:01:40 CET 1982");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Wed Jan 02 08:01:40 CET 1980");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date9, (int) ' ');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date21, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 3600000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 02 08:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 01 00:00:00 CET 2080");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 01 00:00:00 CET 2080");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) -1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 1000);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 6);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date16, (int) '#');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date16, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 01 16:40:00 CET 1980");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 16:40:00 CET 1980");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 01 16:40:00 CET 1982");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 16:40:00 CET 1980");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date17, 3600000);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date17, (int) (short) 10);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 100);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 16 00:00:00 CET 11845");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Oct 07 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Sep 07 00:00:00 CEST 1990");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Sep 21 00:00:00 CEST 1990");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date22, (int) 'a');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date22, 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date30, 1001);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 08 01:00:00 CEST 2380");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1002");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1002");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date14, 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Dec 25 00:00:00 CET 1969");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, 3600000);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (short) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date24, 0, (int) '#');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date29, (int) (short) 10);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date29);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addYears(date29, 3600000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date34, 0, (int) ' ');
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date37, (int) (byte) 1);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date47, (int) (short) 10);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addWeeks(date49, 0);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, (int) (short) -1);
        java.util.Iterator iterator56 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date49, 4);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, 0);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date62, (int) (short) 10);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.add(date62, 0, (int) '#');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.add(date62, 0, 3);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date49, date70);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date70);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date14, date70);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addWeeks(date70, (-1));
        java.util.Iterator iterator77 = org.apache.commons.lang.time.DateUtils.iterator(date70, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Dec 25 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(iterator77);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) 'a');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, 6);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date40, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Jan 01 00:00:00 CET 7");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Jan 01 00:00:00 CET 7");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Jan 01 00:00:00 CET 7");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date14, 3600000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date19, (int) (short) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date19, (int) (short) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date19, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Feb 01 00:00:00 CET 3601970");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date3, (int) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date11, 0, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 3);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date11, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (byte) 10, 1);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date21);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 23:59:59 CET 1969");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat May 09 00:00:00 CET 1970");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Iterator iterator12 = org.apache.commons.lang.time.DateUtils.iterator(date8, (int) (byte) 1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, (int) (short) 10);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (byte) 1, 6);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) ' ');
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameInstant(date8, date22);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date33, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Jan 02 08:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:06:00 CET 1980");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date5, 2, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date5, (int) (short) -1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = org.apache.commons.lang.time.DateUtils.round(date12, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Feb 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Dec 31 23:59:59 CET 1979");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:01 CET 1980");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (short) 10);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date62);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date71);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date56);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.round(date3, (int) (byte) 0);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.truncate(date3, 1);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addHours(date77, (-1));
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addMinutes(date77, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Jan 01 00:04:00 CET 1970");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date25, (int) (byte) 1, 6);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) 'a');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, 6);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, 60000);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, (int) (byte) -1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addSeconds(date42, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Jan 01 00:00:00 CET 98");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Jan 01 00:00:00 CET 7");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Jan 01 16:40:00 CET 1");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Jan 01 16:39:59 CET 1");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 01 16:40:00 CET 1");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sat Jan 01 16:40:00 CET 1");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date8, (int) '4');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addWeeks(date14, (int) 'a');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round(date14, (int) (byte) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMinutes(date20, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator24 = org.apache.commons.lang.time.DateUtils.iterator(date20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 31 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Nov 09 00:00:00 CET 1972");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Dec 31 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 31 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 31 00:10:00 CET 1970");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) (short) 10);
        boolean boolean20 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (byte) 1, 6);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, (int) (short) 10);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, 0, (int) '#');
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addHours(date34, (int) (byte) -1);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date34);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date34, 4);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (short) 10);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date50, (int) (short) 10);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date50, 0, (int) '#');
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date55, (int) (short) 10);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date44, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addMonths(date55, (int) (byte) -1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.add(date55, 0, 10);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date55, 3);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date40, date65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date40, (int) (short) 10);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date40, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Jan 01 00:00:00 CET 2022");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.truncate(date14, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date26, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, (-1));
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 23:59:00 CET 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 05 03:59:00 CET 1970");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (int) (short) 10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, 3600000);
        java.util.Iterator iterator16 = org.apache.commons.lang.time.DateUtils.iterator(date8, 2);
        java.lang.Class<?> wildcardClass17 = iterator16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Nov 05 00:00:00 CET 1976");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (short) 10);
        boolean boolean18 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date17);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date11, (int) (byte) 10);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date33, (int) (short) 10);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date33, 0, (int) '#');
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addYears(date46, (int) (short) 10);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date48);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date57);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date42);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date42);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date42, 2);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date62);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date66 = org.apache.commons.lang.time.DateUtils.add(date62, (int) '#', 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMonths(date5, (int) '#');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date11, 0, (int) '#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (short) 10);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date26);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date35);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date20);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date47, (int) (short) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.add(date47, 0, (int) '#');
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMonths(date52, (int) (short) 10);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date52);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date52, 3600000);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addYears(date61, (int) (short) 10);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date57, date63);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date63);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date20);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date70 = org.apache.commons.lang.time.DateUtils.truncate(date7, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 1000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 01 00:00:00 CET 1982");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Wed Dec 01 00:00:35 CET 1982");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date23, (int) (byte) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Tue May 02 11:00:00 CEST 1978");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) '#');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 1001);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addYears(date25, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date25, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Mar 09 00:00:00 CET 2024");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 CET 2005");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 05 00:00:00 CET 2005");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addMonths(date3, 1000);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date5, (-1));
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date5, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMonths(date5, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu May 01 00:00:00 CEST 2053");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Apr 30 23:59:59 CEST 2053");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu May 01 00:00:00 CEST 2053");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 01 00:00:00 CEST 2053");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date21);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, (int) (byte) 10);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) (short) 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date37, 0, (int) '#');
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date50, (int) (short) 10);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date52);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date61);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date46);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date46);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date46, 2);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (short) 0);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.round(date69, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.round(date5, (int) (short) 1);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date5, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date5, (int) '4');
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date5, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 03 04:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Feb 05 00:00:00 CET 1980");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (byte) 1, 6);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date24, 100);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 3600000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date35, 0);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date41, (int) (short) 10);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date41, (int) (short) 0, (-1));
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addWeeks(date41, 0);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate(date41, 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date41, (int) (byte) 0);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date52);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:01:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Jan 01 00:00:00 CET 2070");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Jun 21 00:00:00 CEST 11926");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 10);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 3600000);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Apr 04 00:10:00 CEST 70965");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:10:01 CET 1970");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date3, (int) '#');
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (short) 10);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date33);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 1, (int) (byte) 0);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date27, 0, (int) (byte) 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, 0);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date45 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) boolean43, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round false");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.round(date12, 2);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, 3600000);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 100);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round(date12, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 05 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Dec 01 00:00:00 CET 1981");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Jan 01 00:00:00 CET 1980");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.round(date12, 2);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addHours(date12, 0);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date12, 5);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Jan 22 00:00:00 CET 1980");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date5, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date14, 3600000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) ' ');
        java.util.Iterator iterator24 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date22, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addYears(date32, (int) (short) 10);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameDay(date28, date34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date34, 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) -1);
        java.util.Iterator iterator41 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date34, 4);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date47, (int) (short) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.add(date47, 0, (int) '#');
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date47, 0, 3);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date55);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date55, 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMonths(date59, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date63 = org.apache.commons.lang.time.DateUtils.round(date61, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon Dec 31 23:59:00 CET 1979");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sun Nov 01 00:00:00 CET 1970");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date3, (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date25, 0, (int) '#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date38, (int) (short) 10);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date40);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date34, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date34);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date3, date34);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 2);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) 'a');
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, (int) (byte) 100);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, 1000);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date64, (int) (short) 10);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addYears(date70, (int) (short) 10);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date70, 0, (int) '#');
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMonths(date75, (int) (short) 10);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameDay(date64, date75);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMonths(date75, (int) (byte) -1);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addDays(date80, (int) (byte) 100);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date80, (int) (short) 10);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameDay(date60, date84);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addSeconds(date60, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date89 = org.apache.commons.lang.time.DateUtils.truncate(date60, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Apr 08 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Apr 08 00:01:40 CET 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Apr 08 00:01:40 CEST 2970");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Mar 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Mon Dec 01 00:10:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Sun Apr 08 00:18:21 CEST 2970");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date3, (int) (short) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Aug 13 00:00:00 CET 1970");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.add(date3, 0, 3);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 10);
        boolean boolean24 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date28, 0, (int) '#');
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date28, (-1));
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date28);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date23);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 1001);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 CET 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Feb 05 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Feb 11 16:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Mar 09 00:00:00 CET 1989");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 10);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 10);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date21);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date15, (int) (short) 1, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date15, 0, (int) (byte) 100);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date28, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date28, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Apr 11 00:10:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Feb 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Jan 01 00:00:00 CET 1");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date3, 2);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 100);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date25, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:02:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Dec 02 00:02:00 CET 1971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Dec 02 00:02:00 CET 2023");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date14, 0, 10);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (byte) 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date28, 1000);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date30, 6);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, (int) (short) 1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date30, 3600000);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addHours(date30, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 CEST 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 08 01:00:00 CEST 2380");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 08 01:01:00 CEST 2380");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Oct 19 17:01:00 CEST 2380");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Oct 19 23:01:00 CEST 2380");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sun Oct 19 17:01:00 CEST 2380");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Aug 24 17:01:00 CEST 2387");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Oct 20 03:01:00 CEST 2380");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (short) 10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date9, 0, (int) '#');
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date14);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date14, (int) (byte) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) (byte) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 86400000);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 60000);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date25, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, 2);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date27, 2, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Dec 01 00:00:00 CET 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Mar 11 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Dec 05 00:00:00 CET 1972");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Dec 05 00:00:00 CET 6972");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 03 00:00:00 CET 1");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Tue Feb 01 00:00:00 CET 1");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.addYears(date3, (int) (short) 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date3, 0, (int) '#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) (short) 10);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date27);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date12);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, 0, (int) '#');
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 10);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date44, 3600000);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (short) 10);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date55);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date55);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date12, (int) (byte) 10);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addYears(date63, (int) (short) 10);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.add(date63, 0, (int) '#');
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date63, 0, 3);
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray78);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addYears(date79, (int) (short) 10);
        boolean boolean82 = org.apache.commons.lang.time.DateUtils.isSameDay(date75, date81);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addWeeks(date81, 0);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.add(date81, (int) (byte) 1, 6);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addSeconds(date87, 86400000);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date89, (-1));
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameInstant(date71, date91);
        boolean boolean93 = org.apache.commons.lang.time.DateUtils.isSameDay(date59, date91);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator95 = org.apache.commons.lang.time.DateUtils.iterator(date91, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Nov 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CET 3601970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 10:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Wed Jan 01 00:00:00 CET 1986");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Tue Sep 27 00:00:00 CET 1988");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Mon Sep 26 23:59:59 CET 1988");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CET 1970");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date3, date18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date3, 4);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 01 00:00:00 CET 1980");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 00:00:00 CET 1974");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 CET 1970");
    }
}

