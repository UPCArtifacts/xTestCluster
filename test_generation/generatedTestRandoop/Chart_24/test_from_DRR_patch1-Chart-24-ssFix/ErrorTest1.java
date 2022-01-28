import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj7", obj5.equals(obj7) ? obj5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 10);
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 52.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.lang.Object obj8 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 1.0d);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Object obj2 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass3 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj2", obj1.equals(obj2) ? obj1.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(32.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj5", obj3.equals(obj5) ? obj3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(35.0d);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj4 = grayPaintScale3.clone();
        java.lang.Object obj5 = grayPaintScale3.clone();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) 100);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(97.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj15", grayPaintScale14.equals(obj15) ? grayPaintScale14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1));
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj14", obj5.equals(obj14) ? obj5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        double double18 = grayPaintScale15.getUpperBound();
        double double19 = grayPaintScale15.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean23 = grayPaintScale15.equals((java.lang.Object) (short) 0);
        java.lang.Object obj24 = grayPaintScale15.clone();
        double double25 = grayPaintScale15.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj27 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((-1.0d));
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Class<?> wildcardClass17 = grayPaintScale10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double7 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (short) 100);
        java.awt.Paint paint11 = grayPaintScale6.getPaint(32.0d);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 35.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) grayPaintScale17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) (short) -1);
        boolean boolean29 = grayPaintScale17.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass30 = grayPaintScale17.getClass();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) wildcardClass30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double35 = grayPaintScale34.getLowerBound();
        double double36 = grayPaintScale34.getUpperBound();
        java.awt.Paint paint38 = grayPaintScale34.getPaint((double) 10L);
        double double39 = grayPaintScale34.getUpperBound();
        double double40 = grayPaintScale34.getLowerBound();
        java.awt.Paint paint42 = grayPaintScale34.getPaint((double) (byte) 10);
        java.lang.Object obj43 = grayPaintScale34.clone();
        double double44 = grayPaintScale34.getUpperBound();
        double double45 = grayPaintScale34.getUpperBound();
        java.lang.Object obj46 = grayPaintScale34.clone();
        boolean boolean47 = grayPaintScale2.equals(obj46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale22 and grayPaintScale34", grayPaintScale22.equals(grayPaintScale34) ? grayPaintScale22.hashCode() == grayPaintScale34.hashCode() : true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        java.awt.Paint paint26 = grayPaintScale17.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.awt.Paint paint15 = grayPaintScale0.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
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
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj7", grayPaintScale4.equals(obj7) ? grayPaintScale4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double18 = grayPaintScale17.getUpperBound();
        double double19 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getLowerBound();
        double double30 = grayPaintScale23.getLowerBound();
        double double31 = grayPaintScale23.getUpperBound();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) double31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale23", obj5.equals(grayPaintScale23) ? obj5.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) 10);
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Class<?> wildcardClass23 = grayPaintScale22.getClass();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(32.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (byte) -1);
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (-1.0f));
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) double16);
        java.lang.Object obj18 = grayPaintScale6.clone();
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) 32.0d);
        java.lang.Object obj21 = grayPaintScale6.clone();
        boolean boolean22 = grayPaintScale2.equals(obj21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj18", grayPaintScale6.equals(obj18) ? grayPaintScale6.hashCode() == obj18.hashCode() : true);
    }
}

