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
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray16);
        java.lang.Throwable[] throwableArray21 = arithmeticException20.getSuppressed();
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, (java.lang.Object[]) throwableArray21);
        java.text.ParseException parseException23 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable3, (java.lang.Object[]) throwableArray21);
        java.lang.IllegalStateException illegalStateException24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray21);
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray21);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(parseException23);
        org.junit.Assert.assertNotNull(illegalStateException24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, (java.lang.Object[]) throwableArray14);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) noSuchElementException20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(noSuchElementException20);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.io.EOFException eOFException12 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray10);
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray10);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray10);
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable18, objArray24);
        java.lang.Throwable[] throwableArray26 = concurrentModificationException25.getSuppressed();
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable17, (java.lang.Object[]) throwableArray26);
        java.lang.ArithmeticException arithmeticException28 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable16, (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.MathRuntimeException mathRuntimeException29 = new org.apache.commons.math.MathRuntimeException(localizable15, (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException42 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable35, objArray41);
        java.text.ParseException parseException43 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable34, objArray41);
        java.lang.IllegalArgumentException illegalArgumentException44 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable32, objArray41);
        java.lang.ArithmeticException arithmeticException45 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable31, objArray41);
        org.apache.commons.math.MathRuntimeException mathRuntimeException46 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException29, localizable30, objArray41);
        org.apache.commons.math.exception.util.Localizable localizable47 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        org.apache.commons.math.exception.util.Localizable localizable50 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable50, objArray57);
        java.lang.ArithmeticException arithmeticException59 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable49, objArray57);
        java.util.ConcurrentModificationException concurrentModificationException60 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable48, objArray57);
        org.apache.commons.math.MathRuntimeException mathRuntimeException61 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException46, localizable47, objArray57);
        arithmeticException14.addSuppressed((java.lang.Throwable) mathRuntimeException46);
        java.lang.Throwable[] throwableArray63 = mathRuntimeException46.getSuppressed();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(eOFException12);
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(arithmeticException28);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException42);
        org.junit.Assert.assertNotNull(parseException43);
        org.junit.Assert.assertNotNull(illegalArgumentException44);
        org.junit.Assert.assertNotNull(arithmeticException45);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException58);
        org.junit.Assert.assertNotNull(arithmeticException59);
        org.junit.Assert.assertNotNull(concurrentModificationException60);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray13);
        java.lang.Throwable[] throwableArray18 = noSuchElementException17.getSuppressed();
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray18);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray18);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(eOFException21);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException10 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray9);
        java.lang.Throwable[] throwableArray11 = illegalStateException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException13 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray11);
        java.lang.IllegalArgumentException illegalArgumentException14 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException13);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(illegalArgumentException14);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray15);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 1, localizable3, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray15);
        java.lang.IllegalStateException illegalStateException23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, objArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException24 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) illegalStateException23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(illegalStateException23);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray16);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray16);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray16);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = concurrentModificationException25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(concurrentModificationException25);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.text.ParseException parseException14 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray12);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray12);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable2, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray12);
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException32 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable24, objArray31);
        java.io.EOFException eOFException33 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable23, objArray31);
        java.lang.Throwable[] throwableArray34 = eOFException33.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException35 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable22, (java.lang.Object[]) throwableArray34);
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable21, (java.lang.Object[]) throwableArray34);
        java.lang.ArithmeticException arithmeticException37 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable20, (java.lang.Object[]) throwableArray34);
        java.util.NoSuchElementException noSuchElementException38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable19, (java.lang.Object[]) throwableArray34);
        org.apache.commons.math.MathRuntimeException mathRuntimeException39 = new org.apache.commons.math.MathRuntimeException(localizable18, (java.lang.Object[]) throwableArray34);
        mathRuntimeException17.addSuppressed((java.lang.Throwable) mathRuntimeException39);
        java.lang.Throwable[] throwableArray41 = mathRuntimeException17.getSuppressed();
        java.lang.RuntimeException runtimeException42 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException17);
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable45 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        org.apache.commons.math.exception.util.Localizable localizable50 = null;
        org.apache.commons.math.exception.util.Localizable localizable51 = null;
        org.apache.commons.math.exception.util.Localizable localizable52 = null;
        org.apache.commons.math.exception.util.Localizable localizable54 = null;
        org.apache.commons.math.exception.util.Localizable localizable55 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException62 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable55, objArray61);
        java.text.ParseException parseException63 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable54, objArray61);
        java.lang.IllegalStateException illegalStateException64 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable52, objArray61);
        java.lang.IllegalArgumentException illegalArgumentException65 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable51, objArray61);
        java.lang.IllegalArgumentException illegalArgumentException66 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable50, objArray61);
        org.apache.commons.math.MathRuntimeException mathRuntimeException67 = new org.apache.commons.math.MathRuntimeException(localizable49, objArray61);
        java.text.ParseException parseException68 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable48, objArray61);
        java.lang.IllegalArgumentException illegalArgumentException69 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable46, objArray61);
        java.util.ConcurrentModificationException concurrentModificationException70 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable45, objArray61);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException71 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable44, objArray61);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException17.addMessage(localizable43, objArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(parseException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException32);
        org.junit.Assert.assertNotNull(eOFException33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException35);
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(arithmeticException37);
        org.junit.Assert.assertNotNull(noSuchElementException38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(runtimeException42);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException62);
        org.junit.Assert.assertNotNull(parseException63);
        org.junit.Assert.assertNotNull(illegalStateException64);
        org.junit.Assert.assertNotNull(illegalArgumentException65);
        org.junit.Assert.assertNotNull(illegalArgumentException66);
        org.junit.Assert.assertNotNull(parseException68);
        org.junit.Assert.assertNotNull(illegalArgumentException69);
        org.junit.Assert.assertNotNull(concurrentModificationException70);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException71);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable3, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException22);
        java.lang.Throwable[] throwableArray24 = mathRuntimeException23.getSuppressed();
        java.io.EOFException eOFException25 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray24);
        java.lang.IllegalStateException illegalStateException26 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray24);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(eOFException25);
        org.junit.Assert.assertNotNull(illegalStateException26);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable5, objArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable4, objArray16);
        java.lang.IllegalStateException illegalStateException23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray16);
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray16);
        java.lang.IllegalArgumentException illegalArgumentException25 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray16);
        java.lang.IllegalStateException illegalStateException26 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, objArray16);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(illegalStateException23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(illegalStateException26);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable4, objArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException24 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray16);
        java.lang.IllegalStateException illegalStateException25 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray16);
        java.io.EOFException eOFException26 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException27 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) eOFException26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException24);
        org.junit.Assert.assertNotNull(illegalStateException25);
        org.junit.Assert.assertNotNull(eOFException26);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray15);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray15);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray15);
        java.lang.Throwable[] throwableArray22 = arithmeticException21.getSuppressed();
        java.text.ParseException parseException23 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable2, (java.lang.Object[]) throwableArray22);
        java.lang.ArithmeticException arithmeticException24 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray22);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(parseException23);
        org.junit.Assert.assertNotNull(arithmeticException24);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException20);
        java.lang.Throwable[] throwableArray22 = mathRuntimeException21.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet23 = mathRuntimeException21.getContextKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.text.ParseException parseException14 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray12);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray12);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray12);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray12);
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, objArray33);
        java.io.EOFException eOFException35 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable25, objArray33);
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray33);
        java.lang.ArithmeticException arithmeticException37 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable23, objArray33);
        java.lang.Throwable[] throwableArray38 = arithmeticException37.getSuppressed();
        java.text.ParseException parseException39 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable22, (java.lang.Object[]) throwableArray38);
        java.text.ParseException parseException40 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable20, (java.lang.Object[]) throwableArray38);
        java.util.NoSuchElementException noSuchElementException41 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable18, (java.lang.Object[]) throwableArray38);
        arrayIndexOutOfBoundsException17.addSuppressed((java.lang.Throwable) noSuchElementException41);
        java.lang.Throwable[] throwableArray43 = arrayIndexOutOfBoundsException17.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException44 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray43);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(parseException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException34);
        org.junit.Assert.assertNotNull(eOFException35);
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(arithmeticException37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(parseException39);
        org.junit.Assert.assertNotNull(parseException40);
        org.junit.Assert.assertNotNull(noSuchElementException41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException44);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray11);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray11);
        java.lang.IllegalArgumentException illegalArgumentException16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray11);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(illegalArgumentException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray15 = arithmeticException14.getSuppressed();
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable2, (java.lang.Object[]) throwableArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray15);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray17);
        java.lang.Throwable[] throwableArray22 = arithmeticException21.getSuppressed();
        java.text.ParseException parseException23 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, (java.lang.Object[]) throwableArray22);
        java.text.ParseException parseException24 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable4, (java.lang.Object[]) throwableArray22);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException25 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException26 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.MathRuntimeException mathRuntimeException27 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray22);
        java.lang.Throwable[] throwableArray28 = mathRuntimeException27.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException41 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable33, objArray40);
        java.io.EOFException eOFException42 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable32, objArray40);
        java.util.ConcurrentModificationException concurrentModificationException43 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable31, objArray40);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException44 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable30, objArray40);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException27.setContext("java.lang.IllegalArgumentException: ", (java.lang.Object) localizable30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(parseException23);
        org.junit.Assert.assertNotNull(parseException24);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException25);
        org.junit.Assert.assertNotNull(eOFException26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException41);
        org.junit.Assert.assertNotNull(eOFException42);
        org.junit.Assert.assertNotNull(concurrentModificationException43);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException44);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable10, objArray16);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable9, objArray16);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable7, objArray16);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable6, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray16);
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable27, objArray33);
        java.lang.Throwable[] throwableArray35 = concurrentModificationException34.getSuppressed();
        java.lang.IllegalStateException illegalStateException36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, (java.lang.Object[]) throwableArray35);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException37 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable25, (java.lang.Object[]) throwableArray35);
        java.lang.ArithmeticException arithmeticException38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, (java.lang.Object[]) throwableArray35);
        java.lang.IllegalArgumentException illegalArgumentException39 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable23, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.MathRuntimeException mathRuntimeException40 = new org.apache.commons.math.MathRuntimeException(localizable22, (java.lang.Object[]) throwableArray35);
        concurrentModificationException21.addSuppressed((java.lang.Throwable) mathRuntimeException40);
        java.lang.Throwable[] throwableArray42 = mathRuntimeException40.getSuppressed();
        java.text.ParseException parseException43 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) -1, localizable3, (java.lang.Object[]) throwableArray42);
        java.lang.IllegalStateException illegalStateException44 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray42);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException45 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException46 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) arrayIndexOutOfBoundsException45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(illegalStateException36);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException37);
        org.junit.Assert.assertNotNull(arithmeticException38);
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(parseException43);
        org.junit.Assert.assertNotNull(illegalStateException44);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException45);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable5, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException24 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException23);
        java.io.IOException iOException25 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) mathRuntimeException23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet26 = mathRuntimeException23.getContextKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(illegalArgumentException24);
        org.junit.Assert.assertNotNull(iOException25);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray15);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray15);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException24 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException24);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray16);
        java.lang.Throwable[] throwableArray21 = arithmeticException20.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, (java.lang.Object[]) throwableArray21);
        java.lang.IllegalArgumentException illegalArgumentException23 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, (java.lang.Object[]) throwableArray21);
        java.lang.Throwable[] throwableArray24 = illegalArgumentException23.getSuppressed();
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray24);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, (java.lang.Object[]) throwableArray24);
        org.apache.commons.math.MathRuntimeException mathRuntimeException27 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray24);
        java.lang.Throwable[] throwableArray28 = mathRuntimeException27.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException29 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray28);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(illegalArgumentException23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray13);
        java.lang.Throwable[] throwableArray18 = arithmeticException17.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray18);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray18);
        java.lang.Throwable[] throwableArray21 = illegalArgumentException20.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = concurrentModificationException22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.io.EOFException eOFException12 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray10);
        java.lang.Throwable[] throwableArray13 = eOFException12.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException14 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException15 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = mathRuntimeException15.getContext("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(eOFException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException14);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException16);
        java.lang.Throwable[] throwableArray18 = mathRuntimeException16.getSuppressed();
        java.lang.String str19 = mathRuntimeException16.toString();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathRuntimeException: " + "'", str19, "org.apache.commons.math.MathRuntimeException: ");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException10 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray9);
        java.lang.Throwable[] throwableArray11 = illegalStateException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException13 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray11);
        java.lang.Class<?> wildcardClass14 = mathRuntimeException13.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray11);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        java.lang.Throwable[] throwableArray17 = mathRuntimeException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = mathRuntimeException16.getContext("java.lang.IllegalArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray13);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray13);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, (java.lang.Object[]) throwableArray13);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray13);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray13);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray13);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException19 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) arithmeticException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray17);
        java.lang.IllegalStateException illegalStateException22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray17);
        java.lang.IllegalStateException illegalStateException23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray17);
        java.text.ParseException parseException24 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable4, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException25 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray17);
        java.lang.Throwable[] throwableArray27 = arrayIndexOutOfBoundsException26.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray27);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(illegalStateException22);
        org.junit.Assert.assertNotNull(illegalStateException23);
        org.junit.Assert.assertNotNull(parseException24);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException25);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(illegalArgumentException28);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException11 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray10);
        java.lang.Throwable[] throwableArray12 = concurrentModificationException11.getSuppressed();
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray12);
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray12);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable1, (java.lang.Object[]) throwableArray12);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(parseException15);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.io.EOFException eOFException16 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray14);
        java.lang.Throwable[] throwableArray17 = eOFException16.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, (java.lang.Object[]) throwableArray17);
        java.lang.Throwable[] throwableArray19 = arrayIndexOutOfBoundsException18.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray19);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray19);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray19);
        java.text.ParseException parseException23 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable1, (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(eOFException16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(eOFException22);
        org.junit.Assert.assertNotNull(parseException23);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray17 = mathRuntimeException16.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray30);
        java.lang.Throwable[] throwableArray32 = concurrentModificationException31.getSuppressed();
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable23, (java.lang.Object[]) throwableArray32);
        java.util.NoSuchElementException noSuchElementException34 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable22, (java.lang.Object[]) throwableArray32);
        java.lang.IllegalArgumentException illegalArgumentException35 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable21, (java.lang.Object[]) throwableArray32);
        java.io.EOFException eOFException36 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable20, (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.MathRuntimeException mathRuntimeException37 = new org.apache.commons.math.MathRuntimeException(localizable19, (java.lang.Object[]) throwableArray32);
        concurrentModificationException18.addSuppressed((java.lang.Throwable) mathRuntimeException37);
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        org.apache.commons.math.exception.util.Localizable localizable40 = null;
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        java.lang.Object[] objArray51 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException52 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable44, objArray51);
        java.lang.ArithmeticException arithmeticException53 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable43, objArray51);
        java.util.ConcurrentModificationException concurrentModificationException54 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable42, objArray51);
        java.util.NoSuchElementException noSuchElementException55 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable41, objArray51);
        org.apache.commons.math.MathRuntimeException mathRuntimeException56 = new org.apache.commons.math.MathRuntimeException(localizable40, objArray51);
        java.lang.Throwable[] throwableArray57 = mathRuntimeException56.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable58 = null;
        org.apache.commons.math.exception.util.Localizable localizable59 = null;
        org.apache.commons.math.exception.util.Localizable localizable60 = null;
        org.apache.commons.math.exception.util.Localizable localizable61 = null;
        org.apache.commons.math.exception.util.Localizable localizable62 = null;
        org.apache.commons.math.exception.util.Localizable localizable63 = null;
        org.apache.commons.math.exception.util.Localizable localizable64 = null;
        org.apache.commons.math.exception.util.Localizable localizable65 = null;
        org.apache.commons.math.exception.util.Localizable localizable66 = null;
        org.apache.commons.math.exception.util.Localizable localizable67 = null;
        org.apache.commons.math.exception.util.Localizable localizable68 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException76 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable68, objArray75);
        java.io.EOFException eOFException77 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable67, objArray75);
        java.util.ConcurrentModificationException concurrentModificationException78 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable66, objArray75);
        java.lang.ArithmeticException arithmeticException79 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable65, objArray75);
        java.lang.Throwable[] throwableArray80 = arithmeticException79.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException81 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable64, (java.lang.Object[]) throwableArray80);
        java.lang.IllegalArgumentException illegalArgumentException82 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable63, (java.lang.Object[]) throwableArray80);
        java.lang.Throwable[] throwableArray83 = illegalArgumentException82.getSuppressed();
        java.util.NoSuchElementException noSuchElementException84 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable62, (java.lang.Object[]) throwableArray83);
        java.lang.IllegalArgumentException illegalArgumentException85 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable61, (java.lang.Object[]) throwableArray83);
        org.apache.commons.math.MathRuntimeException mathRuntimeException86 = new org.apache.commons.math.MathRuntimeException(localizable60, (java.lang.Object[]) throwableArray83);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException87 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable59, (java.lang.Object[]) throwableArray83);
        org.apache.commons.math.MathRuntimeException mathRuntimeException88 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException56, localizable58, (java.lang.Object[]) throwableArray83);
        java.io.EOFException eOFException89 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable39, (java.lang.Object[]) throwableArray83);
        concurrentModificationException18.addSuppressed((java.lang.Throwable) eOFException89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException91 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) concurrentModificationException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(illegalStateException33);
        org.junit.Assert.assertNotNull(noSuchElementException34);
        org.junit.Assert.assertNotNull(illegalArgumentException35);
        org.junit.Assert.assertNotNull(eOFException36);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException52);
        org.junit.Assert.assertNotNull(arithmeticException53);
        org.junit.Assert.assertNotNull(concurrentModificationException54);
        org.junit.Assert.assertNotNull(noSuchElementException55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException76);
        org.junit.Assert.assertNotNull(eOFException77);
        org.junit.Assert.assertNotNull(concurrentModificationException78);
        org.junit.Assert.assertNotNull(arithmeticException79);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException81);
        org.junit.Assert.assertNotNull(illegalArgumentException82);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(noSuchElementException84);
        org.junit.Assert.assertNotNull(illegalArgumentException85);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException87);
        org.junit.Assert.assertNotNull(eOFException89);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, (java.lang.Object[]) throwableArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray13);
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable12, objArray19);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable11, objArray19);
        java.lang.Throwable[] throwableArray22 = eOFException21.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable10, (java.lang.Object[]) throwableArray22);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, (java.lang.Object[]) throwableArray22);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, (java.lang.Object[]) throwableArray22);
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable7, (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.MathRuntimeException mathRuntimeException27 = new org.apache.commons.math.MathRuntimeException(localizable6, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException28 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, (java.lang.Object[]) throwableArray22);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException29 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray22);
        java.text.ParseException parseException30 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable3, (java.lang.Object[]) throwableArray22);
        java.util.NoSuchElementException noSuchElementException31 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray22);
        java.util.NoSuchElementException noSuchElementException32 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray22);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(arithmeticException25);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(eOFException28);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException29);
        org.junit.Assert.assertNotNull(parseException30);
        org.junit.Assert.assertNotNull(noSuchElementException31);
        org.junit.Assert.assertNotNull(noSuchElementException32);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable11, objArray18);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable10, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray18);
        java.io.EOFException eOFException23 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray18);
        java.text.ParseException parseException24 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException27 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray18);
        java.text.ParseException parseException28 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 0, localizable1, objArray18);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(eOFException23);
        org.junit.Assert.assertNotNull(parseException24);
        org.junit.Assert.assertNotNull(concurrentModificationException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertNotNull(parseException28);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException11 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray10);
        java.text.ParseException parseException12 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable3, objArray10);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, objArray10);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException15 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException15);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException11);
        org.junit.Assert.assertNotNull(parseException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.lang.Throwable[] throwableArray16 = concurrentModificationException15.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, (java.lang.Object[]) throwableArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, (java.lang.Object[]) throwableArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, (java.lang.Object[]) throwableArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray16);
        java.lang.Throwable[] throwableArray21 = arrayIndexOutOfBoundsException20.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable3, (java.lang.Object[]) throwableArray21);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray21);
        java.lang.IllegalStateException illegalStateException24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray21);
        org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray21);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException25);
        java.lang.Throwable[] throwableArray27 = illegalArgumentException26.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException42 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable35, objArray41);
        java.lang.Throwable[] throwableArray43 = concurrentModificationException42.getSuppressed();
        java.lang.IllegalStateException illegalStateException44 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable34, (java.lang.Object[]) throwableArray43);
        java.util.NoSuchElementException noSuchElementException45 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable33, (java.lang.Object[]) throwableArray43);
        java.lang.IllegalArgumentException illegalArgumentException46 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable32, (java.lang.Object[]) throwableArray43);
        java.io.EOFException eOFException47 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable31, (java.lang.Object[]) throwableArray43);
        java.lang.IllegalArgumentException illegalArgumentException48 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable30, (java.lang.Object[]) throwableArray43);
        java.util.NoSuchElementException noSuchElementException49 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable29, (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.MathRuntimeException mathRuntimeException50 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) illegalArgumentException26, localizable28, (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.exception.util.Localizable localizable51 = null;
        org.apache.commons.math.exception.util.Localizable localizable52 = null;
        org.apache.commons.math.exception.util.Localizable localizable53 = null;
        org.apache.commons.math.exception.util.Localizable localizable54 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException62 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable54, objArray61);
        java.lang.Throwable[] throwableArray63 = illegalStateException62.getSuppressed();
        java.lang.IllegalStateException illegalStateException64 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable53, (java.lang.Object[]) throwableArray63);
        java.lang.ArithmeticException arithmeticException65 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable52, (java.lang.Object[]) throwableArray63);
        java.io.EOFException eOFException66 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable51, (java.lang.Object[]) throwableArray63);
        illegalArgumentException26.addSuppressed((java.lang.Throwable) eOFException66);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(illegalStateException24);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(illegalStateException44);
        org.junit.Assert.assertNotNull(noSuchElementException45);
        org.junit.Assert.assertNotNull(illegalArgumentException46);
        org.junit.Assert.assertNotNull(eOFException47);
        org.junit.Assert.assertNotNull(illegalArgumentException48);
        org.junit.Assert.assertNotNull(noSuchElementException49);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(illegalStateException64);
        org.junit.Assert.assertNotNull(arithmeticException65);
        org.junit.Assert.assertNotNull(eOFException66);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        java.lang.Object[] objArray2 = null;
        java.text.ParseException parseException3 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable1, objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) parseException3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseException3);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException35 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable28, objArray34);
        java.text.ParseException parseException36 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable27, objArray34);
        java.lang.IllegalStateException illegalStateException37 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable25, objArray34);
        java.lang.IllegalArgumentException illegalArgumentException38 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable24, objArray34);
        java.lang.IllegalArgumentException illegalArgumentException39 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable23, objArray34);
        org.apache.commons.math.MathRuntimeException mathRuntimeException40 = new org.apache.commons.math.MathRuntimeException(localizable22, objArray34);
        concurrentModificationException21.addSuppressed((java.lang.Throwable) mathRuntimeException40);
        java.lang.Throwable[] throwableArray42 = mathRuntimeException40.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException43 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray42);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException35);
        org.junit.Assert.assertNotNull(parseException36);
        org.junit.Assert.assertNotNull(illegalStateException37);
        org.junit.Assert.assertNotNull(illegalArgumentException38);
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException43);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray14);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, (java.lang.Object[]) throwableArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray14);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.text.ParseException parseException13 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, objArray11);
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray11);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 10, localizable1, objArray11);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(parseException13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(parseException15);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray17 = mathRuntimeException16.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray30);
        java.lang.Throwable[] throwableArray32 = concurrentModificationException31.getSuppressed();
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable23, (java.lang.Object[]) throwableArray32);
        java.util.NoSuchElementException noSuchElementException34 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable22, (java.lang.Object[]) throwableArray32);
        java.lang.IllegalArgumentException illegalArgumentException35 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable21, (java.lang.Object[]) throwableArray32);
        java.io.EOFException eOFException36 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable20, (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.MathRuntimeException mathRuntimeException37 = new org.apache.commons.math.MathRuntimeException(localizable19, (java.lang.Object[]) throwableArray32);
        concurrentModificationException18.addSuppressed((java.lang.Throwable) mathRuntimeException37);
        org.apache.commons.math.exception.util.Localizable localizable40 = null;
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException50 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable43, objArray49);
        java.lang.Throwable[] throwableArray51 = concurrentModificationException50.getSuppressed();
        java.lang.IllegalStateException illegalStateException52 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable42, (java.lang.Object[]) throwableArray51);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException53 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable41, (java.lang.Object[]) throwableArray51);
        java.lang.ArithmeticException arithmeticException54 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable40, (java.lang.Object[]) throwableArray51);
        java.lang.Throwable[] throwableArray55 = arithmeticException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = arithmeticException54.getSuppressed();
        java.lang.Throwable[] throwableArray57 = arithmeticException54.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException37.setContext("", (java.lang.Object) throwableArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(illegalStateException33);
        org.junit.Assert.assertNotNull(noSuchElementException34);
        org.junit.Assert.assertNotNull(illegalArgumentException35);
        org.junit.Assert.assertNotNull(eOFException36);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(illegalStateException52);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException53);
        org.junit.Assert.assertNotNull(arithmeticException54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.lang.Throwable[] throwableArray15 = concurrentModificationException14.getSuppressed();
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, (java.lang.Object[]) throwableArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, (java.lang.Object[]) throwableArray15);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, (java.lang.Object[]) throwableArray15);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) '4', localizable3, (java.lang.Object[]) throwableArray15);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable1, (java.lang.Object[]) throwableArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = parseException20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(parseException20);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray16);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException23 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray16);
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException37 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable30, objArray36);
        java.text.ParseException parseException38 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable29, objArray36);
        java.lang.IllegalStateException illegalStateException39 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable27, objArray36);
        java.lang.IllegalArgumentException illegalArgumentException40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable26, objArray36);
        java.lang.IllegalArgumentException illegalArgumentException41 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable25, objArray36);
        org.apache.commons.math.MathRuntimeException mathRuntimeException42 = new org.apache.commons.math.MathRuntimeException(localizable24, objArray36);
        concurrentModificationException23.addSuppressed((java.lang.Throwable) mathRuntimeException42);
        java.lang.Throwable[] throwableArray44 = mathRuntimeException42.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException45 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, (java.lang.Object[]) throwableArray44);
        org.apache.commons.math.MathRuntimeException mathRuntimeException46 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray44);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException47 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException48 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) arrayIndexOutOfBoundsException47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(concurrentModificationException23);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException37);
        org.junit.Assert.assertNotNull(parseException38);
        org.junit.Assert.assertNotNull(illegalStateException39);
        org.junit.Assert.assertNotNull(illegalArgumentException40);
        org.junit.Assert.assertNotNull(illegalArgumentException41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(illegalArgumentException45);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException47);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable2, objArray14);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(eOFException21);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray12);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(throwable16);
        concurrentModificationException15.addSuppressed((java.lang.Throwable) mathRuntimeException17);
        java.lang.Throwable[] throwableArray19 = mathRuntimeException17.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable2, (java.lang.Object[]) throwableArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, (java.lang.Object[]) throwableArray19);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException23 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) eOFException22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(eOFException22);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable3, objArray15);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable2, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray15);
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException42 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable34, objArray41);
        java.io.EOFException eOFException43 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable33, objArray41);
        java.util.ConcurrentModificationException concurrentModificationException44 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable32, objArray41);
        java.lang.ArithmeticException arithmeticException45 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable31, objArray41);
        java.lang.Throwable[] throwableArray46 = arithmeticException45.getSuppressed();
        java.text.ParseException parseException47 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable30, (java.lang.Object[]) throwableArray46);
        java.text.ParseException parseException48 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable28, (java.lang.Object[]) throwableArray46);
        java.util.NoSuchElementException noSuchElementException49 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable26, (java.lang.Object[]) throwableArray46);
        java.lang.IllegalArgumentException illegalArgumentException50 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable25, (java.lang.Object[]) throwableArray46);
        java.lang.IllegalArgumentException illegalArgumentException51 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable24, (java.lang.Object[]) throwableArray46);
        arrayIndexOutOfBoundsException23.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException42);
        org.junit.Assert.assertNotNull(eOFException43);
        org.junit.Assert.assertNotNull(concurrentModificationException44);
        org.junit.Assert.assertNotNull(arithmeticException45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(parseException47);
        org.junit.Assert.assertNotNull(parseException48);
        org.junit.Assert.assertNotNull(noSuchElementException49);
        org.junit.Assert.assertNotNull(illegalArgumentException50);
        org.junit.Assert.assertNotNull(illegalArgumentException51);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable12, objArray18);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable11, objArray18);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray18);
        java.lang.IllegalStateException illegalStateException22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray18);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray18);
        java.lang.ArithmeticException arithmeticException26 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray18);
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException28 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray18);
        java.lang.IllegalStateException illegalStateException29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray18);
        java.util.NoSuchElementException noSuchElementException30 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray18);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(illegalStateException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(arithmeticException25);
        org.junit.Assert.assertNotNull(arithmeticException26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(concurrentModificationException28);
        org.junit.Assert.assertNotNull(illegalStateException29);
        org.junit.Assert.assertNotNull(noSuchElementException30);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException35 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable28, objArray34);
        java.lang.Throwable[] throwableArray36 = concurrentModificationException35.getSuppressed();
        java.lang.IllegalStateException illegalStateException37 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable27, (java.lang.Object[]) throwableArray36);
        java.util.NoSuchElementException noSuchElementException38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable26, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math.MathRuntimeException mathRuntimeException39 = new org.apache.commons.math.MathRuntimeException(localizable25, (java.lang.Object[]) throwableArray36);
        java.lang.IllegalStateException illegalStateException40 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable24, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math.MathRuntimeException mathRuntimeException41 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException22, localizable23, (java.lang.Object[]) throwableArray36);
        java.lang.Throwable[] throwableArray42 = mathRuntimeException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException43 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException22);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(illegalStateException37);
        org.junit.Assert.assertNotNull(noSuchElementException38);
        org.junit.Assert.assertNotNull(illegalStateException40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(illegalArgumentException43);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.io.EOFException eOFException12 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray10);
        java.lang.Throwable[] throwableArray13 = eOFException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) eOFException15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(eOFException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException15 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray11);
        java.lang.Throwable[] throwableArray16 = mathRuntimeException15.getSuppressed();
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException18 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) illegalStateException17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(illegalStateException17);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray14);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray18 = concurrentModificationException17.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = concurrentModificationException17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray12);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray12);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException17);
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray30);
        java.lang.Throwable[] throwableArray32 = concurrentModificationException31.getSuppressed();
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable23, (java.lang.Object[]) throwableArray32);
        java.lang.ArithmeticException arithmeticException34 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable22, (java.lang.Object[]) throwableArray32);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException35 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable21, (java.lang.Object[]) throwableArray32);
        java.util.NoSuchElementException noSuchElementException36 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable20, (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.MathRuntimeException mathRuntimeException37 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException17, localizable19, (java.lang.Object[]) throwableArray32);
        java.lang.IllegalStateException illegalStateException38 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray32);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(illegalStateException33);
        org.junit.Assert.assertNotNull(arithmeticException34);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException35);
        org.junit.Assert.assertNotNull(noSuchElementException36);
        org.junit.Assert.assertNotNull(illegalStateException38);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalArgumentException illegalArgumentException16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable3, (java.lang.Object[]) throwableArray14);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 100, localizable2, (java.lang.Object[]) throwableArray14);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(throwable21);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable28, objArray35);
        java.lang.ArithmeticException arithmeticException37 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable27, objArray35);
        java.util.ConcurrentModificationException concurrentModificationException38 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, objArray35);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException40 = new org.apache.commons.math.MathRuntimeException(throwable39);
        concurrentModificationException38.addSuppressed((java.lang.Throwable) mathRuntimeException40);
        java.lang.Throwable[] throwableArray42 = mathRuntimeException40.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException43 = new org.apache.commons.math.MathRuntimeException(localizable25, (java.lang.Object[]) throwableArray42);
        java.lang.ArithmeticException arithmeticException44 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, (java.lang.Object[]) throwableArray42);
        java.lang.Throwable[] throwableArray45 = arithmeticException44.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException46 = new org.apache.commons.math.MathRuntimeException(throwable21, localizable23, (java.lang.Object[]) throwableArray45);
        java.util.NoSuchElementException noSuchElementException47 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable20, (java.lang.Object[]) throwableArray45);
        eOFException19.addSuppressed((java.lang.Throwable) noSuchElementException47);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(illegalArgumentException16);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException36);
        org.junit.Assert.assertNotNull(arithmeticException37);
        org.junit.Assert.assertNotNull(concurrentModificationException38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(arithmeticException44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(noSuchElementException47);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray13);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray13);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray13);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray13);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray14);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray14);
        java.lang.IllegalStateException illegalStateException21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException32 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, objArray31);
        java.lang.Throwable[] throwableArray33 = concurrentModificationException32.getSuppressed();
        java.lang.IllegalStateException illegalStateException34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable24, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.MathRuntimeException mathRuntimeException35 = new org.apache.commons.math.MathRuntimeException(localizable23, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException46 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable39, objArray45);
        java.lang.Throwable[] throwableArray47 = concurrentModificationException46.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException48 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable38, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException49 = new org.apache.commons.math.MathRuntimeException(localizable37, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException50 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException35, localizable36, (java.lang.Object[]) throwableArray47);
        arrayIndexOutOfBoundsException22.addSuppressed((java.lang.Throwable) mathRuntimeException35);
        org.apache.commons.math.exception.util.Localizable localizable52 = null;
        org.apache.commons.math.exception.util.Localizable localizable53 = null;
        org.apache.commons.math.exception.util.Localizable localizable54 = null;
        org.apache.commons.math.exception.util.Localizable localizable55 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException62 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable55, objArray61);
        java.lang.Throwable[] throwableArray63 = concurrentModificationException62.getSuppressed();
        java.io.EOFException eOFException64 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable54, (java.lang.Object[]) throwableArray63);
        java.lang.IllegalArgumentException illegalArgumentException65 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable53, (java.lang.Object[]) throwableArray63);
        java.lang.Throwable[] throwableArray66 = illegalArgumentException65.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException67 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException35, localizable52, (java.lang.Object[]) throwableArray66);
        org.apache.commons.math.MathRuntimeException mathRuntimeException68 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException67);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(illegalStateException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(illegalStateException34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(concurrentModificationException48);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(eOFException64);
        org.junit.Assert.assertNotNull(illegalArgumentException65);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.text.ParseException parseException14 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray12);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray12);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray12);
        java.lang.Throwable[] throwableArray19 = mathRuntimeException18.getSuppressed();
        java.lang.RuntimeException runtimeException20 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException18);
        java.lang.Throwable[] throwableArray21 = runtimeException20.getSuppressed();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(parseException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(runtimeException20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray15);
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray15);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable3, objArray15);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable1, objArray15);
        java.lang.Class<?> wildcardClass23 = parseException22.getClass();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.text.ParseException parseException14 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray12);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray12);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray12);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray12);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray12);
        java.lang.Throwable[] throwableArray19 = illegalArgumentException18.getSuppressed();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(parseException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray16);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable3, (java.lang.Object[]) throwableArray16);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException40 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable33, objArray39);
        java.text.ParseException parseException41 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable32, objArray39);
        java.util.NoSuchElementException noSuchElementException42 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable30, objArray39);
        java.text.ParseException parseException43 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable29, objArray39);
        org.apache.commons.math.MathRuntimeException mathRuntimeException44 = new org.apache.commons.math.MathRuntimeException(localizable27, objArray39);
        java.util.ConcurrentModificationException concurrentModificationException45 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, objArray39);
        java.lang.IllegalStateException illegalStateException46 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable25, objArray39);
        java.lang.ArithmeticException arithmeticException47 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, objArray39);
        java.lang.ArithmeticException arithmeticException48 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable23, objArray39);
        java.util.ConcurrentModificationException concurrentModificationException49 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable22, objArray39);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException20.addMessage(localizable21, objArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException40);
        org.junit.Assert.assertNotNull(parseException41);
        org.junit.Assert.assertNotNull(noSuchElementException42);
        org.junit.Assert.assertNotNull(parseException43);
        org.junit.Assert.assertNotNull(concurrentModificationException45);
        org.junit.Assert.assertNotNull(illegalStateException46);
        org.junit.Assert.assertNotNull(arithmeticException47);
        org.junit.Assert.assertNotNull(arithmeticException48);
        org.junit.Assert.assertNotNull(concurrentModificationException49);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException10 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray9);
        java.lang.Throwable[] throwableArray11 = concurrentModificationException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray11);
        java.util.NoSuchElementException noSuchElementException13 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray11);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray11);
        java.lang.Class<?> wildcardClass15 = eOFException14.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(noSuchElementException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray13);
        java.lang.Throwable[] throwableArray16 = eOFException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, (java.lang.Object[]) throwableArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray16);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable28, objArray35);
        java.io.EOFException eOFException37 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable27, objArray35);
        java.util.ConcurrentModificationException concurrentModificationException38 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, objArray35);
        java.lang.ArithmeticException arithmeticException39 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable25, objArray35);
        java.lang.Throwable[] throwableArray40 = arithmeticException39.getSuppressed();
        java.text.ParseException parseException41 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable24, (java.lang.Object[]) throwableArray40);
        java.text.ParseException parseException42 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable22, (java.lang.Object[]) throwableArray40);
        java.util.NoSuchElementException noSuchElementException43 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable20, (java.lang.Object[]) throwableArray40);
        arrayIndexOutOfBoundsException19.addSuppressed((java.lang.Throwable) noSuchElementException43);
        java.lang.Throwable[] throwableArray45 = arrayIndexOutOfBoundsException19.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException46 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, (java.lang.Object[]) throwableArray45);
        java.lang.Throwable[] throwableArray47 = illegalArgumentException46.getSuppressed();
        java.lang.IllegalStateException illegalStateException48 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray47);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException49 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray47);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException36);
        org.junit.Assert.assertNotNull(eOFException37);
        org.junit.Assert.assertNotNull(concurrentModificationException38);
        org.junit.Assert.assertNotNull(arithmeticException39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(parseException41);
        org.junit.Assert.assertNotNull(parseException42);
        org.junit.Assert.assertNotNull(noSuchElementException43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(illegalArgumentException46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(illegalStateException48);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException49);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray15);
        java.lang.Throwable[] throwableArray20 = arithmeticException19.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray20);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, (java.lang.Object[]) throwableArray20);
        java.lang.IllegalStateException illegalStateException23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray20);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException25 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(illegalStateException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException25);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray14);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray14);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable2, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray14);
        java.lang.RuntimeException runtimeException22 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException21);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException37 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable30, objArray36);
        java.lang.Throwable[] throwableArray38 = concurrentModificationException37.getSuppressed();
        java.lang.IllegalStateException illegalStateException39 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable29, (java.lang.Object[]) throwableArray38);
        java.lang.ArithmeticException arithmeticException40 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable28, (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.MathRuntimeException mathRuntimeException41 = new org.apache.commons.math.MathRuntimeException(localizable27, (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        org.apache.commons.math.exception.util.Localizable localizable47 = null;
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException54 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable47, objArray53);
        java.text.ParseException parseException55 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable46, objArray53);
        java.lang.IllegalArgumentException illegalArgumentException56 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable44, objArray53);
        java.lang.ArithmeticException arithmeticException57 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable43, objArray53);
        org.apache.commons.math.MathRuntimeException mathRuntimeException58 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException41, localizable42, objArray53);
        org.apache.commons.math.exception.util.Localizable localizable59 = null;
        org.apache.commons.math.exception.util.Localizable localizable60 = null;
        org.apache.commons.math.exception.util.Localizable localizable61 = null;
        org.apache.commons.math.exception.util.Localizable localizable62 = null;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException70 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable62, objArray69);
        java.lang.ArithmeticException arithmeticException71 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable61, objArray69);
        java.util.ConcurrentModificationException concurrentModificationException72 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable60, objArray69);
        org.apache.commons.math.MathRuntimeException mathRuntimeException73 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException58, localizable59, objArray69);
        java.lang.ArithmeticException arithmeticException74 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable26, objArray69);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException75 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable25, objArray69);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException76 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable24, objArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException77 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) runtimeException22, localizable23, objArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Locale cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(runtimeException22);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(illegalStateException39);
        org.junit.Assert.assertNotNull(arithmeticException40);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException54);
        org.junit.Assert.assertNotNull(parseException55);
        org.junit.Assert.assertNotNull(illegalArgumentException56);
        org.junit.Assert.assertNotNull(arithmeticException57);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException70);
        org.junit.Assert.assertNotNull(arithmeticException71);
        org.junit.Assert.assertNotNull(concurrentModificationException72);
        org.junit.Assert.assertNotNull(arithmeticException74);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException75);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException76);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.lang.Throwable[] throwableArray19 = eOFException18.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, (java.lang.Object[]) throwableArray19);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, (java.lang.Object[]) throwableArray19);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, (java.lang.Object[]) throwableArray19);
        java.lang.Throwable[] throwableArray23 = arithmeticException22.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException24 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray23);
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable29, objArray35);
        java.lang.IllegalArgumentException illegalArgumentException37 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable28, objArray35);
        java.lang.ArithmeticException arithmeticException38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable27, objArray35);
        java.util.ConcurrentModificationException concurrentModificationException39 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, objArray35);
        org.apache.commons.math.MathRuntimeException mathRuntimeException40 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException24, localizable25, objArray35);
        java.util.ConcurrentModificationException concurrentModificationException41 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray35);
        java.util.ConcurrentModificationException concurrentModificationException42 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray35);
        java.lang.ArithmeticException arithmeticException43 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, objArray35);
        java.lang.IllegalStateException illegalStateException44 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, objArray35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(illegalArgumentException37);
        org.junit.Assert.assertNotNull(arithmeticException38);
        org.junit.Assert.assertNotNull(concurrentModificationException39);
        org.junit.Assert.assertNotNull(concurrentModificationException41);
        org.junit.Assert.assertNotNull(concurrentModificationException42);
        org.junit.Assert.assertNotNull(arithmeticException43);
        org.junit.Assert.assertNotNull(illegalStateException44);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.text.ParseException parseException13 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, objArray11);
        java.lang.IllegalArgumentException illegalArgumentException14 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        java.lang.Throwable[] throwableArray17 = mathRuntimeException16.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable25, objArray32);
        java.io.EOFException eOFException34 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable24, objArray32);
        java.lang.Throwable[] throwableArray35 = eOFException34.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable23, (java.lang.Object[]) throwableArray35);
        java.util.ConcurrentModificationException concurrentModificationException37 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable22, (java.lang.Object[]) throwableArray35);
        java.lang.ArithmeticException arithmeticException38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable21, (java.lang.Object[]) throwableArray35);
        java.util.NoSuchElementException noSuchElementException39 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable20, (java.lang.Object[]) throwableArray35);
        java.lang.ArithmeticException arithmeticException40 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable19, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.MathRuntimeException mathRuntimeException41 = new org.apache.commons.math.MathRuntimeException(localizable18, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable45 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException56 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable49, objArray55);
        java.text.ParseException parseException57 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable48, objArray55);
        java.util.NoSuchElementException noSuchElementException58 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable46, objArray55);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException59 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable45, objArray55);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException60 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable44, objArray55);
        java.lang.ArithmeticException arithmeticException61 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable43, objArray55);
        org.apache.commons.math.MathRuntimeException mathRuntimeException62 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException41, localizable42, objArray55);
        mathRuntimeException16.addSuppressed((java.lang.Throwable) mathRuntimeException62);
        org.apache.commons.math.exception.util.Localizable localizable64 = null;
        org.apache.commons.math.exception.util.Localizable localizable65 = null;
        org.apache.commons.math.exception.util.Localizable localizable66 = null;
        org.apache.commons.math.exception.util.Localizable localizable67 = null;
        org.apache.commons.math.exception.util.Localizable localizable68 = null;
        org.apache.commons.math.exception.util.Localizable localizable69 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException76 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable69, objArray75);
        java.lang.Throwable[] throwableArray77 = concurrentModificationException76.getSuppressed();
        java.lang.ArithmeticException arithmeticException78 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable68, (java.lang.Object[]) throwableArray77);
        java.lang.ArithmeticException arithmeticException79 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable67, (java.lang.Object[]) throwableArray77);
        java.lang.IllegalArgumentException illegalArgumentException80 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable66, (java.lang.Object[]) throwableArray77);
        java.util.ConcurrentModificationException concurrentModificationException81 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable65, (java.lang.Object[]) throwableArray77);
        java.lang.IllegalStateException illegalStateException82 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable64, (java.lang.Object[]) throwableArray77);
        mathRuntimeException16.addSuppressed((java.lang.Throwable) illegalStateException82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj85 = mathRuntimeException16.getContext("org.apache.commons.math.MathRuntimeException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(parseException13);
        org.junit.Assert.assertNotNull(illegalArgumentException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException33);
        org.junit.Assert.assertNotNull(eOFException34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException36);
        org.junit.Assert.assertNotNull(concurrentModificationException37);
        org.junit.Assert.assertNotNull(arithmeticException38);
        org.junit.Assert.assertNotNull(noSuchElementException39);
        org.junit.Assert.assertNotNull(arithmeticException40);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException56);
        org.junit.Assert.assertNotNull(parseException57);
        org.junit.Assert.assertNotNull(noSuchElementException58);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException59);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException60);
        org.junit.Assert.assertNotNull(arithmeticException61);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(arithmeticException78);
        org.junit.Assert.assertNotNull(arithmeticException79);
        org.junit.Assert.assertNotNull(illegalArgumentException80);
        org.junit.Assert.assertNotNull(concurrentModificationException81);
        org.junit.Assert.assertNotNull(illegalStateException82);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray15);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray15);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray15);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((-1), localizable3, objArray15);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray15);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException9 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray8);
        java.text.ParseException parseException10 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable1, objArray8);
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        org.apache.commons.math.exception.util.Localizable localizable13 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable13, objArray19);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable12, objArray19);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable11, objArray19);
        parseException10.addSuppressed((java.lang.Throwable) arithmeticException22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException24 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) arithmeticException22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException9);
        org.junit.Assert.assertNotNull(parseException10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray14);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray14);
        java.lang.IllegalStateException illegalStateException21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException32 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, objArray31);
        java.lang.Throwable[] throwableArray33 = concurrentModificationException32.getSuppressed();
        java.lang.IllegalStateException illegalStateException34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable24, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.MathRuntimeException mathRuntimeException35 = new org.apache.commons.math.MathRuntimeException(localizable23, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException46 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable39, objArray45);
        java.lang.Throwable[] throwableArray47 = concurrentModificationException46.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException48 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable38, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException49 = new org.apache.commons.math.MathRuntimeException(localizable37, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException50 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException35, localizable36, (java.lang.Object[]) throwableArray47);
        arrayIndexOutOfBoundsException22.addSuppressed((java.lang.Throwable) mathRuntimeException35);
        org.apache.commons.math.exception.util.Localizable localizable53 = null;
        org.apache.commons.math.exception.util.Localizable localizable54 = null;
        org.apache.commons.math.exception.util.Localizable localizable55 = null;
        org.apache.commons.math.exception.util.Localizable localizable56 = null;
        org.apache.commons.math.exception.util.Localizable localizable57 = null;
        org.apache.commons.math.exception.util.Localizable localizable58 = null;
        org.apache.commons.math.exception.util.Localizable localizable59 = null;
        java.lang.Object[] objArray66 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException67 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable59, objArray66);
        java.lang.ArithmeticException arithmeticException68 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable58, objArray66);
        java.util.ConcurrentModificationException concurrentModificationException69 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable57, objArray66);
        java.util.NoSuchElementException noSuchElementException70 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable56, objArray66);
        java.io.EOFException eOFException71 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable55, objArray66);
        java.lang.ArithmeticException arithmeticException72 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable54, objArray66);
        java.util.ConcurrentModificationException concurrentModificationException73 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable53, objArray66);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException35.setContext("java.lang.IllegalArgumentException: ", (java.lang.Object) objArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(illegalStateException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(illegalStateException34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(concurrentModificationException48);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException67);
        org.junit.Assert.assertNotNull(arithmeticException68);
        org.junit.Assert.assertNotNull(concurrentModificationException69);
        org.junit.Assert.assertNotNull(noSuchElementException70);
        org.junit.Assert.assertNotNull(eOFException71);
        org.junit.Assert.assertNotNull(arithmeticException72);
        org.junit.Assert.assertNotNull(concurrentModificationException73);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray15);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable29, objArray35);
        java.text.ParseException parseException37 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable28, objArray35);
        java.lang.IllegalStateException illegalStateException38 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, objArray35);
        java.lang.IllegalArgumentException illegalArgumentException39 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable25, objArray35);
        java.lang.IllegalArgumentException illegalArgumentException40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable24, objArray35);
        org.apache.commons.math.MathRuntimeException mathRuntimeException41 = new org.apache.commons.math.MathRuntimeException(localizable23, objArray35);
        concurrentModificationException22.addSuppressed((java.lang.Throwable) mathRuntimeException41);
        java.lang.Throwable[] throwableArray43 = mathRuntimeException41.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException44 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray43);
        java.io.EOFException eOFException45 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException46 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) eOFException45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(parseException37);
        org.junit.Assert.assertNotNull(illegalStateException38);
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertNotNull(illegalArgumentException40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(illegalArgumentException44);
        org.junit.Assert.assertNotNull(eOFException45);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException2 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray1);
        java.io.IOException iOException3 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) mathRuntimeException2);
        org.junit.Assert.assertNotNull(iOException3);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable12, objArray18);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable11, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable9, objArray18);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray18);
        java.io.EOFException eOFException23 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray18);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray18);
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray18);
        java.text.ParseException parseException26 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 1, localizable4, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException27 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray18);
        java.util.NoSuchElementException noSuchElementException28 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException29 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray18);
        java.lang.Class<?> wildcardClass30 = objArray18.getClass();
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(eOFException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
        org.junit.Assert.assertNotNull(parseException26);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertNotNull(noSuchElementException28);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray14);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray14);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, (java.lang.Object[]) throwableArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray14);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray19 = arithmeticException18.getSuppressed();
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray19);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray14);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray14);
        java.lang.IllegalStateException illegalStateException21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray14);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray14);
        java.lang.Class<?> wildcardClass23 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(illegalStateException21);
        org.junit.Assert.assertNotNull(eOFException22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.text.ParseException parseException14 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, objArray12);
        java.lang.IllegalArgumentException illegalArgumentException15 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray12);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray12);
        java.lang.Throwable[] throwableArray18 = mathRuntimeException17.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray18);
        java.lang.Class<?> wildcardClass20 = concurrentModificationException19.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(parseException14);
        org.junit.Assert.assertNotNull(illegalArgumentException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray15);
        java.lang.Throwable[] throwableArray20 = arithmeticException19.getSuppressed();
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, (java.lang.Object[]) throwableArray20);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable2, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray20);
        java.lang.Throwable[] throwableArray24 = noSuchElementException23.getSuppressed();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable12, objArray19);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable11, objArray19);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable10, objArray19);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable9, objArray19);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray19);
        org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException(localizable7, objArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable6, objArray19);
        java.util.ConcurrentModificationException concurrentModificationException27 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray19);
        java.util.ConcurrentModificationException concurrentModificationException28 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray19);
        java.text.ParseException parseException29 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 100, localizable3, objArray19);
        java.text.ParseException parseException30 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 1, localizable1, objArray19);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException26);
        org.junit.Assert.assertNotNull(concurrentModificationException27);
        org.junit.Assert.assertNotNull(concurrentModificationException28);
        org.junit.Assert.assertNotNull(parseException29);
        org.junit.Assert.assertNotNull(parseException30);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, (java.lang.Object[]) throwableArray13);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable2, (java.lang.Object[]) throwableArray13);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray13);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException19 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) eOFException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(eOFException18);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray17 = arrayIndexOutOfBoundsException16.getSuppressed();
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray17);
        java.lang.String str22 = mathRuntimeException21.toString();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathRuntimeException: " + "'", str22, "org.apache.commons.math.MathRuntimeException: ");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray15);
        java.lang.Throwable[] throwableArray20 = arithmeticException19.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray20);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, (java.lang.Object[]) throwableArray20);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException22.getSuppressed();
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray23);
        java.lang.IllegalArgumentException illegalArgumentException25 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray23);
        org.apache.commons.math.MathRuntimeException mathRuntimeException26 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray23);
        java.lang.Throwable[] throwableArray27 = mathRuntimeException26.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet28 = mathRuntimeException26.getContextKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray15);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray15);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray15);
        java.lang.ArithmeticException arithmeticException24 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(arithmeticException24);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable4, objArray15);
        java.lang.Throwable[] throwableArray21 = mathRuntimeException20.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException40 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable32, objArray39);
        java.io.EOFException eOFException41 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable31, objArray39);
        java.util.ConcurrentModificationException concurrentModificationException42 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable30, objArray39);
        java.lang.ArithmeticException arithmeticException43 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable29, objArray39);
        java.lang.Throwable[] throwableArray44 = arithmeticException43.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException45 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable28, (java.lang.Object[]) throwableArray44);
        java.lang.IllegalArgumentException illegalArgumentException46 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable27, (java.lang.Object[]) throwableArray44);
        java.lang.Throwable[] throwableArray47 = illegalArgumentException46.getSuppressed();
        java.util.NoSuchElementException noSuchElementException48 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable26, (java.lang.Object[]) throwableArray47);
        java.lang.IllegalArgumentException illegalArgumentException49 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable25, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException50 = new org.apache.commons.math.MathRuntimeException(localizable24, (java.lang.Object[]) throwableArray47);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException51 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable23, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException20, localizable22, (java.lang.Object[]) throwableArray47);
        java.text.ParseException parseException53 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 100, localizable3, (java.lang.Object[]) throwableArray47);
        java.util.ConcurrentModificationException concurrentModificationException54 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.MathRuntimeException mathRuntimeException55 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet56 = mathRuntimeException55.getContextKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException40);
        org.junit.Assert.assertNotNull(eOFException41);
        org.junit.Assert.assertNotNull(concurrentModificationException42);
        org.junit.Assert.assertNotNull(arithmeticException43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException45);
        org.junit.Assert.assertNotNull(illegalArgumentException46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(noSuchElementException48);
        org.junit.Assert.assertNotNull(illegalArgumentException49);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException51);
        org.junit.Assert.assertNotNull(parseException53);
        org.junit.Assert.assertNotNull(concurrentModificationException54);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        java.io.EOFException eOFException2 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray1);
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        org.apache.commons.math.exception.util.Localizable localizable13 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable13, objArray19);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable12, objArray19);
        java.util.NoSuchElementException noSuchElementException22 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable10, objArray19);
        java.text.ParseException parseException23 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable9, objArray19);
        org.apache.commons.math.MathRuntimeException mathRuntimeException24 = new org.apache.commons.math.MathRuntimeException(localizable7, objArray19);
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray19);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray19);
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException41 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable34, objArray40);
        java.text.ParseException parseException42 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable33, objArray40);
        java.lang.IllegalArgumentException illegalArgumentException43 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable31, objArray40);
        java.lang.ArithmeticException arithmeticException44 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable30, objArray40);
        java.io.EOFException eOFException45 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable29, objArray40);
        java.io.EOFException eOFException46 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable28, objArray40);
        java.util.ConcurrentModificationException concurrentModificationException47 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable27, objArray40);
        illegalArgumentException26.addSuppressed((java.lang.Throwable) concurrentModificationException47);
        java.lang.Throwable[] throwableArray49 = concurrentModificationException47.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException50 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray49);
        java.lang.IllegalStateException illegalStateException51 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, (java.lang.Object[]) throwableArray49);
        eOFException2.addSuppressed((java.lang.Throwable) illegalStateException51);
        org.junit.Assert.assertNotNull(eOFException2);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(noSuchElementException22);
        org.junit.Assert.assertNotNull(parseException23);
        org.junit.Assert.assertNotNull(concurrentModificationException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException41);
        org.junit.Assert.assertNotNull(parseException42);
        org.junit.Assert.assertNotNull(illegalArgumentException43);
        org.junit.Assert.assertNotNull(arithmeticException44);
        org.junit.Assert.assertNotNull(eOFException45);
        org.junit.Assert.assertNotNull(eOFException46);
        org.junit.Assert.assertNotNull(concurrentModificationException47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException50);
        org.junit.Assert.assertNotNull(illegalStateException51);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray17);
        java.lang.Throwable[] throwableArray22 = arithmeticException21.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable6, (java.lang.Object[]) throwableArray22);
        java.lang.IllegalArgumentException illegalArgumentException24 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, (java.lang.Object[]) throwableArray22);
        java.lang.Throwable[] throwableArray25 = illegalArgumentException24.getSuppressed();
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray25);
        java.lang.IllegalArgumentException illegalArgumentException27 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, (java.lang.Object[]) throwableArray25);
        java.lang.Throwable[] throwableArray28 = illegalArgumentException27.getSuppressed();
        java.lang.IllegalStateException illegalStateException29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray28);
        java.util.ConcurrentModificationException concurrentModificationException30 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray28);
        java.util.NoSuchElementException noSuchElementException31 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray28);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(illegalArgumentException24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(illegalStateException29);
        org.junit.Assert.assertNotNull(concurrentModificationException30);
        org.junit.Assert.assertNotNull(noSuchElementException31);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray16);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray16);
        java.io.EOFException eOFException23 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray16);
        java.lang.IllegalStateException illegalStateException24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray16);
        java.lang.Throwable[] throwableArray25 = illegalStateException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = illegalStateException24.getSuppressed();
        java.util.NoSuchElementException noSuchElementException27 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray26);
        java.lang.IllegalArgumentException illegalArgumentException28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray26);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(eOFException23);
        org.junit.Assert.assertNotNull(illegalStateException24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(noSuchElementException27);
        org.junit.Assert.assertNotNull(illegalArgumentException28);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.text.ParseException parseException13 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, objArray11);
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray11);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray11);
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable25, objArray32);
        java.lang.ArithmeticException arithmeticException34 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, objArray32);
        java.util.ConcurrentModificationException concurrentModificationException35 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable23, objArray32);
        java.util.NoSuchElementException noSuchElementException36 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable22, objArray32);
        java.io.EOFException eOFException37 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable21, objArray32);
        java.lang.ArithmeticException arithmeticException38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable20, objArray32);
        java.lang.Throwable[] throwableArray39 = arithmeticException38.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable19, (java.lang.Object[]) throwableArray39);
        java.lang.IllegalStateException illegalStateException41 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable18, (java.lang.Object[]) throwableArray39);
        java.util.NoSuchElementException noSuchElementException42 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable17, (java.lang.Object[]) throwableArray39);
        noSuchElementException16.addSuppressed((java.lang.Throwable) noSuchElementException42);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(parseException13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException33);
        org.junit.Assert.assertNotNull(arithmeticException34);
        org.junit.Assert.assertNotNull(concurrentModificationException35);
        org.junit.Assert.assertNotNull(noSuchElementException36);
        org.junit.Assert.assertNotNull(eOFException37);
        org.junit.Assert.assertNotNull(arithmeticException38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(illegalArgumentException40);
        org.junit.Assert.assertNotNull(illegalStateException41);
        org.junit.Assert.assertNotNull(noSuchElementException42);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException11 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray10);
        java.lang.IllegalArgumentException illegalArgumentException12 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray10);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray10);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray10);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray10);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException11);
        org.junit.Assert.assertNotNull(illegalArgumentException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray13);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray13);
        java.lang.Throwable[] throwableArray19 = arithmeticException18.getSuppressed();
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray13);
        java.lang.Throwable[] throwableArray18 = noSuchElementException17.getSuppressed();
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray18);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable1, (java.lang.Object[]) throwableArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException21 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) parseException20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(parseException20);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.io.EOFException eOFException16 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray14);
        java.lang.Throwable[] throwableArray17 = eOFException16.getSuppressed();
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, (java.lang.Object[]) throwableArray17);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, (java.lang.Object[]) throwableArray17);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable3, (java.lang.Object[]) throwableArray17);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray17);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, objArray33);
        java.lang.ArithmeticException arithmeticException35 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable25, objArray33);
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray33);
        java.util.NoSuchElementException noSuchElementException37 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable23, objArray33);
        java.lang.Throwable[] throwableArray38 = noSuchElementException37.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        org.apache.commons.math.exception.util.Localizable localizable40 = null;
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable45 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        java.lang.Object[] objArray53 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException54 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable46, objArray53);
        java.lang.ArithmeticException arithmeticException55 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable45, objArray53);
        java.util.ConcurrentModificationException concurrentModificationException56 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable44, objArray53);
        java.util.NoSuchElementException noSuchElementException57 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable43, objArray53);
        java.io.EOFException eOFException58 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable42, objArray53);
        java.lang.ArithmeticException arithmeticException59 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable41, objArray53);
        java.io.EOFException eOFException60 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable40, objArray53);
        java.lang.IllegalStateException illegalStateException61 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable39, objArray53);
        java.lang.Throwable[] throwableArray62 = illegalStateException61.getSuppressed();
        noSuchElementException37.addSuppressed((java.lang.Throwable) illegalStateException61);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalStateException61);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(eOFException16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException34);
        org.junit.Assert.assertNotNull(arithmeticException35);
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(noSuchElementException37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException54);
        org.junit.Assert.assertNotNull(arithmeticException55);
        org.junit.Assert.assertNotNull(concurrentModificationException56);
        org.junit.Assert.assertNotNull(noSuchElementException57);
        org.junit.Assert.assertNotNull(eOFException58);
        org.junit.Assert.assertNotNull(arithmeticException59);
        org.junit.Assert.assertNotNull(eOFException60);
        org.junit.Assert.assertNotNull(illegalStateException61);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable11, objArray17);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable10, objArray17);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable8, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable6, objArray17);
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException39 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable31, objArray38);
        java.io.EOFException eOFException40 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable30, objArray38);
        java.util.ConcurrentModificationException concurrentModificationException41 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable29, objArray38);
        java.lang.ArithmeticException arithmeticException42 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable28, objArray38);
        java.lang.Throwable[] throwableArray43 = arithmeticException42.getSuppressed();
        java.text.ParseException parseException44 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable27, (java.lang.Object[]) throwableArray43);
        java.text.ParseException parseException45 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable25, (java.lang.Object[]) throwableArray43);
        java.util.NoSuchElementException noSuchElementException46 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable23, (java.lang.Object[]) throwableArray43);
        arrayIndexOutOfBoundsException22.addSuppressed((java.lang.Throwable) noSuchElementException46);
        java.lang.Throwable[] throwableArray48 = noSuchElementException46.getSuppressed();
        java.lang.IllegalStateException illegalStateException49 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray48);
        java.util.NoSuchElementException noSuchElementException50 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray48);
        java.lang.ArithmeticException arithmeticException51 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, (java.lang.Object[]) throwableArray48);
        java.lang.Throwable[] throwableArray52 = arithmeticException51.getSuppressed();
        java.lang.IllegalStateException illegalStateException53 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray52);
        org.apache.commons.math.MathRuntimeException mathRuntimeException54 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray52);
        java.lang.IllegalStateException illegalStateException55 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException39);
        org.junit.Assert.assertNotNull(eOFException40);
        org.junit.Assert.assertNotNull(concurrentModificationException41);
        org.junit.Assert.assertNotNull(arithmeticException42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(parseException44);
        org.junit.Assert.assertNotNull(parseException45);
        org.junit.Assert.assertNotNull(noSuchElementException46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(illegalStateException49);
        org.junit.Assert.assertNotNull(noSuchElementException50);
        org.junit.Assert.assertNotNull(arithmeticException51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(illegalStateException53);
        org.junit.Assert.assertNotNull(illegalStateException55);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray14);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray14);
        java.lang.IllegalStateException illegalStateException21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray14);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException23 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) eOFException22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(illegalStateException21);
        org.junit.Assert.assertNotNull(eOFException22);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray14);
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable27, objArray33);
        java.text.ParseException parseException35 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable26, objArray33);
        java.lang.IllegalArgumentException illegalArgumentException36 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable24, objArray33);
        java.util.NoSuchElementException noSuchElementException37 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable23, objArray33);
        org.apache.commons.math.MathRuntimeException mathRuntimeException38 = new org.apache.commons.math.MathRuntimeException(localizable22, objArray33);
        java.lang.Throwable[] throwableArray39 = mathRuntimeException38.getSuppressed();
        mathRuntimeException21.addSuppressed((java.lang.Throwable) mathRuntimeException38);
        java.lang.IllegalArgumentException illegalArgumentException41 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException21);
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        org.apache.commons.math.exception.util.Localizable localizable47 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        org.apache.commons.math.exception.util.Localizable localizable50 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable50, objArray57);
        java.io.EOFException eOFException59 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable49, objArray57);
        java.util.ConcurrentModificationException concurrentModificationException60 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable48, objArray57);
        java.lang.ArithmeticException arithmeticException61 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable47, objArray57);
        java.lang.Throwable[] throwableArray62 = arithmeticException61.getSuppressed();
        java.text.ParseException parseException63 = org.apache.commons.math.MathRuntimeException.createParseException(10, localizable46, (java.lang.Object[]) throwableArray62);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException64 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable44, (java.lang.Object[]) throwableArray62);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException65 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable43, (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.MathRuntimeException mathRuntimeException66 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException21, localizable42, (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.MathRuntimeException mathRuntimeException67 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.exception.util.Localizable localizable69 = null;
        org.apache.commons.math.exception.util.Localizable localizable70 = null;
        org.apache.commons.math.exception.util.Localizable localizable71 = null;
        org.apache.commons.math.exception.util.Localizable localizable72 = null;
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException79 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable72, objArray78);
        java.lang.IllegalArgumentException illegalArgumentException80 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable71, objArray78);
        java.lang.ArithmeticException arithmeticException81 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable70, objArray78);
        java.util.ConcurrentModificationException concurrentModificationException82 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable69, objArray78);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException67.setContext("", (java.lang.Object) concurrentModificationException82);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException34);
        org.junit.Assert.assertNotNull(parseException35);
        org.junit.Assert.assertNotNull(illegalArgumentException36);
        org.junit.Assert.assertNotNull(noSuchElementException37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(illegalArgumentException41);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException58);
        org.junit.Assert.assertNotNull(eOFException59);
        org.junit.Assert.assertNotNull(concurrentModificationException60);
        org.junit.Assert.assertNotNull(arithmeticException61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(parseException63);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException64);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException65);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException79);
        org.junit.Assert.assertNotNull(illegalArgumentException80);
        org.junit.Assert.assertNotNull(arithmeticException81);
        org.junit.Assert.assertNotNull(concurrentModificationException82);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable11, objArray17);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable10, objArray17);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable8, objArray17);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable7, objArray17);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable5, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException23 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray17);
        java.lang.IllegalStateException illegalStateException24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray17);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray17);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray17);
        java.io.EOFException eOFException27 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray17);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(concurrentModificationException23);
        org.junit.Assert.assertNotNull(illegalStateException24);
        org.junit.Assert.assertNotNull(arithmeticException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(eOFException27);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray12);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray12);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray12);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        java.lang.Object[] objArray21 = null;
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable20, objArray21);
        mathRuntimeException18.addSuppressed((java.lang.Throwable) parseException22);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(parseException22);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray13);
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException33 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, objArray32);
        java.text.ParseException parseException34 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable25, objArray32);
        java.lang.IllegalArgumentException illegalArgumentException35 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable23, objArray32);
        java.util.NoSuchElementException noSuchElementException36 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable22, objArray32);
        org.apache.commons.math.MathRuntimeException mathRuntimeException37 = new org.apache.commons.math.MathRuntimeException(localizable21, objArray32);
        java.lang.Throwable[] throwableArray38 = mathRuntimeException37.getSuppressed();
        mathRuntimeException20.addSuppressed((java.lang.Throwable) mathRuntimeException37);
        java.lang.IllegalArgumentException illegalArgumentException40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException20);
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        org.apache.commons.math.exception.util.Localizable localizable47 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        org.apache.commons.math.exception.util.Localizable localizable50 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable50, objArray57);
        java.io.EOFException eOFException59 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable49, objArray57);
        java.util.ConcurrentModificationException concurrentModificationException60 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable48, objArray57);
        java.lang.ArithmeticException arithmeticException61 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable47, objArray57);
        java.lang.Throwable[] throwableArray62 = arithmeticException61.getSuppressed();
        java.text.ParseException parseException63 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable46, (java.lang.Object[]) throwableArray62);
        java.text.ParseException parseException64 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable44, (java.lang.Object[]) throwableArray62);
        java.lang.IllegalStateException illegalStateException65 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable42, (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.MathRuntimeException mathRuntimeException66 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException20, localizable41, (java.lang.Object[]) throwableArray62);
        java.io.IOException iOException67 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) mathRuntimeException20);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException33);
        org.junit.Assert.assertNotNull(parseException34);
        org.junit.Assert.assertNotNull(illegalArgumentException35);
        org.junit.Assert.assertNotNull(noSuchElementException36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(illegalArgumentException40);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException58);
        org.junit.Assert.assertNotNull(eOFException59);
        org.junit.Assert.assertNotNull(concurrentModificationException60);
        org.junit.Assert.assertNotNull(arithmeticException61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(parseException63);
        org.junit.Assert.assertNotNull(parseException64);
        org.junit.Assert.assertNotNull(illegalStateException65);
        org.junit.Assert.assertNotNull(iOException67);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.io.EOFException eOFException16 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray14);
        java.lang.Throwable[] throwableArray17 = eOFException16.getSuppressed();
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, (java.lang.Object[]) throwableArray17);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) -1, localizable2, (java.lang.Object[]) throwableArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = arrayIndexOutOfBoundsException22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(eOFException16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException16);
        java.lang.Throwable[] throwableArray18 = mathRuntimeException16.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException39 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable31, objArray38);
        java.io.EOFException eOFException40 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable30, objArray38);
        java.util.ConcurrentModificationException concurrentModificationException41 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable29, objArray38);
        java.lang.ArithmeticException arithmeticException42 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable28, objArray38);
        java.lang.Throwable[] throwableArray43 = arithmeticException42.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException44 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable27, (java.lang.Object[]) throwableArray43);
        java.lang.IllegalArgumentException illegalArgumentException45 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable26, (java.lang.Object[]) throwableArray43);
        java.lang.Throwable[] throwableArray46 = illegalArgumentException45.getSuppressed();
        java.util.NoSuchElementException noSuchElementException47 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable25, (java.lang.Object[]) throwableArray46);
        java.lang.IllegalArgumentException illegalArgumentException48 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable24, (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.MathRuntimeException mathRuntimeException49 = new org.apache.commons.math.MathRuntimeException(localizable23, (java.lang.Object[]) throwableArray46);
        java.text.ParseException parseException50 = org.apache.commons.math.MathRuntimeException.createParseException(10, localizable22, (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.MathRuntimeException mathRuntimeException51 = new org.apache.commons.math.MathRuntimeException(localizable20, (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.MathRuntimeException mathRuntimeException52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException16, localizable19, (java.lang.Object[]) throwableArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet53 = mathRuntimeException16.getContextKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException39);
        org.junit.Assert.assertNotNull(eOFException40);
        org.junit.Assert.assertNotNull(concurrentModificationException41);
        org.junit.Assert.assertNotNull(arithmeticException42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException44);
        org.junit.Assert.assertNotNull(illegalArgumentException45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(noSuchElementException47);
        org.junit.Assert.assertNotNull(illegalArgumentException48);
        org.junit.Assert.assertNotNull(parseException50);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalArgumentException illegalArgumentException16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException17);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable28, objArray35);
        java.io.EOFException eOFException37 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable27, objArray35);
        java.lang.Throwable[] throwableArray38 = eOFException37.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException39 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable26, (java.lang.Object[]) throwableArray38);
        java.util.ConcurrentModificationException concurrentModificationException40 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, (java.lang.Object[]) throwableArray38);
        java.lang.ArithmeticException arithmeticException41 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, (java.lang.Object[]) throwableArray38);
        java.lang.Throwable[] throwableArray42 = arithmeticException41.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException43 = new org.apache.commons.math.MathRuntimeException(localizable23, (java.lang.Object[]) throwableArray42);
        java.text.ParseException parseException44 = org.apache.commons.math.MathRuntimeException.createParseException((int) 'a', localizable22, (java.lang.Object[]) throwableArray42);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException45 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable20, (java.lang.Object[]) throwableArray42);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException17.setContext("", (java.lang.Object) arrayIndexOutOfBoundsException45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(illegalArgumentException16);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException36);
        org.junit.Assert.assertNotNull(eOFException37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException39);
        org.junit.Assert.assertNotNull(concurrentModificationException40);
        org.junit.Assert.assertNotNull(arithmeticException41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(parseException44);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException45);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable4, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException20);
        java.lang.Throwable[] throwableArray22 = illegalArgumentException21.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable3, (java.lang.Object[]) throwableArray22);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, (java.lang.Object[]) throwableArray22);
        java.lang.IllegalStateException illegalStateException25 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.MathRuntimeException mathRuntimeException26 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray22);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(illegalStateException25);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(throwable19);
        concurrentModificationException18.addSuppressed((java.lang.Throwable) mathRuntimeException20);
        java.lang.Throwable[] throwableArray22 = mathRuntimeException20.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable5, (java.lang.Object[]) throwableArray22);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException24 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException25 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException26 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray22);
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray22);
        java.util.NoSuchElementException noSuchElementException28 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray22);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException24);
        org.junit.Assert.assertNotNull(eOFException25);
        org.junit.Assert.assertNotNull(eOFException26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(noSuchElementException28);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        org.apache.commons.math.exception.util.Localizable localizable13 = null;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable13, objArray20);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable12, objArray20);
        java.util.ConcurrentModificationException concurrentModificationException23 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable11, objArray20);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable10, objArray20);
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray20);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable8, objArray20);
        java.util.ConcurrentModificationException concurrentModificationException27 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray20);
        org.apache.commons.math.MathRuntimeException mathRuntimeException28 = new org.apache.commons.math.MathRuntimeException(localizable6, objArray20);
        java.text.ParseException parseException29 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable5, objArray20);
        java.io.EOFException eOFException30 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray20);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException31 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray20);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException32 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray20);
        java.lang.IllegalStateException illegalStateException33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, objArray20);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(concurrentModificationException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(concurrentModificationException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(concurrentModificationException27);
        org.junit.Assert.assertNotNull(parseException29);
        org.junit.Assert.assertNotNull(eOFException30);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException31);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException32);
        org.junit.Assert.assertNotNull(illegalStateException33);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(throwable19);
        concurrentModificationException18.addSuppressed((java.lang.Throwable) mathRuntimeException20);
        java.lang.Throwable[] throwableArray22 = mathRuntimeException20.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable5, (java.lang.Object[]) throwableArray22);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException24 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException25 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray22);
        java.io.EOFException eOFException26 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray22);
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray22);
        java.lang.ArithmeticException arithmeticException28 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray22);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException24);
        org.junit.Assert.assertNotNull(eOFException25);
        org.junit.Assert.assertNotNull(eOFException26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(arithmeticException28);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        org.apache.commons.math.exception.util.Localizable localizable13 = null;
        org.apache.commons.math.exception.util.Localizable localizable14 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable14, objArray21);
        java.lang.ArithmeticException arithmeticException23 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable13, objArray21);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable12, objArray21);
        java.text.ParseException parseException25 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable11, objArray21);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable9, objArray21);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException27 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable8, objArray21);
        java.lang.ArithmeticException arithmeticException28 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray21);
        java.lang.IllegalStateException illegalStateException29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray21);
        java.util.NoSuchElementException noSuchElementException30 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray21);
        java.text.ParseException parseException31 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 0, localizable4, objArray21);
        java.lang.ArithmeticException arithmeticException32 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray21);
        org.apache.commons.math.MathRuntimeException mathRuntimeException33 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray21);
        java.lang.IllegalArgumentException illegalArgumentException34 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray21);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException22);
        org.junit.Assert.assertNotNull(arithmeticException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(parseException25);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException26);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException27);
        org.junit.Assert.assertNotNull(arithmeticException28);
        org.junit.Assert.assertNotNull(illegalStateException29);
        org.junit.Assert.assertNotNull(noSuchElementException30);
        org.junit.Assert.assertNotNull(parseException31);
        org.junit.Assert.assertNotNull(arithmeticException32);
        org.junit.Assert.assertNotNull(illegalArgumentException34);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        java.io.EOFException eOFException2 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray1);
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.lang.Throwable[] throwableArray20 = eOFException19.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable8, (java.lang.Object[]) throwableArray20);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, (java.lang.Object[]) throwableArray20);
        java.lang.ArithmeticException arithmeticException23 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray20);
        java.lang.IllegalStateException illegalStateException26 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, (java.lang.Object[]) throwableArray20);
        eOFException2.addSuppressed((java.lang.Throwable) illegalStateException26);
        java.lang.Throwable[] throwableArray28 = eOFException2.getSuppressed();
        org.junit.Assert.assertNotNull(eOFException2);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(arithmeticException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(illegalStateException26);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, objArray14);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray14);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray14);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray14);
        java.io.IOException iOException23 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) mathRuntimeException22);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(iOException23);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray12);
        java.lang.Throwable[] throwableArray15 = eOFException14.getSuppressed();
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray15);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray15);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException20 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) illegalStateException19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalStateException19);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        java.lang.Throwable[] throwableArray16 = noSuchElementException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = noSuchElementException15.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable27, objArray33);
        java.lang.Throwable[] throwableArray35 = concurrentModificationException34.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable26, (java.lang.Object[]) throwableArray35);
        java.io.EOFException eOFException37 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable25, (java.lang.Object[]) throwableArray35);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException38 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable24, (java.lang.Object[]) throwableArray35);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException39 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable23, (java.lang.Object[]) throwableArray35);
        java.lang.Throwable[] throwableArray40 = arrayIndexOutOfBoundsException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = arrayIndexOutOfBoundsException39.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException42 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable22, (java.lang.Object[]) throwableArray41);
        java.lang.IllegalStateException illegalStateException43 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable21, (java.lang.Object[]) throwableArray41);
        java.lang.ArithmeticException arithmeticException44 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable20, (java.lang.Object[]) throwableArray41);
        java.lang.Class<?> wildcardClass45 = arithmeticException44.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException18.setContext("hi!", (java.lang.Object) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(eOFException37);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException38);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(concurrentModificationException42);
        org.junit.Assert.assertNotNull(illegalStateException43);
        org.junit.Assert.assertNotNull(arithmeticException44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray15);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray15);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray15);
        java.lang.Throwable[] throwableArray23 = arithmeticException22.getSuppressed();
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray23);
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray23);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray13);
        java.lang.Throwable[] throwableArray21 = illegalArgumentException20.getSuppressed();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable7, objArray17);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray17);
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray17);
        java.text.ParseException parseException25 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable3, objArray17);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray17);
        java.lang.IllegalArgumentException illegalArgumentException27 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray17);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(eOFException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(parseException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(illegalArgumentException27);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.lang.ArithmeticException arithmeticException12 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray10);
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray10);
        org.apache.commons.math.MathRuntimeException mathRuntimeException14 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray10);
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException32 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, objArray31);
        java.lang.Throwable[] throwableArray33 = concurrentModificationException32.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, (java.lang.Object[]) throwableArray33);
        java.io.EOFException eOFException35 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable23, (java.lang.Object[]) throwableArray33);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable22, (java.lang.Object[]) throwableArray33);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException37 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable21, (java.lang.Object[]) throwableArray33);
        java.io.EOFException eOFException38 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable20, (java.lang.Object[]) throwableArray33);
        java.util.ConcurrentModificationException concurrentModificationException39 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable19, (java.lang.Object[]) throwableArray33);
        java.lang.ArithmeticException arithmeticException40 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable18, (java.lang.Object[]) throwableArray33);
        java.text.ParseException parseException41 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 1, localizable17, (java.lang.Object[]) throwableArray33);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException14.addMessage(localizable15, (java.lang.Object[]) throwableArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(arithmeticException12);
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(concurrentModificationException34);
        org.junit.Assert.assertNotNull(eOFException35);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException36);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException37);
        org.junit.Assert.assertNotNull(eOFException38);
        org.junit.Assert.assertNotNull(concurrentModificationException39);
        org.junit.Assert.assertNotNull(arithmeticException40);
        org.junit.Assert.assertNotNull(parseException41);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable11, objArray18);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable10, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray18);
        java.util.NoSuchElementException noSuchElementException22 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable8, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException23 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray18);
        org.apache.commons.math.MathRuntimeException mathRuntimeException24 = new org.apache.commons.math.MathRuntimeException(localizable6, objArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException25 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray18);
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray18);
        org.apache.commons.math.MathRuntimeException mathRuntimeException29 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException30 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, objArray18);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(noSuchElementException22);
        org.junit.Assert.assertNotNull(concurrentModificationException23);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException25);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(illegalArgumentException28);
        org.junit.Assert.assertNotNull(illegalArgumentException30);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, (java.lang.Object[]) throwableArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray13);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(eOFException18);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.io.EOFException eOFException12 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray10);
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray10);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException35 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable27, objArray34);
        java.lang.ArithmeticException arithmeticException36 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable26, objArray34);
        java.util.ConcurrentModificationException concurrentModificationException37 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, objArray34);
        java.text.ParseException parseException38 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable24, objArray34);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException39 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable22, objArray34);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException40 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable21, objArray34);
        java.lang.ArithmeticException arithmeticException41 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable20, objArray34);
        java.lang.IllegalStateException illegalStateException42 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable19, objArray34);
        java.util.ConcurrentModificationException concurrentModificationException43 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable18, objArray34);
        java.util.NoSuchElementException noSuchElementException44 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable17, objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException45 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) arithmeticException15, localizable16, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(eOFException12);
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException35);
        org.junit.Assert.assertNotNull(arithmeticException36);
        org.junit.Assert.assertNotNull(concurrentModificationException37);
        org.junit.Assert.assertNotNull(parseException38);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException39);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException40);
        org.junit.Assert.assertNotNull(arithmeticException41);
        org.junit.Assert.assertNotNull(illegalStateException42);
        org.junit.Assert.assertNotNull(concurrentModificationException43);
        org.junit.Assert.assertNotNull(noSuchElementException44);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable11, objArray17);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable10, objArray17);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable8, objArray17);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable7, objArray17);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable5, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException23 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray17);
        java.lang.IllegalStateException illegalStateException24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray17);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray17);
        java.lang.ArithmeticException arithmeticException26 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException27 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray17);
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException45 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable38, objArray44);
        java.text.ParseException parseException46 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable37, objArray44);
        java.lang.IllegalArgumentException illegalArgumentException47 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable35, objArray44);
        java.lang.Object[] objArray48 = new java.lang.Object[] { "", illegalArgumentException47 };
        java.util.ConcurrentModificationException concurrentModificationException49 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable33, objArray48);
        java.lang.Throwable[] throwableArray50 = concurrentModificationException49.getSuppressed();
        java.lang.IllegalStateException illegalStateException51 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable32, (java.lang.Object[]) throwableArray50);
        java.lang.IllegalArgumentException illegalArgumentException52 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable31, (java.lang.Object[]) throwableArray50);
        java.lang.ArithmeticException arithmeticException53 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable30, (java.lang.Object[]) throwableArray50);
        java.util.NoSuchElementException noSuchElementException54 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable29, (java.lang.Object[]) throwableArray50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException55 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) concurrentModificationException27, localizable28, (java.lang.Object[]) throwableArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(concurrentModificationException23);
        org.junit.Assert.assertNotNull(illegalStateException24);
        org.junit.Assert.assertNotNull(arithmeticException25);
        org.junit.Assert.assertNotNull(arithmeticException26);
        org.junit.Assert.assertNotNull(concurrentModificationException27);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException45);
        org.junit.Assert.assertNotNull(parseException46);
        org.junit.Assert.assertNotNull(illegalArgumentException47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(concurrentModificationException49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(illegalStateException51);
        org.junit.Assert.assertNotNull(illegalArgumentException52);
        org.junit.Assert.assertNotNull(arithmeticException53);
        org.junit.Assert.assertNotNull(noSuchElementException54);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray14);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException35 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable27, objArray34);
        java.lang.ArithmeticException arithmeticException36 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable26, objArray34);
        java.util.ConcurrentModificationException concurrentModificationException37 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable25, objArray34);
        java.util.NoSuchElementException noSuchElementException38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable24, objArray34);
        java.lang.Throwable[] throwableArray39 = noSuchElementException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = noSuchElementException38.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException41 = new org.apache.commons.math.MathRuntimeException(throwable22, localizable23, (java.lang.Object[]) throwableArray40);
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        org.apache.commons.math.exception.util.Localizable localizable44 = null;
        org.apache.commons.math.exception.util.Localizable localizable45 = null;
        org.apache.commons.math.exception.util.Localizable localizable46 = null;
        java.lang.Object[] objArray53 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException54 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable46, objArray53);
        java.io.EOFException eOFException55 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable45, objArray53);
        java.lang.Throwable[] throwableArray56 = eOFException55.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException57 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable44, (java.lang.Object[]) throwableArray56);
        java.util.ConcurrentModificationException concurrentModificationException58 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable43, (java.lang.Object[]) throwableArray56);
        java.lang.ArithmeticException arithmeticException59 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable42, (java.lang.Object[]) throwableArray56);
        java.lang.Throwable[] throwableArray60 = arithmeticException59.getSuppressed();
        mathRuntimeException41.addSuppressed((java.lang.Throwable) arithmeticException59);
        java.lang.Throwable[] throwableArray62 = mathRuntimeException41.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable63 = null;
        org.apache.commons.math.exception.util.Localizable localizable65 = null;
        org.apache.commons.math.exception.util.Localizable localizable66 = null;
        org.apache.commons.math.exception.util.Localizable localizable67 = null;
        org.apache.commons.math.exception.util.Localizable localizable68 = null;
        org.apache.commons.math.exception.util.Localizable localizable69 = null;
        org.apache.commons.math.exception.util.Localizable localizable71 = null;
        org.apache.commons.math.exception.util.Localizable localizable72 = null;
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException79 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable72, objArray78);
        java.text.ParseException parseException80 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable71, objArray78);
        java.lang.IllegalArgumentException illegalArgumentException81 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable69, objArray78);
        java.util.NoSuchElementException noSuchElementException82 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable68, objArray78);
        org.apache.commons.math.MathRuntimeException mathRuntimeException83 = new org.apache.commons.math.MathRuntimeException(localizable67, objArray78);
        java.lang.Throwable[] throwableArray84 = mathRuntimeException83.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException85 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable66, (java.lang.Object[]) throwableArray84);
        java.text.ParseException parseException86 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable65, (java.lang.Object[]) throwableArray84);
        org.apache.commons.math.MathRuntimeException mathRuntimeException87 = new org.apache.commons.math.MathRuntimeException(localizable63, (java.lang.Object[]) throwableArray84);
        mathRuntimeException41.addSuppressed((java.lang.Throwable) mathRuntimeException87);
        org.apache.commons.math.MathRuntimeException mathRuntimeException89 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException41);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException20.setContext("org.apache.commons.math.MathRuntimeException: ", (java.lang.Object) mathRuntimeException41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException35);
        org.junit.Assert.assertNotNull(arithmeticException36);
        org.junit.Assert.assertNotNull(concurrentModificationException37);
        org.junit.Assert.assertNotNull(noSuchElementException38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException54);
        org.junit.Assert.assertNotNull(eOFException55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException57);
        org.junit.Assert.assertNotNull(concurrentModificationException58);
        org.junit.Assert.assertNotNull(arithmeticException59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException79);
        org.junit.Assert.assertNotNull(parseException80);
        org.junit.Assert.assertNotNull(illegalArgumentException81);
        org.junit.Assert.assertNotNull(noSuchElementException82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(concurrentModificationException85);
        org.junit.Assert.assertNotNull(parseException86);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.lang.Throwable[] throwableArray14 = eOFException13.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, (java.lang.Object[]) throwableArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable1, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException28 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable20, objArray27);
        java.lang.ArithmeticException arithmeticException29 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable19, objArray27);
        java.lang.IllegalStateException illegalStateException30 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable18, objArray27);
        org.apache.commons.math.MathRuntimeException mathRuntimeException31 = new org.apache.commons.math.MathRuntimeException(localizable17, objArray27);
        parseException16.addSuppressed((java.lang.Throwable) mathRuntimeException31);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException28);
        org.junit.Assert.assertNotNull(arithmeticException29);
        org.junit.Assert.assertNotNull(illegalStateException30);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray17);
        java.lang.Throwable[] throwableArray22 = arithmeticException21.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable6, (java.lang.Object[]) throwableArray22);
        java.lang.IllegalArgumentException illegalArgumentException24 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, (java.lang.Object[]) throwableArray22);
        java.lang.Throwable[] throwableArray25 = illegalArgumentException24.getSuppressed();
        java.lang.Object[] objArray26 = new java.lang.Object[] { throwableArray25 };
        java.lang.ArithmeticException arithmeticException27 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, (java.lang.Object[]) throwableArray25);
        java.text.ParseException parseException28 = org.apache.commons.math.MathRuntimeException.createParseException((int) 'a', localizable3, (java.lang.Object[]) throwableArray25);
        java.lang.IllegalStateException illegalStateException29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, (java.lang.Object[]) throwableArray25);
        java.util.NoSuchElementException noSuchElementException30 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray25);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(illegalArgumentException24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[]]");
        org.junit.Assert.assertNotNull(arithmeticException27);
        org.junit.Assert.assertNotNull(parseException28);
        org.junit.Assert.assertNotNull(illegalStateException29);
        org.junit.Assert.assertNotNull(noSuchElementException30);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException11 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray10);
        java.io.EOFException eOFException12 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray10);
        java.lang.Throwable[] throwableArray13 = eOFException12.getSuppressed();
        org.apache.commons.math.exception.util.Localizable localizable14 = null;
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable17, objArray23);
        java.text.ParseException parseException25 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable16, objArray23);
        java.lang.IllegalArgumentException illegalArgumentException26 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable14, objArray23);
        eOFException12.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.Throwable[] throwableArray28 = eOFException12.getSuppressed();
        java.util.NoSuchElementException noSuchElementException29 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.MathRuntimeException mathRuntimeException30 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException44 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable36, objArray43);
        java.io.EOFException eOFException45 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable35, objArray43);
        java.lang.Throwable[] throwableArray46 = eOFException45.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException47 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable34, (java.lang.Object[]) throwableArray46);
        java.util.ConcurrentModificationException concurrentModificationException48 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable33, (java.lang.Object[]) throwableArray46);
        java.lang.ArithmeticException arithmeticException49 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable32, (java.lang.Object[]) throwableArray46);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException30.addMessage(localizable31, (java.lang.Object[]) throwableArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException11);
        org.junit.Assert.assertNotNull(eOFException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(parseException25);
        org.junit.Assert.assertNotNull(illegalArgumentException26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(noSuchElementException29);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException44);
        org.junit.Assert.assertNotNull(eOFException45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException47);
        org.junit.Assert.assertNotNull(concurrentModificationException48);
        org.junit.Assert.assertNotNull(arithmeticException49);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        java.lang.Throwable[] throwableArray21 = noSuchElementException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = noSuchElementException20.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException(localizable5, (java.lang.Object[]) throwableArray22);
        java.text.ParseException parseException24 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 0, localizable4, (java.lang.Object[]) throwableArray22);
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray22);
        java.lang.Throwable[] throwableArray26 = noSuchElementException25.getSuppressed();
        java.lang.ArithmeticException arithmeticException27 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray26);
        java.util.NoSuchElementException noSuchElementException28 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, (java.lang.Object[]) throwableArray26);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(parseException24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(arithmeticException27);
        org.junit.Assert.assertNotNull(noSuchElementException28);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable3, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException30 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable23, objArray29);
        java.text.ParseException parseException31 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable22, objArray29);
        java.lang.IllegalArgumentException illegalArgumentException32 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable20, objArray29);
        java.lang.ArithmeticException arithmeticException33 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable19, objArray29);
        org.apache.commons.math.MathRuntimeException mathRuntimeException34 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException17, localizable18, objArray29);
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException46 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable38, objArray45);
        java.lang.ArithmeticException arithmeticException47 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable37, objArray45);
        java.util.ConcurrentModificationException concurrentModificationException48 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable36, objArray45);
        org.apache.commons.math.MathRuntimeException mathRuntimeException49 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException34, localizable35, objArray45);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException50 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray45);
        org.apache.commons.math.MathRuntimeException mathRuntimeException51 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray45);
        java.lang.Throwable[] throwableArray52 = mathRuntimeException51.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException53 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray52);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException30);
        org.junit.Assert.assertNotNull(parseException31);
        org.junit.Assert.assertNotNull(illegalArgumentException32);
        org.junit.Assert.assertNotNull(arithmeticException33);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException46);
        org.junit.Assert.assertNotNull(arithmeticException47);
        org.junit.Assert.assertNotNull(concurrentModificationException48);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException53);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable10, objArray16);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable9, objArray16);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray16);
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray16);
        java.lang.IllegalArgumentException illegalArgumentException22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray16);
        java.lang.ArithmeticException arithmeticException23 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray16);
        java.lang.Throwable[] throwableArray24 = arithmeticException23.getSuppressed();
        java.util.NoSuchElementException noSuchElementException25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray24);
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray24);
        java.lang.ArithmeticException arithmeticException27 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray24);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(illegalArgumentException22);
        org.junit.Assert.assertNotNull(arithmeticException23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(noSuchElementException25);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(arithmeticException27);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException17 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray13);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray13);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException17);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable5, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray15);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray15);
        java.lang.IllegalStateException illegalStateException23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException25 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) concurrentModificationException24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(illegalStateException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(throwable18);
        concurrentModificationException17.addSuppressed((java.lang.Throwable) mathRuntimeException19);
        java.lang.Throwable[] throwableArray21 = mathRuntimeException19.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray21);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray21);
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray21);
        java.io.EOFException eOFException25 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray21);
        org.apache.commons.math.MathRuntimeException mathRuntimeException26 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = mathRuntimeException26.getContext("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(eOFException25);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray12);
        java.lang.Throwable[] throwableArray15 = eOFException14.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray15);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, (java.lang.Object[]) throwableArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray15);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable20, objArray21);
        org.apache.commons.math.MathRuntimeException mathRuntimeException23 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException22);
        java.lang.Throwable[] throwableArray24 = mathRuntimeException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException25 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException22);
        illegalArgumentException19.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.io.IOException iOException27 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) illegalArgumentException25);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(iOException27);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.lang.Throwable[] throwableArray15 = concurrentModificationException14.getSuppressed();
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, (java.lang.Object[]) throwableArray15);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, (java.lang.Object[]) throwableArray15);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, (java.lang.Object[]) throwableArray15);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable2, (java.lang.Object[]) throwableArray15);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable1, (java.lang.Object[]) throwableArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException22 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) parseException21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(parseException21);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, (java.lang.Object[]) throwableArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray13);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, (java.lang.Object[]) throwableArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray13);
        java.lang.RuntimeException runtimeException19 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException18);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(runtimeException19);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray16);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable6, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray16);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable4, objArray16);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException24 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray16);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray16);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(arithmeticException25);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray15);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray15);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable3, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray13);
        java.lang.Throwable[] throwableArray16 = eOFException15.getSuppressed();
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable3, (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable2, (java.lang.Object[]) throwableArray16);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray16);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray16);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable4, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray14);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray14);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray14);
        java.lang.Class<?> wildcardClass23 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray14);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray14);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray14);
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray14);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(eOFException22);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException10 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray9);
        java.lang.Throwable[] throwableArray11 = concurrentModificationException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException13 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, (java.lang.Object[]) throwableArray11);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException25 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable18, objArray24);
        java.lang.Throwable[] throwableArray26 = concurrentModificationException25.getSuppressed();
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable17, (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.MathRuntimeException mathRuntimeException28 = new org.apache.commons.math.MathRuntimeException(localizable16, (java.lang.Object[]) throwableArray26);
        java.util.ConcurrentModificationException concurrentModificationException29 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable15, (java.lang.Object[]) throwableArray26);
        arithmeticException14.addSuppressed((java.lang.Throwable) concurrentModificationException29);
        java.lang.Throwable[] throwableArray31 = arithmeticException14.getSuppressed();
        java.lang.Class<?> wildcardClass32 = throwableArray31.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(concurrentModificationException29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.IllegalArgumentException illegalArgumentException13 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray11);
        java.lang.ArithmeticException arithmeticException14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException17);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(illegalArgumentException13);
        org.junit.Assert.assertNotNull(arithmeticException14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, objArray11);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable10, objArray16);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable9, objArray16);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable7, objArray16);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable6, objArray16);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray16);
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        org.apache.commons.math.exception.util.Localizable localizable27 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable27, objArray33);
        java.lang.Throwable[] throwableArray35 = concurrentModificationException34.getSuppressed();
        java.lang.IllegalStateException illegalStateException36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, (java.lang.Object[]) throwableArray35);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException37 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable25, (java.lang.Object[]) throwableArray35);
        java.lang.ArithmeticException arithmeticException38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable24, (java.lang.Object[]) throwableArray35);
        java.lang.IllegalArgumentException illegalArgumentException39 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable23, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.MathRuntimeException mathRuntimeException40 = new org.apache.commons.math.MathRuntimeException(localizable22, (java.lang.Object[]) throwableArray35);
        concurrentModificationException21.addSuppressed((java.lang.Throwable) mathRuntimeException40);
        java.lang.Throwable[] throwableArray42 = mathRuntimeException40.getSuppressed();
        java.text.ParseException parseException43 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) -1, localizable3, (java.lang.Object[]) throwableArray42);
        java.io.EOFException eOFException44 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.MathRuntimeException mathRuntimeException45 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.exception.util.Localizable localizable47 = null;
        org.apache.commons.math.exception.util.Localizable localizable48 = null;
        org.apache.commons.math.exception.util.Localizable localizable49 = null;
        org.apache.commons.math.exception.util.Localizable localizable51 = null;
        org.apache.commons.math.exception.util.Localizable localizable52 = null;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException59 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable52, objArray58);
        java.text.ParseException parseException60 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable51, objArray58);
        java.io.EOFException eOFException61 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable49, objArray58);
        java.io.EOFException eOFException62 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable48, objArray58);
        java.io.EOFException eOFException63 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable47, objArray58);
        java.lang.Throwable[] throwableArray64 = eOFException63.getSuppressed();
        java.lang.Class<?> wildcardClass65 = eOFException63.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException45.setContext("", (java.lang.Object) wildcardClass65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(illegalStateException36);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException37);
        org.junit.Assert.assertNotNull(arithmeticException38);
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(parseException43);
        org.junit.Assert.assertNotNull(eOFException44);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException59);
        org.junit.Assert.assertNotNull(parseException60);
        org.junit.Assert.assertNotNull(eOFException61);
        org.junit.Assert.assertNotNull(eOFException62);
        org.junit.Assert.assertNotNull(eOFException63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable9, objArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray17);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable7, objArray17);
        java.io.EOFException eOFException22 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray17);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray17);
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray17);
        org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException(localizable3, objArray17);
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, objArray17);
        java.text.ParseException parseException27 = org.apache.commons.math.MathRuntimeException.createParseException(0, localizable1, objArray17);
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException45 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable37, objArray44);
        java.io.EOFException eOFException46 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable36, objArray44);
        java.util.ConcurrentModificationException concurrentModificationException47 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable35, objArray44);
        java.lang.ArithmeticException arithmeticException48 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable34, objArray44);
        java.lang.Throwable[] throwableArray49 = arithmeticException48.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException50 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable33, (java.lang.Object[]) throwableArray49);
        java.lang.IllegalArgumentException illegalArgumentException51 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable32, (java.lang.Object[]) throwableArray49);
        java.lang.Throwable[] throwableArray52 = illegalArgumentException51.getSuppressed();
        java.util.NoSuchElementException noSuchElementException53 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable31, (java.lang.Object[]) throwableArray52);
        java.lang.IllegalArgumentException illegalArgumentException54 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable30, (java.lang.Object[]) throwableArray52);
        java.lang.Throwable[] throwableArray55 = illegalArgumentException54.getSuppressed();
        java.lang.IllegalStateException illegalStateException56 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable29, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.MathRuntimeException mathRuntimeException57 = new org.apache.commons.math.MathRuntimeException(localizable28, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.exception.util.Localizable localizable58 = null;
        org.apache.commons.math.exception.util.Localizable localizable59 = null;
        org.apache.commons.math.exception.util.Localizable localizable60 = null;
        org.apache.commons.math.exception.util.Localizable localizable61 = null;
        java.lang.Object[] objArray67 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException68 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable61, objArray67);
        java.lang.ArithmeticException arithmeticException69 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable60, objArray67);
        java.lang.ArithmeticException arithmeticException70 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable59, objArray67);
        java.util.NoSuchElementException noSuchElementException71 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable58, objArray67);
        mathRuntimeException57.addSuppressed((java.lang.Throwable) noSuchElementException71);
        java.lang.RuntimeException runtimeException73 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException57);
        parseException27.addSuppressed((java.lang.Throwable) mathRuntimeException57);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(eOFException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(parseException27);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException45);
        org.junit.Assert.assertNotNull(eOFException46);
        org.junit.Assert.assertNotNull(concurrentModificationException47);
        org.junit.Assert.assertNotNull(arithmeticException48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException50);
        org.junit.Assert.assertNotNull(illegalArgumentException51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(noSuchElementException53);
        org.junit.Assert.assertNotNull(illegalArgumentException54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(illegalStateException56);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException68);
        org.junit.Assert.assertNotNull(arithmeticException69);
        org.junit.Assert.assertNotNull(arithmeticException70);
        org.junit.Assert.assertNotNull(noSuchElementException71);
        org.junit.Assert.assertNotNull(runtimeException73);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException16 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException18 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray14);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray14);
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray14);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(noSuchElementException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(noSuchElementException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(illegalStateException20);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException11 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray10);
        java.lang.Throwable[] throwableArray12 = concurrentModificationException11.getSuppressed();
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray12);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray12);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray12);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray12);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, objArray14);
        java.text.ParseException parseException18 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable4, objArray14);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, objArray14);
        java.lang.Throwable[] throwableArray21 = concurrentModificationException20.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray21);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(parseException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException10 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray9);
        java.lang.Throwable[] throwableArray11 = concurrentModificationException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray11);
        java.lang.IllegalArgumentException illegalArgumentException13 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException14 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable18 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException28 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable21, objArray27);
        java.lang.Throwable[] throwableArray29 = concurrentModificationException28.getSuppressed();
        java.lang.IllegalStateException illegalStateException30 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable20, (java.lang.Object[]) throwableArray29);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException31 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable19, (java.lang.Object[]) throwableArray29);
        java.lang.ArithmeticException arithmeticException32 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable18, (java.lang.Object[]) throwableArray29);
        java.lang.IllegalArgumentException illegalArgumentException33 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable17, (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.MathRuntimeException mathRuntimeException34 = new org.apache.commons.math.MathRuntimeException(localizable16, (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.MathRuntimeException mathRuntimeException35 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException14, localizable15, (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        org.apache.commons.math.exception.util.Localizable localizable40 = null;
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        org.apache.commons.math.exception.util.Localizable localizable42 = null;
        org.apache.commons.math.exception.util.Localizable localizable43 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException50 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable43, objArray49);
        java.lang.Throwable[] throwableArray51 = concurrentModificationException50.getSuppressed();
        java.lang.IllegalStateException illegalStateException52 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable42, (java.lang.Object[]) throwableArray51);
        java.util.NoSuchElementException noSuchElementException53 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable41, (java.lang.Object[]) throwableArray51);
        java.io.EOFException eOFException54 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable40, (java.lang.Object[]) throwableArray51);
        org.apache.commons.math.MathRuntimeException mathRuntimeException55 = new org.apache.commons.math.MathRuntimeException(throwable38, localizable39, (java.lang.Object[]) throwableArray51);
        java.io.EOFException eOFException56 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable37, (java.lang.Object[]) throwableArray51);
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException14.addMessage(localizable36, (java.lang.Object[]) throwableArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(illegalArgumentException13);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(illegalStateException30);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException31);
        org.junit.Assert.assertNotNull(arithmeticException32);
        org.junit.Assert.assertNotNull(illegalArgumentException33);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(illegalStateException52);
        org.junit.Assert.assertNotNull(noSuchElementException53);
        org.junit.Assert.assertNotNull(eOFException54);
        org.junit.Assert.assertNotNull(eOFException56);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.text.ParseException parseException13 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, objArray11);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, objArray11);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, objArray11);
        java.lang.Throwable[] throwableArray16 = eOFException15.getSuppressed();
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = mathRuntimeException17.getContext("org.apache.commons.math.MathRuntimeException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(parseException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException10 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray9);
        java.lang.Throwable[] throwableArray11 = concurrentModificationException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray11);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException14 = new org.apache.commons.math.MathRuntimeException(localizable0, (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException27 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable20, objArray26);
        java.text.ParseException parseException28 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable19, objArray26);
        java.lang.IllegalArgumentException illegalArgumentException29 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable17, objArray26);
        java.lang.ArithmeticException arithmeticException30 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable16, objArray26);
        org.apache.commons.math.MathRuntimeException mathRuntimeException31 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException14, localizable15, objArray26);
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        org.apache.commons.math.exception.util.Localizable localizable40 = null;
        org.apache.commons.math.exception.util.Localizable localizable41 = null;
        java.lang.Object[] objArray48 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException49 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable41, objArray48);
        java.lang.ArithmeticException arithmeticException50 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable40, objArray48);
        java.util.ConcurrentModificationException concurrentModificationException51 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable39, objArray48);
        java.text.ParseException parseException52 = org.apache.commons.math.MathRuntimeException.createParseException((int) ' ', localizable38, objArray48);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException53 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable36, objArray48);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException54 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable35, objArray48);
        org.apache.commons.math.MathRuntimeException mathRuntimeException55 = new org.apache.commons.math.MathRuntimeException(localizable34, objArray48);
        org.apache.commons.math.MathRuntimeException mathRuntimeException56 = new org.apache.commons.math.MathRuntimeException(localizable33, objArray48);
        java.lang.IllegalArgumentException illegalArgumentException57 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable) mathRuntimeException56);
        java.lang.Throwable[] throwableArray58 = mathRuntimeException56.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            mathRuntimeException31.setContext("", (java.lang.Object) throwableArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This class is deprecated; calling this method is a bug.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException27);
        org.junit.Assert.assertNotNull(parseException28);
        org.junit.Assert.assertNotNull(illegalArgumentException29);
        org.junit.Assert.assertNotNull(arithmeticException30);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException49);
        org.junit.Assert.assertNotNull(arithmeticException50);
        org.junit.Assert.assertNotNull(concurrentModificationException51);
        org.junit.Assert.assertNotNull(parseException52);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException53);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException54);
        org.junit.Assert.assertNotNull(illegalArgumentException57);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, (java.lang.Object[]) throwableArray13);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable2, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException17 = new org.apache.commons.math.MathRuntimeException(localizable1, (java.lang.Object[]) throwableArray13);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray15);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray15);
        java.util.NoSuchElementException noSuchElementException21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException(localizable2, objArray15);
        java.io.EOFException eOFException23 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, objArray15);
        java.lang.ArithmeticException arithmeticException24 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(noSuchElementException21);
        org.junit.Assert.assertNotNull(eOFException23);
        org.junit.Assert.assertNotNull(arithmeticException24);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable10, objArray16);
        java.lang.Throwable[] throwableArray18 = concurrentModificationException17.getSuppressed();
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, (java.lang.Object[]) throwableArray18);
        java.lang.ArithmeticException arithmeticException20 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable8, (java.lang.Object[]) throwableArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, (java.lang.Object[]) throwableArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable6, (java.lang.Object[]) throwableArray18);
        java.lang.IllegalArgumentException illegalArgumentException23 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, (java.lang.Object[]) throwableArray18);
        java.io.EOFException eOFException24 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, (java.lang.Object[]) throwableArray18);
        java.lang.IllegalStateException illegalStateException25 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, (java.lang.Object[]) throwableArray18);
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray18);
        java.util.NoSuchElementException noSuchElementException27 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, (java.lang.Object[]) throwableArray18);
        java.io.EOFException eOFException28 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(arithmeticException20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException22);
        org.junit.Assert.assertNotNull(illegalArgumentException23);
        org.junit.Assert.assertNotNull(eOFException24);
        org.junit.Assert.assertNotNull(illegalStateException25);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(noSuchElementException27);
        org.junit.Assert.assertNotNull(eOFException28);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable10, objArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray17);
        java.lang.Throwable[] throwableArray20 = eOFException19.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable8, (java.lang.Object[]) throwableArray20);
        java.util.ConcurrentModificationException concurrentModificationException22 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, (java.lang.Object[]) throwableArray20);
        java.lang.ArithmeticException arithmeticException23 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable6, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable5, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException26 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, (java.lang.Object[]) throwableArray20);
        java.util.NoSuchElementException noSuchElementException27 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable2, (java.lang.Object[]) throwableArray20);
        java.lang.IllegalArgumentException illegalArgumentException28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray20);
        java.util.ConcurrentModificationException concurrentModificationException29 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException21);
        org.junit.Assert.assertNotNull(concurrentModificationException22);
        org.junit.Assert.assertNotNull(arithmeticException23);
        org.junit.Assert.assertNotNull(noSuchElementException24);
        org.junit.Assert.assertNotNull(noSuchElementException26);
        org.junit.Assert.assertNotNull(noSuchElementException27);
        org.junit.Assert.assertNotNull(illegalArgumentException28);
        org.junit.Assert.assertNotNull(concurrentModificationException29);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.text.ParseException parseException13 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable4, objArray11);
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, objArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray11);
        org.apache.commons.math.MathRuntimeException mathRuntimeException16 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray11);
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable22 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        org.apache.commons.math.exception.util.Localizable localizable25 = null;
        org.apache.commons.math.exception.util.Localizable localizable26 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable26, objArray33);
        java.lang.ArithmeticException arithmeticException35 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable25, objArray33);
        java.util.ConcurrentModificationException concurrentModificationException36 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray33);
        java.util.NoSuchElementException noSuchElementException37 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable23, objArray33);
        java.util.ConcurrentModificationException concurrentModificationException38 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable22, objArray33);
        org.apache.commons.math.MathRuntimeException mathRuntimeException39 = new org.apache.commons.math.MathRuntimeException(localizable21, objArray33);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException40 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable20, objArray33);
        java.text.ParseException parseException41 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) -1, localizable19, objArray33);
        org.apache.commons.math.MathRuntimeException mathRuntimeException42 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException16, localizable17, objArray33);
        java.lang.RuntimeException runtimeException43 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable) mathRuntimeException16);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(parseException13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException34);
        org.junit.Assert.assertNotNull(arithmeticException35);
        org.junit.Assert.assertNotNull(concurrentModificationException36);
        org.junit.Assert.assertNotNull(noSuchElementException37);
        org.junit.Assert.assertNotNull(concurrentModificationException38);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException40);
        org.junit.Assert.assertNotNull(parseException41);
        org.junit.Assert.assertNotNull(runtimeException43);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, objArray12);
        java.io.EOFException eOFException14 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray12);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray12);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray12);
        java.lang.ArithmeticException arithmeticException18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) arithmeticException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(eOFException14);
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(arithmeticException18);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException10 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray9);
        java.lang.Throwable[] throwableArray11 = concurrentModificationException10.getSuppressed();
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable2, (java.lang.Object[]) throwableArray11);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException13 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, (java.lang.Object[]) throwableArray11);
        java.lang.Throwable[] throwableArray14 = arrayIndexOutOfBoundsException13.getSuppressed();
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.util.Localizable localizable16 = null;
        org.apache.commons.math.exception.util.Localizable localizable17 = null;
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray30);
        java.text.ParseException parseException32 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable23, objArray30);
        java.util.NoSuchElementException noSuchElementException33 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable21, objArray30);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException34 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable20, objArray30);
        java.text.ParseException parseException35 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable19, objArray30);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable17, objArray30);
        java.util.NoSuchElementException noSuchElementException37 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable16, objArray30);
        concurrentModificationException15.addSuppressed((java.lang.Throwable) noSuchElementException37);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException31);
        org.junit.Assert.assertNotNull(parseException32);
        org.junit.Assert.assertNotNull(noSuchElementException33);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException34);
        org.junit.Assert.assertNotNull(parseException35);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException36);
        org.junit.Assert.assertNotNull(noSuchElementException37);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException13 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray12);
        java.lang.Throwable[] throwableArray14 = concurrentModificationException13.getSuppressed();
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable5, (java.lang.Object[]) throwableArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException16 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, (java.lang.Object[]) throwableArray14);
        java.lang.Throwable[] throwableArray17 = arrayIndexOutOfBoundsException16.getSuppressed();
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, (java.lang.Object[]) throwableArray17);
        java.io.EOFException eOFException19 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray17);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable1, (java.lang.Object[]) throwableArray17);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray17);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(eOFException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable7, objArray15);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable5, objArray15);
        java.io.EOFException eOFException20 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable4, objArray15);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 1, localizable3, objArray15);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException(100, localizable1, objArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = parseException22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(eOFException20);
        org.junit.Assert.assertNotNull(parseException21);
        org.junit.Assert.assertNotNull(parseException22);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable7, objArray14);
        java.io.EOFException eOFException16 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable6, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException18 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable4, objArray14);
        java.lang.IllegalStateException illegalStateException19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable3, objArray14);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable2, objArray14);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable0, objArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = eOFException21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException15);
        org.junit.Assert.assertNotNull(eOFException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException18);
        org.junit.Assert.assertNotNull(illegalStateException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(eOFException21);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray14);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray14);
        java.text.ParseException parseException19 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 100, localizable3, objArray14);
        java.lang.IllegalStateException illegalStateException20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable1, objArray14);
        java.lang.ArithmeticException arithmeticException21 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(parseException19);
        org.junit.Assert.assertNotNull(illegalStateException20);
        org.junit.Assert.assertNotNull(arithmeticException21);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.text.ParseException parseException15 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable6, objArray13);
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException17 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable3, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException19 = new org.apache.commons.math.MathRuntimeException(localizable1, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException20 = new org.apache.commons.math.MathRuntimeException(localizable0, objArray13);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException20);
        java.lang.Throwable[] throwableArray22 = mathRuntimeException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = mathRuntimeException21.getSuppressed();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(parseException15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(illegalArgumentException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException11 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray10);
        java.lang.ArithmeticException arithmeticException12 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray10);
        java.lang.ArithmeticException arithmeticException13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable2, objArray10);
        java.util.NoSuchElementException noSuchElementException14 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray10);
        java.lang.Throwable[] throwableArray15 = noSuchElementException14.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray15);
        java.lang.Class<?> wildcardClass17 = illegalArgumentException16.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException11);
        org.junit.Assert.assertNotNull(arithmeticException12);
        org.junit.Assert.assertNotNull(arithmeticException13);
        org.junit.Assert.assertNotNull(noSuchElementException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(illegalArgumentException16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException12 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray11);
        java.io.EOFException eOFException13 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable3, objArray11);
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray11);
        java.util.NoSuchElementException noSuchElementException15 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray11);
        java.lang.ArithmeticException arithmeticException16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, objArray11);
        java.lang.Throwable[] throwableArray17 = arithmeticException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException18 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable) arithmeticException16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException12);
        org.junit.Assert.assertNotNull(eOFException13);
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(noSuchElementException15);
        org.junit.Assert.assertNotNull(arithmeticException16);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable9, objArray15);
        java.text.ParseException parseException17 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable8, objArray15);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable5, objArray15);
        java.lang.IllegalArgumentException illegalArgumentException20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable4, objArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException21 = new org.apache.commons.math.MathRuntimeException(localizable3, objArray15);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) (short) 10, localizable2, objArray15);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, objArray15);
        java.lang.Throwable[] throwableArray24 = arrayIndexOutOfBoundsException23.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException25 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) arrayIndexOutOfBoundsException23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(parseException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(illegalArgumentException20);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException15 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable8, objArray14);
        java.text.ParseException parseException16 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable7, objArray14);
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray14);
        java.lang.IllegalStateException illegalStateException18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, objArray14);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException19 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, objArray14);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray14);
        java.text.ParseException parseException21 = org.apache.commons.math.MathRuntimeException.createParseException(1, localizable1, objArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException22 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) parseException21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException15);
        org.junit.Assert.assertNotNull(parseException16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(illegalStateException18);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
        org.junit.Assert.assertNotNull(parseException21);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException19 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable12, objArray18);
        java.text.ParseException parseException20 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable11, objArray18);
        java.io.EOFException eOFException21 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable9, objArray18);
        java.lang.IllegalStateException illegalStateException22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable8, objArray18);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, objArray18);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, objArray18);
        java.lang.ArithmeticException arithmeticException25 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray18);
        java.lang.ArithmeticException arithmeticException26 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable4, objArray18);
        java.util.NoSuchElementException noSuchElementException27 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray18);
        java.lang.IllegalArgumentException illegalArgumentException28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray18);
        java.lang.Throwable[] throwableArray29 = illegalArgumentException28.getSuppressed();
        java.lang.ArithmeticException arithmeticException30 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable1, (java.lang.Object[]) throwableArray29);
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, (java.lang.Object[]) throwableArray29);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException19);
        org.junit.Assert.assertNotNull(parseException20);
        org.junit.Assert.assertNotNull(eOFException21);
        org.junit.Assert.assertNotNull(illegalStateException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(arithmeticException25);
        org.junit.Assert.assertNotNull(arithmeticException26);
        org.junit.Assert.assertNotNull(noSuchElementException27);
        org.junit.Assert.assertNotNull(illegalArgumentException28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(arithmeticException30);
        org.junit.Assert.assertNotNull(concurrentModificationException31);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException14 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable7, objArray13);
        java.lang.Throwable[] throwableArray15 = concurrentModificationException14.getSuppressed();
        java.lang.IllegalStateException illegalStateException16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, (java.lang.Object[]) throwableArray15);
        java.lang.ArithmeticException arithmeticException17 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathRuntimeException mathRuntimeException18 = new org.apache.commons.math.MathRuntimeException(localizable4, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.exception.util.Localizable localizable19 = null;
        org.apache.commons.math.exception.util.Localizable localizable20 = null;
        org.apache.commons.math.exception.util.Localizable localizable21 = null;
        org.apache.commons.math.exception.util.Localizable localizable23 = null;
        org.apache.commons.math.exception.util.Localizable localizable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException31 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable24, objArray30);
        java.text.ParseException parseException32 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable23, objArray30);
        java.lang.IllegalArgumentException illegalArgumentException33 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable21, objArray30);
        java.lang.ArithmeticException arithmeticException34 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable20, objArray30);
        org.apache.commons.math.MathRuntimeException mathRuntimeException35 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException18, localizable19, objArray30);
        org.apache.commons.math.exception.util.Localizable localizable36 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        org.apache.commons.math.exception.util.Localizable localizable39 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException47 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable39, objArray46);
        java.lang.ArithmeticException arithmeticException48 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable38, objArray46);
        java.util.ConcurrentModificationException concurrentModificationException49 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable37, objArray46);
        org.apache.commons.math.MathRuntimeException mathRuntimeException50 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) mathRuntimeException35, localizable36, objArray46);
        java.lang.ArithmeticException arithmeticException51 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable3, objArray46);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException52 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable2, objArray46);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException53 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, objArray46);
        java.util.ConcurrentModificationException concurrentModificationException54 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray46);
        java.lang.Throwable[] throwableArray55 = concurrentModificationException54.getSuppressed();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(illegalStateException16);
        org.junit.Assert.assertNotNull(arithmeticException17);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException31);
        org.junit.Assert.assertNotNull(parseException32);
        org.junit.Assert.assertNotNull(illegalArgumentException33);
        org.junit.Assert.assertNotNull(arithmeticException34);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException47);
        org.junit.Assert.assertNotNull(arithmeticException48);
        org.junit.Assert.assertNotNull(concurrentModificationException49);
        org.junit.Assert.assertNotNull(arithmeticException51);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException52);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException53);
        org.junit.Assert.assertNotNull(concurrentModificationException54);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.io.EOFException eOFException15 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException17 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable3, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable2, objArray13);
        java.util.NoSuchElementException noSuchElementException19 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable1, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException20 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable0, objArray13);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(eOFException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(concurrentModificationException17);
        org.junit.Assert.assertNotNull(illegalArgumentException18);
        org.junit.Assert.assertNotNull(noSuchElementException19);
        org.junit.Assert.assertNotNull(concurrentModificationException20);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable6, objArray13);
        java.lang.ArithmeticException arithmeticException15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException16 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable4, objArray13);
        java.util.NoSuchElementException noSuchElementException17 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable3, objArray13);
        java.util.ConcurrentModificationException concurrentModificationException18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, objArray13);
        java.lang.IllegalArgumentException illegalArgumentException19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, objArray13);
        java.util.NoSuchElementException noSuchElementException20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable0, objArray13);
        java.lang.Throwable[] throwableArray21 = noSuchElementException20.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = noSuchElementException20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arithmeticException15);
        org.junit.Assert.assertNotNull(concurrentModificationException16);
        org.junit.Assert.assertNotNull(noSuchElementException17);
        org.junit.Assert.assertNotNull(concurrentModificationException18);
        org.junit.Assert.assertNotNull(illegalArgumentException19);
        org.junit.Assert.assertNotNull(noSuchElementException20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable5, objArray11);
        java.lang.Throwable[] throwableArray13 = concurrentModificationException12.getSuppressed();
        java.lang.IllegalStateException illegalStateException14 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable4, (java.lang.Object[]) throwableArray13);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException15 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray13);
        java.lang.Throwable[] throwableArray16 = arrayIndexOutOfBoundsException15.getSuppressed();
        java.io.EOFException eOFException17 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable2, (java.lang.Object[]) throwableArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable1, (java.lang.Object[]) throwableArray16);
        java.lang.ArithmeticException arithmeticException19 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable0, (java.lang.Object[]) throwableArray16);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(illegalStateException14);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(eOFException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(arithmeticException19);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable4 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.lang.Throwable[] throwableArray19 = eOFException18.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, (java.lang.Object[]) throwableArray19);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, (java.lang.Object[]) throwableArray19);
        java.lang.ArithmeticException arithmeticException22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable5, (java.lang.Object[]) throwableArray19);
        java.util.NoSuchElementException noSuchElementException23 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(localizable4, (java.lang.Object[]) throwableArray19);
        java.text.ParseException parseException24 = org.apache.commons.math.MathRuntimeException.createParseException((int) (byte) 0, localizable3, (java.lang.Object[]) throwableArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException25 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable1, (java.lang.Object[]) throwableArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable0, (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(arithmeticException22);
        org.junit.Assert.assertNotNull(noSuchElementException23);
        org.junit.Assert.assertNotNull(parseException24);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException25);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException26);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable2 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.exception.util.Localizable localizable6 = null;
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable8 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, '4', (byte) 10, 10L, 10, 'a' };
        java.lang.IllegalStateException illegalStateException17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable9, objArray16);
        java.io.EOFException eOFException18 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable8, objArray16);
        java.lang.Throwable[] throwableArray19 = eOFException18.getSuppressed();
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException20 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable7, (java.lang.Object[]) throwableArray19);
        java.util.ConcurrentModificationException concurrentModificationException21 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable6, (java.lang.Object[]) throwableArray19);
        java.text.ParseException parseException22 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable5, (java.lang.Object[]) throwableArray19);
        java.lang.ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException23 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(localizable3, (java.lang.Object[]) throwableArray19);
        java.util.ConcurrentModificationException concurrentModificationException24 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable2, (java.lang.Object[]) throwableArray19);
        java.lang.IllegalArgumentException illegalArgumentException25 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray19);
        java.lang.Throwable[] throwableArray26 = illegalArgumentException25.getSuppressed();
        java.lang.IllegalStateException illegalStateException27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(localizable0, (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.exception.util.Localizable localizable28 = null;
        org.apache.commons.math.exception.util.Localizable localizable29 = null;
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        org.apache.commons.math.exception.util.Localizable localizable31 = null;
        org.apache.commons.math.exception.util.Localizable localizable32 = null;
        org.apache.commons.math.exception.util.Localizable localizable33 = null;
        org.apache.commons.math.exception.util.Localizable localizable34 = null;
        org.apache.commons.math.exception.util.Localizable localizable35 = null;
        org.apache.commons.math.exception.util.Localizable localizable37 = null;
        org.apache.commons.math.exception.util.Localizable localizable38 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1.0f), (byte) 1, 100, (short) 10, (-1.0f) };
        java.util.ConcurrentModificationException concurrentModificationException45 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable38, objArray44);
        java.text.ParseException parseException46 = org.apache.commons.math.MathRuntimeException.createParseException((int) '#', localizable37, objArray44);
        java.lang.IllegalArgumentException illegalArgumentException47 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable35, objArray44);
        java.lang.ArithmeticException arithmeticException48 = org.apache.commons.math.MathRuntimeException.createArithmeticException(localizable34, objArray44);
        java.io.EOFException eOFException49 = org.apache.commons.math.MathRuntimeException.createEOFException(localizable33, objArray44);
        java.lang.IllegalArgumentException illegalArgumentException50 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable32, objArray44);
        java.util.ConcurrentModificationException concurrentModificationException51 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(localizable31, objArray44);
        java.lang.IllegalArgumentException illegalArgumentException52 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable30, objArray44);
        java.lang.IllegalArgumentException illegalArgumentException53 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(localizable29, objArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathRuntimeException mathRuntimeException54 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable) illegalStateException27, localizable28, objArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, 4, 10, 10, 10, a]");
        org.junit.Assert.assertNotNull(illegalStateException17);
        org.junit.Assert.assertNotNull(eOFException18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException20);
        org.junit.Assert.assertNotNull(concurrentModificationException21);
        org.junit.Assert.assertNotNull(parseException22);
        org.junit.Assert.assertNotNull(arrayIndexOutOfBoundsException23);
        org.junit.Assert.assertNotNull(concurrentModificationException24);
        org.junit.Assert.assertNotNull(illegalArgumentException25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(illegalStateException27);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1.0, 1, 100, 10, -1.0]");
        org.junit.Assert.assertNotNull(concurrentModificationException45);
        org.junit.Assert.assertNotNull(parseException46);
        org.junit.Assert.assertNotNull(illegalArgumentException47);
        org.junit.Assert.assertNotNull(arithmeticException48);
        org.junit.Assert.assertNotNull(eOFException49);
        org.junit.Assert.assertNotNull(illegalArgumentException50);
        org.junit.Assert.assertNotNull(concurrentModificationException51);
        org.junit.Assert.assertNotNull(illegalArgumentException52);
        org.junit.Assert.assertNotNull(illegalArgumentException53);
    }
}

