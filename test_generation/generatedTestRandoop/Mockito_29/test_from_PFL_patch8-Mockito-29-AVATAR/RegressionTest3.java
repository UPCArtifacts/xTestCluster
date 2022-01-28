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
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean6 = same4.matches((java.lang.Object) 100);
        boolean boolean8 = same4.matches((java.lang.Object) (short) -1);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same4.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean14 = same12.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean18 = same16.matches((java.lang.Object) 100);
        boolean boolean19 = same12.matches((java.lang.Object) boolean18);
        boolean boolean21 = same12.matches((java.lang.Object) 1L);
        boolean boolean23 = same12.matches((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass24 = same12.getClass();
        boolean boolean25 = same4.matches((java.lang.Object) wildcardClass24);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(0)");
        java.lang.String str28 = same27.toString();
        boolean boolean29 = same4.matches((java.lang.Object) str28);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean34 = same32.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean38 = same36.matches((java.lang.Object) 100);
        boolean boolean39 = same32.matches((java.lang.Object) boolean38);
        boolean boolean41 = same32.matches((java.lang.Object) 1L);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean47 = same45.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        boolean boolean50 = same45.matches((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) same45);
        boolean boolean53 = same51.matches((java.lang.Object) (short) -1);
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean55 = same43.matches((java.lang.Object) same51);
        boolean boolean56 = same4.matches((java.lang.Object) same51);
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) same51);
        boolean boolean59 = same2.matches((java.lang.Object) same58);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(\"same(0)\")" + "'", str28, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }
}

