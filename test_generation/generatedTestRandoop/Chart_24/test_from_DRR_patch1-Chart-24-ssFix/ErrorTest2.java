import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 32.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double19 = grayPaintScale18.getUpperBound();
        java.lang.Object obj20 = grayPaintScale18.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((-1.0d));
        java.awt.Paint paint28 = grayPaintScale24.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double32 = grayPaintScale31.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) (short) 0);
        double double38 = grayPaintScale35.getUpperBound();
        boolean boolean40 = grayPaintScale35.equals((java.lang.Object) ' ');
        boolean boolean41 = grayPaintScale31.equals((java.lang.Object) boolean40);
        java.lang.Object obj42 = grayPaintScale31.clone();
        boolean boolean43 = grayPaintScale24.equals((java.lang.Object) grayPaintScale31);
        java.lang.Class<?> wildcardClass44 = grayPaintScale31.getClass();
        boolean boolean45 = grayPaintScale18.equals((java.lang.Object) wildcardClass44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale31 and obj42", grayPaintScale31.equals(obj42) ? grayPaintScale31.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
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
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) (-1.0f));
        double double30 = grayPaintScale21.getLowerBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10L);
        java.awt.Paint paint36 = grayPaintScale34.getPaint((double) (-1L));
        boolean boolean37 = grayPaintScale21.equals((java.lang.Object) paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
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
        java.awt.Paint paint47 = grayPaintScale16.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj21 and obj45", obj21.equals(obj45) ? obj21.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double12 = grayPaintScale11.getUpperBound();
        java.lang.Object obj13 = grayPaintScale11.clone();
        boolean boolean14 = grayPaintScale2.equals(obj13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getLowerBound();
        java.lang.Object obj20 = grayPaintScale17.clone();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 0);
        double double23 = grayPaintScale17.getUpperBound();
        double double24 = grayPaintScale17.getUpperBound();
        double double25 = grayPaintScale17.getUpperBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj13", grayPaintScale11.equals(obj13) ? grayPaintScale11.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        java.awt.Paint paint19 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getUpperBound();
        double double26 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint30 = grayPaintScale22.getPaint((double) 1);
        double double31 = grayPaintScale22.getUpperBound();
        double double32 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj36 = grayPaintScale35.clone();
        java.awt.Paint paint38 = grayPaintScale35.getPaint((double) (-1));
        boolean boolean40 = grayPaintScale35.equals((java.lang.Object) (-1L));
        double double41 = grayPaintScale35.getUpperBound();
        java.awt.Paint paint43 = grayPaintScale35.getPaint((double) 0);
        boolean boolean44 = grayPaintScale22.equals((java.lang.Object) grayPaintScale35);
        java.lang.Object obj45 = grayPaintScale35.clone();
        boolean boolean46 = grayPaintScale2.equals(obj45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale35 and obj36", grayPaintScale35.equals(obj36) ? grayPaintScale35.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(35.0d);
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        double double15 = grayPaintScale7.getLowerBound();
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) 0);
        double double21 = grayPaintScale18.getUpperBound();
        double double22 = grayPaintScale18.getLowerBound();
        double double23 = grayPaintScale18.getUpperBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 10L);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) '4');
        java.awt.Paint paint31 = grayPaintScale27.getPaint(100.0d);
        java.lang.Object obj32 = grayPaintScale27.clone();
        boolean boolean33 = grayPaintScale18.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) 100.0f);
        double double30 = grayPaintScale29.getUpperBound();
        boolean boolean31 = grayPaintScale15.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale29", grayPaintScale2.equals(grayPaintScale29) ? grayPaintScale2.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        double double16 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj19", obj11.equals(obj19) ? obj11.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) -1);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) 100L);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 1);
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (byte) 1);
        java.lang.Object obj27 = grayPaintScale18.clone();
        double double28 = grayPaintScale18.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale18.getPaint(0.0d);
        double double31 = grayPaintScale18.getUpperBound();
        double double32 = grayPaintScale18.getUpperBound();
        java.lang.Object obj33 = grayPaintScale18.clone();
        boolean boolean34 = grayPaintScale2.equals(obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj27", grayPaintScale18.equals(obj27) ? grayPaintScale18.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (byte) -1);
        double double15 = grayPaintScale12.getLowerBound();
        double double16 = grayPaintScale12.getLowerBound();
        double double17 = grayPaintScale12.getUpperBound();
        java.lang.Object obj18 = grayPaintScale12.clone();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj18", grayPaintScale12.equals(obj18) ? grayPaintScale12.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean17 = grayPaintScale7.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint19 = grayPaintScale7.getPaint((double) (short) 0);
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) paint19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double24 = grayPaintScale23.getUpperBound();
        double double25 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) (short) 0);
        double double31 = grayPaintScale28.getLowerBound();
        boolean boolean33 = grayPaintScale28.equals((java.lang.Object) 1);
        double double34 = grayPaintScale28.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double38 = grayPaintScale37.getLowerBound();
        java.awt.Paint paint40 = grayPaintScale37.getPaint((double) (short) 100);
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) (-1L));
        boolean boolean43 = grayPaintScale28.equals((java.lang.Object) grayPaintScale37);
        double double44 = grayPaintScale28.getUpperBound();
        java.lang.Class<?> wildcardClass45 = grayPaintScale28.getClass();
        boolean boolean46 = grayPaintScale23.equals((java.lang.Object) grayPaintScale28);
        boolean boolean47 = grayPaintScale0.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale37", grayPaintScale7.equals(grayPaintScale37) ? grayPaintScale7.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) (byte) 10);
        java.awt.Paint paint12 = grayPaintScale6.getPaint((double) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale6.equals(obj13);
        java.awt.Paint paint16 = grayPaintScale6.getPaint((double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double20 = grayPaintScale19.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint29 = grayPaintScale27.getPaint((double) (short) 0);
        double double30 = grayPaintScale27.getUpperBound();
        boolean boolean32 = grayPaintScale27.equals((java.lang.Object) ' ');
        boolean boolean33 = grayPaintScale23.equals((java.lang.Object) boolean32);
        java.lang.Class<?> wildcardClass34 = grayPaintScale23.getClass();
        boolean boolean35 = grayPaintScale19.equals((java.lang.Object) wildcardClass34);
        java.awt.Paint paint37 = grayPaintScale19.getPaint((double) (short) 10);
        java.lang.Object obj38 = grayPaintScale19.clone();
        boolean boolean39 = grayPaintScale6.equals((java.lang.Object) grayPaintScale19);
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale19 and obj38", grayPaintScale19.equals(obj38) ? grayPaintScale19.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale15.getPaint((double) 0L);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        java.awt.Paint paint30 = grayPaintScale23.getPaint((double) (short) 10);
        java.lang.Object obj31 = grayPaintScale23.clone();
        java.awt.Paint paint33 = grayPaintScale23.getPaint((double) (short) 1);
        java.awt.Paint paint35 = grayPaintScale23.getPaint((double) (short) 0);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj31", obj11.equals(obj31) ? obj11.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj8", obj7.equals(obj8) ? obj7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
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
        java.awt.Paint paint24 = grayPaintScale15.getPaint(0.0d);
        java.lang.Object obj25 = grayPaintScale15.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) (short) 0);
        double double31 = grayPaintScale28.getLowerBound();
        boolean boolean33 = grayPaintScale28.equals((java.lang.Object) 1);
        double double34 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale28.getPaint((double) (byte) 1);
        java.awt.Paint paint38 = grayPaintScale28.getPaint((double) 10);
        double double39 = grayPaintScale28.getLowerBound();
        boolean boolean40 = grayPaintScale15.equals((java.lang.Object) double39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale28", grayPaintScale5.equals(grayPaintScale28) ? grayPaintScale5.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double27 = grayPaintScale26.getLowerBound();
        double double28 = grayPaintScale26.getLowerBound();
        java.lang.Object obj29 = grayPaintScale26.clone();
        java.awt.Paint paint31 = grayPaintScale26.getPaint((double) 0);
        double double32 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale26.getPaint((double) (byte) 100);
        boolean boolean35 = grayPaintScale12.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale26", grayPaintScale2.equals(grayPaintScale26) ? grayPaintScale2.hashCode() == grayPaintScale26.hashCode() : true);
    }
}

