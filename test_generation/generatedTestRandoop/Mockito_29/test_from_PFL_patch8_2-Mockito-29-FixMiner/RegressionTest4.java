import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str4 = same2.toString();
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean14);
        java.lang.String str16 = same15.toString();
        java.lang.String str17 = same15.toString();
        java.lang.String str18 = same15.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(false)" + "'", str16, "same(false)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(false)" + "'", str17, "same(false)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(false)" + "'", str18, "same(false)");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str4 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str6 = same3.toString();
        java.lang.Class<?> wildcardClass7 = same3.getClass();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean16 = same14.matches((java.lang.Object) 100);
        boolean boolean17 = same10.matches((java.lang.Object) boolean16);
        boolean boolean19 = same10.matches((java.lang.Object) 1L);
        boolean boolean21 = same10.matches((java.lang.Object) 1);
        boolean boolean23 = same10.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same10.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        boolean boolean34 = same28.matches((java.lang.Object) same33);
        org.hamcrest.Description description35 = null;
        // The following exception was thrown during execution in test generation
        try {
            same8.describeMismatch((java.lang.Object) same33, description35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(same(0.0))" + "'", str4, "same(same(0.0))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(0.0))" + "'", str6, "same(same(0.0))");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean8 = same1.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.String str13 = same12.toString();
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same9.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str19 = same16.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(10)" + "'", str13, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(10))" + "'", str19, "same(same(10))");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean8 = same6.matches((java.lang.Object) 100);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean17 = same13.matches((java.lang.Object) "same(0)");
        java.lang.String str18 = same13.toString();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same13.matches((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        boolean boolean25 = same6.matches((java.lang.Object) same24);
        java.lang.String str26 = same24.toString();
        boolean boolean27 = same1.matches((java.lang.Object) same24);
        boolean boolean29 = same1.matches((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        java.lang.String str31 = same30.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0.0)" + "'", str4, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(0))" + "'", str26, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(100.0)" + "'", str31, "same(100.0)");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
        java.lang.Object obj2 = null;
        boolean boolean3 = same1.matches(obj2);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) 10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same14);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        java.lang.String str25 = same22.toString();
        java.lang.String str26 = same22.toString();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(same(0))" + "'", str25, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(0))" + "'", str26, "same(same(0))");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        boolean boolean12 = same1.matches((java.lang.Object) 1);
        boolean boolean14 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        boolean boolean28 = same21.matches((java.lang.Object) boolean27);
        boolean boolean30 = same21.matches((java.lang.Object) 1L);
        boolean boolean32 = same21.matches((java.lang.Object) 1);
        boolean boolean34 = same21.matches((java.lang.Object) 10.0d);
        boolean boolean35 = same19.matches((java.lang.Object) same21);
        java.lang.String str36 = same21.toString();
        java.lang.String str37 = same21.toString();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        boolean boolean45 = same39.matches((java.lang.Object) same44);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean47 = same21.matches((java.lang.Object) same39);
        java.lang.String str48 = same39.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(0)" + "'", str36, "same(0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(0)" + "'", str37, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(10)" + "'", str48, "same(10)");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        java.lang.String str7 = same1.toString();
        boolean boolean9 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        boolean boolean19 = same15.matches((java.lang.Object) "same(0)");
        java.lang.String str20 = same15.toString();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same11.matches((java.lang.Object) same15);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same25.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean40 = same33.matches((java.lang.Object) boolean39);
        boolean boolean42 = same33.matches((java.lang.Object) 1L);
        boolean boolean44 = same33.matches((java.lang.Object) 1);
        boolean boolean45 = same31.matches((java.lang.Object) boolean44);
        java.lang.String str46 = same31.toString();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same48.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean54 = same52.matches((java.lang.Object) 100);
        boolean boolean55 = same48.matches((java.lang.Object) boolean54);
        boolean boolean57 = same48.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean62 = same48.matches((java.lang.Object) same59);
        boolean boolean63 = same31.matches((java.lang.Object) same59);
        boolean boolean64 = same11.matches((java.lang.Object) boolean63);
        java.lang.String str65 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str67 = same11.toString();
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same69._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same72._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        boolean boolean75 = same69.matches((java.lang.Object) same74);
        java.lang.String str76 = same74.toString();
        org.mockito.internal.matchers.Same same78 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean80 = same78.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same82 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean83 = same78.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) same78);
        boolean boolean85 = same74.matches((java.lang.Object) same84);
        boolean boolean86 = same11.matches((java.lang.Object) boolean85);
        boolean boolean87 = same1.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str90 = same11.toString();
        org.mockito.internal.matchers.Same same91 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        same91._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(same(0))" + "'", str46, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "same(0)" + "'", str65, "same(0)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(0)" + "'", str67, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "same(same(0.0))" + "'", str76, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "same(0)" + "'", str90, "same(0)");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass11 = same10.getClass();
        boolean boolean12 = same1.matches((java.lang.Object) wildcardClass11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass11);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
        java.lang.Object obj17 = null;
        boolean boolean18 = same16.matches(obj17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        boolean boolean20 = same13.matches((java.lang.Object) same19);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        boolean boolean13 = same1.matches((java.lang.Object) boolean12);
        java.lang.String str14 = same1.toString();
        java.lang.String str15 = same1.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean20 = same18.matches((java.lang.Object) 100);
        boolean boolean22 = same18.matches((java.lang.Object) "same(0)");
        java.lang.String str23 = same18.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same18.matches((java.lang.Object) same25);
        java.lang.Class<?> wildcardClass29 = same18.getClass();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean31 = same16.matches((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        java.lang.String str34 = same16.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0.0)" + "'", str14, "same(0.0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0.0)" + "'", str15, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(0)" + "'", str23, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(same(0.0))" + "'", str34, "same(same(0.0))");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same6.toString();
        java.lang.Class<?> wildcardClass9 = same6.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        boolean boolean11 = same1.matches((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same('4')" + "'", str8, "same('4')");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        boolean boolean12 = same1.matches((java.lang.Object) 1);
        boolean boolean14 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description21 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeTo(description21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str4 = same3.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean9 = same7.matches((java.lang.Object) 100);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean14 = same7.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description17 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) same15, description17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(same(0.0))" + "'", str4, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        java.lang.String str8 = same6.toString();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(same(0.0))" + "'", str8, "same(same(0.0))");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        java.lang.String str6 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same14.toString();
        java.lang.Class<?> wildcardClass17 = same14.getClass();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass17);
        boolean boolean19 = same9.matches((java.lang.Object) wildcardClass17);
        boolean boolean20 = same1.matches((java.lang.Object) same9);
        java.lang.String str21 = same9.toString();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same('4')" + "'", str16, "same('4')");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(0)" + "'", str3, "same(0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean7 = same3.matches((java.lang.Object) "same(0)");
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str13 = same12.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str17 = same15.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) str17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean24 = same20.matches((java.lang.Object) (short) -1);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean29 = same27.matches((java.lang.Object) 100);
        boolean boolean31 = same27.matches((java.lang.Object) (short) -1);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str33 = same27.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean41 = same39.matches((java.lang.Object) 100);
        boolean boolean42 = same35.matches((java.lang.Object) boolean41);
        boolean boolean44 = same35.matches((java.lang.Object) 1L);
        boolean boolean46 = same35.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass47 = same35.getClass();
        boolean boolean48 = same27.matches((java.lang.Object) wildcardClass47);
        boolean boolean49 = same20.matches((java.lang.Object) boolean48);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str51 = same20.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) str51);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean56 = same54.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean60 = same58.matches((java.lang.Object) 100);
        boolean boolean61 = same54.matches((java.lang.Object) boolean60);
        boolean boolean63 = same54.matches((java.lang.Object) 1L);
        boolean boolean65 = same54.matches((java.lang.Object) 1);
        boolean boolean67 = same54.matches((java.lang.Object) 10.0d);
        boolean boolean68 = same52.matches((java.lang.Object) same54);
        boolean boolean69 = same18.matches((java.lang.Object) boolean68);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str71 = same18.toString();
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        org.hamcrest.Description description74 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeMismatch((java.lang.Object) same72, description74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(10)" + "'", str17, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(0)" + "'", str33, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(0)" + "'", str51, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(\"same(10)\")" + "'", str71, "same(\"same(10)\")");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean8 = same1.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean19 = same12.matches((java.lang.Object) boolean18);
        boolean boolean21 = same12.matches((java.lang.Object) 1L);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same9.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same25.matches((java.lang.Object) (byte) 100);
        java.lang.String str32 = same25.toString();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean41 = same25.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean41);
        boolean boolean44 = same42.matches((java.lang.Object) "same(0)");
        boolean boolean45 = same12.matches((java.lang.Object) same42);
        java.lang.String str46 = same42.toString();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same48.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean54 = same52.matches((java.lang.Object) 100);
        boolean boolean55 = same48.matches((java.lang.Object) boolean54);
        boolean boolean57 = same48.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean60 = same48.matches((java.lang.Object) 10L);
        boolean boolean62 = same48.matches((java.lang.Object) 100);
        java.lang.String str63 = same48.toString();
        org.hamcrest.Description description64 = null;
        // The following exception was thrown during execution in test generation
        try {
            same42.describeMismatch((java.lang.Object) same48, description64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(0)" + "'", str32, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(false)" + "'", str46, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(0)" + "'", str63, "same(0)");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same1.matches((java.lang.Object) same14);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same4.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean11 = same4.matches((java.lang.Object) boolean10);
        boolean boolean13 = same4.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean16 = same4.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean16);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same1.matches((java.lang.Object) same17);
        java.lang.String str20 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.hamcrest.Description description23 = null;
        // The following exception was thrown during execution in test generation
        try {
            same22.describeTo(description23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(false)" + "'", str20, "same(false)");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) 10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same14);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass25 = same24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = same3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        boolean boolean16 = same12.matches((java.lang.Object) "same(0)");
        java.lang.String str17 = same12.toString();
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean29 = same24.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same22.matches((java.lang.Object) same24);
        boolean boolean33 = same6.matches((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean42 = same35.matches((java.lang.Object) (byte) 10);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str44 = same35.toString();
        boolean boolean45 = same6.matches((java.lang.Object) same35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(0)" + "'", str17, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(0)" + "'", str44, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean24 = same22.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean28 = same26.matches((java.lang.Object) 100);
        boolean boolean29 = same22.matches((java.lang.Object) boolean28);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass31 = same22.getClass();
        boolean boolean32 = same19.matches((java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = same19.getClass();
        org.hamcrest.Description description34 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same19, description34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) (short) -1);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same8.toString();
        boolean boolean15 = same1.matches((java.lang.Object) same8);
        java.lang.Class<?> wildcardClass16 = same1.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 0);
        java.lang.String str20 = same19.toString();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same17.matches((java.lang.Object) same19);
        java.lang.String str23 = same19.toString();
        java.lang.String str24 = same19.toString();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(0)" + "'", str23, "same(0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        boolean boolean21 = same7.matches((java.lang.Object) boolean20);
        java.lang.String str22 = same7.toString();
        boolean boolean24 = same7.matches((java.lang.Object) 1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str28 = same27.toString();
        java.lang.String str29 = same27.toString();
        java.lang.String str30 = same27.toString();
        boolean boolean31 = same7.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean31);
        java.lang.Class<?> wildcardClass33 = same32.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(0)" + "'", str30, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str5 = same3.toString();
        java.lang.String str6 = same3.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(same(10))" + "'", str5, "same(same(10))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(10))" + "'", str6, "same(same(10))");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same6.matches((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) '#');
        java.lang.String str11 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass17 = same15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean21 = same19.matches((java.lang.Object) 100);
        boolean boolean22 = same15.matches((java.lang.Object) boolean21);
        boolean boolean24 = same15.matches((java.lang.Object) 1L);
        boolean boolean26 = same15.matches((java.lang.Object) 1);
        boolean boolean28 = same15.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same15.matches((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean32);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean41 = same39.matches((java.lang.Object) 100);
        boolean boolean42 = same35.matches((java.lang.Object) boolean41);
        boolean boolean44 = same35.matches((java.lang.Object) 1L);
        boolean boolean46 = same35.matches((java.lang.Object) 1);
        boolean boolean48 = same35.matches((java.lang.Object) 10.0d);
        boolean boolean49 = same33.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.String str52 = same51.toString();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) str52);
        same53._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean55 = same35.matches((java.lang.Object) same53);
        boolean boolean56 = same1.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean60 = same58.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean64 = same62.matches((java.lang.Object) 100);
        boolean boolean66 = same62.matches((java.lang.Object) "same(0)");
        java.lang.String str67 = same62.toString();
        same62._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean69 = same58.matches((java.lang.Object) same62);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) same58);
        same58._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) same58);
        java.lang.String str73 = same72.toString();
        boolean boolean74 = same1.matches((java.lang.Object) same72);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(10)" + "'", str52, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(0)" + "'", str67, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "same(same(0))" + "'", str73, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same1.matches((java.lang.Object) same11);
        java.lang.String str18 = same1.toString();
        java.lang.String str19 = same1.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        boolean boolean28 = same21.matches((java.lang.Object) boolean27);
        boolean boolean30 = same21.matches((java.lang.Object) 1L);
        boolean boolean32 = same21.matches((java.lang.Object) ' ');
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str34 = same21.toString();
        org.hamcrest.Description description35 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same21, description35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(0)" + "'", str34, "same(0)");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        boolean boolean12 = same1.matches((java.lang.Object) 1);
        boolean boolean14 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        boolean boolean28 = same21.matches((java.lang.Object) boolean27);
        boolean boolean30 = same21.matches((java.lang.Object) 1L);
        boolean boolean32 = same21.matches((java.lang.Object) 1);
        boolean boolean34 = same21.matches((java.lang.Object) 10.0d);
        boolean boolean35 = same19.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean41 = same37.matches((java.lang.Object) "same(0)");
        java.lang.String str42 = same37.toString();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean47 = same37.matches((java.lang.Object) same44);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean51 = same49.matches((java.lang.Object) 100);
        boolean boolean53 = same49.matches((java.lang.Object) (short) -1);
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str55 = same49.toString();
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean59 = same57.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean63 = same61.matches((java.lang.Object) 100);
        boolean boolean64 = same57.matches((java.lang.Object) boolean63);
        boolean boolean66 = same57.matches((java.lang.Object) 1L);
        boolean boolean68 = same57.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass69 = same57.getClass();
        boolean boolean70 = same49.matches((java.lang.Object) wildcardClass69);
        java.lang.Class<?> wildcardClass71 = same49.getClass();
        boolean boolean72 = same37.matches((java.lang.Object) wildcardClass71);
        boolean boolean73 = same21.matches((java.lang.Object) same37);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same75 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(0)" + "'", str42, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(0)" + "'", str55, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean7 = same3.matches((java.lang.Object) "same(0)");
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same3);
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        java.lang.String str25 = same24.toString();
        boolean boolean26 = same1.matches((java.lang.Object) str25);
        java.lang.String str27 = same1.toString();
        java.lang.String str28 = same1.toString();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        boolean boolean34 = same30.matches((java.lang.Object) "same(0)");
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean40 = same1.matches((java.lang.Object) same30);
        java.lang.String str41 = same30.toString();
        org.hamcrest.Description description43 = null;
        // The following exception was thrown during execution in test generation
        try {
            same30.describeMismatch((java.lang.Object) '4', description43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(\"same(0)\")" + "'", str25, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(0)" + "'", str41, "same(0)");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        boolean boolean21 = same7.matches((java.lang.Object) boolean20);
        java.lang.String str22 = same7.toString();
        boolean boolean24 = same7.matches((java.lang.Object) 1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str28 = same27.toString();
        java.lang.String str29 = same27.toString();
        java.lang.String str30 = same27.toString();
        boolean boolean31 = same7.matches((java.lang.Object) same27);
        org.hamcrest.Description description32 = null;
        // The following exception was thrown during execution in test generation
        try {
            same27.describeTo(description32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(0)" + "'", str30, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str4 = same2.toString();
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean9 = same7.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same12.toString();
        java.lang.Class<?> wildcardClass15 = same12.getClass();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass15);
        boolean boolean17 = same7.matches((java.lang.Object) wildcardClass15);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean20 = same2.matches((java.lang.Object) same19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same('4')" + "'", str14, "same('4')");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) "same(0)");
        java.lang.String str13 = same8.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same8.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        boolean boolean20 = same1.matches((java.lang.Object) same19);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) 10);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        boolean boolean29 = same19.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean33 = same31.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        boolean boolean38 = same31.matches((java.lang.Object) boolean37);
        boolean boolean40 = same31.matches((java.lang.Object) 1L);
        boolean boolean42 = same31.matches((java.lang.Object) 1);
        java.lang.String str43 = same31.toString();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) str43);
        boolean boolean45 = same19.matches((java.lang.Object) str43);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(0)" + "'", str43, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass11 = same10.getClass();
        boolean boolean12 = same1.matches((java.lang.Object) wildcardClass11);
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        boolean boolean16 = same12.matches((java.lang.Object) "same(0)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass20 = same18.getClass();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = same21.getClass();
        org.hamcrest.Description description23 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeMismatch((java.lang.Object) same21, description23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) '#');
        java.lang.String str11 = same1.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) 10);
        boolean boolean17 = same1.matches((java.lang.Object) boolean16);
        java.lang.String str18 = same1.toString();
        boolean boolean20 = same1.matches((java.lang.Object) '#');
        java.lang.String str21 = same1.toString();
        java.lang.String str22 = same1.toString();
        java.lang.String str23 = same1.toString();
        java.lang.String str24 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(0)" + "'", str22, "same(0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(0)" + "'", str23, "same(0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        java.lang.String str7 = same1.toString();
        boolean boolean9 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        boolean boolean19 = same15.matches((java.lang.Object) "same(0)");
        java.lang.String str20 = same15.toString();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same11.matches((java.lang.Object) same15);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same25.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean40 = same33.matches((java.lang.Object) boolean39);
        boolean boolean42 = same33.matches((java.lang.Object) 1L);
        boolean boolean44 = same33.matches((java.lang.Object) 1);
        boolean boolean45 = same31.matches((java.lang.Object) boolean44);
        java.lang.String str46 = same31.toString();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same48.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean54 = same52.matches((java.lang.Object) 100);
        boolean boolean55 = same48.matches((java.lang.Object) boolean54);
        boolean boolean57 = same48.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean62 = same48.matches((java.lang.Object) same59);
        boolean boolean63 = same31.matches((java.lang.Object) same59);
        boolean boolean64 = same11.matches((java.lang.Object) boolean63);
        java.lang.String str65 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str67 = same11.toString();
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same69._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same72._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        boolean boolean75 = same69.matches((java.lang.Object) same74);
        java.lang.String str76 = same74.toString();
        org.mockito.internal.matchers.Same same78 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean80 = same78.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same82 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean83 = same78.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) same78);
        boolean boolean85 = same74.matches((java.lang.Object) same84);
        boolean boolean86 = same11.matches((java.lang.Object) boolean85);
        boolean boolean87 = same1.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str90 = same11.toString();
        java.lang.String str91 = same11.toString();
        org.mockito.internal.matchers.Same same92 = new org.mockito.internal.matchers.Same((java.lang.Object) str91);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(same(0))" + "'", str46, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "same(0)" + "'", str65, "same(0)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(0)" + "'", str67, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "same(same(0.0))" + "'", str76, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "same(0)" + "'", str90, "same(0)");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "same(0)" + "'", str91, "same(0)");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same1.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean17);
        boolean boolean20 = same18.matches((java.lang.Object) "same(0)");
        java.lang.String str21 = same18.toString();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean30 = same23.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.String str35 = same34.toString();
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean37 = same31.matches((java.lang.Object) same34);
        boolean boolean38 = same18.matches((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean43 = same41.matches((java.lang.Object) 100);
        boolean boolean45 = same41.matches((java.lang.Object) "same(0)");
        java.lang.String str46 = same41.toString();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean51 = same41.matches((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        java.lang.String str53 = same41.toString();
        java.lang.String str54 = same41.toString();
        boolean boolean56 = same41.matches((java.lang.Object) (-1L));
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean61 = same59.matches((java.lang.Object) 100);
        boolean boolean63 = same59.matches((java.lang.Object) "same(0)");
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) same59);
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same((java.lang.Object) same65);
        boolean boolean67 = same41.matches((java.lang.Object) same65);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        same70._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean72 = same41.matches((java.lang.Object) same70);
        boolean boolean73 = same34.matches((java.lang.Object) boolean72);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same76 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean78 = same76.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean82 = same80.matches((java.lang.Object) 100);
        boolean boolean83 = same76.matches((java.lang.Object) boolean82);
        boolean boolean85 = same76.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same87 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean88 = same76.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same89 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean88);
        boolean boolean91 = same89.matches((java.lang.Object) 1L);
        same89._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str93 = same89.toString();
        org.mockito.internal.matchers.Same same94 = new org.mockito.internal.matchers.Same((java.lang.Object) str93);
        boolean boolean95 = same34.matches((java.lang.Object) str93);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(false)" + "'", str21, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(10)" + "'", str35, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(0)" + "'", str46, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(0)" + "'", str53, "same(0)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(0)" + "'", str54, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "same(false)" + "'", str93, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean8 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean16 = same14.matches((java.lang.Object) 100);
        boolean boolean18 = same14.matches((java.lang.Object) "same(0)");
        java.lang.String str19 = same14.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same14.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean28 = same26.matches((java.lang.Object) 100);
        boolean boolean30 = same26.matches((java.lang.Object) (short) -1);
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str32 = same26.toString();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean36 = same34.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean40 = same38.matches((java.lang.Object) 100);
        boolean boolean41 = same34.matches((java.lang.Object) boolean40);
        boolean boolean43 = same34.matches((java.lang.Object) 1L);
        boolean boolean45 = same34.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass46 = same34.getClass();
        boolean boolean47 = same26.matches((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = same26.getClass();
        boolean boolean49 = same14.matches((java.lang.Object) wildcardClass48);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean53 = same51.matches((java.lang.Object) 100);
        boolean boolean55 = same51.matches((java.lang.Object) "same(0)");
        java.lang.String str56 = same51.toString();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same58._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same58._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean61 = same51.matches((java.lang.Object) same58);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) same51);
        boolean boolean63 = same14.matches((java.lang.Object) same51);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass65 = same14.getClass();
        boolean boolean66 = same1.matches((java.lang.Object) wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(0)" + "'", str32, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "same(0)" + "'", str56, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean16 = same14.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same14.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        boolean boolean22 = same20.matches((java.lang.Object) (short) -1);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same12.matches((java.lang.Object) same20);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass26 = same20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        boolean boolean14 = same10.matches((java.lang.Object) "same(0)");
        java.lang.String str15 = same10.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same10.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        boolean boolean22 = same3.matches((java.lang.Object) same21);
        boolean boolean23 = same1.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same25.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean40 = same33.matches((java.lang.Object) boolean39);
        boolean boolean42 = same33.matches((java.lang.Object) 1L);
        boolean boolean44 = same33.matches((java.lang.Object) 1);
        boolean boolean45 = same31.matches((java.lang.Object) boolean44);
        java.lang.String str46 = same31.toString();
        boolean boolean48 = same31.matches((java.lang.Object) 1);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean51 = same1.matches((java.lang.Object) same31);
        java.lang.Class<?> wildcardClass52 = same1.getClass();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description54 = null;
        // The following exception was thrown during execution in test generation
        try {
            same53.describeTo(description54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(same(0))" + "'", str46, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) 10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same14);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str24 = same23.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(same(0))" + "'", str24, "same(same(0))");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        boolean boolean13 = same1.matches((java.lang.Object) boolean12);
        java.lang.String str14 = same1.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean24 = same20.matches((java.lang.Object) "same(0)");
        java.lang.String str25 = same20.toString();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same16.matches((java.lang.Object) same20);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same36.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean42 = same40.matches((java.lang.Object) 100);
        boolean boolean44 = same40.matches((java.lang.Object) "same(0)");
        java.lang.String str45 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean47 = same36.matches((java.lang.Object) same40);
        boolean boolean49 = same36.matches((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean49);
        java.lang.String str51 = same50.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) str51);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        boolean boolean54 = same33.matches((java.lang.Object) same52);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass58 = same56.getClass();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass58);
        boolean boolean60 = same33.matches((java.lang.Object) wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0.0)" + "'", str14, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(0)" + "'", str25, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(0)" + "'", str45, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(false)" + "'", str51, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        java.lang.String str9 = same1.toString();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean18 = same11.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass20 = same19.getClass();
        boolean boolean21 = same1.matches((java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(0)" + "'", str9, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        boolean boolean21 = same7.matches((java.lang.Object) boolean20);
        java.lang.String str22 = same7.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same28.matches((java.lang.Object) 100);
        boolean boolean31 = same24.matches((java.lang.Object) boolean30);
        boolean boolean33 = same24.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same24.matches((java.lang.Object) same35);
        boolean boolean39 = same7.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean43 = same41.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean47 = same45.matches((java.lang.Object) 100);
        boolean boolean48 = same41.matches((java.lang.Object) boolean47);
        boolean boolean50 = same41.matches((java.lang.Object) 1L);
        boolean boolean52 = same41.matches((java.lang.Object) ' ');
        boolean boolean53 = same7.matches((java.lang.Object) boolean52);
        java.lang.String str54 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(same(0))" + "'", str54, "same(same(0))");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean28 = same26.matches((java.lang.Object) 100);
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same26);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        boolean boolean39 = same35.matches((java.lang.Object) "same(0)");
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str41 = same35.toString();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean45 = same43.matches((java.lang.Object) 100);
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean48 = same35.matches((java.lang.Object) same43);
        java.lang.String str49 = same43.toString();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        boolean boolean51 = same33.matches((java.lang.Object) same50);
        boolean boolean52 = same23.matches((java.lang.Object) same50);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(0)" + "'", str41, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(0)" + "'", str49, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        boolean boolean13 = same1.matches((java.lang.Object) boolean12);
        java.lang.String str14 = same1.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean24 = same20.matches((java.lang.Object) "same(0)");
        java.lang.String str25 = same20.toString();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same16.matches((java.lang.Object) same20);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same36.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean42 = same40.matches((java.lang.Object) 100);
        boolean boolean44 = same40.matches((java.lang.Object) "same(0)");
        java.lang.String str45 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean47 = same36.matches((java.lang.Object) same40);
        boolean boolean49 = same36.matches((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean49);
        java.lang.String str51 = same50.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) str51);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        boolean boolean54 = same33.matches((java.lang.Object) same52);
        java.lang.String str55 = same33.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0.0)" + "'", str14, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(0)" + "'", str25, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(0)" + "'", str45, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(false)" + "'", str51, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(same(0.0))" + "'", str55, "same(same(0.0))");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean17 = same13.matches((java.lang.Object) "same(0)");
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        boolean boolean27 = same20.matches((java.lang.Object) boolean26);
        boolean boolean29 = same20.matches((java.lang.Object) 1L);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean36 = same34.matches((java.lang.Object) 100);
        boolean boolean38 = same34.matches((java.lang.Object) "same(0)");
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        boolean boolean42 = same20.matches((java.lang.Object) same40);
        boolean boolean43 = same13.matches((java.lang.Object) same40);
        org.hamcrest.Description description44 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeMismatch((java.lang.Object) boolean43, description44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
        java.lang.Object obj2 = null;
        boolean boolean3 = same1.matches(obj2);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass7 = same1.getClass();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass7);
        java.lang.String str9 = same8.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str9, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        boolean boolean14 = same10.matches((java.lang.Object) "same(0)");
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same10.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean20 = same18.matches((java.lang.Object) 100);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same10.matches((java.lang.Object) same18);
        java.lang.String str24 = same18.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean26 = same8.matches((java.lang.Object) same25);
        org.hamcrest.Description description27 = null;
        // The following exception was thrown during execution in test generation
        try {
            same25.describeTo(description27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(0)" + "'", str16, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same1.matches((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean20 = same18.matches((java.lang.Object) 100);
        boolean boolean22 = same18.matches((java.lang.Object) "same(0)");
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same10.matches((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass27 = same10.getClass();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean19 = same12.matches((java.lang.Object) boolean18);
        boolean boolean21 = same12.matches((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass22 = same12.getClass();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        boolean boolean24 = same9.matches((java.lang.Object) same23);
        java.lang.String str25 = same9.toString();
        java.lang.Class<?> wildcardClass26 = same9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(same(0))" + "'", str25, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        boolean boolean15 = same8.matches((java.lang.Object) boolean14);
        boolean boolean17 = same8.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean20 = same8.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean20);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str23 = same21.toString();
        java.lang.String str24 = same21.toString();
        boolean boolean25 = same1.matches((java.lang.Object) same21);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str27 = same21.toString();
        java.lang.String str28 = same21.toString();
        java.lang.Class<?> wildcardClass29 = same21.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(false)" + "'", str23, "same(false)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(false)" + "'", str24, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(false)" + "'", str27, "same(false)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(false)" + "'", str28, "same(false)");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(0)" + "'", str9, "same(0)");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same12.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        boolean boolean25 = same16.matches((java.lang.Object) 1L);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same28.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean34 = same32.matches((java.lang.Object) 100);
        boolean boolean35 = same28.matches((java.lang.Object) boolean34);
        boolean boolean37 = same28.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean40 = same28.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean40);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean40);
        java.lang.String str43 = same42.toString();
        boolean boolean44 = same16.matches((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean46 = same12.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(false)" + "'", str43, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str8 = same7.toString();
        boolean boolean10 = same7.matches((java.lang.Object) (byte) 10);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean16 = same14.matches((java.lang.Object) 100);
        boolean boolean18 = same14.matches((java.lang.Object) (short) -1);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str20 = same14.toString();
        boolean boolean21 = same7.matches((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean21);
        org.hamcrest.Description description23 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) boolean21, description23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        java.lang.String str8 = same6.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same10.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        boolean boolean17 = same6.matches((java.lang.Object) same16);
        java.lang.String str18 = same6.toString();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        boolean boolean28 = same21.matches((java.lang.Object) boolean27);
        boolean boolean30 = same21.matches((java.lang.Object) 1L);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.hamcrest.Description description35 = null;
        // The following exception was thrown during execution in test generation
        try {
            same6.describeMismatch((java.lang.Object) same34, description35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(same(0.0))" + "'", str8, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(same(0.0))" + "'", str18, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        java.lang.String str25 = same24.toString();
        boolean boolean26 = same1.matches((java.lang.Object) str25);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(\"same(0)\")" + "'", str25, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean7 = same3.matches((java.lang.Object) "same(0)");
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same12.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) (short) -1);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same8.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        boolean boolean25 = same16.matches((java.lang.Object) 1L);
        boolean boolean27 = same16.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass28 = same16.getClass();
        boolean boolean29 = same8.matches((java.lang.Object) wildcardClass28);
        boolean boolean30 = same1.matches((java.lang.Object) boolean29);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean36 = same34.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean40 = same38.matches((java.lang.Object) 100);
        boolean boolean41 = same34.matches((java.lang.Object) boolean40);
        boolean boolean43 = same34.matches((java.lang.Object) 1L);
        boolean boolean45 = same34.matches((java.lang.Object) 1);
        boolean boolean47 = same34.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) 1);
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean51 = same34.matches((java.lang.Object) same49);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean51);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean56 = same54.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean60 = same58.matches((java.lang.Object) 100);
        boolean boolean61 = same54.matches((java.lang.Object) boolean60);
        boolean boolean63 = same54.matches((java.lang.Object) 1L);
        boolean boolean65 = same54.matches((java.lang.Object) 1);
        boolean boolean67 = same54.matches((java.lang.Object) 10.0d);
        boolean boolean68 = same52.matches((java.lang.Object) same54);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean72 = same70.matches((java.lang.Object) 100);
        same70._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same70._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same70._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean79 = same77.matches((java.lang.Object) 100);
        boolean boolean81 = same77.matches((java.lang.Object) "same(0)");
        java.lang.String str82 = same77.toString();
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same84._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same84._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean87 = same77.matches((java.lang.Object) same84);
        org.mockito.internal.matchers.Same same88 = new org.mockito.internal.matchers.Same((java.lang.Object) same77);
        boolean boolean89 = same70.matches((java.lang.Object) same88);
        same88._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean91 = same52.matches((java.lang.Object) same88);
        java.lang.String str92 = same88.toString();
        java.lang.Class<?> wildcardClass93 = same88.getClass();
        boolean boolean94 = same32.matches((java.lang.Object) same88);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "same(0)" + "'", str82, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "same(same(0))" + "'", str92, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str5 = same4.toString();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same4.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(same(-1))" + "'", str5, "same(same(-1))");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean12 = same10.matches((java.lang.Object) 100);
        boolean boolean14 = same10.matches((java.lang.Object) "same(0)");
        java.lang.String str15 = same10.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same10.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        boolean boolean22 = same3.matches((java.lang.Object) same21);
        boolean boolean23 = same1.matches((java.lang.Object) same21);
        java.lang.String str24 = same1.toString();
        java.lang.String str25 = same1.toString();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean29 = same27.matches((java.lang.Object) 100);
        boolean boolean31 = same27.matches((java.lang.Object) (short) -1);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str33 = same27.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean37 = same35.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean41 = same39.matches((java.lang.Object) 100);
        boolean boolean42 = same35.matches((java.lang.Object) boolean41);
        boolean boolean44 = same35.matches((java.lang.Object) 1L);
        boolean boolean46 = same35.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass47 = same35.getClass();
        boolean boolean48 = same27.matches((java.lang.Object) wildcardClass47);
        java.lang.Class<?> wildcardClass49 = same27.getClass();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass49);
        java.lang.Class<?> wildcardClass51 = same50.getClass();
        boolean boolean52 = same1.matches((java.lang.Object) wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same()" + "'", str24, "same()");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same()" + "'", str25, "same()");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(0)" + "'", str33, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        java.lang.String str9 = same6.toString();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        boolean boolean15 = same11.matches((java.lang.Object) (short) -1);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str17 = same11.toString();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean21 = same19.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        boolean boolean26 = same19.matches((java.lang.Object) boolean25);
        boolean boolean28 = same19.matches((java.lang.Object) 1L);
        boolean boolean30 = same19.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass31 = same19.getClass();
        boolean boolean32 = same11.matches((java.lang.Object) wildcardClass31);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        java.lang.String str34 = same33.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean37 = same6.matches((java.lang.Object) same33);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0.0))" + "'", str9, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(0)" + "'", str17, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(same(0))" + "'", str34, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean21 = same19.matches((java.lang.Object) 100);
        boolean boolean23 = same19.matches((java.lang.Object) "same(0)");
        java.lang.String str24 = same19.toString();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same15.matches((java.lang.Object) same19);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        boolean boolean30 = same1.matches((java.lang.Object) same15);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str33 = same32.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(same(0))" + "'", str33, "same(same(0))");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        boolean boolean28 = same24.matches((java.lang.Object) "same(0)");
        java.lang.String str29 = same24.toString();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean34 = same24.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description38 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same24, description38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same1.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean17);
        boolean boolean20 = same18.matches((java.lang.Object) "same(0)");
        java.lang.String str21 = same18.toString();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean30 = same23.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.String str35 = same34.toString();
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean37 = same31.matches((java.lang.Object) same34);
        boolean boolean38 = same18.matches((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(false)" + "'", str21, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(10)" + "'", str35, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) "same(0)");
        java.lang.String str13 = same8.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same8.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        boolean boolean20 = same1.matches((java.lang.Object) same19);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str23 = same19.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(0))" + "'", str23, "same(same(0))");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same6.toString();
        java.lang.Class<?> wildcardClass9 = same6.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        boolean boolean11 = same1.matches((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same('4')" + "'", str8, "same('4')");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        boolean boolean12 = same1.matches((java.lang.Object) 1);
        boolean boolean14 = same1.matches((java.lang.Object) '#');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str18 = same17.toString();
        java.lang.String str19 = same17.toString();
        java.lang.String str20 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        boolean boolean29 = same17.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean33 = same1.matches((java.lang.Object) same30);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str36 = same35.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(same(0))" + "'", str36, "same(same(0))");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) 10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(same(0))");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same1.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean17);
        boolean boolean20 = same18.matches((java.lang.Object) "same(0)");
        java.lang.String str21 = same18.toString();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass24 = same18.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(false)" + "'", str21, "same(false)");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str4 = same3.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean9 = same7.matches((java.lang.Object) 100);
        boolean boolean11 = same7.matches((java.lang.Object) (short) -1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same7.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean21 = same19.matches((java.lang.Object) 100);
        boolean boolean22 = same15.matches((java.lang.Object) boolean21);
        boolean boolean24 = same15.matches((java.lang.Object) 1L);
        boolean boolean26 = same15.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass27 = same15.getClass();
        boolean boolean28 = same7.matches((java.lang.Object) wildcardClass27);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same33.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean43 = same41.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean47 = same45.matches((java.lang.Object) 100);
        boolean boolean48 = same41.matches((java.lang.Object) boolean47);
        boolean boolean50 = same41.matches((java.lang.Object) 1L);
        boolean boolean52 = same41.matches((java.lang.Object) 1);
        boolean boolean53 = same39.matches((java.lang.Object) boolean52);
        java.lang.String str54 = same39.toString();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean58 = same56.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean62 = same60.matches((java.lang.Object) 100);
        boolean boolean63 = same56.matches((java.lang.Object) boolean62);
        boolean boolean65 = same56.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same67._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same67._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean70 = same56.matches((java.lang.Object) same67);
        boolean boolean71 = same39.matches((java.lang.Object) same67);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean75 = same73.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean79 = same77.matches((java.lang.Object) 100);
        boolean boolean80 = same73.matches((java.lang.Object) boolean79);
        boolean boolean82 = same73.matches((java.lang.Object) 1L);
        boolean boolean84 = same73.matches((java.lang.Object) ' ');
        boolean boolean85 = same39.matches((java.lang.Object) boolean84);
        java.lang.String str86 = same39.toString();
        boolean boolean87 = same7.matches((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same88 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean89 = same5.matches((java.lang.Object) same7);
        java.lang.String str90 = same7.toString();
        java.lang.Class<?> wildcardClass91 = same7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(same(0.0))" + "'", str4, "same(same(0.0))");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(same(0))" + "'", str54, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "same(same(0))" + "'", str86, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "same(0)" + "'", str90, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        java.lang.String str25 = same24.toString();
        boolean boolean26 = same1.matches((java.lang.Object) str25);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean36 = same34.matches((java.lang.Object) 100);
        boolean boolean37 = same30.matches((java.lang.Object) boolean36);
        boolean boolean39 = same30.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean42 = same30.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean42);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean42);
        java.lang.String str45 = same44.toString();
        java.lang.String str46 = same44.toString();
        java.lang.String str47 = same44.toString();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same44);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same44);
        org.hamcrest.Description description50 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same49, description50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(\"same(0)\")" + "'", str25, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(false)" + "'", str45, "same(false)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(false)" + "'", str46, "same(false)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "same(false)" + "'", str47, "same(false)");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same9.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same17.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        boolean boolean24 = same17.matches((java.lang.Object) boolean23);
        boolean boolean26 = same17.matches((java.lang.Object) 1L);
        boolean boolean28 = same17.matches((java.lang.Object) 1);
        boolean boolean29 = same15.matches((java.lang.Object) boolean28);
        java.lang.String str30 = same15.toString();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean34 = same32.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same36.matches((java.lang.Object) 100);
        boolean boolean39 = same32.matches((java.lang.Object) boolean38);
        boolean boolean41 = same32.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean46 = same32.matches((java.lang.Object) same43);
        boolean boolean47 = same15.matches((java.lang.Object) same43);
        boolean boolean48 = same6.matches((java.lang.Object) same43);
        boolean boolean50 = same43.matches((java.lang.Object) (short) -1);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean54 = same52.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean58 = same56.matches((java.lang.Object) 100);
        boolean boolean59 = same52.matches((java.lang.Object) boolean58);
        boolean boolean61 = same52.matches((java.lang.Object) 1L);
        boolean boolean63 = same52.matches((java.lang.Object) 1);
        boolean boolean65 = same52.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean69 = same67.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean73 = same71.matches((java.lang.Object) 100);
        boolean boolean74 = same67.matches((java.lang.Object) boolean73);
        boolean boolean76 = same67.matches((java.lang.Object) 1L);
        boolean boolean77 = same52.matches((java.lang.Object) same67);
        java.lang.Class<?> wildcardClass78 = same67.getClass();
        boolean boolean79 = same43.matches((java.lang.Object) wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(same(0))" + "'", str30, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.String str14 = same12.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 0);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 0);
        boolean boolean18 = same12.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.hamcrest.Description description28 = null;
        // The following exception was thrown during execution in test generation
        try {
            same17.describeMismatch((java.lang.Object) same27, description28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same1.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        boolean boolean21 = same7.matches((java.lang.Object) boolean20);
        java.lang.String str22 = same7.toString();
        boolean boolean24 = same7.matches((java.lang.Object) 1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str28 = same27.toString();
        java.lang.String str29 = same27.toString();
        java.lang.String str30 = same27.toString();
        boolean boolean31 = same7.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean40 = same33.matches((java.lang.Object) boolean39);
        boolean boolean42 = same33.matches((java.lang.Object) 1L);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean49 = same47.matches((java.lang.Object) 100);
        boolean boolean51 = same47.matches((java.lang.Object) "same(0)");
        same47._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same53);
        boolean boolean55 = same33.matches((java.lang.Object) same53);
        boolean boolean56 = same7.matches((java.lang.Object) same53);
        java.lang.String str57 = same7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(0)" + "'", str30, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(same(0))" + "'", str57, "same(same(0))");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean24 = same20.matches((java.lang.Object) "same(0)");
        java.lang.String str25 = same20.toString();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean30 = same20.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean34 = same32.matches((java.lang.Object) 100);
        boolean boolean36 = same32.matches((java.lang.Object) (short) -1);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str38 = same32.toString();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean42 = same40.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean46 = same44.matches((java.lang.Object) 100);
        boolean boolean47 = same40.matches((java.lang.Object) boolean46);
        boolean boolean49 = same40.matches((java.lang.Object) 1L);
        boolean boolean51 = same40.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass52 = same40.getClass();
        boolean boolean53 = same32.matches((java.lang.Object) wildcardClass52);
        java.lang.Class<?> wildcardClass54 = same32.getClass();
        boolean boolean55 = same20.matches((java.lang.Object) wildcardClass54);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass54);
        boolean boolean57 = same18.matches((java.lang.Object) wildcardClass54);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean57);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(0)" + "'", str25, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(0)" + "'", str38, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean19 = same12.matches((java.lang.Object) boolean18);
        boolean boolean21 = same12.matches((java.lang.Object) 1L);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same25.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        boolean boolean33 = same31.matches((java.lang.Object) (short) -1);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean35 = same23.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str40 = same37.toString();
        boolean boolean41 = same31.matches((java.lang.Object) same37);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        boolean boolean43 = same1.matches((java.lang.Object) same42);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean48 = same46.matches((java.lang.Object) 100);
        same46._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        boolean boolean53 = same46.matches((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass55 = same54.getClass();
        boolean boolean56 = same42.matches((java.lang.Object) wildcardClass55);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(0.0)" + "'", str40, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) 10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same14);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean28 = same26.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        boolean boolean33 = same26.matches((java.lang.Object) boolean32);
        boolean boolean35 = same26.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean38 = same26.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass42 = same40.getClass();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass42);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass42);
        boolean boolean45 = same26.matches((java.lang.Object) same44);
        boolean boolean46 = same24.matches((java.lang.Object) same44);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same48.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean53 = same48.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean58 = same56.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean62 = same60.matches((java.lang.Object) 100);
        boolean boolean63 = same56.matches((java.lang.Object) boolean62);
        boolean boolean65 = same56.matches((java.lang.Object) 1L);
        boolean boolean67 = same56.matches((java.lang.Object) 1);
        boolean boolean68 = same54.matches((java.lang.Object) boolean67);
        java.lang.String str69 = same54.toString();
        boolean boolean71 = same54.matches((java.lang.Object) 1);
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str75 = same74.toString();
        java.lang.String str76 = same74.toString();
        java.lang.String str77 = same74.toString();
        boolean boolean78 = same54.matches((java.lang.Object) same74);
        org.hamcrest.Description description79 = null;
        // The following exception was thrown during execution in test generation
        try {
            same24.describeMismatch((java.lang.Object) same54, description79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "same(same(0))" + "'", str69, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "same(0)" + "'", str75, "same(0)");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "same(0)" + "'", str76, "same(0)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "same(0)" + "'", str77, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.String str10 = same9.toString();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) str10);
        java.lang.String str12 = same11.toString();
        boolean boolean14 = same11.matches((java.lang.Object) "same(\"same(10)\")");
        java.lang.String str15 = same11.toString();
        boolean boolean16 = same1.matches((java.lang.Object) str15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(10)" + "'", str10, "same(10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(\"same(10)\")" + "'", str12, "same(\"same(10)\")");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(\"same(10)\")" + "'", str15, "same(\"same(10)\")");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) 1L);
        boolean boolean12 = same1.matches((java.lang.Object) 1);
        boolean boolean14 = same1.matches((java.lang.Object) 10.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        boolean boolean25 = same16.matches((java.lang.Object) 1L);
        boolean boolean26 = same1.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str29 = same28.toString();
        java.lang.Class<?> wildcardClass30 = same28.getClass();
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        java.lang.Object obj32 = null;
        boolean boolean33 = same1.matches(obj32);
        java.lang.Class<?> wildcardClass34 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.String str14 = same12.toString();
        java.lang.String str15 = same12.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same17.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        boolean boolean24 = same17.matches((java.lang.Object) boolean23);
        boolean boolean26 = same17.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean29 = same17.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean29);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str32 = same30.toString();
        boolean boolean33 = same12.matches((java.lang.Object) same30);
        java.lang.String str34 = same12.toString();
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same36.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean42 = same40.matches((java.lang.Object) 100);
        boolean boolean43 = same36.matches((java.lang.Object) boolean42);
        boolean boolean45 = same36.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean48 = same36.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass52 = same50.getClass();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass52);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass52);
        boolean boolean55 = same36.matches((java.lang.Object) same54);
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean57 = same12.matches((java.lang.Object) same54);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean61 = same59.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean65 = same63.matches((java.lang.Object) 100);
        boolean boolean66 = same59.matches((java.lang.Object) boolean65);
        boolean boolean68 = same59.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean71 = same59.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean71);
        boolean boolean74 = same72.matches((java.lang.Object) 1L);
        same72._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description76 = null;
        // The following exception was thrown during execution in test generation
        try {
            same54.describeMismatch((java.lang.Object) same72, description76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(same(0))" + "'", str15, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(false)" + "'", str32, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(same(0))" + "'", str34, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean9 = same7.matches((java.lang.Object) 100);
        boolean boolean10 = same3.matches((java.lang.Object) boolean9);
        boolean boolean12 = same3.matches((java.lang.Object) '#');
        java.lang.String str13 = same3.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str16 = same15.toString();
        boolean boolean18 = same15.matches((java.lang.Object) (byte) 10);
        boolean boolean19 = same3.matches((java.lang.Object) boolean18);
        boolean boolean20 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean24 = same22.matches((java.lang.Object) 100);
        boolean boolean26 = same22.matches((java.lang.Object) "same(0)");
        java.lang.String str27 = same22.toString();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same22.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        java.lang.String str35 = same33.toString();
        java.lang.String str36 = same33.toString();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean40 = same38.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean44 = same42.matches((java.lang.Object) 100);
        boolean boolean45 = same38.matches((java.lang.Object) boolean44);
        boolean boolean47 = same38.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean50 = same38.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean50);
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str53 = same51.toString();
        boolean boolean54 = same33.matches((java.lang.Object) same51);
        java.lang.String str55 = same33.toString();
        boolean boolean56 = same1.matches((java.lang.Object) str55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(0)" + "'", str16, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(same(0))" + "'", str35, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(same(0))" + "'", str36, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(false)" + "'", str53, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(same(0))" + "'", str55, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str6 = same1.toString();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str12 = same11.toString();
        java.lang.String str13 = same11.toString();
        java.lang.String str14 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same9.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        java.lang.String str19 = same11.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same17.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same17.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean25 = same15.matches((java.lang.Object) same17);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean31 = same29.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        boolean boolean36 = same29.matches((java.lang.Object) boolean35);
        boolean boolean38 = same29.matches((java.lang.Object) 1L);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str40 = same29.toString();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str43 = same42.toString();
        boolean boolean45 = same42.matches((java.lang.Object) (byte) 10);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean48 = same29.matches((java.lang.Object) same42);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean52 = same27.matches((java.lang.Object) same50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(0)" + "'", str40, "same(0)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(0)" + "'", str43, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same17.matches((java.lang.Object) 100);
        boolean boolean21 = same17.matches((java.lang.Object) "same(0)");
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        java.lang.String str25 = same24.toString();
        boolean boolean26 = same1.matches((java.lang.Object) same24);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str28 = same27.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(same(same(0)))" + "'", str25, "same(same(same(0)))");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(same(0))" + "'", str28, "same(same(0))");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean7 = same3.matches((java.lang.Object) "same(0)");
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str13 = same12.toString();
        java.lang.String str14 = same12.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean20 = same16.matches((java.lang.Object) (short) -1);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str22 = same16.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean30 = same28.matches((java.lang.Object) 100);
        boolean boolean31 = same24.matches((java.lang.Object) boolean30);
        boolean boolean33 = same24.matches((java.lang.Object) 1L);
        boolean boolean35 = same24.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass36 = same24.getClass();
        boolean boolean37 = same16.matches((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean42 = same12.matches((java.lang.Object) same39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(0)" + "'", str22, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean8 = same6.matches((java.lang.Object) 100);
        boolean boolean10 = same6.matches((java.lang.Object) "same(0)");
        java.lang.String str11 = same6.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same6.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean20 = same18.matches((java.lang.Object) 100);
        boolean boolean22 = same18.matches((java.lang.Object) (short) -1);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str24 = same18.toString();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean28 = same26.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        boolean boolean33 = same26.matches((java.lang.Object) boolean32);
        boolean boolean35 = same26.matches((java.lang.Object) 1L);
        boolean boolean37 = same26.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass38 = same26.getClass();
        boolean boolean39 = same18.matches((java.lang.Object) wildcardClass38);
        java.lang.Class<?> wildcardClass40 = same18.getClass();
        boolean boolean41 = same6.matches((java.lang.Object) wildcardClass40);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean45 = same43.matches((java.lang.Object) 100);
        boolean boolean47 = same43.matches((java.lang.Object) "same(0)");
        java.lang.String str48 = same43.toString();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean53 = same43.matches((java.lang.Object) same50);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        boolean boolean55 = same6.matches((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean57 = same4.matches((java.lang.Object) same56);
        java.lang.String str58 = same56.toString();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(0)" + "'", str48, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "same(same(0))" + "'", str58, "same(same(0))");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) (short) -1);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same8.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean22 = same20.matches((java.lang.Object) 100);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        boolean boolean25 = same16.matches((java.lang.Object) 1L);
        boolean boolean27 = same16.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass28 = same16.getClass();
        boolean boolean29 = same8.matches((java.lang.Object) wildcardClass28);
        boolean boolean30 = same1.matches((java.lang.Object) boolean29);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean33 = same1.matches((java.lang.Object) "same(10)");
        java.lang.String str34 = same1.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) str34);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean43 = same41.matches((java.lang.Object) 100);
        boolean boolean44 = same37.matches((java.lang.Object) boolean43);
        boolean boolean46 = same37.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean51 = same37.matches((java.lang.Object) same48);
        java.lang.String str52 = same37.toString();
        boolean boolean53 = same35.matches((java.lang.Object) same37);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(0)" + "'", str34, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(0)" + "'", str52, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean9 = same5.matches((java.lang.Object) "same(0)");
        java.lang.String str10 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass13 = same1.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean20 = same16.matches((java.lang.Object) "same(0)");
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean24 = same16.matches((java.lang.Object) (byte) 100);
        boolean boolean25 = same14.matches((java.lang.Object) same16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same6.matches((java.lang.Object) same10);
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same6.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) 100);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean13 = same11.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        boolean boolean18 = same11.matches((java.lang.Object) boolean17);
        boolean boolean20 = same11.matches((java.lang.Object) '#');
        java.lang.String str21 = same11.toString();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) 10);
        boolean boolean27 = same11.matches((java.lang.Object) boolean26);
        java.lang.String str28 = same11.toString();
        boolean boolean29 = same1.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean33 = same31.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean36 = same31.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        boolean boolean38 = same11.matches((java.lang.Object) same37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean7 = same5.matches((java.lang.Object) 100);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        boolean boolean10 = same1.matches((java.lang.Object) '#');
        java.lang.String str11 = same1.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean19 = same17.matches((java.lang.Object) 100);
        boolean boolean20 = same13.matches((java.lang.Object) boolean19);
        boolean boolean22 = same13.matches((java.lang.Object) 1L);
        boolean boolean24 = same13.matches((java.lang.Object) 1);
        boolean boolean26 = same13.matches((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass27 = same13.getClass();
        boolean boolean28 = same1.matches((java.lang.Object) wildcardClass27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        boolean boolean34 = same30.matches((java.lang.Object) (short) -1);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        boolean boolean41 = same37.matches((java.lang.Object) (short) -1);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str43 = same37.toString();
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean47 = same45.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean51 = same49.matches((java.lang.Object) 100);
        boolean boolean52 = same45.matches((java.lang.Object) boolean51);
        boolean boolean54 = same45.matches((java.lang.Object) 1L);
        boolean boolean56 = same45.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass57 = same45.getClass();
        boolean boolean58 = same37.matches((java.lang.Object) wildcardClass57);
        boolean boolean59 = same30.matches((java.lang.Object) boolean58);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean62 = same1.matches((java.lang.Object) same30);
        java.lang.Class<?> wildcardClass63 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(0)" + "'", str43, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean11 = same9.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean15 = same13.matches((java.lang.Object) 100);
        boolean boolean16 = same9.matches((java.lang.Object) boolean15);
        boolean boolean18 = same9.matches((java.lang.Object) 1L);
        boolean boolean20 = same9.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        boolean boolean22 = same1.matches((java.lang.Object) wildcardClass21);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str27 = same1.toString();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean31 = same29.matches((java.lang.Object) 100);
        boolean boolean33 = same29.matches((java.lang.Object) (short) -1);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str35 = same29.toString();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean39 = same37.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean43 = same41.matches((java.lang.Object) 100);
        boolean boolean44 = same37.matches((java.lang.Object) boolean43);
        boolean boolean46 = same37.matches((java.lang.Object) 1L);
        boolean boolean48 = same37.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass49 = same37.getClass();
        boolean boolean50 = same29.matches((java.lang.Object) wildcardClass49);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        java.lang.String str53 = same52.toString();
        boolean boolean54 = same29.matches((java.lang.Object) str53);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.hamcrest.Description description56 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same29, description56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(0)" + "'", str35, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(\"same(0)\")" + "'", str53, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        boolean boolean12 = same8.matches((java.lang.Object) (short) -1);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same8.toString();
        boolean boolean15 = same1.matches((java.lang.Object) same8);
        java.lang.Class<?> wildcardClass16 = same1.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 0);
        java.lang.String str20 = same19.toString();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same17.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean26 = same24.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean29 = same24.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        java.lang.String str31 = same24.toString();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeMismatch((java.lang.Object) same24, description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(0)" + "'", str31, "same(0)");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        boolean boolean5 = same1.matches((java.lang.Object) "same(0)");
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str13 = same1.toString();
        java.lang.String str14 = same1.toString();
        boolean boolean16 = same1.matches((java.lang.Object) (-1L));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean21 = same19.matches((java.lang.Object) 100);
        boolean boolean23 = same19.matches((java.lang.Object) "same(0)");
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        boolean boolean27 = same1.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same1.matches((java.lang.Object) same30);
        java.lang.String str33 = same1.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean41 = same39.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean45 = same43.matches((java.lang.Object) 100);
        boolean boolean46 = same39.matches((java.lang.Object) boolean45);
        boolean boolean47 = same35.matches((java.lang.Object) boolean46);
        java.lang.String str48 = same35.toString();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean52 = same50.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean56 = same54.matches((java.lang.Object) 100);
        boolean boolean58 = same54.matches((java.lang.Object) "same(0)");
        java.lang.String str59 = same54.toString();
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean61 = same50.matches((java.lang.Object) same54);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) same50);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean66 = same35.matches((java.lang.Object) same50);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        boolean boolean69 = same1.matches((java.lang.Object) same68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(0)" + "'", str33, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(0.0)" + "'", str48, "same(0.0)");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "same(0)" + "'", str59, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean10 = same8.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        boolean boolean15 = same8.matches((java.lang.Object) boolean14);
        boolean boolean17 = same8.matches((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass18 = same8.getClass();
        boolean boolean19 = same5.matches((java.lang.Object) wildcardClass18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean27 = same25.matches((java.lang.Object) 100);
        boolean boolean28 = same21.matches((java.lang.Object) boolean27);
        boolean boolean30 = same21.matches((java.lang.Object) 1L);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 10L);
        boolean boolean33 = same21.matches((java.lang.Object) 10L);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass37 = same35.getClass();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        boolean boolean40 = same21.matches((java.lang.Object) same39);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean42 = same5.matches((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean46 = same44.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean49 = same44.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same44);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean54 = same5.matches((java.lang.Object) same44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same1.toString();
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (byte) -1, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean7 = same3.matches((java.lang.Object) "same(0)");
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean16 = same14.matches((java.lang.Object) 100);
        boolean boolean18 = same14.matches((java.lang.Object) (short) -1);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean23 = same21.matches((java.lang.Object) 100);
        boolean boolean25 = same21.matches((java.lang.Object) (short) -1);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str27 = same21.toString();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean31 = same29.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean35 = same33.matches((java.lang.Object) 100);
        boolean boolean36 = same29.matches((java.lang.Object) boolean35);
        boolean boolean38 = same29.matches((java.lang.Object) 1L);
        boolean boolean40 = same29.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass41 = same29.getClass();
        boolean boolean42 = same21.matches((java.lang.Object) wildcardClass41);
        boolean boolean43 = same14.matches((java.lang.Object) boolean42);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str45 = same14.toString();
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) str45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same48.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean54 = same52.matches((java.lang.Object) 100);
        boolean boolean55 = same48.matches((java.lang.Object) boolean54);
        boolean boolean57 = same48.matches((java.lang.Object) 1L);
        boolean boolean59 = same48.matches((java.lang.Object) 1);
        boolean boolean61 = same48.matches((java.lang.Object) 10.0d);
        boolean boolean62 = same46.matches((java.lang.Object) same48);
        same46._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description64 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeMismatch((java.lang.Object) same46, description64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(0)" + "'", str45, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }
}

