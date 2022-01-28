import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dateTimeFormatter2.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter4.print(readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.ReadWritableInstant readWritableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dateTimeFormatter2.parseInto(readWritableInstant3, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.io.Writer writer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter4.print((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter9.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter9.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter2.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer6, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter8.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        java.lang.Class<?> wildcardClass7 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter9.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter6.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter4.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter8.print(readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter8.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.ReadWritableInstant readWritableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter2.parseInto(readWritableInstant8, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter9.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print(readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTimeFormatter8.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter12.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = dateTimeFormatter9.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeFormatter6.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = dateTimeFormatter7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter2.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter13.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        boolean boolean8 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print(readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter4.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter11.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        boolean boolean7 = dateTimeFormatter2.isParser();
        org.joda.time.ReadWritableInstant readWritableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter2.parseInto(readWritableInstant8, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter6.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter7.parseInto(readWritableInstant9, "", 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter8.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter3.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        boolean boolean8 = dateTimeFormatter2.isOffsetParsed();
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter12.print(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print(readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        java.lang.Class<?> wildcardClass10 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter8.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter2.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.lang.Class<?> wildcardClass11 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter8.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter12.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter7.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter9.parseInto(readWritableInstant11, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeFormatter2.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter9.print((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter6.print(readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter11.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter4.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        java.lang.Class<?> wildcardClass11 = dateTimeFormatter8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter9.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter9.getPrinter();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter13.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter8.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter5.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer16, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = dateTimeFormatter8.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 2000);
        boolean boolean13 = dateTimeFormatter10.isOffsetParsed();
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = dateTimeFormatter8.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter8.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter7.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter12.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter2.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.ReadWritableInstant readWritableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter2.parseInto(readWritableInstant9, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronology();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print(readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter6.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, readableInstant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = dateTimeFormatter6.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter7.getZone();
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter7.parseInto(readWritableInstant11, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int9 = dateTimeFormatter2.getPivotYear();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        java.io.Writer writer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter12.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print(readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter13.print(readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter11.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable9, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = dateTimeFormatter13.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        int int4 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = dateTimeFormatter7.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2000 + "'", int4 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter6.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter8.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer16, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeFormatter8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.lang.Class<?> wildcardClass5 = dateTimeFormatter3.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        java.util.Locale locale16 = dateTimeFormatter15.getLocale();
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer17, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print(readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter2.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter7.print((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter2.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        java.util.Locale locale16 = dateTimeFormatter15.getLocale();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuffer17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = dateTimeFormatter2.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = dateTimeFormatter15.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter7.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(2000);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter9.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter6.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter9.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter6.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        int int4 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear((int) (short) -1);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer7, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2000 + "'", int4 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter10.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        boolean boolean13 = dateTimeFormatter12.isParser();
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean8 = dateTimeFormatter7.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter7.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter2.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(dateTimeParser10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter2.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter2.isOffsetParsed();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) '#');
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print(readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter8.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.Integer int14 = dateTimeFormatter11.getPivotYear();
        int int15 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withZoneUTC();
        java.lang.Integer int19 = dateTimeFormatter17.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter17.getParser();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withZone(dateTimeZone21);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter25.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter17.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter8.withZone(dateTimeZone33);
        java.lang.Appendable appendable36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter35.printTo(appendable36, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter8.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter2.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter8.withZone(dateTimeZone24);
        java.util.Locale locale26 = dateTimeFormatter8.getLocale();
        int int27 = dateTimeFormatter8.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTimeFormatter8.print((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.Integer int14 = dateTimeFormatter11.getPivotYear();
        int int15 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withZoneUTC();
        java.lang.Integer int19 = dateTimeFormatter17.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter17.getParser();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withZone(dateTimeZone21);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter25.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter17.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter8.withZone(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = dateTimeFormatter8.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withLocale(locale7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter9.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter9.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        java.util.Locale locale35 = dateTimeFormatter7.getLocale();
        java.lang.Appendable appendable36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable36, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(locale35);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear(0);
        java.io.Writer writer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer8, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print(readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 1);
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter4.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale8 = dateTimeFormatter7.getLocale();
        java.lang.Class<?> wildcardClass9 = dateTimeFormatter7.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Class<?> wildcardClass13 = dateTimeFormatter10.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter9.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter2.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withDefaultYear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter10.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter9.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = dateTimeFormatter5.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter2.getPrinter();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimePrinter7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withChronology(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = dateTimeFormatter10.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withChronology(chronology35);
        java.lang.StringBuffer stringBuffer37 = null;
        org.joda.time.ReadablePartial readablePartial38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter34.printTo(stringBuffer37, readablePartial38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = dateTimeFormatter2.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeParser6);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter8.parseInto(readWritableInstant11, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withOffsetParsed();
        java.io.Writer writer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter10.print(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        boolean boolean8 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print(readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(10);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter9.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withLocale(locale5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter4.getChronology();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer8, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter8.print((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        java.util.Locale locale35 = dateTimeFormatter7.getLocale();
        java.lang.StringBuffer stringBuffer36 = null;
        org.joda.time.ReadablePartial readablePartial37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer36, readablePartial37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(locale35);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronology();
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter11.withZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = dateTimeFormatter25.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter14.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withZone(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateTimeFormatter18.print((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter11.print(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(dateTimeZone13);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter2.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(chronology6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter2.parseInto(readWritableInstant12, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter11.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronology();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter7.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        java.io.Writer writer9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter8.withZone(dateTimeZone24);
        java.lang.Class<?> wildcardClass26 = dateTimeFormatter8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter14.print(readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter10.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter9.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = dateTimeFormatter10.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = dateTimeFormatter7.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Class<?> wildcardClass8 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter10.getZone();
        int int16 = dateTimeFormatter10.getDefaultYear();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 0);
        org.joda.time.ReadWritableInstant readWritableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dateTimeFormatter13.parseInto(readWritableInstant14, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withDefaultYear((int) (byte) 1);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter13.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 2000);
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear((int) (byte) 100);
        java.io.Writer writer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        int int4 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter6.getZone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2000 + "'", int4 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter8.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter2.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter2.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter6.print(readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withLocale(locale5);
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatter17.getPrinter();
        java.util.Locale locale19 = dateTimeFormatter17.getLocale();
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(stringBuffer20, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimePrinter18);
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter9.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeParser13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 0);
        boolean boolean14 = dateTimeFormatter13.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter13.print((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeFormatter8.isPrinter();
        java.io.Writer writer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer15, readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(0);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withChronology(chronology12);
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter9.withZone(dateTimeZone22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeFormatter23.print(readableInstant24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter11.print(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter8.print((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter2.getZone();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology8 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 2000);
        boolean boolean13 = dateTimeFormatter10.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeFormatter10.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter6.print(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer14, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter10.parseInto(readWritableInstant11, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter9.getPrinter();
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter9.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter2.parseInto(readWritableInstant7, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter11.parseInto(readWritableInstant12, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter2.getParser();
        java.io.Writer writer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter2.getZone();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeFormatter2.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withChronology(chronology11);
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(10);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter11.parseInto(readWritableInstant12, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print(readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter6.parseInto(readWritableInstant7, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 1);
        java.io.Writer writer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter5.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        int int10 = dateTimeFormatter2.getDefaultYear();
        java.lang.Class<?> wildcardClass11 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter11.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withPivotYear(2000);
        java.lang.Appendable appendable28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable28, readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        boolean boolean9 = dateTimeFormatter7.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        int int10 = dateTimeFormatter2.getDefaultYear();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(0);
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        java.io.Writer writer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeZone11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Class<?> wildcardClass6 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter9.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = dateTimeFormatter8.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter11.withZone(dateTimeZone24);
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(stringBuffer26, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale8);
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter8.print(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter8.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeFormatter2.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter2.getParser();
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(dateTimeParser10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        java.lang.Class<?> wildcardClass15 = dateTimeFormatter13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter2.getPrinter();
        boolean boolean12 = dateTimeFormatter2.isParser();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = dateTimeFormatter9.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer11, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale11);
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withLocale(locale6);
        int int8 = dateTimeFormatter7.getDefaultYear();
        int int9 = dateTimeFormatter7.getDefaultYear();
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear(100);
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.Integer int14 = dateTimeFormatter11.getPivotYear();
        int int15 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withZone(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withZoneUTC();
        java.lang.Integer int19 = dateTimeFormatter17.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter17.getParser();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withZone(dateTimeZone21);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter25.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter30.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter17.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter8.withZone(dateTimeZone33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeFormatter35.print(readableInstant36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withOffsetParsed();
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable14, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter11.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = dateTimeFormatter11.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNull(dateTimeParser14);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) (short) 0);
        org.joda.time.ReadWritableInstant readWritableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter9.parseInto(readWritableInstant12, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter6.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeFormatter11.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        java.lang.Appendable appendable7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        java.lang.Integer int18 = dateTimeFormatter15.getPivotYear();
        int int19 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter15.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        java.util.Locale locale23 = dateTimeFormatter22.getLocale();
        boolean boolean24 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeFormatter32.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter22.withZone(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter12.withZone(dateTimeZone35);
        java.lang.Integer int38 = dateTimeFormatter12.getPivotYear();
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer39, readableInstant40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNull(int38);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withDefaultYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter11.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = dateTimeFormatter2.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.lang.Integer int11 = dateTimeFormatter2.getPivotYear();
        java.io.Writer writer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter14.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withZone(dateTimeZone17);
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable19, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable10 = null;
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable10, readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = dateTimeFormatter2.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale8 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((int) '4');
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable11, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer9, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((int) '#');
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter13.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        java.lang.Integer int24 = dateTimeFormatter21.getPivotYear();
        int int25 = dateTimeFormatter21.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter21.withZone(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withZoneUTC();
        java.lang.Integer int29 = dateTimeFormatter27.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter27.getParser();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withZone(dateTimeZone31);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter27.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter18.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter9.withZone(dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = dateTimeFormatter46.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter8.print(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter9.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimePrinter11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withLocale(locale5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withDefaultYear((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter9.print(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        java.util.Locale locale35 = dateTimeFormatter7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeFormatter7.print((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(locale35);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter7.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer13, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        java.lang.Integer int18 = dateTimeFormatter15.getPivotYear();
        int int19 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter15.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        java.util.Locale locale23 = dateTimeFormatter22.getLocale();
        boolean boolean24 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeFormatter32.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter22.withZone(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter12.withZone(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate39 = dateTimeFormatter12.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 0);
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter2.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = dateTimeFormatter10.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        boolean boolean7 = dateTimeFormatter5.isParser();
        java.io.Writer writer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = dateTimeFormatter6.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withLocale(locale19);
        java.lang.Integer int21 = dateTimeFormatter18.getPivotYear();
        int int22 = dateTimeFormatter18.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withDefaultYear((int) '#');
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter27.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter9.withZone(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeFormatter30.print(readablePartial32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2000 + "'", int22 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((int) 'a');
        boolean boolean12 = dateTimeFormatter2.isPrinter();
        org.joda.time.ReadWritableInstant readWritableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter2.parseInto(readWritableInstant13, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronology();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTimeFormatter8.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.ReadWritableInstant readWritableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter2.parseInto(readWritableInstant8, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter2.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((int) '#');
        java.io.Writer writer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        java.io.Writer writer10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer10, readableInstant11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter9.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter9.withPivotYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime28 = dateTimeFormatter9.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withLocale(locale18);
        java.lang.Integer int20 = dateTimeFormatter17.getPivotYear();
        int int21 = dateTimeFormatter17.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter17.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        java.lang.Integer int25 = dateTimeFormatter23.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser26 = dateTimeFormatter23.getParser();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withZone(dateTimeZone27);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withLocale(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeFormatter36.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter23.withZone(dateTimeZone39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter10.withZone(dateTimeZone39);
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withLocale(locale42);
        java.lang.StringBuffer stringBuffer44 = null;
        org.joda.time.ReadablePartial readablePartial45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter41.printTo(stringBuffer44, readablePartial45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(dateTimeParser26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = dateTimeFormatter11.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withLocale(locale14);
        java.lang.Class<?> wildcardClass16 = dateTimeFormatter15.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter15.getPrinter();
        boolean boolean18 = dateTimeFormatter15.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeFormatter15.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertNull(dateTimePrinter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter10.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        boolean boolean14 = dateTimeFormatter11.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter11.print((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withChronology(chronology12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter13.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter9.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        boolean boolean14 = dateTimeFormatter11.isParser();
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer15, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withZoneUTC();
        int int11 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter14.getPrinter();
        java.io.Writer writer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        java.io.Writer writer7 = null;
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 2000);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        boolean boolean13 = dateTimeFormatter12.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        java.lang.Integer int24 = dateTimeFormatter21.getPivotYear();
        int int25 = dateTimeFormatter21.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter21.withZone(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withZoneUTC();
        java.lang.Integer int29 = dateTimeFormatter27.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter27.getParser();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withZone(dateTimeZone31);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter27.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter18.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter9.withZone(dateTimeZone43);
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = dateTimeFormatter9.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime49 = dateTimeFormatter9.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNull(dateTimePrinter47);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        int int12 = dateTimeFormatter9.getDefaultYear();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable13, readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withChronology(chronology10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter6.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter8.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withLocale(locale19);
        java.lang.Integer int21 = dateTimeFormatter18.getPivotYear();
        int int22 = dateTimeFormatter18.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withDefaultYear((int) '#');
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter27.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter9.withZone(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.Chronology chronology32 = dateTimeFormatter31.getChronolgy();
        java.lang.Appendable appendable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter31.printTo(appendable33, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2000 + "'", int22 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(chronology32);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter8.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimePrinter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = dateTimeFormatter2.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        java.lang.Integer int16 = dateTimeFormatter13.getPivotYear();
        int int17 = dateTimeFormatter13.getDefaultYear();
        java.lang.Integer int18 = dateTimeFormatter13.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        java.lang.Integer int26 = dateTimeFormatter23.getPivotYear();
        int int27 = dateTimeFormatter23.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withZoneUTC();
        java.lang.Integer int31 = dateTimeFormatter29.getPivotYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withChronology(chronology32);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withLocale(locale37);
        java.lang.Integer int39 = dateTimeFormatter36.getPivotYear();
        int int40 = dateTimeFormatter36.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter36.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter42.withZoneUTC();
        java.util.Locale locale44 = dateTimeFormatter43.getLocale();
        boolean boolean45 = dateTimeFormatter43.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withLocale(locale49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter53.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeFormatter53.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter43.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter33.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter13.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter9.withZone(dateTimeZone56);
        java.io.Writer writer61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer61, readableInstant62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2000 + "'", int40 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear((int) (byte) 10);
        java.io.Writer writer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(writer15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        int int11 = dateTimeFormatter8.getDefaultYear();
        boolean boolean12 = dateTimeFormatter8.isOffsetParsed();
        java.lang.Appendable appendable13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withChronology(chronology5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter4.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter11.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology10 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = dateTimeFormatter2.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear(100);
        java.lang.Class<?> wildcardClass13 = dateTimeFormatter8.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer14, readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean9 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology14 = dateTimeFormatter11.getChronolgy();
        java.lang.Appendable appendable15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable15, readablePartial16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withDefaultYear((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter15.print(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        boolean boolean8 = dateTimeFormatter2.isOffsetParsed();
        java.lang.Appendable appendable9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable9, readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        int int10 = dateTimeFormatter9.getDefaultYear();
        java.io.Writer writer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.Chronology chronology11 = dateTimeFormatter8.getChronology();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int8 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 1);
        boolean boolean10 = dateTimeFormatter7.isParser();
        java.io.Writer writer11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 100);
        org.joda.time.ReadWritableInstant readWritableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTimeFormatter4.parseInto(readWritableInstant7, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        int int11 = dateTimeFormatter8.getDefaultYear();
        boolean boolean12 = dateTimeFormatter8.isOffsetParsed();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer13, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.ReadWritableInstant readWritableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dateTimeFormatter2.parseInto(readWritableInstant10, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withLocale(locale14);
        java.io.Writer writer16 = null;
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer16, readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter20.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter12.withZone(dateTimeZone21);
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter22.printTo(stringBuffer23, readablePartial24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter5.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withChronology(chronology9);
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.io.Writer writer14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = dateTimeFormatter7.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withChronology(chronology13);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer15, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter8.parseInto(readWritableInstant11, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withDefaultYear(0);
        java.lang.Class<?> wildcardClass18 = dateTimeFormatter17.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withLocale(locale14);
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(stringBuffer16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        boolean boolean8 = dateTimeFormatter7.isParser();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear(2000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter10.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter10.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 2000);
        java.lang.Class<?> wildcardClass13 = dateTimeFormatter10.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        boolean boolean24 = dateTimeFormatter23.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withPivotYear(0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withChronology(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withLocale(locale33);
        java.lang.Integer int35 = dateTimeFormatter32.getPivotYear();
        int int36 = dateTimeFormatter32.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter32.withZone(dateTimeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        java.lang.Integer int40 = dateTimeFormatter38.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter38.getParser();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter38.withZone(dateTimeZone42);
        org.joda.time.format.DateTimePrinter dateTimePrinter44 = null;
        org.joda.time.format.DateTimeParser dateTimeParser45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter44, dateTimeParser45);
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withLocale(locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter46.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter46.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeFormatter51.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter38.withZone(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter29.withZone(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter20.withZone(dateTimeZone54);
        org.joda.time.format.DateTimePrinter dateTimePrinter58 = dateTimeFormatter20.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTimeFormatter20.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter2.withZone(dateTimeZone59);
        java.lang.Appendable appendable61 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable61, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNull(dateTimeParser10);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2000 + "'", int36 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNull(dateTimePrinter58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeFormatter2.print(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = dateTimeFormatter14.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter2.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 100);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        org.joda.time.Chronology chronology13 = dateTimeFormatter11.getChronolgy();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withLocale(locale14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter11.getChronology();
        java.lang.Appendable appendable17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable17, readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology11 = dateTimeFormatter2.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(chronology11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale11 = dateTimeFormatter9.getLocale();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 10);
        java.lang.Appendable appendable16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable16, readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withChronology(chronology13);
        org.joda.time.ReadWritableInstant readWritableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter12.parseInto(readWritableInstant15, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        int int13 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter10.print(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.lang.Appendable appendable14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable14, readableInstant15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withDefaultYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter5.print((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter15.print((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable4, readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(0);
        boolean boolean8 = dateTimeFormatter7.isParser();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withLocale(locale9);
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter12.parseInto(readWritableInstant13, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        java.lang.Integer int13 = dateTimeFormatter10.getPivotYear();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        java.lang.Integer int18 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter16.getParser();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter29.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter7.withZone(dateTimeZone32);
        java.util.Locale locale35 = dateTimeFormatter7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long37 = dateTimeFormatter7.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(locale35);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withLocale(locale5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = dateTimeFormatter4.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronology();
        java.io.Writer writer13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer13, readableInstant14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = dateTimeFormatter11.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withChronology(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter7.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }
}

