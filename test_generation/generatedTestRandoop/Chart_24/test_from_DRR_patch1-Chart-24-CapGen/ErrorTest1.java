import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(10.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double18 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        double double24 = grayPaintScale21.getLowerBound();
        boolean boolean26 = grayPaintScale21.equals((java.lang.Object) 1);
        double double27 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) (byte) 1);
        boolean boolean30 = grayPaintScale17.equals((java.lang.Object) grayPaintScale21);
        java.awt.Paint paint32 = grayPaintScale21.getPaint((double) 100);
        double double33 = grayPaintScale21.getUpperBound();
        java.lang.Object obj34 = grayPaintScale21.clone();
        boolean boolean35 = grayPaintScale2.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and grayPaintScale17", obj14.equals(grayPaintScale17) ? obj14.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        java.lang.Object obj18 = grayPaintScale14.clone();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) 10L);
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 1);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint25 = grayPaintScale14.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) 10.0d);
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) boolean25);
        java.awt.Paint paint28 = grayPaintScale15.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass29 = grayPaintScale15.getClass();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj31 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and grayPaintScale15", obj6.equals(grayPaintScale15) ? obj6.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        java.lang.Object obj15 = grayPaintScale8.clone();
        double double16 = grayPaintScale8.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj15", grayPaintScale8.equals(obj15) ? grayPaintScale8.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) (byte) 1);
        java.awt.Paint paint33 = grayPaintScale23.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) (short) 0);
        double double39 = grayPaintScale36.getLowerBound();
        java.lang.Class<?> wildcardClass40 = grayPaintScale36.getClass();
        boolean boolean41 = grayPaintScale23.equals((java.lang.Object) grayPaintScale36);
        double double42 = grayPaintScale23.getLowerBound();
        double double43 = grayPaintScale23.getUpperBound();
        java.lang.Object obj44 = grayPaintScale23.clone();
        boolean boolean45 = grayPaintScale14.equals(obj44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and grayPaintScale36", grayPaintScale23.equals(grayPaintScale36) ? grayPaintScale23.hashCode() == grayPaintScale36.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 0);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) grayPaintScale10);
        double double14 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale7.getPaint((double) 0);
        java.lang.Object obj17 = grayPaintScale7.clone();
        java.lang.Object obj18 = grayPaintScale7.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj18", obj17.equals(obj18) ? obj17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double17 = grayPaintScale2.getLowerBound();
        double double18 = grayPaintScale2.getUpperBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass22 = grayPaintScale19.getClass();
        boolean boolean23 = grayPaintScale6.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale19", grayPaintScale2.equals(grayPaintScale19) ? grayPaintScale2.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj7", obj5.equals(obj7) ? obj5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        java.lang.Object obj20 = grayPaintScale13.clone();
        double double21 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 10);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double25 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale2.equals(obj9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass20 = grayPaintScale19.getClass();
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) grayPaintScale19);
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale13.getPaint(97.0d);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale19", grayPaintScale5.equals(grayPaintScale19) ? grayPaintScale5.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj10", obj9.equals(obj10) ? obj9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double12 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getLowerBound();
        double double14 = grayPaintScale9.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 10.0f);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) 'a');
        double double7 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getUpperBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.lang.Object obj13 = grayPaintScale10.clone();
        java.lang.Object obj14 = grayPaintScale10.clone();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj14", obj13.equals(obj14) ? obj13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint(10.0d);
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        java.lang.Object obj20 = grayPaintScale13.clone();
        double double21 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double25 = grayPaintScale24.getLowerBound();
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) double25);
        java.awt.Paint paint28 = grayPaintScale13.getPaint((double) ' ');
        double double29 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale13.getPaint(0.0d);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double33 = grayPaintScale13.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double25 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale24.getPaint((double) (short) 100);
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean33 = grayPaintScale24.equals((java.lang.Object) grayPaintScale32);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint38 = grayPaintScale36.getPaint((double) 0);
        double double39 = grayPaintScale36.getUpperBound();
        double double40 = grayPaintScale36.getUpperBound();
        java.lang.Class<?> wildcardClass41 = grayPaintScale36.getClass();
        boolean boolean42 = grayPaintScale32.equals((java.lang.Object) grayPaintScale36);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint47 = grayPaintScale45.getPaint((double) (short) 0);
        double double48 = grayPaintScale45.getUpperBound();
        java.awt.Paint paint50 = grayPaintScale45.getPaint(100.0d);
        double double51 = grayPaintScale45.getUpperBound();
        boolean boolean52 = grayPaintScale32.equals((java.lang.Object) double51);
        java.awt.Paint paint54 = grayPaintScale32.getPaint((double) (short) 0);
        boolean boolean55 = grayPaintScale2.equals((java.lang.Object) paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale45", obj9.equals(grayPaintScale45) ? obj9.hashCode() == grayPaintScale45.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (byte) -1);
        double double21 = grayPaintScale18.getLowerBound();
        double double22 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (short) 0);
        double double29 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) 1);
        double double32 = grayPaintScale26.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double36 = grayPaintScale35.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale35.getPaint((double) (short) 100);
        java.awt.Paint paint40 = grayPaintScale35.getPaint((double) (-1L));
        boolean boolean41 = grayPaintScale26.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint43 = grayPaintScale35.getPaint((double) (-1.0f));
        java.lang.Class<?> wildcardClass44 = paint43.getClass();
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale26", grayPaintScale6.equals(grayPaintScale26) ? grayPaintScale6.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 1.0d);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        java.lang.Object obj14 = grayPaintScale11.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getLowerBound();
        double double22 = grayPaintScale17.getUpperBound();
        boolean boolean23 = grayPaintScale11.equals((java.lang.Object) double22);
        java.awt.Paint paint25 = grayPaintScale11.getPaint((double) (byte) 0);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj14", grayPaintScale11.equals(obj14) ? grayPaintScale11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj9", obj3.equals(obj9) ? obj3.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj14", obj11.equals(obj14) ? obj11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale0.getPaint(35.0d);
        java.lang.Object obj15 = grayPaintScale0.clone();
        java.lang.Object obj16 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj15", obj5.equals(obj15) ? obj5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double24 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint((double) (short) 100);
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass37 = grayPaintScale36.getClass();
        boolean boolean38 = grayPaintScale30.equals((java.lang.Object) grayPaintScale36);
        boolean boolean39 = grayPaintScale14.equals((java.lang.Object) boolean38);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double41 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale30", grayPaintScale2.equals(grayPaintScale30) ? grayPaintScale2.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        java.lang.Class<?> wildcardClass23 = grayPaintScale5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj21", grayPaintScale15.equals(obj21) ? grayPaintScale15.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale10.getPaint((double) '4');
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        java.lang.Class<?> wildcardClass17 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (short) 100);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1L));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale8", obj5.equals(grayPaintScale8) ? obj5.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.lang.Object obj13 = grayPaintScale10.clone();
        double double14 = grayPaintScale10.getUpperBound();
        double double15 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale10.getPaint((double) (short) 10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj13", grayPaintScale10.equals(obj13) ? grayPaintScale10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10);
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        java.lang.Object obj21 = grayPaintScale18.clone();
        java.awt.Paint paint23 = grayPaintScale18.getPaint((double) (-1));
        double double24 = grayPaintScale18.getUpperBound();
        boolean boolean26 = grayPaintScale18.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double30 = grayPaintScale29.getUpperBound();
        boolean boolean31 = grayPaintScale18.equals((java.lang.Object) double30);
        boolean boolean32 = grayPaintScale6.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale18", grayPaintScale2.equals(grayPaintScale18) ? grayPaintScale2.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 52.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double7 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint21 = grayPaintScale6.getPaint((double) '#');
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double23 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) 1);
        double double20 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 1);
        java.awt.Paint paint24 = grayPaintScale14.getPaint((double) 10);
        double double25 = grayPaintScale14.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj27 = grayPaintScale14.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) 10L);
        java.lang.Class<?> wildcardClass33 = paint32.getClass();
        boolean boolean34 = grayPaintScale14.equals((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj27", grayPaintScale5.equals(obj27) ? grayPaintScale5.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale0.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 0);
        java.lang.Object obj28 = grayPaintScale25.clone();
        java.awt.Paint paint30 = grayPaintScale25.getPaint((double) (-1));
        java.awt.Paint paint32 = grayPaintScale25.getPaint((double) 10.0f);
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj28", grayPaintScale7.equals(obj28) ? grayPaintScale7.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj14", obj10.equals(obj14) ? obj10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint((double) (short) 100);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean23 = grayPaintScale14.equals((java.lang.Object) grayPaintScale22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 0);
        double double29 = grayPaintScale26.getUpperBound();
        double double30 = grayPaintScale26.getUpperBound();
        java.lang.Class<?> wildcardClass31 = grayPaintScale26.getClass();
        boolean boolean32 = grayPaintScale22.equals((java.lang.Object) grayPaintScale26);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) (short) 0);
        double double38 = grayPaintScale35.getUpperBound();
        java.awt.Paint paint40 = grayPaintScale35.getPaint(100.0d);
        double double41 = grayPaintScale35.getUpperBound();
        boolean boolean42 = grayPaintScale22.equals((java.lang.Object) double41);
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Object obj44 = grayPaintScale22.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale35", grayPaintScale2.equals(grayPaintScale35) ? grayPaintScale2.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) (byte) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        boolean boolean20 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint23 = grayPaintScale2.getPaint(32.0d);
        double double24 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double28 = grayPaintScale27.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale27.getPaint((double) (short) 100);
        java.awt.Paint paint32 = grayPaintScale27.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double36 = grayPaintScale35.getLowerBound();
        boolean boolean37 = grayPaintScale27.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint39 = grayPaintScale27.getPaint((double) (short) 0);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        java.lang.Class<?> wildcardClass41 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale27", grayPaintScale16.equals(grayPaintScale27) ? grayPaintScale16.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale15.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getUpperBound();
        java.lang.Object obj23 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double13 = grayPaintScale9.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) '4');
        double double23 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (short) 0);
        java.awt.Paint paint30 = grayPaintScale26.getPaint(0.0d);
        java.lang.Class<?> wildcardClass31 = grayPaintScale26.getClass();
        boolean boolean32 = grayPaintScale18.equals((java.lang.Object) wildcardClass31);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        java.lang.Object obj34 = grayPaintScale2.clone();
        java.awt.Paint paint36 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj34", obj6.equals(obj34) ? obj6.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj11 = grayPaintScale10.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((-1.0d));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) 'a');
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double25 = grayPaintScale24.getLowerBound();
        double double26 = grayPaintScale24.getUpperBound();
        double double27 = grayPaintScale24.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        boolean boolean31 = grayPaintScale24.equals((java.lang.Object) 100.0d);
        boolean boolean32 = grayPaintScale17.equals((java.lang.Object) 100.0d);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale24", grayPaintScale17.equals(grayPaintScale24) ? grayPaintScale17.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) boolean10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        java.lang.Object obj17 = grayPaintScale14.clone();
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) (short) 10);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj17", grayPaintScale14.equals(obj17) ? grayPaintScale14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj14", obj10.equals(obj14) ? obj10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj17 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass18 = grayPaintScale14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and obj17", obj15.equals(obj17) ? obj15.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double17 = grayPaintScale16.getUpperBound();
        double double18 = grayPaintScale16.getLowerBound();
        double double19 = grayPaintScale16.getUpperBound();
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj21 = grayPaintScale13.clone();
        boolean boolean22 = grayPaintScale2.equals(obj21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale16", obj9.equals(grayPaintScale16) ? obj9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj12 = grayPaintScale11.clone();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) grayPaintScale11);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double15 = grayPaintScale11.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        java.lang.Object obj15 = grayPaintScale12.clone();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (-1));
        double double18 = grayPaintScale12.getUpperBound();
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) 10L);
        java.lang.Object obj21 = grayPaintScale12.clone();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        java.lang.Object obj30 = grayPaintScale6.clone();
        double double31 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj30", grayPaintScale2.equals(obj30) ? grayPaintScale2.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) '4');
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) 100L);
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) grayPaintScale24);
        double double26 = grayPaintScale17.getLowerBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        double double28 = grayPaintScale17.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale8", grayPaintScale2.equals(grayPaintScale8) ? grayPaintScale2.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj12 = grayPaintScale11.clone();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) grayPaintScale11);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj10", obj7.equals(obj10) ? obj7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 10.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) boolean12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) (byte) 10);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        boolean boolean20 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (byte) -1);
        boolean boolean28 = grayPaintScale24.equals((java.lang.Object) 100L);
        double double29 = grayPaintScale24.getLowerBound();
        boolean boolean30 = grayPaintScale7.equals((java.lang.Object) double29);
        java.lang.Object obj31 = grayPaintScale7.clone();
        java.lang.Object obj32 = grayPaintScale7.clone();
        double double33 = grayPaintScale7.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj31 and obj32", obj31.equals(obj32) ? obj31.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (byte) -1);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (-1.0f));
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) double25);
        java.lang.Object obj27 = grayPaintScale15.clone();
        boolean boolean28 = grayPaintScale6.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint30 = grayPaintScale6.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj27", grayPaintScale15.equals(obj27) ? grayPaintScale15.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) ' ');
        double double19 = grayPaintScale16.getLowerBound();
        double double20 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale16.getPaint((double) 10.0f);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and grayPaintScale16", obj10.equals(grayPaintScale16) ? obj10.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        double double9 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) (byte) 10);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) (-1));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double9 = grayPaintScale8.getLowerBound();
        double double10 = grayPaintScale8.getLowerBound();
        double double11 = grayPaintScale8.getUpperBound();
        double double12 = grayPaintScale8.getLowerBound();
        double double13 = grayPaintScale8.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getLowerBound();
        double double14 = grayPaintScale9.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        java.lang.Object obj22 = grayPaintScale18.clone();
        java.awt.Paint paint24 = grayPaintScale18.getPaint((-1.0d));
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (-1L));
        java.lang.Object obj27 = grayPaintScale18.clone();
        boolean boolean28 = grayPaintScale2.equals(obj27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj22", grayPaintScale18.equals(obj22) ? grayPaintScale18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 0);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) grayPaintScale8);
        double double12 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale17.getPaint((double) (byte) 10);
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale17);
        double double23 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale5.getPaint((double) (-1L));
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj30 = grayPaintScale29.clone();
        boolean boolean32 = grayPaintScale29.equals((java.lang.Object) 1.0f);
        double double33 = grayPaintScale29.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double37 = grayPaintScale36.getUpperBound();
        boolean boolean38 = grayPaintScale29.equals((java.lang.Object) double37);
        java.awt.Paint paint40 = grayPaintScale29.getPaint((double) 'a');
        boolean boolean41 = grayPaintScale5.equals((java.lang.Object) paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale29 and obj30", grayPaintScale29.equals(obj30) ? grayPaintScale29.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint(0.0d);
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj13 = grayPaintScale12.clone();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) (byte) 10);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint(0.0d);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getLowerBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (byte) -1);
        double double23 = grayPaintScale20.getLowerBound();
        double double24 = grayPaintScale20.getLowerBound();
        double double25 = grayPaintScale20.getUpperBound();
        java.lang.Object obj26 = grayPaintScale20.clone();
        java.lang.Object obj27 = grayPaintScale20.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) 10L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint20 = grayPaintScale9.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale5.equals(obj6);
        java.lang.Object obj8 = grayPaintScale5.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (-1.0d));
        double double14 = grayPaintScale9.getUpperBound();
        boolean boolean15 = grayPaintScale5.equals((java.lang.Object) double14);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale18.clone();
        java.awt.Paint paint21 = grayPaintScale18.getPaint((double) (-1));
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj19", grayPaintScale18.equals(obj19) ? grayPaintScale18.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        double double18 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (byte) 100);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double28 = grayPaintScale27.getLowerBound();
        double double29 = grayPaintScale27.getLowerBound();
        double double30 = grayPaintScale27.getUpperBound();
        double double31 = grayPaintScale27.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean35 = grayPaintScale27.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint37 = grayPaintScale27.getPaint(1.0d);
        java.awt.Paint paint39 = grayPaintScale27.getPaint((double) (short) -1);
        boolean boolean40 = grayPaintScale24.equals((java.lang.Object) paint39);
        double double41 = grayPaintScale24.getLowerBound();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) double41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and grayPaintScale24", obj12.equals(grayPaintScale24) ? obj12.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale2.equals(obj15);
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double9 = grayPaintScale8.getLowerBound();
        double double10 = grayPaintScale8.getLowerBound();
        double double11 = grayPaintScale8.getUpperBound();
        double double12 = grayPaintScale8.getUpperBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        java.lang.Object obj20 = grayPaintScale17.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale23.getClass();
        boolean boolean27 = grayPaintScale17.equals((java.lang.Object) wildcardClass26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj20", grayPaintScale17.equals(obj20) ? grayPaintScale17.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((-1.0d));
        java.lang.Object obj11 = grayPaintScale6.clone();
        java.awt.Paint paint13 = grayPaintScale6.getPaint(0.0d);
        double double14 = grayPaintScale6.getLowerBound();
        double double15 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale6.getPaint(32.0d);
        java.awt.Paint paint19 = grayPaintScale6.getPaint((double) (short) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (byte) 0);
        double double13 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale9.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj20 = grayPaintScale9.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) (short) 10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale16", grayPaintScale9.equals(grayPaintScale16) ? grayPaintScale9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(10.0d);
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) (short) 10);
        double double20 = grayPaintScale12.getLowerBound();
        java.lang.Object obj21 = grayPaintScale12.clone();
        double double22 = grayPaintScale12.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        java.lang.Class<?> wildcardClass24 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj21", grayPaintScale12.equals(obj21) ? grayPaintScale12.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getUpperBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale17.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        double double23 = grayPaintScale17.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean20 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        double double21 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale11.getPaint((double) '#');
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (byte) -1);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (-1.0f));
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) double25);
        java.lang.Object obj27 = grayPaintScale15.clone();
        boolean boolean28 = grayPaintScale6.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj29 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj16", obj6.equals(obj16) ? obj6.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((-1.0d));
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) 1L);
        java.lang.Object obj20 = grayPaintScale11.clone();
        double double21 = grayPaintScale11.getUpperBound();
        double double22 = grayPaintScale11.getUpperBound();
        double double23 = grayPaintScale11.getLowerBound();
        java.lang.Object obj24 = grayPaintScale11.clone();
        boolean boolean25 = grayPaintScale2.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj20", grayPaintScale11.equals(obj20) ? grayPaintScale11.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj12 = grayPaintScale11.clone();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) grayPaintScale11);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj15 = grayPaintScale11.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getUpperBound();
        double double12 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale8.getPaint((double) (short) 1);
        double double15 = grayPaintScale8.getUpperBound();
        java.lang.Object obj16 = grayPaintScale8.clone();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double18 = grayPaintScale8.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) 100);
        double double14 = grayPaintScale10.getLowerBound();
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) grayPaintScale10);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getLowerBound();
        double double21 = grayPaintScale14.getLowerBound();
        java.lang.Object obj22 = grayPaintScale14.clone();
        double double23 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (short) 0);
        double double29 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) 1);
        double double32 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale26.getPaint(1.0d);
        java.lang.Class<?> wildcardClass35 = grayPaintScale26.getClass();
        boolean boolean36 = grayPaintScale14.equals((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = grayPaintScale14.clone();
        java.lang.Object obj38 = grayPaintScale14.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj22 and obj37", obj22.equals(obj37) ? obj22.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double14 = grayPaintScale13.getUpperBound();
        java.lang.Object obj15 = grayPaintScale13.clone();
        java.lang.Class<?> wildcardClass16 = grayPaintScale13.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        java.lang.Class<?> wildcardClass18 = grayPaintScale13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) 100);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean19 = grayPaintScale10.equals((java.lang.Object) grayPaintScale18);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale18);
        double double21 = grayPaintScale0.getLowerBound();
        java.lang.Object obj22 = grayPaintScale0.clone();
        java.awt.Paint paint24 = grayPaintScale0.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj22", obj5.equals(obj22) ? obj5.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale12.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = grayPaintScale12.clone();
        double double18 = grayPaintScale12.getUpperBound();
        double double19 = grayPaintScale12.getLowerBound();
        java.lang.Object obj20 = grayPaintScale12.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj20", obj17.equals(obj20) ? obj17.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale7.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj14 = grayPaintScale7.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale19.equals((java.lang.Object) 0L);
        double double23 = grayPaintScale19.getUpperBound();
        boolean boolean24 = grayPaintScale6.equals((java.lang.Object) grayPaintScale19);
        java.lang.Class<?> wildcardClass25 = grayPaintScale19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) (byte) 1);
        java.lang.Object obj20 = grayPaintScale11.clone();
        double double21 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale11.getPaint((double) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = grayPaintScale11.equals(obj24);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj20", grayPaintScale11.equals(obj20) ? grayPaintScale11.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint(0.0d);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getLowerBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        java.lang.Object obj15 = grayPaintScale12.clone();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (-1));
        double double18 = grayPaintScale12.getLowerBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj15", grayPaintScale12.equals(obj15) ? grayPaintScale12.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double6 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 10.0d);
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) boolean19);
        java.lang.Object obj21 = grayPaintScale9.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj21", grayPaintScale9.equals(obj21) ? grayPaintScale9.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) 10L);
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 100);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        java.awt.Paint paint28 = grayPaintScale24.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint33 = grayPaintScale31.getPaint((double) (short) 0);
        java.awt.Paint paint35 = grayPaintScale31.getPaint(0.0d);
        boolean boolean36 = grayPaintScale24.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint38 = grayPaintScale24.getPaint((double) 100L);
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        java.lang.Object obj40 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and grayPaintScale31", grayPaintScale24.equals(grayPaintScale31) ? grayPaintScale24.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale5.clone();
        double double15 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint23 = grayPaintScale21.getPaint(0.0d);
        boolean boolean24 = grayPaintScale5.equals((java.lang.Object) grayPaintScale21);
        double double25 = grayPaintScale21.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) (short) 10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale16", grayPaintScale9.equals(grayPaintScale16) ? grayPaintScale9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj8 = grayPaintScale7.clone();
        double double9 = grayPaintScale7.getUpperBound();
        double double10 = grayPaintScale7.getLowerBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj12", obj10.equals(obj12) ? obj10.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getLowerBound();
        double double14 = grayPaintScale9.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 10.0f);
        double double18 = grayPaintScale2.getLowerBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 10.0f);
        java.lang.Object obj23 = grayPaintScale22.clone();
        boolean boolean24 = grayPaintScale2.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 10);
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) 10.0d);
        boolean boolean23 = grayPaintScale19.equals((java.lang.Object) (-1.0d));
        double double24 = grayPaintScale19.getLowerBound();
        double double25 = grayPaintScale19.getUpperBound();
        java.lang.Object obj26 = grayPaintScale19.clone();
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) grayPaintScale19);
        double double28 = grayPaintScale19.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) double28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj26", grayPaintScale19.equals(obj26) ? grayPaintScale19.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double14 = grayPaintScale13.getUpperBound();
        java.lang.Object obj15 = grayPaintScale13.clone();
        java.lang.Class<?> wildcardClass16 = grayPaintScale13.getClass();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        java.lang.Object obj18 = grayPaintScale13.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        double double10 = grayPaintScale0.getLowerBound();
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale0.getPaint(35.0d);
        java.lang.Object obj15 = grayPaintScale0.clone();
        double double16 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj15", obj5.equals(obj15) ? obj5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (short) 100);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1L));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.lang.Class<?> wildcardClass15 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double6 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) (short) 100);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        java.lang.Object obj15 = grayPaintScale5.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj15", grayPaintScale5.equals(obj15) ? grayPaintScale5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.lang.Object obj13 = grayPaintScale10.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj13", grayPaintScale10.equals(obj13) ? grayPaintScale10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj11", obj10.equals(obj11) ? obj10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 0L);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) 1);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) 10.0d);
        boolean boolean31 = grayPaintScale20.equals((java.lang.Object) boolean30);
        java.lang.Object obj32 = grayPaintScale20.clone();
        boolean boolean33 = grayPaintScale16.equals((java.lang.Object) grayPaintScale20);
        double double34 = grayPaintScale20.getUpperBound();
        boolean boolean35 = grayPaintScale7.equals((java.lang.Object) double34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj32", grayPaintScale20.equals(obj32) ? grayPaintScale20.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) 10L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj19 = grayPaintScale0.clone();
        double double20 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) -1);
        double double23 = grayPaintScale2.getUpperBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        boolean boolean35 = grayPaintScale30.equals((java.lang.Object) 1);
        double double36 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale30.getPaint((double) 10L);
        boolean boolean39 = grayPaintScale27.equals((java.lang.Object) 10L);
        double double40 = grayPaintScale27.getLowerBound();
        boolean boolean42 = grayPaintScale27.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint44 = grayPaintScale27.getPaint((double) 100L);
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj24", obj9.equals(obj24) ? obj9.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double6 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        boolean boolean13 = grayPaintScale5.equals((java.lang.Object) wildcardClass12);
        java.awt.Paint paint15 = grayPaintScale5.getPaint((double) 100);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj17 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint19 = grayPaintScale17.getPaint(10.0d);
        java.awt.Paint paint21 = grayPaintScale17.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double25 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale24.getPaint((double) (short) 100);
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean33 = grayPaintScale24.equals((java.lang.Object) grayPaintScale32);
        boolean boolean34 = grayPaintScale17.equals((java.lang.Object) grayPaintScale32);
        double double35 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint37 = grayPaintScale17.getPaint((double) (short) 100);
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) paint37);
        java.lang.Class<?> wildcardClass39 = paint37.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(100.0d);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) '4');
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0L);
        java.awt.Paint paint18 = grayPaintScale9.getPaint((double) 10L);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double8 = grayPaintScale7.getUpperBound();
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale7.equals(obj9);
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj11", grayPaintScale7.equals(obj11) ? grayPaintScale7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        java.lang.Object obj11 = grayPaintScale8.clone();
        java.awt.Paint paint13 = grayPaintScale8.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint19 = grayPaintScale8.getPaint((double) '#');
        double double20 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double24 = grayPaintScale23.getUpperBound();
        double double25 = grayPaintScale23.getLowerBound();
        boolean boolean26 = grayPaintScale8.equals((java.lang.Object) double25);
        java.awt.Paint paint28 = grayPaintScale8.getPaint((double) (byte) 0);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100);
        java.awt.Paint paint13 = grayPaintScale11.getPaint(100.0d);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj16 = grayPaintScale11.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        double double11 = grayPaintScale7.getLowerBound();
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj12", grayPaintScale7.equals(obj12) ? grayPaintScale7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 10.0f);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale14.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = grayPaintScale14.clone();
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale14.getPaint((double) '#');
        java.lang.Object obj24 = grayPaintScale14.clone();
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj19 and obj24", obj19.equals(obj24) ? obj19.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) (byte) 1);
        double double20 = grayPaintScale11.getUpperBound();
        double double21 = grayPaintScale11.getUpperBound();
        double double22 = grayPaintScale11.getUpperBound();
        java.lang.Object obj23 = grayPaintScale11.clone();
        boolean boolean24 = grayPaintScale2.equals(obj23);
        java.awt.Paint paint26 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj23", grayPaintScale11.equals(obj23) ? grayPaintScale11.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj15", obj11.equals(obj15) ? obj11.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = grayPaintScale0.clone();
        java.awt.Paint paint16 = grayPaintScale0.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj14", obj5.equals(obj14) ? obj5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        java.lang.Object obj13 = grayPaintScale10.clone();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj13", grayPaintScale10.equals(obj13) ? grayPaintScale10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale15.getPaint((double) 0L);
        java.lang.Object obj20 = grayPaintScale15.clone();
        double double21 = grayPaintScale15.getLowerBound();
        double double22 = grayPaintScale15.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj20", grayPaintScale15.equals(obj20) ? grayPaintScale15.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) (short) 10);
        double double13 = grayPaintScale5.getLowerBound();
        java.lang.Object obj14 = grayPaintScale5.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) 10.0d);
        double double19 = grayPaintScale16.getUpperBound();
        double double20 = grayPaintScale16.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) 1);
        double double28 = grayPaintScale22.getLowerBound();
        double double29 = grayPaintScale22.getLowerBound();
        double double30 = grayPaintScale22.getLowerBound();
        double double31 = grayPaintScale22.getUpperBound();
        double double32 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale22.getPaint((double) '4');
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        double double36 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale22", obj9.equals(grayPaintScale22) ? obj9.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 1.0f);
        double double11 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj13 = grayPaintScale7.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) '4');
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj9 = grayPaintScale8.clone();
        double double10 = grayPaintScale8.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) (short) 10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) 10.0d);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale16", grayPaintScale9.equals(grayPaintScale16) ? grayPaintScale9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) 100);
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean19 = grayPaintScale10.equals((java.lang.Object) grayPaintScale18);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale18);
        double double21 = grayPaintScale18.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (byte) 0);
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double25 = grayPaintScale24.getLowerBound();
        double double26 = grayPaintScale24.getLowerBound();
        boolean boolean27 = grayPaintScale17.equals((java.lang.Object) grayPaintScale24);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj18", grayPaintScale17.equals(obj18) ? grayPaintScale17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double12 = grayPaintScale11.getUpperBound();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) grayPaintScale11);
        double double16 = grayPaintScale8.getLowerBound();
        double double17 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale8.getPaint(10.0d);
        java.lang.Object obj20 = grayPaintScale8.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        java.awt.Paint paint23 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj20", grayPaintScale8.equals(obj20) ? grayPaintScale8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj14", obj8.equals(obj14) ? obj8.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        double double20 = grayPaintScale16.getLowerBound();
        java.lang.Object obj21 = grayPaintScale16.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) 0);
        boolean boolean30 = grayPaintScale24.equals((java.lang.Object) grayPaintScale27);
        double double31 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale24.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double37 = grayPaintScale36.getLowerBound();
        double double38 = grayPaintScale36.getUpperBound();
        java.awt.Paint paint40 = grayPaintScale36.getPaint((double) (byte) 10);
        boolean boolean41 = grayPaintScale24.equals((java.lang.Object) grayPaintScale36);
        double double42 = grayPaintScale36.getLowerBound();
        boolean boolean43 = grayPaintScale16.equals((java.lang.Object) grayPaintScale36);
        boolean boolean44 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj45 = grayPaintScale16.clone();
        java.lang.Object obj46 = grayPaintScale16.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj21 and obj45", obj21.equals(obj45) ? obj21.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) (short) 10);
        double double13 = grayPaintScale5.getLowerBound();
        java.lang.Object obj14 = grayPaintScale5.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 1L);
        java.lang.Object obj19 = grayPaintScale10.clone();
        double double20 = grayPaintScale10.getUpperBound();
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Object obj22 = grayPaintScale10.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj19", obj7.equals(obj19) ? obj7.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) '4');
        java.awt.Paint paint17 = grayPaintScale13.getPaint((double) 100L);
        double double18 = grayPaintScale13.getUpperBound();
        java.lang.Object obj19 = grayPaintScale13.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) '4');
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) 100L);
        double double19 = grayPaintScale14.getUpperBound();
        java.lang.Object obj20 = grayPaintScale14.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 10L);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj16 and obj17", obj16.equals(obj17) ? obj16.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        double double22 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale20", grayPaintScale2.equals(grayPaintScale20) ? grayPaintScale2.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        double double16 = grayPaintScale13.getUpperBound();
        double double17 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double21 = grayPaintScale20.getLowerBound();
        double double22 = grayPaintScale20.getLowerBound();
        java.lang.Object obj23 = grayPaintScale20.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) ' ');
        double double29 = grayPaintScale26.getLowerBound();
        double double30 = grayPaintScale26.getLowerBound();
        java.lang.Class<?> wildcardClass31 = grayPaintScale26.getClass();
        boolean boolean32 = grayPaintScale20.equals((java.lang.Object) wildcardClass31);
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) (-1.0d));
        double double35 = grayPaintScale20.getLowerBound();
        double double36 = grayPaintScale20.getLowerBound();
        boolean boolean37 = grayPaintScale13.equals((java.lang.Object) grayPaintScale20);
        double double38 = grayPaintScale20.getLowerBound();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) double38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) 10L);
        java.awt.Paint paint16 = grayPaintScale10.getPaint((double) (short) -1);
        java.lang.Object obj17 = grayPaintScale10.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj17", grayPaintScale10.equals(obj17) ? grayPaintScale10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) 10.0d);
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) boolean25);
        java.awt.Paint paint28 = grayPaintScale15.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass29 = grayPaintScale15.getClass();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double34 = grayPaintScale33.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale33.getPaint((double) (short) 100);
        java.awt.Paint paint38 = grayPaintScale33.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean42 = grayPaintScale33.equals((java.lang.Object) grayPaintScale41);
        double double43 = grayPaintScale33.getLowerBound();
        java.awt.Paint paint45 = grayPaintScale33.getPaint((double) (-1.0f));
        boolean boolean46 = grayPaintScale15.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint((double) (short) 100);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 100.0f);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        double double26 = grayPaintScale23.getUpperBound();
        java.lang.Object obj27 = grayPaintScale23.clone();
        double double28 = grayPaintScale23.getUpperBound();
        double double29 = grayPaintScale23.getUpperBound();
        double double30 = grayPaintScale23.getUpperBound();
        double double31 = grayPaintScale23.getLowerBound();
        boolean boolean32 = grayPaintScale14.equals((java.lang.Object) double31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj27", grayPaintScale23.equals(obj27) ? grayPaintScale23.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj12", obj11.equals(obj12) ? obj11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale5.equals((java.lang.Object) grayPaintScale11);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((-1.0d));
        java.lang.Object obj18 = grayPaintScale15.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj12", obj9.equals(obj12) ? obj9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 1L);
        double double16 = grayPaintScale13.getLowerBound();
        java.lang.Object obj17 = grayPaintScale13.clone();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double19 = grayPaintScale13.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) 0);
        boolean boolean29 = grayPaintScale23.equals((java.lang.Object) grayPaintScale26);
        double double30 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale23.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double36 = grayPaintScale35.getLowerBound();
        double double37 = grayPaintScale35.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale35.getPaint((double) (byte) 10);
        boolean boolean40 = grayPaintScale23.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint42 = grayPaintScale23.getPaint(0.0d);
        boolean boolean43 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        double double44 = grayPaintScale23.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) (short) 1);
        double double13 = grayPaintScale5.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double24 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint((double) (short) 100);
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass37 = grayPaintScale36.getClass();
        boolean boolean38 = grayPaintScale30.equals((java.lang.Object) grayPaintScale36);
        boolean boolean39 = grayPaintScale14.equals((java.lang.Object) boolean38);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint42 = grayPaintScale14.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale30", grayPaintScale2.equals(grayPaintScale30) ? grayPaintScale2.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj17 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj15", grayPaintScale14.equals(obj15) ? grayPaintScale14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale5.clone();
        double double15 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint23 = grayPaintScale21.getPaint(0.0d);
        boolean boolean24 = grayPaintScale5.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj25 = grayPaintScale21.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale11.getPaint((double) 1L);
        double double16 = grayPaintScale11.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and grayPaintScale11", obj8.equals(grayPaintScale11) ? obj8.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 10.0d);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) (-1.0d));
        double double15 = grayPaintScale10.getLowerBound();
        double double16 = grayPaintScale10.getUpperBound();
        java.lang.Object obj17 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = grayPaintScale5.equals(obj17);
        double double20 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj17", grayPaintScale10.equals(obj17) ? grayPaintScale10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) 1L);
        java.lang.Object obj20 = grayPaintScale11.clone();
        double double21 = grayPaintScale11.getUpperBound();
        double double22 = grayPaintScale11.getUpperBound();
        double double23 = grayPaintScale11.getLowerBound();
        java.lang.Object obj24 = grayPaintScale11.clone();
        boolean boolean25 = grayPaintScale2.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj20", grayPaintScale11.equals(obj20) ? grayPaintScale11.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 'a');
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double9 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getUpperBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) ' ');
        boolean boolean18 = grayPaintScale8.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = grayPaintScale8.clone();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        double double21 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj19", grayPaintScale8.equals(obj19) ? grayPaintScale8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj16 = grayPaintScale15.clone();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = grayPaintScale21.equals(obj22);
        boolean boolean24 = grayPaintScale15.equals(obj22);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj16", grayPaintScale15.equals(obj16) ? grayPaintScale15.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1.0f);
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale2.equals(obj14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale2.equals(obj18);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        java.lang.Object obj26 = grayPaintScale23.clone();
        double double27 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale23.getPaint((double) 10);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj20 and grayPaintScale23", obj20.equals(grayPaintScale23) ? obj20.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) (-1.0f));
        java.lang.Object obj18 = grayPaintScale7.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale14", grayPaintScale7.equals(grayPaintScale14) ? grayPaintScale7.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) 1);
        double double26 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint28 = grayPaintScale20.getPaint((double) (byte) 1);
        java.lang.Object obj29 = grayPaintScale20.clone();
        double double30 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale20.getPaint((double) (byte) 100);
        java.lang.Object obj33 = null;
        boolean boolean34 = grayPaintScale20.equals(obj33);
        boolean boolean35 = grayPaintScale2.equals(obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale20", obj9.equals(grayPaintScale20) ? obj9.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale18.getPaint(100.0d);
        double double24 = grayPaintScale18.getUpperBound();
        double double25 = grayPaintScale18.getLowerBound();
        boolean boolean26 = grayPaintScale15.equals((java.lang.Object) grayPaintScale18);
        java.awt.Paint paint28 = grayPaintScale18.getPaint((double) (short) 1);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale18", obj5.equals(grayPaintScale18) ? obj5.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale10.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale22);
        double double28 = grayPaintScale22.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Object obj30 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        double double12 = grayPaintScale11.getUpperBound();
        java.lang.Object obj13 = grayPaintScale11.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj17 = grayPaintScale16.clone();
        java.awt.Paint paint19 = grayPaintScale16.getPaint(0.0d);
        boolean boolean20 = grayPaintScale11.equals((java.lang.Object) grayPaintScale16);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj13", grayPaintScale11.equals(obj13) ? grayPaintScale11.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        java.lang.Object obj20 = grayPaintScale17.clone();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = grayPaintScale17.equals(obj21);
        double double23 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) 10.0d);
        double double27 = grayPaintScale24.getUpperBound();
        double double28 = grayPaintScale24.getLowerBound();
        double double29 = grayPaintScale24.getUpperBound();
        boolean boolean30 = grayPaintScale17.equals((java.lang.Object) double29);
        java.awt.Paint paint32 = grayPaintScale17.getPaint((double) 10.0f);
        double double33 = grayPaintScale17.getLowerBound();
        java.lang.Object obj34 = grayPaintScale17.clone();
        boolean boolean35 = grayPaintScale2.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj20", grayPaintScale17.equals(obj20) ? grayPaintScale17.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        double double15 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Object obj21 = grayPaintScale18.clone();
        boolean boolean22 = grayPaintScale7.equals(obj21);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj21", grayPaintScale18.equals(obj21) ? grayPaintScale18.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 32.0d);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(100.0d);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) '4');
        double double17 = grayPaintScale11.getLowerBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) (short) 10);
        double double13 = grayPaintScale5.getLowerBound();
        java.lang.Object obj14 = grayPaintScale5.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double6 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale5.getPaint((double) (short) 100);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) paint10);
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        java.lang.Object obj19 = grayPaintScale16.clone();
        java.awt.Paint paint21 = grayPaintScale16.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean25 = grayPaintScale16.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint27 = grayPaintScale16.getPaint((double) '#');
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj19", grayPaintScale16.equals(obj19) ? grayPaintScale16.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 10.0f);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj13 = grayPaintScale12.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale5.equals(obj13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        java.lang.Object obj24 = grayPaintScale21.clone();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1));
        double double27 = grayPaintScale21.getUpperBound();
        boolean boolean28 = grayPaintScale18.equals((java.lang.Object) grayPaintScale21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) 10.0d);
        boolean boolean32 = grayPaintScale21.equals((java.lang.Object) 10.0d);
        boolean boolean34 = grayPaintScale21.equals((java.lang.Object) 0);
        double double35 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint37 = grayPaintScale21.getPaint((double) 100.0f);
        boolean boolean38 = grayPaintScale5.equals((java.lang.Object) paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = grayPaintScale16.equals(obj20);
        double double22 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) 10.0d);
        double double26 = grayPaintScale23.getUpperBound();
        double double27 = grayPaintScale23.getLowerBound();
        double double28 = grayPaintScale23.getUpperBound();
        boolean boolean29 = grayPaintScale16.equals((java.lang.Object) double28);
        java.awt.Paint paint31 = grayPaintScale16.getPaint((double) 10.0f);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale16", obj11.equals(grayPaintScale16) ? obj11.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale8.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(32.0d);
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj12", obj5.equals(obj12) ? obj5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1.0f);
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 1);
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (byte) 1);
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) grayPaintScale18);
        double double28 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double32 = grayPaintScale31.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale31.getPaint((double) (short) 100);
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean40 = grayPaintScale31.equals((java.lang.Object) grayPaintScale39);
        boolean boolean41 = grayPaintScale18.equals((java.lang.Object) boolean40);
        java.lang.Object obj42 = grayPaintScale18.clone();
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj42", grayPaintScale14.equals(obj42) ? grayPaintScale14.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        double double24 = grayPaintScale17.getLowerBound();
        double double25 = grayPaintScale17.getLowerBound();
        double double26 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double30 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint32 = grayPaintScale29.getPaint((double) (short) 100);
        java.awt.Paint paint34 = grayPaintScale29.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean38 = grayPaintScale29.equals((java.lang.Object) grayPaintScale37);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint43 = grayPaintScale41.getPaint((double) 0);
        double double44 = grayPaintScale41.getUpperBound();
        double double45 = grayPaintScale41.getUpperBound();
        java.lang.Class<?> wildcardClass46 = grayPaintScale41.getClass();
        boolean boolean47 = grayPaintScale37.equals((java.lang.Object) grayPaintScale41);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale50 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint52 = grayPaintScale50.getPaint((double) (short) 0);
        double double53 = grayPaintScale50.getUpperBound();
        java.awt.Paint paint55 = grayPaintScale50.getPaint(100.0d);
        double double56 = grayPaintScale50.getUpperBound();
        boolean boolean57 = grayPaintScale37.equals((java.lang.Object) double56);
        boolean boolean58 = grayPaintScale17.equals((java.lang.Object) grayPaintScale37);
        boolean boolean59 = grayPaintScale2.equals((java.lang.Object) grayPaintScale37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale50", grayPaintScale17.equals(grayPaintScale50) ? grayPaintScale17.hashCode() == grayPaintScale50.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale18.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) wildcardClass21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double29 = grayPaintScale28.getUpperBound();
        double double30 = grayPaintScale28.getLowerBound();
        double double31 = grayPaintScale28.getUpperBound();
        boolean boolean32 = grayPaintScale25.equals((java.lang.Object) grayPaintScale28);
        double double33 = grayPaintScale28.getLowerBound();
        java.lang.Object obj34 = null;
        boolean boolean35 = grayPaintScale28.equals(obj34);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double39 = grayPaintScale38.getUpperBound();
        java.lang.Object obj40 = null;
        boolean boolean41 = grayPaintScale38.equals(obj40);
        java.awt.Paint paint43 = grayPaintScale38.getPaint((double) ' ');
        java.lang.Object obj44 = grayPaintScale38.clone();
        boolean boolean45 = grayPaintScale28.equals((java.lang.Object) grayPaintScale38);
        java.awt.Paint paint47 = grayPaintScale38.getPaint(0.0d);
        boolean boolean48 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and grayPaintScale25", obj6.equals(grayPaintScale25) ? obj6.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) '#');
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 10);
        double double19 = grayPaintScale18.getUpperBound();
        java.lang.Object obj20 = grayPaintScale18.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale18", grayPaintScale5.equals(grayPaintScale18) ? grayPaintScale5.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10);
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.lang.Object obj17 = grayPaintScale10.clone();
        double double18 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) 10);
        double double21 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale10.getPaint((double) 10);
        java.lang.Object obj24 = grayPaintScale10.clone();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj24", obj17.equals(obj24) ? obj17.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (-1.0f));
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint14 = grayPaintScale10.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 1);
        java.awt.Paint paint27 = grayPaintScale17.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale30.getClass();
        boolean boolean35 = grayPaintScale17.equals((java.lang.Object) grayPaintScale30);
        double double36 = grayPaintScale17.getLowerBound();
        boolean boolean37 = grayPaintScale10.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint39 = grayPaintScale10.getPaint(100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale30", grayPaintScale17.equals(grayPaintScale30) ? grayPaintScale17.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 10.0f);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) 1);
        double double28 = grayPaintScale22.getLowerBound();
        double double29 = grayPaintScale22.getLowerBound();
        double double30 = grayPaintScale22.getLowerBound();
        double double31 = grayPaintScale22.getUpperBound();
        double double32 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale22.getPaint((double) '4');
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Class<?> wildcardClass36 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale22", obj9.equals(grayPaintScale22) ? obj9.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj14", obj10.equals(obj14) ? obj10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 52.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj7 = grayPaintScale6.clone();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) (byte) 10);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) paint10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj9", grayPaintScale6.equals(obj9) ? grayPaintScale6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double15 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass21 = paint20.getClass();
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = null;
        boolean boolean24 = grayPaintScale14.equals(obj23);
        double double25 = grayPaintScale14.getUpperBound();
        java.lang.Object obj26 = grayPaintScale14.clone();
        boolean boolean27 = grayPaintScale2.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getUpperBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) ' ');
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = grayPaintScale6.getClass();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) wildcardClass17);
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double27 = grayPaintScale26.getUpperBound();
        double double28 = grayPaintScale26.getLowerBound();
        double double29 = grayPaintScale26.getUpperBound();
        boolean boolean30 = grayPaintScale23.equals((java.lang.Object) grayPaintScale26);
        double double31 = grayPaintScale23.getLowerBound();
        double double32 = grayPaintScale23.getLowerBound();
        java.lang.Class<?> wildcardClass33 = grayPaintScale23.getClass();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale26", grayPaintScale10.equals(grayPaintScale26) ? grayPaintScale10.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass3 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj2", obj1.equals(obj2) ? obj1.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double13 = grayPaintScale5.getLowerBound();
        java.lang.Object obj14 = grayPaintScale5.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj14", obj8.equals(obj14) ? obj8.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 0);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) grayPaintScale10);
        double double14 = grayPaintScale7.getUpperBound();
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) '#');
        java.lang.Object obj18 = grayPaintScale7.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj18", obj3.equals(obj18) ? obj3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) 1);
        double double28 = grayPaintScale22.getLowerBound();
        java.lang.Object obj29 = grayPaintScale22.clone();
        double double30 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint32 = grayPaintScale22.getPaint((double) (byte) 100);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale22 and obj29", grayPaintScale22.equals(obj29) ? grayPaintScale22.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj13 = grayPaintScale12.clone();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) (byte) 10);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        double double25 = grayPaintScale21.getLowerBound();
        java.lang.Object obj26 = grayPaintScale21.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        java.lang.Class<?> wildcardClass28 = grayPaintScale21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale5.clone();
        double double15 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj13 = grayPaintScale12.clone();
        java.awt.Paint paint15 = grayPaintScale12.getPaint((double) (byte) 10);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double17 = grayPaintScale12.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint16 = grayPaintScale5.getPaint((double) '#');
        double double17 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double21 = grayPaintScale20.getUpperBound();
        double double22 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) double22);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double24 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint((double) (short) 100);
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass37 = grayPaintScale36.getClass();
        boolean boolean38 = grayPaintScale30.equals((java.lang.Object) grayPaintScale36);
        boolean boolean39 = grayPaintScale14.equals((java.lang.Object) boolean38);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint42 = grayPaintScale14.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale30", grayPaintScale2.equals(grayPaintScale30) ? grayPaintScale2.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) ' ');
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint(0.0d);
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 1);
        boolean boolean29 = grayPaintScale25.equals((java.lang.Object) 10L);
        java.awt.Paint paint31 = grayPaintScale25.getPaint((double) (short) -1);
        java.lang.Object obj32 = grayPaintScale25.clone();
        boolean boolean33 = grayPaintScale2.equals(obj32);
        java.lang.Class<?> wildcardClass34 = obj32.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100);
        java.awt.Paint paint13 = grayPaintScale11.getPaint(100.0d);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Object obj21 = grayPaintScale18.clone();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        java.lang.Class<?> wildcardClass23 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj21", grayPaintScale18.equals(obj21) ? grayPaintScale18.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        double double26 = grayPaintScale23.getUpperBound();
        java.lang.Object obj27 = grayPaintScale23.clone();
        double double28 = grayPaintScale23.getUpperBound();
        double double29 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = grayPaintScale32.equals(obj33);
        java.awt.Paint paint36 = grayPaintScale32.getPaint((double) 10.0f);
        double double37 = grayPaintScale32.getUpperBound();
        java.lang.Class<?> wildcardClass38 = grayPaintScale32.getClass();
        boolean boolean39 = grayPaintScale23.equals((java.lang.Object) grayPaintScale32);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        double double41 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj27", grayPaintScale23.equals(obj27) ? grayPaintScale23.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double16 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double20 = grayPaintScale19.getLowerBound();
        double double21 = grayPaintScale19.getLowerBound();
        java.lang.Object obj22 = grayPaintScale19.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj22", grayPaintScale19.equals(obj22) ? grayPaintScale19.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj13", obj11.equals(obj13) ? obj11.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double15 = grayPaintScale2.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        double double18 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint23 = grayPaintScale21.getPaint(1.0d);
        java.awt.Paint paint25 = grayPaintScale21.getPaint((double) 100);
        java.awt.Paint paint27 = grayPaintScale21.getPaint((double) (-1.0f));
        java.lang.Object obj28 = grayPaintScale21.clone();
        boolean boolean29 = grayPaintScale2.equals(obj28);
        double double30 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj28", grayPaintScale21.equals(obj28) ? grayPaintScale21.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (byte) -1);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 100L);
        double double20 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        boolean boolean29 = grayPaintScale15.equals((java.lang.Object) 1);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale23", obj5.equals(grayPaintScale23) ? obj5.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double14 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (short) 100);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean22 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) 0);
        double double28 = grayPaintScale25.getUpperBound();
        double double29 = grayPaintScale25.getUpperBound();
        java.lang.Class<?> wildcardClass30 = grayPaintScale25.getClass();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) grayPaintScale25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint36 = grayPaintScale34.getPaint((double) (short) 0);
        double double37 = grayPaintScale34.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale34.getPaint(100.0d);
        double double40 = grayPaintScale34.getUpperBound();
        boolean boolean41 = grayPaintScale21.equals((java.lang.Object) double40);
        java.awt.Paint paint43 = grayPaintScale21.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint48 = grayPaintScale46.getPaint((double) 0.0f);
        boolean boolean49 = grayPaintScale21.equals((java.lang.Object) paint48);
        java.lang.Class<?> wildcardClass50 = grayPaintScale21.getClass();
        boolean boolean51 = grayPaintScale2.equals((java.lang.Object) wildcardClass50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj9", grayPaintScale6.equals(obj9) ? grayPaintScale6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale0.getPaint((double) 100L);
        java.lang.Object obj23 = grayPaintScale0.clone();
        double double24 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (byte) -1);
        boolean boolean17 = grayPaintScale13.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (-1.0f));
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean24 = grayPaintScale13.equals((java.lang.Object) double23);
        java.lang.Object obj25 = grayPaintScale13.clone();
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) 32.0d);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj25", grayPaintScale13.equals(obj25) ? grayPaintScale13.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint14 = grayPaintScale10.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 1);
        java.awt.Paint paint27 = grayPaintScale17.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) (short) 0);
        double double33 = grayPaintScale30.getLowerBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale30.getClass();
        boolean boolean35 = grayPaintScale17.equals((java.lang.Object) grayPaintScale30);
        double double36 = grayPaintScale17.getLowerBound();
        boolean boolean37 = grayPaintScale10.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj41 = grayPaintScale40.clone();
        java.awt.Paint paint43 = grayPaintScale40.getPaint((double) (short) 0);
        java.lang.Object obj44 = grayPaintScale40.clone();
        boolean boolean45 = grayPaintScale17.equals((java.lang.Object) grayPaintScale40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale30", grayPaintScale10.equals(grayPaintScale30) ? grayPaintScale10.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale2.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj16", obj9.equals(obj16) ? obj9.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getUpperBound();
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale15.equals(obj17);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) ' ');
        java.lang.Object obj21 = grayPaintScale15.clone();
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint24 = grayPaintScale5.getPaint((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj21", grayPaintScale15.equals(obj21) ? grayPaintScale15.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getUpperBound();
        java.lang.Object obj13 = grayPaintScale9.clone();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) (short) 100);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj13", grayPaintScale9.equals(obj13) ? grayPaintScale9.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = grayPaintScale5.clone();
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj10", grayPaintScale5.equals(obj10) ? grayPaintScale5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 10L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 10L);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale18.clone();
        java.awt.Paint paint21 = grayPaintScale18.getPaint((double) (-1));
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) (-1L));
        java.awt.Paint paint25 = grayPaintScale18.getPaint((double) 100.0f);
        double double26 = grayPaintScale18.getUpperBound();
        java.lang.Class<?> wildcardClass27 = grayPaintScale18.getClass();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj19", grayPaintScale18.equals(obj19) ? grayPaintScale18.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1L);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj12", obj3.equals(obj12) ? obj3.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (byte) 0);
        double double17 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double21 = grayPaintScale20.getLowerBound();
        double double22 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj24 = grayPaintScale13.clone();
        boolean boolean25 = grayPaintScale2.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.lang.Object obj13 = grayPaintScale10.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint16 = grayPaintScale10.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) -1);
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint21 = grayPaintScale17.getPaint((-1.0d));
        java.lang.Object obj22 = grayPaintScale17.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 1);
        double double28 = grayPaintScale25.getLowerBound();
        boolean boolean29 = grayPaintScale17.equals((java.lang.Object) grayPaintScale25);
        java.awt.Paint paint31 = grayPaintScale17.getPaint((double) ' ');
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) 0);
        double double38 = grayPaintScale35.getUpperBound();
        double double39 = grayPaintScale35.getLowerBound();
        double double40 = grayPaintScale35.getUpperBound();
        java.lang.Object obj41 = grayPaintScale35.clone();
        double double42 = grayPaintScale35.getUpperBound();
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) grayPaintScale35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj22", grayPaintScale17.equals(obj22) ? grayPaintScale17.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale6.equals(obj9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double14 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getUpperBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) ' ');
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) boolean22);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) wildcardClass25);
        double double27 = grayPaintScale13.getLowerBound();
        double double28 = grayPaintScale13.getUpperBound();
        java.lang.Object obj29 = grayPaintScale13.clone();
        boolean boolean30 = grayPaintScale6.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj29", grayPaintScale2.equals(obj29) ? grayPaintScale2.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) 100);
        double double18 = grayPaintScale6.getUpperBound();
        java.lang.Object obj19 = grayPaintScale6.clone();
        java.awt.Paint paint21 = grayPaintScale6.getPaint((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 100);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj23 = grayPaintScale22.clone();
        double double24 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale22", grayPaintScale17.equals(grayPaintScale22) ? grayPaintScale17.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 10L);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = grayPaintScale15.clone();
        double double21 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale15.getPaint(0.0d);
        java.awt.Paint paint25 = grayPaintScale15.getPaint((double) (byte) 10);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint28 = grayPaintScale2.getPaint(52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj20", grayPaintScale15.equals(obj20) ? grayPaintScale15.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        java.lang.Object obj17 = grayPaintScale14.clone();
        double double18 = grayPaintScale14.getUpperBound();
        double double19 = grayPaintScale14.getUpperBound();
        double double20 = grayPaintScale14.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) 0);
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean19 = grayPaintScale11.equals((java.lang.Object) grayPaintScale18);
        java.lang.Object obj20 = grayPaintScale11.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean31 = grayPaintScale21.equals((java.lang.Object) grayPaintScale29);
        double double32 = grayPaintScale29.getLowerBound();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        double double34 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale29", grayPaintScale8.equals(grayPaintScale29) ? grayPaintScale8.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getUpperBound();
        java.lang.Object obj19 = grayPaintScale15.clone();
        double double20 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        java.lang.Object obj26 = grayPaintScale23.clone();
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale15", obj11.equals(grayPaintScale15) ? obj11.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj8 = grayPaintScale7.clone();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double12 = grayPaintScale7.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint27 = grayPaintScale17.getPaint(1.0d);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale24", grayPaintScale9.equals(grayPaintScale24) ? grayPaintScale9.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        double double11 = grayPaintScale7.getLowerBound();
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj12", grayPaintScale7.equals(obj12) ? grayPaintScale7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) 1);
        double double20 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 1);
        java.awt.Paint paint24 = grayPaintScale14.getPaint((double) 10);
        double double25 = grayPaintScale14.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj27 = grayPaintScale14.clone();
        double double28 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj27", grayPaintScale5.equals(obj27) ? grayPaintScale5.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double7 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) grayPaintScale10);
        double double20 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint25 = grayPaintScale21.getPaint((-1.0d));
        boolean boolean26 = grayPaintScale10.equals((java.lang.Object) paint25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double30 = grayPaintScale29.getLowerBound();
        double double31 = grayPaintScale29.getLowerBound();
        double double32 = grayPaintScale29.getUpperBound();
        boolean boolean33 = grayPaintScale10.equals((java.lang.Object) grayPaintScale29);
        double double34 = grayPaintScale10.getLowerBound();
        java.lang.Object obj35 = grayPaintScale10.clone();
        boolean boolean36 = grayPaintScale2.equals(obj35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale10", grayPaintScale6.equals(grayPaintScale10) ? grayPaintScale6.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        java.lang.Object obj23 = grayPaintScale19.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint(52.0d);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.awt.Paint paint12 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj15", obj5.equals(obj15) ? obj5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale8.getPaint((double) (byte) 1);
        java.lang.Object obj17 = grayPaintScale8.clone();
        double double18 = grayPaintScale8.getUpperBound();
        double double19 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 0.0d);
        java.lang.Object obj23 = grayPaintScale22.clone();
        boolean boolean24 = grayPaintScale8.equals(obj23);
        boolean boolean25 = grayPaintScale2.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj17", grayPaintScale8.equals(obj17) ? grayPaintScale8.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 10.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) boolean12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 100);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean19 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint21 = grayPaintScale17.getPaint(10.0d);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) '4');
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 100.0f);
        java.lang.Object obj26 = grayPaintScale25.clone();
        boolean boolean27 = grayPaintScale2.equals(obj26);
        double double28 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale25 and obj26", grayPaintScale25.equals(obj26) ? grayPaintScale25.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale33.getPaint(0.0d);
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean42 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        java.awt.Paint paint44 = grayPaintScale33.getPaint(97.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) 0L);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double19 = grayPaintScale12.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj13", obj8.equals(obj13) ? obj8.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double14 = grayPaintScale13.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale13.equals(obj15);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale13.getPaint(1.0d);
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale5.clone();
        double double15 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale18.clone();
        java.awt.Paint paint21 = grayPaintScale18.getPaint((double) (-1));
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale18.equals((java.lang.Object) grayPaintScale24);
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) grayPaintScale18);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj10", obj9.equals(obj10) ? obj9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint(35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass33 = grayPaintScale30.getClass();
        boolean boolean34 = grayPaintScale25.equals((java.lang.Object) grayPaintScale30);
        java.lang.Object obj35 = grayPaintScale25.clone();
        double double36 = grayPaintScale25.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale25.getPaint(0.0d);
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj18 and grayPaintScale30", obj18.equals(grayPaintScale30) ? obj18.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1L));
        boolean boolean27 = grayPaintScale12.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj28 = grayPaintScale12.clone();
        java.awt.Paint paint30 = grayPaintScale12.getPaint((double) 100);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double32 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj28", grayPaintScale12.equals(obj28) ? grayPaintScale12.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass12 = grayPaintScale8.getClass();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100L);
        java.lang.Object obj18 = grayPaintScale17.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj14", obj5.equals(obj14) ? obj5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.awt.Paint paint23 = grayPaintScale20.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.lang.Object obj9 = grayPaintScale6.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj9", grayPaintScale6.equals(obj9) ? grayPaintScale6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((-1.0d));
        java.lang.Object obj18 = grayPaintScale15.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj18", grayPaintScale15.equals(obj18) ? grayPaintScale15.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.lang.Class<?> wildcardClass11 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double9 = grayPaintScale8.getLowerBound();
        double double10 = grayPaintScale8.getUpperBound();
        java.lang.Object obj11 = grayPaintScale8.clone();
        double double12 = grayPaintScale8.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double14 = grayPaintScale8.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj8", obj6.equals(obj8) ? obj6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1.0f);
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (byte) -1);
        double double21 = grayPaintScale18.getLowerBound();
        double double22 = grayPaintScale18.getLowerBound();
        double double23 = grayPaintScale18.getUpperBound();
        double double24 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double28 = grayPaintScale27.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale27.getPaint((double) (short) 100);
        java.awt.Paint paint32 = grayPaintScale27.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double36 = grayPaintScale35.getLowerBound();
        boolean boolean37 = grayPaintScale27.equals((java.lang.Object) grayPaintScale35);
        java.awt.Paint paint39 = grayPaintScale35.getPaint(10.0d);
        boolean boolean40 = grayPaintScale18.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint42 = grayPaintScale18.getPaint(52.0d);
        java.lang.Object obj43 = grayPaintScale18.clone();
        double double44 = grayPaintScale18.getUpperBound();
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) double44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj43", grayPaintScale18.equals(obj43) ? grayPaintScale18.hashCode() == obj43.hashCode() : true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double27 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint((double) (short) 100);
        java.awt.Paint paint31 = grayPaintScale26.getPaint((double) (-1L));
        boolean boolean32 = grayPaintScale17.equals((java.lang.Object) grayPaintScale26);
        java.awt.Paint paint34 = grayPaintScale17.getPaint((double) ' ');
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and grayPaintScale17", obj10.equals(grayPaintScale17) ? obj10.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj17 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) 1.0f);
        double double20 = grayPaintScale16.getLowerBound();
        boolean boolean21 = grayPaintScale11.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj22 = grayPaintScale16.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and obj22", obj17.equals(obj22) ? obj17.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale2.equals(obj11);
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getLowerBound();
        java.lang.Object obj17 = grayPaintScale6.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj21 = grayPaintScale20.clone();
        java.awt.Paint paint23 = grayPaintScale20.getPaint(100.0d);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) '4');
        java.lang.Object obj26 = grayPaintScale20.clone();
        boolean boolean27 = grayPaintScale6.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) (-1.0d));
        double double20 = grayPaintScale15.getLowerBound();
        java.lang.Object obj21 = grayPaintScale15.clone();
        java.awt.Paint paint23 = grayPaintScale15.getPaint((double) 100.0f);
        java.awt.Paint paint25 = grayPaintScale15.getPaint((-1.0d));
        java.lang.Object obj26 = grayPaintScale15.clone();
        boolean boolean27 = grayPaintScale2.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj21", grayPaintScale15.equals(obj21) ? grayPaintScale15.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj8 = grayPaintScale7.clone();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale7.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 1L);
        double double21 = grayPaintScale2.getUpperBound();
        double double22 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double31 = grayPaintScale30.getLowerBound();
        double double32 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale30.getPaint((double) (byte) 10);
        boolean boolean36 = grayPaintScale30.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double40 = grayPaintScale39.getLowerBound();
        java.awt.Paint paint42 = grayPaintScale39.getPaint((double) (short) 100);
        boolean boolean43 = grayPaintScale30.equals((java.lang.Object) grayPaintScale39);
        boolean boolean44 = grayPaintScale25.equals((java.lang.Object) grayPaintScale30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint49 = grayPaintScale47.getPaint((double) (byte) -1);
        boolean boolean51 = grayPaintScale47.equals((java.lang.Object) 100L);
        double double52 = grayPaintScale47.getLowerBound();
        boolean boolean53 = grayPaintScale30.equals((java.lang.Object) double52);
        java.awt.Paint paint55 = grayPaintScale30.getPaint((double) 100.0f);
        double double56 = grayPaintScale30.getUpperBound();
        double double57 = grayPaintScale30.getUpperBound();
        boolean boolean58 = grayPaintScale2.equals((java.lang.Object) double57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale25", grayPaintScale13.equals(grayPaintScale25) ? grayPaintScale13.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        double double15 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double19 = grayPaintScale18.getLowerBound();
        boolean boolean20 = grayPaintScale7.equals((java.lang.Object) double19);
        double double21 = grayPaintScale7.getLowerBound();
        double double22 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale7.getPaint((double) 'a');
        double double25 = grayPaintScale7.getLowerBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 'a');
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) ' ');
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        java.lang.Object obj19 = grayPaintScale16.clone();
        double double20 = grayPaintScale16.getUpperBound();
        double double21 = grayPaintScale16.getUpperBound();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale16", grayPaintScale8.equals(grayPaintScale16) ? grayPaintScale8.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj14", obj10.equals(obj14) ? obj10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) (short) 0);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale10", obj5.equals(grayPaintScale10) ? obj5.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        double double19 = grayPaintScale16.getLowerBound();
        boolean boolean21 = grayPaintScale16.equals((java.lang.Object) 1);
        double double22 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) 1L);
        java.lang.Object obj25 = grayPaintScale16.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        java.lang.Object obj27 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj25", grayPaintScale16.equals(obj25) ? grayPaintScale16.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj15", obj11.equals(obj15) ? obj11.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj5", obj3.equals(obj5) ? obj3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getUpperBound();
        double double21 = grayPaintScale0.getLowerBound();
        java.lang.Object obj22 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass33 = grayPaintScale30.getClass();
        boolean boolean34 = grayPaintScale25.equals((java.lang.Object) grayPaintScale30);
        boolean boolean35 = grayPaintScale0.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale30", grayPaintScale7.equals(grayPaintScale30) ? grayPaintScale7.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getLowerBound();
        java.lang.Object obj17 = grayPaintScale6.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        java.lang.Object obj18 = grayPaintScale14.clone();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) 10L);
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 1);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint25 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj18", grayPaintScale14.equals(obj18) ? grayPaintScale14.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (short) 100);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean26 = grayPaintScale17.equals((java.lang.Object) grayPaintScale25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) 0);
        double double32 = grayPaintScale29.getUpperBound();
        double double33 = grayPaintScale29.getUpperBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale29.getClass();
        boolean boolean35 = grayPaintScale25.equals((java.lang.Object) grayPaintScale29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint40 = grayPaintScale38.getPaint((double) (short) 0);
        double double41 = grayPaintScale38.getUpperBound();
        java.awt.Paint paint43 = grayPaintScale38.getPaint(100.0d);
        double double44 = grayPaintScale38.getUpperBound();
        boolean boolean45 = grayPaintScale25.equals((java.lang.Object) double44);
        java.awt.Paint paint47 = grayPaintScale25.getPaint((double) (short) 0);
        boolean boolean48 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and grayPaintScale38", obj14.equals(grayPaintScale38) ? obj14.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint10 = grayPaintScale6.getPaint(0.0d);
        double double11 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint((double) (short) 100);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean23 = grayPaintScale14.equals((java.lang.Object) grayPaintScale22);
        java.lang.Object obj24 = grayPaintScale14.clone();
        boolean boolean25 = grayPaintScale6.equals(obj24);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj24", grayPaintScale14.equals(obj24) ? grayPaintScale14.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale10.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale22);
        double double28 = grayPaintScale22.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        double double30 = grayPaintScale22.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj8", obj6.equals(obj8) ? obj6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 10.0f);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        double double19 = grayPaintScale16.getLowerBound();
        boolean boolean21 = grayPaintScale16.equals((java.lang.Object) 1);
        double double22 = grayPaintScale16.getLowerBound();
        double double23 = grayPaintScale16.getLowerBound();
        double double24 = grayPaintScale16.getLowerBound();
        double double25 = grayPaintScale16.getUpperBound();
        java.lang.Object obj26 = grayPaintScale16.clone();
        boolean boolean27 = grayPaintScale5.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj26", obj8.equals(obj26) ? obj8.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        java.lang.Class<?> wildcardClass23 = grayPaintScale19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 'a');
        java.lang.Class<?> wildcardClass21 = paint20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (short) 100);
        java.awt.Paint paint22 = grayPaintScale17.getPaint(32.0d);
        double double23 = grayPaintScale17.getLowerBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint26 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale17", obj11.equals(grayPaintScale17) ? obj11.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) double10);
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double22 = grayPaintScale21.getUpperBound();
        double double23 = grayPaintScale21.getLowerBound();
        double double24 = grayPaintScale21.getUpperBound();
        boolean boolean25 = grayPaintScale18.equals((java.lang.Object) grayPaintScale21);
        double double26 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale18.getPaint((double) 10L);
        java.lang.Object obj29 = grayPaintScale18.clone();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj15", obj3.equals(obj15) ? obj3.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) '4');
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Object obj23 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj27 = grayPaintScale26.clone();
        boolean boolean29 = grayPaintScale26.equals((java.lang.Object) 1.0f);
        double double30 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj22 and obj23", obj22.equals(obj23) ? obj22.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) 10L);
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getLowerBound();
        double double21 = grayPaintScale14.getLowerBound();
        java.lang.Object obj22 = grayPaintScale14.clone();
        double double23 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (short) 0);
        double double29 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) 1);
        double double32 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale26.getPaint(1.0d);
        java.lang.Class<?> wildcardClass35 = grayPaintScale26.getClass();
        boolean boolean36 = grayPaintScale14.equals((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass38 = grayPaintScale14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj22 and obj37", obj22.equals(obj37) ? obj22.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 1);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) '4');
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint24 = grayPaintScale20.getPaint(0.0d);
        java.awt.Paint paint26 = grayPaintScale20.getPaint((double) 10L);
        java.awt.Paint paint28 = grayPaintScale20.getPaint((-1.0d));
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) paint28);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double33 = grayPaintScale32.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double37 = grayPaintScale36.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint42 = grayPaintScale40.getPaint((double) (short) 0);
        double double43 = grayPaintScale40.getUpperBound();
        boolean boolean45 = grayPaintScale40.equals((java.lang.Object) ' ');
        boolean boolean46 = grayPaintScale36.equals((java.lang.Object) boolean45);
        java.lang.Class<?> wildcardClass47 = grayPaintScale36.getClass();
        boolean boolean48 = grayPaintScale32.equals((java.lang.Object) wildcardClass47);
        boolean boolean49 = grayPaintScale13.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and grayPaintScale40", grayPaintScale20.equals(grayPaintScale40) ? grayPaintScale20.hashCode() == grayPaintScale40.hashCode() : true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        java.awt.Paint paint13 = grayPaintScale7.getPaint((-1.0d));
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) (-1L));
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj11", grayPaintScale7.equals(obj11) ? grayPaintScale7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        double double19 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale5.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = grayPaintScale24.equals(obj25);
        java.awt.Paint paint28 = grayPaintScale24.getPaint((double) 10.0f);
        double double29 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale24.getPaint((double) (short) 0);
        double double32 = grayPaintScale24.getUpperBound();
        boolean boolean33 = grayPaintScale5.equals((java.lang.Object) grayPaintScale24);
        double double34 = grayPaintScale24.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass17 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj16", obj6.equals(obj16) ? obj6.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 10);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj15", obj6.equals(obj15) ? obj6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 10.0d);
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) boolean16);
        java.lang.Object obj18 = grayPaintScale6.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double20 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj18", grayPaintScale6.equals(obj18) ? grayPaintScale6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 100);
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) 0);
        double double25 = grayPaintScale22.getUpperBound();
        double double26 = grayPaintScale22.getLowerBound();
        double double27 = grayPaintScale22.getUpperBound();
        java.lang.Object obj28 = grayPaintScale22.clone();
        java.awt.Paint paint30 = grayPaintScale22.getPaint(32.0d);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale22 and obj28", grayPaintScale22.equals(obj28) ? grayPaintScale22.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double9 = grayPaintScale8.getLowerBound();
        double double10 = grayPaintScale8.getUpperBound();
        java.lang.Object obj11 = grayPaintScale8.clone();
        double double12 = grayPaintScale8.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 100.0f);
        java.lang.Object obj17 = grayPaintScale14.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 100L);
        double double22 = grayPaintScale21.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj17", grayPaintScale14.equals(obj17) ? grayPaintScale14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj12", obj11.equals(obj12) ? obj11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass19 = grayPaintScale16.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) wildcardClass19);
        double double21 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double25 = grayPaintScale24.getLowerBound();
        double double26 = grayPaintScale24.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale24.getPaint((double) (byte) 10);
        boolean boolean30 = grayPaintScale24.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint32 = grayPaintScale24.getPaint((double) (byte) 1);
        double double33 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale24.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean40 = grayPaintScale38.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass41 = grayPaintScale38.getClass();
        boolean boolean42 = grayPaintScale24.equals((java.lang.Object) wildcardClass41);
        java.lang.Object obj43 = grayPaintScale24.clone();
        java.awt.Paint paint45 = grayPaintScale24.getPaint((double) '4');
        boolean boolean46 = grayPaintScale2.equals((java.lang.Object) paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale38", grayPaintScale16.equals(grayPaintScale38) ? grayPaintScale16.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) -1);
        double double23 = grayPaintScale2.getUpperBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.awt.Paint paint26 = grayPaintScale2.getPaint((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj24", obj9.equals(obj24) ? obj9.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1));
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (byte) -1);
        boolean boolean25 = grayPaintScale21.equals((java.lang.Object) 100L);
        double double26 = grayPaintScale21.getLowerBound();
        double double27 = grayPaintScale21.getUpperBound();
        boolean boolean28 = grayPaintScale18.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        java.awt.Paint paint31 = grayPaintScale18.getPaint(97.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 1);
        boolean boolean25 = grayPaintScale21.equals((java.lang.Object) 10L);
        java.awt.Paint paint27 = grayPaintScale21.getPaint((double) (byte) 100);
        boolean boolean28 = grayPaintScale5.equals((java.lang.Object) grayPaintScale21);
        double double29 = grayPaintScale21.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj19", obj9.equals(obj19) ? obj9.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(35.0d);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint14 = grayPaintScale10.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint19 = grayPaintScale17.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) 1);
        double double28 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale22.getPaint((double) 1L);
        java.lang.Object obj31 = grayPaintScale22.clone();
        double double32 = grayPaintScale22.getUpperBound();
        double double33 = grayPaintScale22.getUpperBound();
        double double34 = grayPaintScale22.getUpperBound();
        boolean boolean35 = grayPaintScale17.equals((java.lang.Object) grayPaintScale22);
        boolean boolean36 = grayPaintScale10.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale22 and obj31", grayPaintScale22.equals(obj31) ? grayPaintScale22.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) 0);
        boolean boolean22 = grayPaintScale16.equals((java.lang.Object) grayPaintScale19);
        double double23 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale16.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double29 = grayPaintScale28.getLowerBound();
        double double30 = grayPaintScale28.getUpperBound();
        java.awt.Paint paint32 = grayPaintScale28.getPaint((double) (byte) 10);
        boolean boolean33 = grayPaintScale16.equals((java.lang.Object) grayPaintScale28);
        double double34 = grayPaintScale16.getLowerBound();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) double34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj13", obj3.equals(obj13) ? obj3.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        double double27 = grayPaintScale24.getLowerBound();
        boolean boolean29 = grayPaintScale24.equals((java.lang.Object) 1);
        double double30 = grayPaintScale24.getLowerBound();
        double double31 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale24.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint38 = grayPaintScale36.getPaint(10.0d);
        boolean boolean39 = grayPaintScale24.equals((java.lang.Object) grayPaintScale36);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale24);
        java.awt.Paint paint42 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj18 and grayPaintScale24", obj18.equals(grayPaintScale24) ? obj18.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 1.0f);
        double double11 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        double double21 = grayPaintScale15.getLowerBound();
        java.lang.Object obj22 = grayPaintScale15.clone();
        double double23 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean28 = grayPaintScale15.equals((java.lang.Object) double27);
        java.awt.Paint paint30 = grayPaintScale15.getPaint((double) ' ');
        double double31 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale15.getPaint(0.0d);
        double double34 = grayPaintScale15.getLowerBound();
        double double35 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint40 = grayPaintScale38.getPaint((double) (short) 1);
        boolean boolean42 = grayPaintScale38.equals((java.lang.Object) 10L);
        java.awt.Paint paint44 = grayPaintScale38.getPaint((double) (short) -1);
        java.lang.Object obj45 = grayPaintScale38.clone();
        boolean boolean46 = grayPaintScale15.equals(obj45);
        boolean boolean47 = grayPaintScale7.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj22", grayPaintScale15.equals(obj22) ? grayPaintScale15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 1);
        boolean boolean25 = grayPaintScale21.equals((java.lang.Object) 10L);
        java.awt.Paint paint27 = grayPaintScale21.getPaint((double) (byte) 100);
        boolean boolean28 = grayPaintScale5.equals((java.lang.Object) grayPaintScale21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint33 = grayPaintScale31.getPaint(0.0d);
        java.awt.Paint paint35 = grayPaintScale31.getPaint((double) (-1.0f));
        boolean boolean36 = grayPaintScale21.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale18.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) boolean26);
        java.lang.Object obj28 = grayPaintScale2.clone();
        double double29 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and obj28", grayPaintScale24.equals(obj28) ? grayPaintScale24.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj8 = grayPaintScale7.clone();
        java.awt.Paint paint10 = grayPaintScale7.getPaint(100.0d);
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) '4');
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0L);
        java.awt.Paint paint16 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 0);
        boolean boolean31 = grayPaintScale23.equals((java.lang.Object) grayPaintScale28);
        boolean boolean32 = grayPaintScale20.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) (short) 0);
        double double38 = grayPaintScale35.getLowerBound();
        boolean boolean40 = grayPaintScale35.equals((java.lang.Object) 1);
        double double41 = grayPaintScale35.getLowerBound();
        java.awt.Paint paint43 = grayPaintScale35.getPaint((double) (byte) 1);
        java.lang.Object obj44 = grayPaintScale35.clone();
        double double45 = grayPaintScale35.getUpperBound();
        boolean boolean46 = grayPaintScale23.equals((java.lang.Object) grayPaintScale35);
        boolean boolean47 = grayPaintScale7.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale35", grayPaintScale2.equals(grayPaintScale35) ? grayPaintScale2.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean16 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (byte) 0);
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale21", grayPaintScale13.equals(grayPaintScale21) ? grayPaintScale13.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj4 = grayPaintScale3.clone();
        java.lang.Object obj5 = grayPaintScale3.clone();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint21 = grayPaintScale17.getPaint((-1.0d));
        boolean boolean22 = grayPaintScale6.equals((java.lang.Object) paint21);
        java.lang.Object obj23 = grayPaintScale6.clone();
        double double24 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        double double34 = grayPaintScale33.getLowerBound();
        java.lang.Object obj35 = grayPaintScale33.clone();
        boolean boolean36 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        double double37 = grayPaintScale33.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (-1));
        double double21 = grayPaintScale17.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj14", obj5.equals(obj14) ? obj5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) '#');
        java.lang.Class<?> wildcardClass18 = paint17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(32.0d);
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj13", obj8.equals(obj13) ? obj8.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Object obj21 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj20", obj9.equals(obj20) ? obj9.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double7 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint21 = grayPaintScale6.getPaint((double) '#');
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double23 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Class<?> wildcardClass10 = paint9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double18 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale17.getPaint((double) (short) 100);
        java.awt.Paint paint22 = grayPaintScale17.getPaint(32.0d);
        double double23 = grayPaintScale17.getLowerBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj28 = grayPaintScale27.clone();
        java.awt.Paint paint30 = grayPaintScale27.getPaint((double) (-1));
        java.lang.Object obj31 = grayPaintScale27.clone();
        boolean boolean32 = grayPaintScale2.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale17", obj11.equals(grayPaintScale17) ? obj11.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        double double12 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) ' ');
        java.awt.Paint paint16 = grayPaintScale5.getPaint((double) 1.0f);
        java.lang.Object obj17 = grayPaintScale5.clone();
        boolean boolean18 = grayPaintScale2.equals(obj17);
        java.lang.Object obj19 = null;
        boolean boolean20 = grayPaintScale2.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj17", grayPaintScale5.equals(obj17) ? grayPaintScale5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getUpperBound();
        java.lang.Object obj13 = grayPaintScale9.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale9.clone();
        double double16 = grayPaintScale9.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj15", obj13.equals(obj15) ? obj13.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 1.0d);
        double double18 = grayPaintScale17.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        double double20 = grayPaintScale17.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getUpperBound();
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', 100.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 100.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        java.awt.Paint paint19 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double23 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (-1L));
        double double28 = grayPaintScale22.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Object obj30 = grayPaintScale22.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) ' ');
        double double11 = grayPaintScale8.getLowerBound();
        double double12 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        double double25 = grayPaintScale21.getLowerBound();
        java.lang.Object obj26 = grayPaintScale21.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        double double28 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj26", grayPaintScale21.equals(obj26) ? grayPaintScale21.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) (byte) 10);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double20 = grayPaintScale14.getLowerBound();
        double double21 = grayPaintScale14.getLowerBound();
        java.lang.Object obj22 = grayPaintScale14.clone();
        double double23 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (short) 0);
        double double29 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale26.equals((java.lang.Object) 1);
        double double32 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale26.getPaint(1.0d);
        java.lang.Class<?> wildcardClass35 = grayPaintScale26.getClass();
        boolean boolean36 = grayPaintScale14.equals((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj22", grayPaintScale14.equals(obj22) ? grayPaintScale14.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100);
        java.lang.Object obj16 = grayPaintScale15.clone();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) grayPaintScale15);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj16", grayPaintScale15.equals(obj16) ? grayPaintScale15.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint(10.0d);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) ' ');
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 1.0f);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint22 = grayPaintScale18.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 0);
        double double28 = grayPaintScale25.getLowerBound();
        boolean boolean30 = grayPaintScale25.equals((java.lang.Object) 1);
        java.awt.Paint paint32 = grayPaintScale25.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean35 = grayPaintScale33.equals((java.lang.Object) 10.0d);
        boolean boolean36 = grayPaintScale25.equals((java.lang.Object) boolean35);
        boolean boolean37 = grayPaintScale18.equals((java.lang.Object) boolean36);
        double double38 = grayPaintScale18.getLowerBound();
        java.lang.Object obj39 = grayPaintScale18.clone();
        boolean boolean40 = grayPaintScale2.equals(obj39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj17", obj14.equals(obj17) ? obj14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        java.lang.Class<?> wildcardClass10 = grayPaintScale9.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) wildcardClass10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) 10L);
        boolean boolean32 = grayPaintScale14.equals((java.lang.Object) 10L);
        java.lang.Object obj33 = grayPaintScale14.clone();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj33", grayPaintScale23.equals(obj33) ? grayPaintScale23.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint(52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 0);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getUpperBound();
        double double17 = grayPaintScale12.getLowerBound();
        double double18 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale12.getPaint((double) (byte) 1);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double22 = grayPaintScale12.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale33.getPaint(0.0d);
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean42 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        java.lang.Class<?> wildcardClass43 = grayPaintScale33.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double15 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint(0.0d);
        java.lang.Object obj18 = grayPaintScale14.clone();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) 10L);
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) (byte) 1);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double24 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) -1);
        double double23 = grayPaintScale2.getUpperBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.lang.Object obj25 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj24", obj9.equals(obj24) ? obj9.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) 10.0d);
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = grayPaintScale7.clone();
        double double13 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale7.getPaint(0.0d);
        java.awt.Paint paint17 = grayPaintScale7.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) double26);
        double double28 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint((double) 10);
        boolean boolean31 = grayPaintScale7.equals((java.lang.Object) paint30);
        java.lang.Object obj32 = grayPaintScale7.clone();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj32", obj12.equals(obj32) ? obj12.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale10.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale22);
        double double28 = grayPaintScale22.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Object obj30 = grayPaintScale2.clone();
        java.lang.Object obj31 = null;
        boolean boolean32 = grayPaintScale2.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj30", obj7.equals(obj30) ? obj7.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj9 = grayPaintScale8.clone();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(100.0d);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) '4');
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0L);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 1.0f);
        double double11 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj13 = grayPaintScale7.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) (short) 10);
        boolean boolean24 = grayPaintScale7.equals((java.lang.Object) paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale16", grayPaintScale2.equals(grayPaintScale16) ? grayPaintScale2.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (-1));
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        boolean boolean25 = grayPaintScale10.equals((java.lang.Object) grayPaintScale19);
        java.lang.Object obj26 = grayPaintScale10.clone();
        java.awt.Paint paint28 = grayPaintScale10.getPaint((double) 100);
        double double29 = grayPaintScale10.getLowerBound();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint32 = grayPaintScale0.getPaint((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj26", grayPaintScale10.equals(obj26) ? grayPaintScale10.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        java.lang.Object obj20 = grayPaintScale17.clone();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = grayPaintScale17.equals(obj21);
        double double23 = grayPaintScale17.getUpperBound();
        double double24 = grayPaintScale17.getLowerBound();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj14", obj10.equals(obj14) ? obj10.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 1);
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) 10L);
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) 10L);
        double double28 = grayPaintScale15.getLowerBound();
        boolean boolean30 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint32 = grayPaintScale15.getPaint((double) 100L);
        java.awt.Paint paint34 = grayPaintScale15.getPaint((double) 0);
        boolean boolean35 = grayPaintScale7.equals((java.lang.Object) paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale18", grayPaintScale2.equals(grayPaintScale18) ? grayPaintScale2.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double7 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint21 = grayPaintScale6.getPaint((double) '#');
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double23 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale10", grayPaintScale6.equals(grayPaintScale10) ? grayPaintScale6.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 'a');
        double double20 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double26 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double30 = grayPaintScale29.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        double double36 = grayPaintScale33.getUpperBound();
        boolean boolean38 = grayPaintScale33.equals((java.lang.Object) ' ');
        boolean boolean39 = grayPaintScale29.equals((java.lang.Object) boolean38);
        java.lang.Class<?> wildcardClass40 = grayPaintScale29.getClass();
        boolean boolean41 = grayPaintScale25.equals((java.lang.Object) wildcardClass40);
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale33", obj9.equals(grayPaintScale33) ? obj9.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) ' ');
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double23 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (-1L));
        boolean boolean28 = grayPaintScale13.equals((java.lang.Object) grayPaintScale22);
        java.awt.Paint paint30 = grayPaintScale13.getPaint((double) (short) -1);
        double double31 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale13.getPaint((double) (byte) 100);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and grayPaintScale13", obj10.equals(grayPaintScale13) ? obj10.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 100);
        java.awt.Paint paint13 = grayPaintScale11.getPaint(100.0d);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Object obj21 = grayPaintScale18.clone();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) 10.0d);
        boolean boolean27 = grayPaintScale23.equals((java.lang.Object) (-1.0d));
        double double28 = grayPaintScale23.getLowerBound();
        java.lang.Object obj29 = grayPaintScale23.clone();
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) 100.0f);
        double double32 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale23.getPaint((double) (byte) 10);
        java.awt.Paint paint36 = grayPaintScale23.getPaint((double) '#');
        boolean boolean37 = grayPaintScale18.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj11 = grayPaintScale8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double14 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 1);
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) grayPaintScale17);
        double double27 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint32 = grayPaintScale28.getPaint((-1.0d));
        boolean boolean33 = grayPaintScale17.equals((java.lang.Object) paint32);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double37 = grayPaintScale36.getLowerBound();
        double double38 = grayPaintScale36.getLowerBound();
        double double39 = grayPaintScale36.getUpperBound();
        boolean boolean40 = grayPaintScale17.equals((java.lang.Object) grayPaintScale36);
        double double41 = grayPaintScale17.getLowerBound();
        java.lang.Object obj42 = grayPaintScale17.clone();
        boolean boolean43 = grayPaintScale2.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale17", grayPaintScale13.equals(grayPaintScale17) ? grayPaintScale13.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        java.lang.Object obj15 = grayPaintScale8.clone();
        double double16 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean21 = grayPaintScale8.equals((java.lang.Object) double20);
        java.awt.Paint paint23 = grayPaintScale8.getPaint((double) (-1));
        double double24 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale8.getPaint((double) 1L);
        double double27 = grayPaintScale8.getUpperBound();
        double double28 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale8.getPaint(97.0d);
        java.lang.Object obj31 = grayPaintScale8.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and obj31", obj15.equals(obj31) ? obj15.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) '4');
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) 100L);
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) grayPaintScale24);
        double double26 = grayPaintScale17.getLowerBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) 0);
        double double33 = grayPaintScale30.getUpperBound();
        double double34 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint36 = grayPaintScale30.getPaint(10.0d);
        double double37 = grayPaintScale30.getLowerBound();
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale30);
        java.lang.Class<?> wildcardClass39 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale30", grayPaintScale17.equals(grayPaintScale30) ? grayPaintScale17.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj13 = grayPaintScale12.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale5.equals(obj13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        double double24 = grayPaintScale21.getLowerBound();
        boolean boolean26 = grayPaintScale21.equals((java.lang.Object) 1);
        double double27 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) 10L);
        boolean boolean30 = grayPaintScale18.equals((java.lang.Object) 10L);
        double double31 = grayPaintScale18.getLowerBound();
        boolean boolean33 = grayPaintScale18.equals((java.lang.Object) 10.0d);
        double double34 = grayPaintScale18.getLowerBound();
        boolean boolean35 = grayPaintScale5.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        double double15 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale8.getPaint((double) ' ');
        java.awt.Paint paint19 = grayPaintScale8.getPaint((double) 1.0f);
        java.lang.Object obj20 = grayPaintScale8.clone();
        java.awt.Paint paint22 = grayPaintScale8.getPaint(0.0d);
        java.lang.Object obj23 = grayPaintScale8.clone();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj20 and obj23", obj20.equals(obj23) ? obj20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj15", obj6.equals(obj15) ? obj6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        java.awt.Paint paint17 = grayPaintScale10.getPaint((double) (short) 10);
        java.lang.Object obj18 = grayPaintScale10.clone();
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (-1.0f));
        double double26 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint(100.0d);
        boolean boolean29 = grayPaintScale10.equals((java.lang.Object) grayPaintScale23);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj18", grayPaintScale10.equals(obj18) ? grayPaintScale10.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj14 = grayPaintScale13.clone();
        java.lang.Object obj15 = grayPaintScale13.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj13", obj11.equals(obj13) ? obj11.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) (short) 10);
        java.lang.Object obj23 = grayPaintScale15.clone();
        java.awt.Paint paint25 = grayPaintScale15.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) (-1.0f));
        double double31 = grayPaintScale28.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint(100.0d);
        boolean boolean34 = grayPaintScale15.equals((java.lang.Object) grayPaintScale28);
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) 1);
        double double14 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale8.getPaint((double) (byte) 1);
        java.lang.Object obj17 = grayPaintScale8.clone();
        double double18 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale8.getPaint(0.0d);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint23 = grayPaintScale8.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint12 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (-1.0f));
        double double19 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getLowerBound();
        double double25 = grayPaintScale22.getUpperBound();
        double double26 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint32 = grayPaintScale22.getPaint(1.0d);
        boolean boolean33 = grayPaintScale15.equals((java.lang.Object) paint32);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj35 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getUpperBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) ' ');
        double double21 = grayPaintScale15.getLowerBound();
        double double22 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale15.getPaint((double) 100.0f);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale8.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 1.0f);
        double double11 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.lang.Object obj18 = grayPaintScale15.clone();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) 0);
        boolean boolean21 = grayPaintScale7.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        double double16 = grayPaintScale2.getLowerBound();
        double double17 = grayPaintScale2.getUpperBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        boolean boolean27 = grayPaintScale22.equals((java.lang.Object) 1);
        double double28 = grayPaintScale22.getLowerBound();
        double double29 = grayPaintScale22.getLowerBound();
        double double30 = grayPaintScale22.getLowerBound();
        double double31 = grayPaintScale22.getUpperBound();
        double double32 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((-1.0d));
        java.lang.Object obj38 = grayPaintScale35.clone();
        boolean boolean39 = grayPaintScale22.equals(obj38);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale35 and obj38", grayPaintScale35.equals(obj38) ? grayPaintScale35.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale13.getPaint((double) (byte) 1);
        java.lang.Object obj22 = grayPaintScale13.clone();
        double double23 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale13.getPaint((double) (byte) 100);
        boolean boolean26 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) '4', (double) 100);
        java.awt.Paint paint31 = grayPaintScale29.getPaint(0.0d);
        boolean boolean32 = grayPaintScale13.equals((java.lang.Object) grayPaintScale29);
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale10", obj5.equals(grayPaintScale10) ? obj5.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale33.getPaint(0.0d);
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean42 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        java.awt.Paint paint44 = grayPaintScale33.getPaint(52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj11 = grayPaintScale10.clone();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) 100);
        double double25 = grayPaintScale21.getLowerBound();
        double double26 = grayPaintScale21.getUpperBound();
        double double27 = grayPaintScale21.getLowerBound();
        boolean boolean28 = grayPaintScale16.equals((java.lang.Object) double27);
        double double29 = grayPaintScale16.getUpperBound();
        double double30 = grayPaintScale16.getLowerBound();
        boolean boolean31 = grayPaintScale10.equals((java.lang.Object) double30);
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj11", grayPaintScale10.equals(obj11) ? grayPaintScale10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj14", obj11.equals(obj14) ? obj11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean20 = grayPaintScale16.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint26 = grayPaintScale16.getPaint((double) (-1.0f));
        double double27 = grayPaintScale16.getUpperBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) double27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale23", grayPaintScale16.equals(grayPaintScale23) ? grayPaintScale16.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) (short) 10);
        double double14 = grayPaintScale6.getLowerBound();
        java.lang.Object obj15 = grayPaintScale6.clone();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint18 = grayPaintScale0.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj15", grayPaintScale6.equals(obj15) ? grayPaintScale6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double5 = grayPaintScale4.getLowerBound();
        double double6 = grayPaintScale4.getLowerBound();
        java.lang.Object obj7 = grayPaintScale4.clone();
        double double8 = grayPaintScale4.getUpperBound();
        double double9 = grayPaintScale4.getLowerBound();
        double double10 = grayPaintScale4.getLowerBound();
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale4);
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj7", grayPaintScale4.equals(obj7) ? grayPaintScale4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(10.0d);
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj12", obj5.equals(obj12) ? obj5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 10);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 10L);
        double double12 = grayPaintScale7.getUpperBound();
        java.lang.Object obj13 = grayPaintScale7.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale16.getPaint((double) 1L);
        double double21 = grayPaintScale16.getUpperBound();
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and grayPaintScale16", obj13.equals(grayPaintScale16) ? obj13.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        double double21 = grayPaintScale15.getLowerBound();
        double double22 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale15.getPaint((double) (-1));
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and grayPaintScale15", obj10.equals(grayPaintScale15) ? obj10.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test938");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) 0L);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass14 = grayPaintScale8.getClass();
        boolean boolean15 = grayPaintScale5.equals((java.lang.Object) wildcardClass14);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', 52.0d);
        java.lang.Object obj20 = grayPaintScale19.clone();
        double double21 = grayPaintScale19.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj20", grayPaintScale19.equals(obj20) ? grayPaintScale19.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test939");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint15 = grayPaintScale11.getPaint((double) 'a');
        double double16 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double20 = grayPaintScale19.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) ' ');
        boolean boolean29 = grayPaintScale19.equals((java.lang.Object) boolean28);
        java.lang.Object obj30 = grayPaintScale19.clone();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        java.lang.Class<?> wildcardClass32 = grayPaintScale19.getClass();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and grayPaintScale19", obj6.equals(grayPaintScale19) ? obj6.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test940");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = grayPaintScale7.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.lang.Object obj18 = grayPaintScale15.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale15", grayPaintScale7.equals(grayPaintScale15) ? grayPaintScale7.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test941");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, 32.0d);
        double double17 = grayPaintScale16.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj13", grayPaintScale9.equals(obj13) ? grayPaintScale9.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test942");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 52.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) '4');
        java.awt.Paint paint16 = grayPaintScale12.getPaint((double) 100L);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and grayPaintScale12", obj3.equals(grayPaintScale12) ? obj3.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test943");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) (short) 0);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double20 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test944");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        java.lang.Class<?> wildcardClass22 = grayPaintScale20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test945");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test946");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass20 = grayPaintScale19.getClass();
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) grayPaintScale19);
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) 1.0f);
        double double24 = grayPaintScale13.getLowerBound();
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale13.equals(obj25);
        java.awt.Paint paint28 = grayPaintScale13.getPaint((double) 1L);
        java.lang.Object obj29 = null;
        boolean boolean30 = grayPaintScale13.equals(obj29);
        java.lang.Object obj31 = grayPaintScale13.clone();
        boolean boolean32 = grayPaintScale2.equals(obj31);
        java.awt.Paint paint34 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj31", grayPaintScale13.equals(obj31) ? grayPaintScale13.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test947");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) '4');
        java.awt.Paint paint12 = grayPaintScale8.getPaint((double) 100L);
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) grayPaintScale24);
        double double26 = grayPaintScale17.getLowerBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint32 = grayPaintScale30.getPaint((double) 0);
        double double33 = grayPaintScale30.getUpperBound();
        double double34 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint36 = grayPaintScale30.getPaint(10.0d);
        double double37 = grayPaintScale30.getLowerBound();
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale30);
        java.awt.Paint paint40 = grayPaintScale30.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale8", grayPaintScale2.equals(grayPaintScale8) ? grayPaintScale2.hashCode() == grayPaintScale8.hashCode() : true);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test948");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (short) 100);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj18 = grayPaintScale8.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        java.lang.Object obj20 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj18", grayPaintScale8.equals(obj18) ? grayPaintScale8.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test949");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj14 = grayPaintScale13.clone();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(100.0d);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test950");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(32.0d);
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (short) 100);
        java.lang.Class<?> wildcardClass14 = paint13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test951");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) 10.0d);
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint((-1.0d));
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double19 = grayPaintScale11.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test952");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 10.0f);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test953");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) boolean28);
        double double30 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale33.getPaint(0.0d);
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((-1.0d));
        boolean boolean42 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        java.lang.Object obj43 = grayPaintScale33.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test954");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test955");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test956");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test957");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test958");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj8", obj7.equals(obj8) ? obj7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test959");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        double double15 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.lang.Object obj19 = grayPaintScale18.clone();
        boolean boolean20 = grayPaintScale2.equals(obj19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        java.lang.Object obj26 = grayPaintScale23.clone();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) (-1));
        double double29 = grayPaintScale23.getUpperBound();
        boolean boolean31 = grayPaintScale23.equals((java.lang.Object) 10L);
        java.awt.Paint paint33 = grayPaintScale23.getPaint((double) (byte) 1);
        double double34 = grayPaintScale23.getLowerBound();
        java.lang.Class<?> wildcardClass35 = grayPaintScale23.getClass();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale23", obj11.equals(grayPaintScale23) ? obj11.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test960");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        java.awt.Paint paint23 = grayPaintScale6.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale20", grayPaintScale2.equals(grayPaintScale20) ? grayPaintScale2.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test961");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 10);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj16 = grayPaintScale15.clone();
        double double17 = grayPaintScale15.getLowerBound();
        double double18 = grayPaintScale15.getLowerBound();
        java.lang.Object obj19 = grayPaintScale15.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj16 and obj19", obj16.equals(obj19) ? obj16.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test962");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 10L);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) double13);
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj16 and obj17", obj16.equals(obj17) ? obj16.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test963");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double17 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale16.getPaint((double) (short) 100);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (-1L));
        boolean boolean22 = grayPaintScale7.equals((java.lang.Object) grayPaintScale16);
        double double23 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale7.getPaint((double) '4');
        double double26 = grayPaintScale7.getUpperBound();
        java.lang.Object obj27 = grayPaintScale7.clone();
        double double28 = grayPaintScale7.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) double28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj27", grayPaintScale7.equals(obj27) ? grayPaintScale7.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test964");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale2.equals(obj9);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double16 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double20 = grayPaintScale19.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getUpperBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) ' ');
        boolean boolean29 = grayPaintScale19.equals((java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = grayPaintScale19.getClass();
        boolean boolean31 = grayPaintScale15.equals((java.lang.Object) wildcardClass30);
        java.awt.Paint paint33 = grayPaintScale15.getPaint((double) (short) 10);
        java.lang.Object obj34 = grayPaintScale15.clone();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        double double36 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj34", grayPaintScale15.equals(obj34) ? grayPaintScale15.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test965");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (-1));
        double double18 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale2.getPaint((double) 1L);
        double double21 = grayPaintScale2.getUpperBound();
        double double22 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale2.getPaint(97.0d);
        java.lang.Object obj25 = grayPaintScale2.clone();
        double double26 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj25", obj9.equals(obj25) ? obj9.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test966");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) (-1L));
        double double17 = grayPaintScale11.getUpperBound();
        double double18 = grayPaintScale11.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test967");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        double double22 = grayPaintScale20.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test968");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) 0);
        boolean boolean25 = grayPaintScale19.equals((java.lang.Object) grayPaintScale22);
        double double26 = grayPaintScale22.getLowerBound();
        double double27 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 10);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj15", grayPaintScale14.equals(obj15) ? grayPaintScale14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test969");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        double double15 = grayPaintScale13.getLowerBound();
        double double16 = grayPaintScale13.getLowerBound();
        java.lang.Class<?> wildcardClass17 = grayPaintScale13.getClass();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test970");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 0);
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale10.getPaint(10.0d);
        double double17 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) 1);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) (short) 10);
        double double28 = grayPaintScale20.getLowerBound();
        java.lang.Object obj29 = grayPaintScale20.clone();
        double double30 = grayPaintScale20.getLowerBound();
        boolean boolean31 = grayPaintScale10.equals((java.lang.Object) grayPaintScale20);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.awt.Paint paint34 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj29", grayPaintScale20.equals(obj29) ? grayPaintScale20.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test971");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj11", obj10.equals(obj11) ? obj10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test972");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) 1L);
        java.awt.Paint paint16 = grayPaintScale6.getPaint((double) (short) 10);
        double double17 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((-1.0d));
        java.lang.Object obj23 = grayPaintScale20.clone();
        boolean boolean24 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test973");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale2.equals(obj15);
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (-1));
        double double20 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        java.lang.Object obj26 = grayPaintScale23.clone();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) (-1));
        double double29 = grayPaintScale23.getUpperBound();
        boolean boolean31 = grayPaintScale23.equals((java.lang.Object) 10L);
        java.awt.Paint paint33 = grayPaintScale23.getPaint((double) (-1));
        double double34 = grayPaintScale23.getUpperBound();
        java.lang.Object obj35 = null;
        boolean boolean36 = grayPaintScale23.equals(obj35);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint44 = grayPaintScale42.getPaint((double) (byte) -1);
        boolean boolean46 = grayPaintScale42.equals((java.lang.Object) 100L);
        double double47 = grayPaintScale42.getLowerBound();
        double double48 = grayPaintScale42.getUpperBound();
        boolean boolean49 = grayPaintScale39.equals((java.lang.Object) grayPaintScale42);
        boolean boolean50 = grayPaintScale23.equals((java.lang.Object) grayPaintScale39);
        boolean boolean51 = grayPaintScale2.equals((java.lang.Object) grayPaintScale39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale23", obj9.equals(grayPaintScale23) ? obj9.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test974");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale0.getPaint((double) 0.0f);
        java.awt.Paint paint24 = grayPaintScale0.getPaint(10.0d);
        java.lang.Class<?> wildcardClass25 = paint24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test975");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test976");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = grayPaintScale2.equals(obj3);
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj9 = grayPaintScale8.clone();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (-1));
        boolean boolean13 = grayPaintScale8.equals((java.lang.Object) (-1L));
        double double14 = grayPaintScale8.getLowerBound();
        java.lang.Object obj15 = grayPaintScale8.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test977");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale11.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint20 = grayPaintScale11.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass21 = grayPaintScale11.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test978");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getUpperBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test979");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 100L);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (-1));
        double double10 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test980");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale7.equals((java.lang.Object) boolean17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) boolean18);
        double double20 = grayPaintScale0.getLowerBound();
        double double21 = grayPaintScale0.getUpperBound();
        java.lang.Object obj22 = grayPaintScale0.clone();
        double double23 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj22", grayPaintScale15.equals(obj22) ? grayPaintScale15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test981");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (-1.0f));
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass15 = grayPaintScale9.getClass();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass18 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test982");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(97.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test983");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 'a');
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) paint19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double27 = grayPaintScale26.getLowerBound();
        double double28 = grayPaintScale26.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint33 = grayPaintScale31.getPaint((double) 0);
        boolean boolean34 = grayPaintScale26.equals((java.lang.Object) grayPaintScale31);
        boolean boolean35 = grayPaintScale23.equals((java.lang.Object) grayPaintScale26);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint40 = grayPaintScale38.getPaint((double) (short) 0);
        double double41 = grayPaintScale38.getLowerBound();
        boolean boolean43 = grayPaintScale38.equals((java.lang.Object) 1);
        double double44 = grayPaintScale38.getLowerBound();
        java.awt.Paint paint46 = grayPaintScale38.getPaint((double) (byte) 1);
        java.lang.Object obj47 = grayPaintScale38.clone();
        double double48 = grayPaintScale38.getUpperBound();
        boolean boolean49 = grayPaintScale26.equals((java.lang.Object) grayPaintScale38);
        boolean boolean50 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale38", obj9.equals(grayPaintScale38) ? obj9.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test984");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 0);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) grayPaintScale8);
        double double12 = grayPaintScale5.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale17.getPaint((double) (byte) 10);
        boolean boolean22 = grayPaintScale5.equals((java.lang.Object) grayPaintScale17);
        double double23 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale5.getPaint((double) (-1L));
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) (short) 0);
        java.lang.Object obj32 = grayPaintScale29.clone();
        double double33 = grayPaintScale29.getUpperBound();
        boolean boolean35 = grayPaintScale29.equals((java.lang.Object) 100);
        java.awt.Paint paint37 = grayPaintScale29.getPaint((double) (byte) 10);
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        java.lang.Object obj39 = grayPaintScale29.clone();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale29 and obj32", grayPaintScale29.equals(obj32) ? grayPaintScale29.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test985");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double16 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale19.equals((java.lang.Object) 0L);
        double double23 = grayPaintScale19.getUpperBound();
        boolean boolean24 = grayPaintScale6.equals((java.lang.Object) grayPaintScale19);
        java.awt.Paint paint26 = grayPaintScale19.getPaint((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test986");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale0.getPaint(10.0d);
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.awt.Paint paint14 = grayPaintScale0.getPaint((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj12", obj5.equals(obj12) ? obj5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test987");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (-1.0f));
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass15 = grayPaintScale9.getClass();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }
}

