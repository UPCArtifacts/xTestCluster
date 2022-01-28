import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        java.lang.Object obj11 = grayPaintScale7.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        java.lang.Object obj17 = grayPaintScale13.clone();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale7.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Class<?> wildcardClass12 = grayPaintScale7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) (-1));
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) paint12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        java.lang.Object obj14 = grayPaintScale11.clone();
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1));
        double double17 = grayPaintScale11.getUpperBound();
        boolean boolean19 = grayPaintScale11.equals((java.lang.Object) 10L);
        java.awt.Paint paint21 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj14", grayPaintScale11.equals(obj14) ? grayPaintScale11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        java.lang.Object obj15 = grayPaintScale12.clone();
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) grayPaintScale12);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj15", grayPaintScale12.equals(obj15) ? grayPaintScale12.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj21 = grayPaintScale20.clone();
        java.awt.Paint paint23 = grayPaintScale20.getPaint((double) (-1));
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) (-1L));
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 100.0f);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj21", grayPaintScale20.equals(obj21) ? grayPaintScale20.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj9 = grayPaintScale8.clone();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(100.0d);
        java.lang.Object obj12 = grayPaintScale8.clone();
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = grayPaintScale15.equals(obj16);
        boolean boolean18 = grayPaintScale9.equals(obj16);
        boolean boolean19 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Class<?> wildcardClass8 = grayPaintScale7.getClass();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        java.lang.Object obj17 = grayPaintScale14.clone();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (-1));
        double double20 = grayPaintScale14.getUpperBound();
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double26 = grayPaintScale25.getUpperBound();
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) double26);
        boolean boolean28 = grayPaintScale7.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj21 = grayPaintScale20.clone();
        boolean boolean22 = grayPaintScale2.equals(obj21);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 0);
        java.awt.Paint paint29 = grayPaintScale25.getPaint((double) 10.0f);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj21", grayPaintScale20.equals(obj21) ? grayPaintScale20.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj21 = grayPaintScale20.clone();
        boolean boolean22 = grayPaintScale2.equals(obj21);
        double double23 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj21", grayPaintScale20.equals(obj21) ? grayPaintScale20.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj18 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.lang.Object obj21 = grayPaintScale18.clone();
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = grayPaintScale18.equals(obj22);
        java.lang.Class<?> wildcardClass24 = grayPaintScale18.getClass();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj21", grayPaintScale18.equals(obj21) ? grayPaintScale18.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double12 = grayPaintScale7.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = grayPaintScale17.equals(obj18);
        boolean boolean20 = grayPaintScale11.equals(obj18);
        boolean boolean21 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale11", obj5.equals(grayPaintScale11) ? obj5.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) 10.0d);
        boolean boolean10 = grayPaintScale6.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = grayPaintScale6.clone();
        java.lang.Object obj12 = grayPaintScale6.clone();
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double13 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale14.equals((java.lang.Object) (-1.0d));
        double double19 = grayPaintScale14.getLowerBound();
        java.lang.Object obj20 = grayPaintScale14.clone();
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) 100.0f);
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj20", grayPaintScale14.equals(obj20) ? grayPaintScale14.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.lang.Object obj16 = grayPaintScale9.clone();
        double double17 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj16", grayPaintScale9.equals(obj16) ? grayPaintScale9.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (-1));
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj19 = grayPaintScale18.clone();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) grayPaintScale18);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj19", grayPaintScale18.equals(obj19) ? grayPaintScale18.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(35.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale5.equals((java.lang.Object) 1);
        double double11 = grayPaintScale5.getLowerBound();
        java.lang.Object obj12 = grayPaintScale5.clone();
        double double13 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) double17);
        double double19 = grayPaintScale5.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale5.getClass();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj12", grayPaintScale5.equals(obj12) ? grayPaintScale5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double21 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale20.getPaint((double) (short) 100);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) (-1L));
        boolean boolean26 = grayPaintScale11.equals((java.lang.Object) grayPaintScale20);
        java.awt.Paint paint28 = grayPaintScale11.getPaint((double) (byte) 0);
        boolean boolean30 = grayPaintScale11.equals((java.lang.Object) (byte) 1);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        java.lang.Object obj16 = grayPaintScale13.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj16", grayPaintScale13.equals(obj16) ? grayPaintScale13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale12", obj9.equals(grayPaintScale12) ? obj9.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale8.equals(obj9);
        boolean boolean11 = grayPaintScale2.equals(obj9);
        java.lang.Class<?> wildcardClass12 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint24 = grayPaintScale20.getPaint(0.0d);
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and grayPaintScale20", grayPaintScale15.equals(grayPaintScale20) ? grayPaintScale15.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = grayPaintScale2.equals(obj18);
        java.awt.Paint paint22 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj18", grayPaintScale17.equals(obj18) ? grayPaintScale17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj5", obj3.equals(obj5) ? obj3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        double double17 = grayPaintScale14.getUpperBound();
        java.lang.Object obj18 = grayPaintScale14.clone();
        double double19 = grayPaintScale14.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale14", grayPaintScale8.equals(grayPaintScale14) ? grayPaintScale8.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        java.lang.Object obj15 = grayPaintScale6.clone();
        double double16 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale6.getPaint((double) (byte) 100);
        boolean boolean19 = grayPaintScale3.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj20 = grayPaintScale6.clone();
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and obj20", obj15.equals(obj20) ? obj15.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        boolean boolean17 = grayPaintScale7.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        java.lang.Class<?> wildcardClass20 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj18", grayPaintScale12.equals(obj18) ? grayPaintScale12.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = grayPaintScale7.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj14", obj12.equals(obj14) ? obj12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) wildcardClass9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) (short) 10);
        java.lang.Object obj21 = grayPaintScale13.clone();
        java.lang.Object obj22 = grayPaintScale13.clone();
        boolean boolean23 = grayPaintScale2.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj21", grayPaintScale13.equals(obj21) ? grayPaintScale13.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj9", obj3.equals(obj9) ? obj3.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.lang.Object obj17 = grayPaintScale10.clone();
        double double18 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) 10);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj17", grayPaintScale10.equals(obj17) ? grayPaintScale10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
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
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint(100.0d);
        java.lang.Class<?> wildcardClass15 = grayPaintScale11.getClass();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 10);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double16 = grayPaintScale13.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale11.getPaint((double) 10L);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double33 = grayPaintScale32.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale32.getPaint((double) (short) 100);
        java.awt.Paint paint37 = grayPaintScale32.getPaint((double) (-1L));
        boolean boolean38 = grayPaintScale23.equals((java.lang.Object) grayPaintScale32);
        java.awt.Paint paint40 = grayPaintScale23.getPaint((double) (byte) 0);
        boolean boolean41 = grayPaintScale2.equals((java.lang.Object) paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and grayPaintScale23", grayPaintScale11.equals(grayPaintScale23) ? grayPaintScale11.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        java.lang.Object obj11 = grayPaintScale8.clone();
        java.awt.Paint paint13 = grayPaintScale8.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint19 = grayPaintScale8.getPaint((double) '#');
        double double20 = grayPaintScale8.getUpperBound();
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        java.lang.Object obj16 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.lang.Object obj18 = grayPaintScale15.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) ' ');
        double double24 = grayPaintScale21.getLowerBound();
        double double25 = grayPaintScale21.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale21.getClass();
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) wildcardClass26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj18", grayPaintScale15.equals(obj18) ? grayPaintScale15.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        double double22 = grayPaintScale8.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj18", grayPaintScale12.equals(obj18) ? grayPaintScale12.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double16 = grayPaintScale13.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale15", obj5.equals(grayPaintScale15) ? obj5.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getUpperBound();
        double double27 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale23.getPaint((double) (short) 100);
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) 1);
        boolean boolean32 = grayPaintScale18.equals((java.lang.Object) 1);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale23", grayPaintScale6.equals(grayPaintScale23) ? grayPaintScale6.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint14 = grayPaintScale12.getPaint(10.0d);
        java.awt.Paint paint16 = grayPaintScale12.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale12.equals((java.lang.Object) grayPaintScale27);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getLowerBound();
        double double28 = grayPaintScale25.getUpperBound();
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) grayPaintScale25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = grayPaintScale32.equals(obj33);
        java.awt.Paint paint36 = grayPaintScale32.getPaint((double) 10.0f);
        java.lang.Object obj37 = grayPaintScale32.clone();
        boolean boolean38 = grayPaintScale25.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        double double22 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj17", grayPaintScale8.equals(obj17) ? grayPaintScale8.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj5", obj3.equals(obj5) ? obj3.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        java.lang.Class<?> wildcardClass18 = paint17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        double double22 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj17", grayPaintScale8.equals(obj17) ? grayPaintScale8.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        double double20 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj14", obj11.equals(obj14) ? obj11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj13 = grayPaintScale5.clone();
        double double14 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj13", obj8.equals(obj13) ? obj8.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double12 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1.0f));
        double double15 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        double double21 = grayPaintScale18.getUpperBound();
        double double22 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean26 = grayPaintScale18.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint28 = grayPaintScale18.getPaint(1.0d);
        boolean boolean29 = grayPaintScale11.equals((java.lang.Object) paint28);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale18", obj5.equals(grayPaintScale18) ? obj5.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.awt.Paint paint17 = grayPaintScale5.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj12", obj11.equals(obj12) ? obj11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint17 = grayPaintScale13.getPaint(0.0d);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 1);
        double double24 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale18.getPaint((double) (byte) 1);
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) grayPaintScale18);
        java.awt.Paint paint29 = grayPaintScale18.getPaint((double) 100);
        double double30 = grayPaintScale18.getUpperBound();
        java.lang.Class<?> wildcardClass31 = grayPaintScale18.getClass();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale14", obj11.equals(grayPaintScale14) ? obj11.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        double double18 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale15", obj5.equals(grayPaintScale15) ? obj5.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj13 = grayPaintScale12.clone();
        double double14 = grayPaintScale12.getLowerBound();
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (-1.0f));
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        double double27 = grayPaintScale24.getLowerBound();
        boolean boolean29 = grayPaintScale24.equals((java.lang.Object) 1);
        double double30 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint32 = grayPaintScale24.getPaint((double) (byte) 1);
        double double33 = grayPaintScale24.getUpperBound();
        java.lang.Class<?> wildcardClass34 = grayPaintScale24.getClass();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) wildcardClass34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and grayPaintScale24", grayPaintScale15.equals(grayPaintScale24) ? grayPaintScale15.hashCode() == grayPaintScale24.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        java.lang.Object obj16 = grayPaintScale13.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        java.lang.Class<?> wildcardClass18 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj16", grayPaintScale13.equals(obj16) ? grayPaintScale13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj6", obj4.equals(obj6) ? obj4.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) (byte) 1);
        java.awt.Paint paint19 = grayPaintScale9.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale22.getClass();
        boolean boolean27 = grayPaintScale9.equals((java.lang.Object) grayPaintScale22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double31 = grayPaintScale30.getLowerBound();
        double double32 = grayPaintScale30.getUpperBound();
        java.lang.Object obj33 = grayPaintScale30.clone();
        boolean boolean34 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale30 and obj33", grayPaintScale30.equals(obj33) ? grayPaintScale30.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale10.clone();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (-1));
        java.lang.Class<?> wildcardClass14 = grayPaintScale10.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj11", grayPaintScale10.equals(obj11) ? grayPaintScale10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(100.0d);
        java.lang.Object obj13 = grayPaintScale9.clone();
        boolean boolean14 = grayPaintScale2.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = null;
        boolean boolean7 = grayPaintScale2.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.lang.Object obj22 = grayPaintScale8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = grayPaintScale2.equals(obj6);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) 1);
        double double17 = grayPaintScale11.getLowerBound();
        java.lang.Object obj18 = grayPaintScale11.clone();
        double double19 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean24 = grayPaintScale11.equals((java.lang.Object) double23);
        double double25 = grayPaintScale11.getLowerBound();
        double double26 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale11.getPaint((double) 'a');
        double double29 = grayPaintScale11.getLowerBound();
        double double30 = grayPaintScale11.getUpperBound();
        java.lang.Object obj31 = grayPaintScale11.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj18 and obj31", obj18.equals(obj31) ? obj18.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        double double16 = grayPaintScale9.getLowerBound();
        java.lang.Object obj17 = grayPaintScale9.clone();
        double double18 = grayPaintScale9.getUpperBound();
        double double19 = grayPaintScale9.getLowerBound();
        double double20 = grayPaintScale9.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint13 = grayPaintScale7.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Object obj23 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj22", obj9.equals(obj22) ? obj9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj11", obj10.equals(obj11) ? obj10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) double18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        java.awt.Paint paint17 = grayPaintScale10.getPaint((double) (short) 10);
        java.lang.Object obj18 = grayPaintScale10.clone();
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj18", grayPaintScale10.equals(obj18) ? grayPaintScale10.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = grayPaintScale2.equals(obj18);
        double double21 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj18", grayPaintScale17.equals(obj18) ? grayPaintScale17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getUpperBound();
        java.lang.Object obj26 = grayPaintScale23.clone();
        boolean boolean27 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        double double28 = grayPaintScale15.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj26", grayPaintScale23.equals(obj26) ? grayPaintScale23.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) 1.0f);
        double double11 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) double15);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and grayPaintScale14", obj4.equals(grayPaintScale14) ? obj4.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) 100.0f);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale12.getPaint((double) (byte) 1);
        boolean boolean21 = grayPaintScale8.equals((java.lang.Object) grayPaintScale12);
        java.awt.Paint paint23 = grayPaintScale12.getPaint((double) 100);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and grayPaintScale12", grayPaintScale8.equals(grayPaintScale12) ? grayPaintScale8.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        java.lang.Class<?> wildcardClass23 = paint21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        java.lang.Object obj16 = grayPaintScale13.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj16", grayPaintScale13.equals(obj16) ? grayPaintScale13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj6", obj3.equals(obj6) ? obj3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj22", obj9.equals(obj22) ? obj9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale11.equals((java.lang.Object) grayPaintScale17);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale11", obj5.equals(grayPaintScale11) ? obj5.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        java.lang.Object obj11 = grayPaintScale8.clone();
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1));
        double double14 = grayPaintScale8.getUpperBound();
        boolean boolean16 = grayPaintScale8.equals((java.lang.Object) 10L);
        java.awt.Paint paint18 = grayPaintScale8.getPaint((double) (byte) 1);
        java.awt.Paint paint20 = grayPaintScale8.getPaint((double) (byte) 100);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        java.lang.Object obj9 = grayPaintScale5.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
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
        java.awt.Paint paint28 = grayPaintScale13.getPaint((double) (short) 100);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj9", grayPaintScale5.equals(obj9) ? grayPaintScale5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        java.lang.Object obj16 = grayPaintScale12.clone();
        boolean boolean17 = grayPaintScale9.equals((java.lang.Object) grayPaintScale12);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj16", grayPaintScale12.equals(obj16) ? grayPaintScale12.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        double double21 = grayPaintScale18.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass19 = grayPaintScale18.getClass();
        boolean boolean20 = grayPaintScale12.equals((java.lang.Object) grayPaintScale18);
        double double21 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale12.getPaint((double) 'a');
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 0);
        double double11 = grayPaintScale8.getLowerBound();
        java.lang.Object obj12 = grayPaintScale8.clone();
        java.awt.Paint paint14 = grayPaintScale8.getPaint((-1.0d));
        java.awt.Paint paint16 = grayPaintScale8.getPaint((double) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj12", grayPaintScale8.equals(obj12) ? grayPaintScale8.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        double double34 = grayPaintScale18.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double24 = grayPaintScale23.getUpperBound();
        boolean boolean25 = grayPaintScale17.equals((java.lang.Object) double24);
        java.lang.Class<?> wildcardClass26 = grayPaintScale17.getClass();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale17", obj5.equals(grayPaintScale17) ? obj5.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (byte) 100);
        double double23 = grayPaintScale22.getUpperBound();
        java.lang.Object obj24 = grayPaintScale22.clone();
        java.awt.Paint paint26 = grayPaintScale22.getPaint(10.0d);
        boolean boolean27 = grayPaintScale6.equals((java.lang.Object) paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj8 = grayPaintScale7.clone();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (-1));
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) (-1L));
        double double13 = grayPaintScale7.getLowerBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 1L);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.lang.Object obj12 = grayPaintScale9.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) ' ');
        double double18 = grayPaintScale15.getLowerBound();
        double double19 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale15.getClass();
        boolean boolean21 = grayPaintScale9.equals((java.lang.Object) wildcardClass20);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj12", grayPaintScale9.equals(obj12) ? grayPaintScale9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj12 = grayPaintScale11.clone();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1));
        boolean boolean16 = grayPaintScale11.equals((java.lang.Object) (-1L));
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass23 = grayPaintScale20.getClass();
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale20);
        java.lang.Object obj25 = grayPaintScale20.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale20", obj5.equals(grayPaintScale20) ? obj5.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        java.awt.Paint paint39 = grayPaintScale17.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale30", grayPaintScale10.equals(grayPaintScale30) ? grayPaintScale10.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((-1.0d));
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) (short) 1);
        double double21 = grayPaintScale14.getUpperBound();
        java.lang.Object obj22 = grayPaintScale14.clone();
        double double23 = grayPaintScale14.getUpperBound();
        java.lang.Object obj24 = grayPaintScale14.clone();
        boolean boolean25 = grayPaintScale0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj22", grayPaintScale14.equals(obj22) ? grayPaintScale14.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        double double13 = grayPaintScale10.getUpperBound();
        java.lang.Object obj14 = grayPaintScale10.clone();
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        java.awt.Paint paint21 = grayPaintScale6.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        java.lang.Object obj12 = grayPaintScale9.clone();
        java.lang.Object obj13 = grayPaintScale9.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint14 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        java.lang.Object obj21 = grayPaintScale0.clone();
        java.lang.Object obj22 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj21", grayPaintScale15.equals(obj21) ? grayPaintScale15.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        double double10 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) 10.0d);
        boolean boolean11 = grayPaintScale7.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = grayPaintScale7.clone();
        java.lang.Object obj13 = grayPaintScale7.clone();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.awt.Paint paint15 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 10);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale17.getPaint((double) 10L);
        double double22 = grayPaintScale17.getUpperBound();
        java.lang.Object obj23 = grayPaintScale17.clone();
        java.awt.Paint paint25 = grayPaintScale17.getPaint(0.0d);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj23", grayPaintScale17.equals(obj23) ? grayPaintScale17.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        double double23 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj22", obj9.equals(obj22) ? obj9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = grayPaintScale5.clone();
        double double11 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        double double17 = grayPaintScale14.getLowerBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) 1);
        double double20 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) 10L);
        boolean boolean23 = grayPaintScale5.equals((java.lang.Object) grayPaintScale14);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj10", grayPaintScale5.equals(obj10) ? grayPaintScale5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        java.awt.Paint paint13 = grayPaintScale4.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        double double19 = grayPaintScale16.getUpperBound();
        java.lang.Object obj20 = grayPaintScale16.clone();
        double double21 = grayPaintScale16.getUpperBound();
        double double22 = grayPaintScale16.getLowerBound();
        java.lang.Object obj23 = grayPaintScale16.clone();
        boolean boolean24 = grayPaintScale4.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj20", obj7.equals(obj20) ? obj7.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        double double23 = grayPaintScale20.getLowerBound();
        boolean boolean25 = grayPaintScale20.equals((java.lang.Object) 1);
        double double26 = grayPaintScale20.getUpperBound();
        java.lang.Class<?> wildcardClass27 = grayPaintScale20.getClass();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale20", obj9.equals(grayPaintScale20) ? obj9.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.lang.Class<?> wildcardClass10 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        java.awt.Paint paint24 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) 10.0d);
        double double28 = grayPaintScale25.getUpperBound();
        java.lang.Object obj29 = grayPaintScale25.clone();
        java.lang.Object obj30 = grayPaintScale25.clone();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj29 and obj30", obj29.equals(obj30) ? obj29.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        double double19 = grayPaintScale9.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj12", obj3.equals(obj12) ? obj3.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) grayPaintScale17);
        double double21 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale14.getPaint((double) 0);
        java.lang.Object obj24 = grayPaintScale14.clone();
        java.lang.Object obj25 = grayPaintScale14.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        double double20 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj16 = grayPaintScale15.clone();
        double double17 = grayPaintScale15.getLowerBound();
        java.lang.Object obj18 = grayPaintScale15.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj16", grayPaintScale15.equals(obj16) ? grayPaintScale15.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.lang.Class<?> wildcardClass18 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (short) 0);
        java.lang.Class<?> wildcardClass22 = paint21.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale19", obj5.equals(grayPaintScale19) ? obj5.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = grayPaintScale2.equals(obj18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj18", grayPaintScale17.equals(obj18) ? grayPaintScale17.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale11.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        java.awt.Paint paint22 = grayPaintScale18.getPaint(0.0d);
        boolean boolean23 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint25 = grayPaintScale11.getPaint((double) 100L);
        java.awt.Paint paint27 = grayPaintScale11.getPaint((double) (byte) -1);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and grayPaintScale18", grayPaintScale11.equals(grayPaintScale18) ? grayPaintScale11.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj6 = grayPaintScale5.clone();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale15", obj5.equals(grayPaintScale15) ? obj5.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double23 = grayPaintScale22.getUpperBound();
        java.lang.Object obj24 = grayPaintScale22.clone();
        java.lang.Class<?> wildcardClass25 = grayPaintScale22.getClass();
        boolean boolean26 = grayPaintScale5.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj11", obj9.equals(obj11) ? obj9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        java.lang.Object obj10 = grayPaintScale7.clone();
        double double11 = grayPaintScale7.getUpperBound();
        double double12 = grayPaintScale7.getLowerBound();
        double double13 = grayPaintScale7.getLowerBound();
        boolean boolean14 = grayPaintScale3.equals((java.lang.Object) grayPaintScale7);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.awt.Paint paint13 = grayPaintScale4.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        double double17 = grayPaintScale16.getLowerBound();
        java.lang.Object obj18 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale4.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 1);
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (short) 0);
        double double22 = grayPaintScale19.getLowerBound();
        boolean boolean24 = grayPaintScale19.equals((java.lang.Object) 1);
        double double25 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale19.getPaint((double) (byte) 1);
        java.lang.Object obj28 = grayPaintScale19.clone();
        double double29 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale19.getPaint(0.0d);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj28", obj9.equals(obj28) ? obj9.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (short) 100);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1L));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint16 = grayPaintScale8.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        double double24 = grayPaintScale21.getLowerBound();
        boolean boolean26 = grayPaintScale21.equals((java.lang.Object) 1);
        double double27 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) 1L);
        java.lang.Object obj30 = grayPaintScale21.clone();
        double double31 = grayPaintScale21.getUpperBound();
        double double32 = grayPaintScale21.getUpperBound();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) double32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj14", grayPaintScale5.equals(obj14) ? grayPaintScale5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        java.lang.Object obj19 = grayPaintScale9.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        java.lang.Object obj9 = grayPaintScale5.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj9", grayPaintScale5.equals(obj9) ? grayPaintScale5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        double double25 = grayPaintScale13.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        java.lang.Object obj24 = grayPaintScale21.clone();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) (-1));
        double double27 = grayPaintScale21.getUpperBound();
        double double28 = grayPaintScale21.getLowerBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj24", grayPaintScale8.equals(obj24) ? grayPaintScale8.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        double double7 = grayPaintScale5.getLowerBound();
        double double8 = grayPaintScale5.getUpperBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double10 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 32.0d);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double18 = grayPaintScale17.getLowerBound();
        double double19 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) (byte) 10);
        boolean boolean28 = grayPaintScale22.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double32 = grayPaintScale31.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale31.getPaint((double) (short) 100);
        boolean boolean35 = grayPaintScale22.equals((java.lang.Object) grayPaintScale31);
        boolean boolean36 = grayPaintScale17.equals((java.lang.Object) grayPaintScale22);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint41 = grayPaintScale39.getPaint((double) (byte) -1);
        boolean boolean43 = grayPaintScale39.equals((java.lang.Object) 100L);
        double double44 = grayPaintScale39.getLowerBound();
        boolean boolean45 = grayPaintScale22.equals((java.lang.Object) double44);
        java.lang.Object obj46 = grayPaintScale22.clone();
        boolean boolean47 = grayPaintScale5.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale39", grayPaintScale13.equals(grayPaintScale39) ? grayPaintScale13.hashCode() == grayPaintScale39.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        java.awt.Paint paint19 = grayPaintScale11.getPaint(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        double double20 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj18", grayPaintScale15.equals(obj18) ? grayPaintScale15.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj7", obj5.equals(obj7) ? obj5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        java.lang.Object obj26 = grayPaintScale22.clone();
        java.awt.Paint paint28 = grayPaintScale22.getPaint((-1.0d));
        java.lang.Object obj29 = grayPaintScale22.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj18", grayPaintScale6.equals(obj18) ? grayPaintScale6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        java.lang.Class<?> wildcardClass37 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale33 and obj35", grayPaintScale33.equals(obj35) ? grayPaintScale33.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        boolean boolean13 = grayPaintScale9.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = grayPaintScale9.clone();
        double double15 = grayPaintScale9.getUpperBound();
        double double16 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) 100);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean28 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean29 = grayPaintScale9.equals((java.lang.Object) grayPaintScale27);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj14", grayPaintScale9.equals(obj14) ? grayPaintScale9.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj16", grayPaintScale8.equals(obj16) ? grayPaintScale8.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) '#');
        java.lang.Class<?> wildcardClass18 = paint17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) (byte) 10);
        boolean boolean15 = grayPaintScale9.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double19 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint((double) (short) 100);
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint27 = grayPaintScale25.getPaint((double) (short) 0);
        double double28 = grayPaintScale25.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass32 = grayPaintScale31.getClass();
        boolean boolean33 = grayPaintScale25.equals((java.lang.Object) grayPaintScale31);
        boolean boolean34 = grayPaintScale9.equals((java.lang.Object) boolean33);
        java.lang.Object obj35 = grayPaintScale9.clone();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale31 and obj35", grayPaintScale31.equals(obj35) ? grayPaintScale31.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        double double36 = grayPaintScale33.getLowerBound();
        boolean boolean38 = grayPaintScale33.equals((java.lang.Object) 1);
        double double39 = grayPaintScale33.getLowerBound();
        double double40 = grayPaintScale33.getLowerBound();
        double double41 = grayPaintScale33.getLowerBound();
        double double42 = grayPaintScale33.getUpperBound();
        java.lang.Object obj43 = grayPaintScale33.clone();
        java.lang.Object obj44 = grayPaintScale33.clone();
        boolean boolean45 = grayPaintScale6.equals((java.lang.Object) grayPaintScale33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj43", grayPaintScale2.equals(obj43) ? grayPaintScale2.hashCode() == obj43.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double10 = grayPaintScale8.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) 0);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) paint12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj10 = grayPaintScale9.clone();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) 1.0f);
        double double13 = grayPaintScale9.getLowerBound();
        double double14 = grayPaintScale9.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj8", obj7.equals(obj8) ? obj7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        java.lang.Object obj21 = grayPaintScale18.clone();
        java.awt.Paint paint23 = grayPaintScale18.getPaint((double) (-1));
        java.awt.Paint paint25 = grayPaintScale18.getPaint((double) 10.0f);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale18 and obj21", grayPaintScale18.equals(obj21) ? grayPaintScale18.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        java.lang.Class<?> wildcardClass12 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj7", grayPaintScale4.equals(obj7) ? grayPaintScale4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getLowerBound();
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) 1);
        double double13 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) (byte) 1);
        java.lang.Object obj16 = grayPaintScale7.clone();
        double double17 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale7.getPaint((double) (byte) 100);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj16", grayPaintScale7.equals(obj16) ? grayPaintScale7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 1);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) 10L);
        java.lang.Object obj15 = grayPaintScale10.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        java.awt.Paint paint26 = grayPaintScale2.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        java.lang.Object obj34 = grayPaintScale18.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) 0);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double9 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (byte) 10);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        double double24 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.lang.Object obj12 = grayPaintScale9.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) ' ');
        double double18 = grayPaintScale15.getLowerBound();
        double double19 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass20 = grayPaintScale15.getClass();
        boolean boolean21 = grayPaintScale9.equals((java.lang.Object) wildcardClass20);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) (-1.0d));
        double double24 = grayPaintScale9.getLowerBound();
        double double25 = grayPaintScale9.getLowerBound();
        java.lang.Class<?> wildcardClass26 = grayPaintScale9.getClass();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj12", grayPaintScale9.equals(obj12) ? grayPaintScale9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint21 = grayPaintScale19.getPaint((double) (short) 0);
        double double22 = grayPaintScale19.getLowerBound();
        boolean boolean24 = grayPaintScale19.equals((java.lang.Object) 1);
        double double25 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale19.getPaint((double) (byte) 1);
        java.awt.Paint paint29 = grayPaintScale19.getPaint((double) 10);
        double double30 = grayPaintScale19.getLowerBound();
        double double31 = grayPaintScale19.getLowerBound();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) double31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and grayPaintScale19", obj11.equals(grayPaintScale19) ? obj11.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        java.lang.Class<?> wildcardClass22 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        java.lang.Class<?> wildcardClass23 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj22", grayPaintScale15.equals(obj22) ? grayPaintScale15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj7", obj5.equals(obj7) ? obj5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = null;
        boolean boolean6 = grayPaintScale2.equals(obj5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) 10L);
        double double14 = grayPaintScale9.getUpperBound();
        java.lang.Object obj15 = grayPaintScale9.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) 1L);
        double double23 = grayPaintScale18.getUpperBound();
        boolean boolean24 = grayPaintScale9.equals((java.lang.Object) grayPaintScale18);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getLowerBound();
        java.lang.Object obj11 = grayPaintScale8.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        java.awt.Paint paint14 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint28 = grayPaintScale2.getPaint(100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj25", grayPaintScale15.equals(obj25) ? grayPaintScale15.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        java.lang.Object obj18 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj13", grayPaintScale9.equals(obj13) ? grayPaintScale9.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double6 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) 1);
        double double15 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale9.getPaint((double) (byte) 1);
        boolean boolean18 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        double double19 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint24 = grayPaintScale20.getPaint((-1.0d));
        boolean boolean25 = grayPaintScale9.equals((java.lang.Object) paint24);
        java.lang.Object obj26 = grayPaintScale9.clone();
        boolean boolean27 = grayPaintScale2.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale9", grayPaintScale5.equals(grayPaintScale9) ? grayPaintScale5.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double20 = grayPaintScale19.getLowerBound();
        double double21 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale19.getPaint((double) (byte) 10);
        java.awt.Paint paint25 = grayPaintScale19.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj29 = grayPaintScale28.clone();
        double double30 = grayPaintScale28.getLowerBound();
        double double31 = grayPaintScale28.getUpperBound();
        double double32 = grayPaintScale28.getLowerBound();
        boolean boolean33 = grayPaintScale19.equals((java.lang.Object) grayPaintScale28);
        boolean boolean34 = grayPaintScale5.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale19", grayPaintScale2.equals(grayPaintScale19) ? grayPaintScale2.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        java.lang.Class<?> wildcardClass13 = grayPaintScale8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = grayPaintScale7.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj12 and obj13", obj12.equals(obj13) ? obj12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        double double33 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj22", grayPaintScale17.equals(obj22) ? grayPaintScale17.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double10 = grayPaintScale9.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(0.0d);
        java.lang.Object obj13 = grayPaintScale9.clone();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) 10L);
        double double16 = grayPaintScale9.getLowerBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and grayPaintScale9", obj3.equals(grayPaintScale9) ? obj3.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        double double18 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and obj17", obj15.equals(obj17) ? obj15.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) double13);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale12", grayPaintScale7.equals(grayPaintScale12) ? grayPaintScale7.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((-1.0d));
        double double13 = grayPaintScale10.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj18 = grayPaintScale17.clone();
        java.awt.Paint paint20 = grayPaintScale17.getPaint(100.0d);
        java.lang.Class<?> wildcardClass21 = grayPaintScale17.getClass();
        boolean boolean22 = grayPaintScale10.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint(35.0d);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.awt.Paint paint24 = grayPaintScale20.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        java.lang.Class<?> wildcardClass33 = grayPaintScale7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj31 and obj32", obj31.equals(obj32) ? obj31.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        java.lang.Object obj27 = grayPaintScale24.clone();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (-1));
        double double30 = grayPaintScale24.getUpperBound();
        boolean boolean32 = grayPaintScale24.equals((java.lang.Object) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double36 = grayPaintScale35.getUpperBound();
        boolean boolean37 = grayPaintScale24.equals((java.lang.Object) double36);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint42 = grayPaintScale40.getPaint((double) 0);
        double double43 = grayPaintScale40.getUpperBound();
        double double44 = grayPaintScale40.getLowerBound();
        double double45 = grayPaintScale40.getUpperBound();
        boolean boolean46 = grayPaintScale24.equals((java.lang.Object) grayPaintScale40);
        boolean boolean47 = grayPaintScale2.equals((java.lang.Object) grayPaintScale40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and obj27", grayPaintScale24.equals(obj27) ? grayPaintScale24.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Class<?> wildcardClass14 = paint13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getLowerBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) 1);
        double double12 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) '#');
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
        java.lang.Class<?> wildcardClass36 = grayPaintScale20.getClass();
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale26", grayPaintScale6.equals(grayPaintScale26) ? grayPaintScale6.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (short) 1);
        double double11 = grayPaintScale8.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint14 = grayPaintScale0.getPaint((double) ' ');
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        double double18 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj17", obj5.equals(obj17) ? obj5.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) ' ');
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) boolean11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        java.lang.Object obj18 = grayPaintScale15.clone();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1));
        double double21 = grayPaintScale15.getUpperBound();
        boolean boolean23 = grayPaintScale15.equals((java.lang.Object) 10L);
        java.awt.Paint paint25 = grayPaintScale15.getPaint((double) 1L);
        java.lang.Class<?> wildcardClass26 = grayPaintScale15.getClass();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj18", grayPaintScale6.equals(obj18) ? grayPaintScale6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        double double16 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj13", grayPaintScale12.equals(obj13) ? grayPaintScale12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double13 = grayPaintScale5.getLowerBound();
        java.lang.Object obj14 = grayPaintScale5.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        java.lang.Class<?> wildcardClass16 = grayPaintScale13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj13 = grayPaintScale5.clone();
        double double14 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj13", obj8.equals(obj13) ? obj8.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj12", obj11.equals(obj12) ? obj11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 'a');
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (short) 0);
        double double12 = grayPaintScale9.getLowerBound();
        java.lang.Object obj13 = grayPaintScale9.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj13", grayPaintScale9.equals(obj13) ? grayPaintScale9.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (short) 100);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 10);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj13", grayPaintScale9.equals(obj13) ? grayPaintScale9.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) 'a');
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) 1.0f);
        double double10 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double14 = grayPaintScale13.getUpperBound();
        boolean boolean15 = grayPaintScale6.equals((java.lang.Object) double14);
        double double16 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale6.getPaint(10.0d);
        double double19 = grayPaintScale6.getLowerBound();
        double double20 = grayPaintScale6.getUpperBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and grayPaintScale13", obj3.equals(grayPaintScale13) ? obj3.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 1L);
        double double9 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        double double19 = grayPaintScale12.getLowerBound();
        java.lang.Object obj20 = grayPaintScale12.clone();
        double double21 = grayPaintScale12.getUpperBound();
        double double22 = grayPaintScale12.getLowerBound();
        double double23 = grayPaintScale12.getUpperBound();
        double double24 = grayPaintScale12.getUpperBound();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) double24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj20", grayPaintScale12.equals(obj20) ? grayPaintScale12.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.lang.Object obj20 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) 10.0d);
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = grayPaintScale8.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj13", grayPaintScale8.equals(obj13) ? grayPaintScale8.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        double double30 = grayPaintScale22.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (byte) 0);
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, 1.0d);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double13 = grayPaintScale9.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj11", obj9.equals(obj11) ? obj9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double13 = grayPaintScale12.getLowerBound();
        double double14 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale12.getPaint((double) '4');
        java.lang.Object obj17 = grayPaintScale12.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) 'a');
        boolean boolean23 = grayPaintScale12.equals((java.lang.Object) grayPaintScale20);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj17", grayPaintScale12.equals(obj17) ? grayPaintScale12.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) '#');
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getLowerBound();
        double double16 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj10", obj5.equals(obj10) ? obj5.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        java.awt.Paint paint17 = grayPaintScale13.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj7", grayPaintScale4.equals(obj7) ? grayPaintScale4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        double double20 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj18", grayPaintScale8.equals(obj18) ? grayPaintScale8.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        double double8 = grayPaintScale5.getLowerBound();
        java.lang.Object obj9 = grayPaintScale5.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        java.lang.Object obj19 = grayPaintScale16.clone();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (-1));
        double double22 = grayPaintScale16.getUpperBound();
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) grayPaintScale16);
        double double24 = grayPaintScale16.getLowerBound();
        boolean boolean25 = grayPaintScale5.equals((java.lang.Object) double24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and grayPaintScale16", obj9.equals(grayPaintScale16) ? obj9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale2.getPaint(35.0d);
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 1);
        double double21 = grayPaintScale20.getUpperBound();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        java.lang.Class<?> wildcardClass23 = grayPaintScale20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((double) (short) 0);
        java.lang.Object obj23 = grayPaintScale20.clone();
        java.awt.Paint paint25 = grayPaintScale20.getPaint(1.0d);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and obj23", grayPaintScale20.equals(obj23) ? grayPaintScale20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double30 = grayPaintScale29.getLowerBound();
        double double31 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale29.getPaint((double) '#');
        boolean boolean35 = grayPaintScale29.equals((java.lang.Object) 1L);
        double double36 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale29.getPaint((double) (short) 1);
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj25", grayPaintScale15.equals(obj25) ? grayPaintScale15.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 'a');
        java.lang.Class<?> wildcardClass11 = paint10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getUpperBound();
        double double10 = grayPaintScale8.getLowerBound();
        java.lang.Object obj11 = grayPaintScale8.clone();
        boolean boolean12 = grayPaintScale2.equals(obj11);
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj11", grayPaintScale8.equals(obj11) ? grayPaintScale8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        java.awt.Paint paint21 = grayPaintScale5.getPaint((double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj15", obj5.equals(obj15) ? obj5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        java.awt.Paint paint45 = grayPaintScale22.getPaint((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale35", grayPaintScale2.equals(grayPaintScale35) ? grayPaintScale2.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (-1.0f));
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj14 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 1L);
        double double24 = grayPaintScale21.getLowerBound();
        java.lang.Class<?> wildcardClass25 = grayPaintScale21.getClass();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj17", grayPaintScale10.equals(obj17) ? grayPaintScale10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj12 = grayPaintScale11.clone();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 0L);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(32.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        java.lang.Object obj14 = grayPaintScale10.clone();
        java.awt.Paint paint16 = grayPaintScale10.getPaint((-1.0d));
        java.lang.Object obj17 = grayPaintScale10.clone();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj17", obj14.equals(obj17) ? obj14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj9", obj3.equals(obj9) ? obj3.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint16 = grayPaintScale12.getPaint((-1.0d));
        java.lang.Object obj17 = grayPaintScale12.clone();
        java.awt.Paint paint19 = grayPaintScale12.getPaint(0.0d);
        double double20 = grayPaintScale12.getLowerBound();
        double double21 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale12.getPaint(32.0d);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint9 = grayPaintScale5.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        java.awt.Paint paint19 = grayPaintScale12.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 10.0d);
        boolean boolean23 = grayPaintScale12.equals((java.lang.Object) boolean22);
        boolean boolean24 = grayPaintScale5.equals((java.lang.Object) boolean23);
        double double25 = grayPaintScale5.getUpperBound();
        double double26 = grayPaintScale5.getLowerBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale20", grayPaintScale5.equals(grayPaintScale20) ? grayPaintScale5.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double27 = grayPaintScale26.getLowerBound();
        double double28 = grayPaintScale26.getLowerBound();
        double double29 = grayPaintScale26.getUpperBound();
        java.awt.Paint paint31 = grayPaintScale26.getPaint(35.0d);
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint33 = grayPaintScale29.getPaint((-1.0d));
        boolean boolean34 = grayPaintScale18.equals((java.lang.Object) paint33);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double38 = grayPaintScale37.getLowerBound();
        double double39 = grayPaintScale37.getLowerBound();
        double double40 = grayPaintScale37.getUpperBound();
        boolean boolean41 = grayPaintScale18.equals((java.lang.Object) grayPaintScale37);
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and grayPaintScale14", obj10.equals(grayPaintScale14) ? obj10.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass16 = grayPaintScale13.getClass();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) grayPaintScale13);
        java.lang.Object obj18 = grayPaintScale8.clone();
        java.awt.Paint paint20 = grayPaintScale8.getPaint(0.0d);
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint26 = grayPaintScale24.getPaint((double) (short) 0);
        java.lang.Object obj27 = grayPaintScale24.clone();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (-1));
        double double30 = grayPaintScale24.getUpperBound();
        boolean boolean32 = grayPaintScale24.equals((java.lang.Object) 10L);
        java.awt.Paint paint34 = grayPaintScale24.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double38 = grayPaintScale37.getUpperBound();
        boolean boolean39 = grayPaintScale24.equals((java.lang.Object) grayPaintScale37);
        boolean boolean40 = grayPaintScale0.equals((java.lang.Object) grayPaintScale24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj18", grayPaintScale8.equals(obj18) ? grayPaintScale8.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj11 = grayPaintScale0.clone();
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint((double) (short) 100);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (-1L));
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double15 = grayPaintScale8.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        double double18 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and obj17", obj15.equals(obj17) ? obj15.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(100.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 35.0d);
        double double11 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj15 = grayPaintScale14.clone();
        java.awt.Paint paint17 = grayPaintScale14.getPaint((double) (-1));
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) grayPaintScale14);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj15", grayPaintScale14.equals(obj15) ? grayPaintScale14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        double double6 = grayPaintScale5.getLowerBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale0.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and grayPaintScale5", obj2.equals(grayPaintScale5) ? obj2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 1);
        double double26 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale17.getPaint(52.0d);
        boolean boolean29 = grayPaintScale5.equals((java.lang.Object) paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and grayPaintScale17", obj8.equals(grayPaintScale17) ? obj8.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        java.lang.Class<?> wildcardClass37 = grayPaintScale33.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        double double37 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale33 and obj35", grayPaintScale33.equals(obj35) ? grayPaintScale33.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj6", obj4.equals(obj6) ? obj4.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) 0L);
        java.lang.Object obj27 = grayPaintScale22.clone();
        boolean boolean28 = grayPaintScale5.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        double double9 = grayPaintScale5.getUpperBound();
        double double10 = grayPaintScale5.getUpperBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale5.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) 0);
        java.lang.Object obj9 = grayPaintScale6.clone();
        java.awt.Paint paint11 = grayPaintScale6.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean15 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint17 = grayPaintScale6.getPaint((double) '#');
        double double18 = grayPaintScale6.getLowerBound();
        double double19 = grayPaintScale6.getUpperBound();
        java.lang.Object obj20 = grayPaintScale6.clone();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj20", obj9.equals(obj20) ? obj9.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) (short) 100);
        java.awt.Paint paint17 = grayPaintScale15.getPaint(10.0d);
        java.awt.Paint paint19 = grayPaintScale15.getPaint((double) (-1.0f));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double23 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean31 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        boolean boolean32 = grayPaintScale15.equals((java.lang.Object) grayPaintScale30);
        double double33 = grayPaintScale15.getUpperBound();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) double33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj12", obj10.equals(obj12) ? obj10.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.awt.Paint paint28 = grayPaintScale15.getPaint(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint11 = grayPaintScale2.getPaint((-1.0d));
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj13", obj3.equals(obj13) ? obj3.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        java.lang.Class<?> wildcardClass24 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj23", grayPaintScale15.equals(obj23) ? grayPaintScale15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj16 = grayPaintScale2.clone();
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj16", obj5.equals(obj16) ? obj5.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) 1.0f);
        double double12 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) double16);
        double double18 = grayPaintScale8.getLowerBound();
        java.lang.Class<?> wildcardClass19 = grayPaintScale8.getClass();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 1L);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and grayPaintScale10", obj7.equals(grayPaintScale10) ? obj7.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        double double27 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj25", grayPaintScale16.equals(obj25) ? grayPaintScale16.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = grayPaintScale7.getClass();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj6 = grayPaintScale5.clone();
        java.awt.Paint paint8 = grayPaintScale5.getPaint(100.0d);
        double double9 = grayPaintScale5.getLowerBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) double9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj6", grayPaintScale5.equals(obj6) ? grayPaintScale5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        java.lang.Object obj19 = grayPaintScale5.clone();
        java.awt.Paint paint21 = grayPaintScale5.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj19", obj14.equals(obj19) ? obj14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) (short) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.lang.Object obj11 = grayPaintScale7.clone();
        java.lang.Class<?> wildcardClass12 = grayPaintScale7.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        double double19 = grayPaintScale16.getUpperBound();
        double double20 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) (short) 0);
        java.lang.Object obj25 = grayPaintScale16.clone();
        boolean boolean26 = grayPaintScale2.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj11", grayPaintScale7.equals(obj11) ? grayPaintScale7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        double double6 = grayPaintScale5.getLowerBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        java.awt.Paint paint17 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(100.0d);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        double double36 = grayPaintScale22.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (short) 0);
        double double14 = grayPaintScale11.getUpperBound();
        java.lang.Object obj15 = grayPaintScale11.clone();
        double double16 = grayPaintScale11.getLowerBound();
        double double17 = grayPaintScale11.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj15", obj8.equals(obj15) ? obj8.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        java.awt.Paint paint28 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale14", grayPaintScale5.equals(grayPaintScale14) ? grayPaintScale5.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 35.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale6.clone();
        java.awt.Paint paint9 = grayPaintScale6.getPaint((double) (-1));
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double14 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) (byte) 1);
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) grayPaintScale17);
        java.awt.Paint paint28 = grayPaintScale17.getPaint((double) 100);
        java.lang.Object obj29 = grayPaintScale17.clone();
        boolean boolean30 = grayPaintScale2.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale17", grayPaintScale13.equals(grayPaintScale17) ? grayPaintScale13.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getLowerBound();
        double double28 = grayPaintScale25.getUpperBound();
        boolean boolean29 = grayPaintScale6.equals((java.lang.Object) grayPaintScale25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) 0);
        boolean boolean38 = grayPaintScale32.equals((java.lang.Object) grayPaintScale35);
        double double39 = grayPaintScale32.getUpperBound();
        java.awt.Paint paint41 = grayPaintScale32.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double45 = grayPaintScale44.getLowerBound();
        double double46 = grayPaintScale44.getUpperBound();
        java.awt.Paint paint48 = grayPaintScale44.getPaint((double) (byte) 10);
        boolean boolean49 = grayPaintScale32.equals((java.lang.Object) grayPaintScale44);
        double double50 = grayPaintScale44.getLowerBound();
        double double51 = grayPaintScale44.getLowerBound();
        java.lang.Object obj52 = grayPaintScale44.clone();
        double double53 = grayPaintScale44.getUpperBound();
        boolean boolean54 = grayPaintScale6.equals((java.lang.Object) grayPaintScale44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale25 and grayPaintScale35", grayPaintScale25.equals(grayPaintScale35) ? grayPaintScale25.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        java.lang.Object obj21 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj20", obj9.equals(obj20) ? obj9.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        double double8 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj9 = grayPaintScale8.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj9", grayPaintScale8.equals(obj9) ? grayPaintScale8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        java.lang.Object obj17 = grayPaintScale14.clone();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (-1));
        double double20 = grayPaintScale14.getUpperBound();
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) 10L);
        java.awt.Paint paint24 = grayPaintScale14.getPaint((double) (-1));
        double double25 = grayPaintScale14.getUpperBound();
        java.lang.Object obj26 = null;
        boolean boolean27 = grayPaintScale14.equals(obj26);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj17", obj10.equals(obj17) ? obj10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        java.awt.Paint paint24 = grayPaintScale2.getPaint(35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale10", grayPaintScale6.equals(grayPaintScale10) ? grayPaintScale6.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        java.lang.Object obj27 = grayPaintScale15.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        java.lang.Object obj38 = null;
        boolean boolean39 = grayPaintScale17.equals(obj38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale30", grayPaintScale10.equals(grayPaintScale30) ? grayPaintScale10.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        double double11 = grayPaintScale7.getLowerBound();
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj12", grayPaintScale7.equals(obj12) ? grayPaintScale7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), 1.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) '4');
        double double14 = grayPaintScale11.getLowerBound();
        java.lang.Object obj15 = grayPaintScale11.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj15", obj3.equals(obj15) ? obj3.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double15 = grayPaintScale14.getUpperBound();
        double double16 = grayPaintScale14.getLowerBound();
        java.lang.Object obj17 = grayPaintScale14.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.lang.Object obj21 = grayPaintScale20.clone();
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) grayPaintScale20);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj11", obj10.equals(obj11) ? obj10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        double double20 = grayPaintScale17.getLowerBound();
        boolean boolean22 = grayPaintScale17.equals((java.lang.Object) 1);
        double double23 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale17.getPaint((double) 1L);
        java.lang.Object obj26 = grayPaintScale17.clone();
        double double27 = grayPaintScale17.getUpperBound();
        double double28 = grayPaintScale17.getUpperBound();
        double double29 = grayPaintScale17.getUpperBound();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj26", grayPaintScale10.equals(obj26) ? grayPaintScale10.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        double double9 = grayPaintScale8.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        java.lang.Object obj12 = grayPaintScale8.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (byte) -1);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 100L);
        boolean boolean20 = grayPaintScale8.equals((java.lang.Object) grayPaintScale15);
        double double21 = grayPaintScale8.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double25 = grayPaintScale24.getLowerBound();
        double double26 = grayPaintScale24.getLowerBound();
        java.lang.Class<?> wildcardClass27 = grayPaintScale24.getClass();
        boolean boolean28 = grayPaintScale8.equals((java.lang.Object) wildcardClass27);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj12", grayPaintScale8.equals(obj12) ? grayPaintScale8.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (short) 0);
        java.lang.Object obj20 = grayPaintScale17.clone();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (-1));
        double double23 = grayPaintScale17.getUpperBound();
        boolean boolean24 = grayPaintScale14.equals((java.lang.Object) grayPaintScale17);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj11", obj5.equals(obj11) ? obj5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        java.lang.Object obj30 = grayPaintScale22.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double10 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale13.getPaint((double) (byte) 1);
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale13);
        java.awt.Paint paint24 = grayPaintScale13.getPaint((double) 100);
        double double25 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale13.getPaint((double) (short) 10);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale13", grayPaintScale9.equals(grayPaintScale13) ? grayPaintScale9.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj13", obj10.equals(obj13) ? obj10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        java.awt.Paint paint28 = grayPaintScale2.getPaint((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj25", grayPaintScale16.equals(obj25) ? grayPaintScale16.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        java.lang.Object obj16 = grayPaintScale13.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj16", grayPaintScale13.equals(obj16) ? grayPaintScale13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass16 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj15", obj11.equals(obj15) ? obj11.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        java.lang.Object obj38 = grayPaintScale17.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale30", grayPaintScale10.equals(grayPaintScale30) ? grayPaintScale10.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) '#');
        double double14 = grayPaintScale2.getLowerBound();
        double double15 = grayPaintScale2.getUpperBound();
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj16", obj5.equals(obj16) ? obj5.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj16", obj5.equals(obj16) ? obj5.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.awt.Paint paint26 = grayPaintScale19.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        double double40 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale24 and grayPaintScale31", grayPaintScale24.equals(grayPaintScale31) ? grayPaintScale24.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double11 = grayPaintScale10.getLowerBound();
        double double12 = grayPaintScale10.getLowerBound();
        java.lang.Object obj13 = grayPaintScale10.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) ' ');
        double double19 = grayPaintScale16.getLowerBound();
        double double20 = grayPaintScale16.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale16.getClass();
        boolean boolean22 = grayPaintScale10.equals((java.lang.Object) wildcardClass21);
        boolean boolean24 = grayPaintScale10.equals((java.lang.Object) (-1.0d));
        double double25 = grayPaintScale10.getLowerBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj13", grayPaintScale10.equals(obj13) ? grayPaintScale10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double17 = grayPaintScale16.getUpperBound();
        java.lang.Object obj18 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        java.lang.Class<?> wildcardClass20 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj18", grayPaintScale16.equals(obj18) ? grayPaintScale16.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double16 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale15.getPaint((double) (short) 100);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj25 = grayPaintScale15.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        double double27 = grayPaintScale15.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 0);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale2.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        java.awt.Paint paint22 = grayPaintScale18.getPaint((double) 10.0f);
        double double23 = grayPaintScale18.getUpperBound();
        java.lang.Object obj24 = grayPaintScale18.clone();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        java.awt.Paint paint30 = grayPaintScale21.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double13 = grayPaintScale12.getLowerBound();
        double double14 = grayPaintScale12.getLowerBound();
        java.lang.Object obj15 = grayPaintScale12.clone();
        java.lang.Object obj16 = grayPaintScale12.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj15", grayPaintScale12.equals(obj15) ? grayPaintScale12.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) 'a');
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint15 = grayPaintScale10.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = grayPaintScale8.getClass();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double17 = grayPaintScale16.getUpperBound();
        java.lang.Object obj18 = grayPaintScale16.clone();
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double23 = grayPaintScale22.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean32 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        double double33 = grayPaintScale22.getUpperBound();
        double double34 = grayPaintScale22.getUpperBound();
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj18", grayPaintScale16.equals(obj18) ? grayPaintScale16.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (-1));
        double double11 = grayPaintScale5.getUpperBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean19 = grayPaintScale15.equals((java.lang.Object) 0L);
        java.awt.Paint paint21 = grayPaintScale15.getPaint(100.0d);
        double double22 = grayPaintScale15.getLowerBound();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) double22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        java.awt.Paint paint42 = grayPaintScale2.getPaint((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale36", grayPaintScale14.equals(grayPaintScale36) ? grayPaintScale14.hashCode() == grayPaintScale36.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        java.lang.Object obj24 = grayPaintScale12.clone();
        java.lang.Object obj25 = grayPaintScale12.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj21 and obj24", obj21.equals(obj24) ? obj21.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj12 = grayPaintScale11.clone();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double20 = grayPaintScale19.getLowerBound();
        double double21 = grayPaintScale19.getLowerBound();
        double double22 = grayPaintScale19.getUpperBound();
        double double23 = grayPaintScale19.getLowerBound();
        double double24 = grayPaintScale19.getLowerBound();
        java.lang.Class<?> wildcardClass25 = grayPaintScale19.getClass();
        boolean boolean26 = grayPaintScale11.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale19", grayPaintScale2.equals(grayPaintScale19) ? grayPaintScale2.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
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
        double double20 = grayPaintScale12.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj15", obj5.equals(obj15) ? obj5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double9 = grayPaintScale8.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) double9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj14 = grayPaintScale13.clone();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (short) 0);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj14", grayPaintScale13.equals(obj14) ? grayPaintScale13.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        java.awt.Paint paint22 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 1);
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (short) 0);
        double double15 = grayPaintScale12.getLowerBound();
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 1);
        double double18 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale12.getPaint((double) (byte) 1);
        java.lang.Object obj21 = grayPaintScale12.clone();
        double double22 = grayPaintScale12.getUpperBound();
        double double23 = grayPaintScale12.getLowerBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale12.getClass();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj21", obj9.equals(obj21) ? obj9.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) 10);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj12 = grayPaintScale11.clone();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        double double17 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj12", grayPaintScale11.equals(obj12) ? grayPaintScale11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = grayPaintScale5.clone();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 100.0f);
        java.awt.Paint paint15 = grayPaintScale5.getPaint((-1.0d));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint18 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj11", grayPaintScale5.equals(obj11) ? grayPaintScale5.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj8", obj6.equals(obj8) ? obj6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
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
        java.awt.Paint paint28 = grayPaintScale13.getPaint((double) (-1));
        double double29 = grayPaintScale13.getUpperBound();
        double double30 = grayPaintScale13.getUpperBound();
        java.lang.Object obj31 = grayPaintScale13.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj20", obj5.equals(obj20) ? obj5.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        double double21 = grayPaintScale2.getUpperBound();
        java.lang.Object obj22 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 0);
        boolean boolean31 = grayPaintScale25.equals((java.lang.Object) grayPaintScale28);
        double double32 = grayPaintScale25.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale25.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double38 = grayPaintScale37.getLowerBound();
        double double39 = grayPaintScale37.getUpperBound();
        java.awt.Paint paint41 = grayPaintScale37.getPaint((double) (byte) 10);
        boolean boolean42 = grayPaintScale25.equals((java.lang.Object) grayPaintScale37);
        java.awt.Paint paint44 = grayPaintScale25.getPaint(0.0d);
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj22", obj9.equals(obj22) ? obj9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale5.clone();
        java.awt.Paint paint10 = grayPaintScale5.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 1, (double) 100.0f);
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (byte) 1);
        double double15 = grayPaintScale5.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 10.0d);
        boolean boolean14 = grayPaintScale10.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = grayPaintScale10.clone();
        double double16 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint(0.0d);
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) (byte) 10);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        java.lang.Object obj21 = grayPaintScale2.clone();
        double double22 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj20 and obj21", obj20.equals(obj21) ? obj20.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) 100);
        double double11 = grayPaintScale7.getLowerBound();
        java.lang.Object obj12 = grayPaintScale7.clone();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj12", grayPaintScale7.equals(obj12) ? grayPaintScale7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) '#');
        double double17 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        java.awt.Paint paint22 = grayPaintScale20.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass23 = paint22.getClass();
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale16.equals(obj25);
        double double27 = grayPaintScale16.getUpperBound();
        java.lang.Object obj28 = grayPaintScale16.clone();
        boolean boolean29 = grayPaintScale2.equals(obj28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1L);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj13", obj5.equals(obj13) ? obj5.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) 1.0f);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((-1.0d));
        java.lang.Class<?> wildcardClass15 = grayPaintScale12.getClass();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj9", obj3.equals(obj9) ? obj3.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (-1.0f));
        double double12 = grayPaintScale9.getLowerBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint18 = grayPaintScale14.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        double double24 = grayPaintScale21.getLowerBound();
        boolean boolean26 = grayPaintScale21.equals((java.lang.Object) 1);
        java.awt.Paint paint28 = grayPaintScale21.getPaint((double) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) 10.0d);
        boolean boolean32 = grayPaintScale21.equals((java.lang.Object) boolean31);
        boolean boolean33 = grayPaintScale14.equals((java.lang.Object) boolean32);
        double double34 = grayPaintScale14.getLowerBound();
        java.lang.Object obj35 = grayPaintScale14.clone();
        boolean boolean36 = grayPaintScale2.equals(obj35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale29", grayPaintScale14.equals(grayPaintScale29) ? grayPaintScale14.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        java.lang.Class<?> wildcardClass16 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and obj15", obj14.equals(obj15) ? obj14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint(32.0d);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((-1.0d));
        java.lang.Object obj14 = grayPaintScale9.clone();
        java.awt.Paint paint16 = grayPaintScale9.getPaint(10.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj14", grayPaintScale9.equals(obj14) ? grayPaintScale9.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        java.lang.Class<?> wildcardClass28 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj26", grayPaintScale21.equals(obj26) ? grayPaintScale21.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 10, (double) ' ');
        java.awt.Paint paint12 = grayPaintScale10.getPaint(0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) paint12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 10.0d);
        boolean boolean18 = grayPaintScale14.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = grayPaintScale14.clone();
        double double20 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint25 = grayPaintScale23.getPaint((double) (short) 0);
        double double26 = grayPaintScale23.getLowerBound();
        boolean boolean28 = grayPaintScale23.equals((java.lang.Object) 1);
        double double29 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) 10L);
        boolean boolean32 = grayPaintScale14.equals((java.lang.Object) grayPaintScale23);
        java.lang.Object obj33 = grayPaintScale14.clone();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj19 and obj33", obj19.equals(obj33) ? obj19.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double12 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) 0.0f);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint20 = grayPaintScale18.getPaint((double) (short) 0);
        double double21 = grayPaintScale18.getLowerBound();
        boolean boolean23 = grayPaintScale18.equals((java.lang.Object) 1);
        double double24 = grayPaintScale18.getLowerBound();
        double double25 = grayPaintScale18.getLowerBound();
        double double26 = grayPaintScale18.getLowerBound();
        double double27 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double31 = grayPaintScale30.getLowerBound();
        double double32 = grayPaintScale30.getUpperBound();
        java.awt.Paint paint34 = grayPaintScale30.getPaint((double) (byte) 10);
        boolean boolean36 = grayPaintScale30.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale39 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double40 = grayPaintScale39.getLowerBound();
        java.awt.Paint paint42 = grayPaintScale39.getPaint((double) (short) 100);
        boolean boolean43 = grayPaintScale30.equals((java.lang.Object) grayPaintScale39);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint48 = grayPaintScale46.getPaint((double) (short) 0);
        double double49 = grayPaintScale46.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale52 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass53 = grayPaintScale52.getClass();
        boolean boolean54 = grayPaintScale46.equals((java.lang.Object) grayPaintScale52);
        boolean boolean55 = grayPaintScale30.equals((java.lang.Object) boolean54);
        boolean boolean56 = grayPaintScale18.equals((java.lang.Object) grayPaintScale30);
        boolean boolean57 = grayPaintScale2.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and grayPaintScale39", obj15.equals(grayPaintScale39) ? obj15.hashCode() == grayPaintScale39.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean10 = grayPaintScale8.equals((java.lang.Object) 10.0d);
        boolean boolean12 = grayPaintScale8.equals((java.lang.Object) (-1.0d));
        double double13 = grayPaintScale8.getLowerBound();
        java.lang.Object obj14 = grayPaintScale8.clone();
        double double15 = grayPaintScale8.getLowerBound();
        java.lang.Object obj16 = grayPaintScale8.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj14", grayPaintScale8.equals(obj14) ? grayPaintScale8.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj8 = grayPaintScale7.clone();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (-1));
        boolean boolean12 = grayPaintScale7.equals((java.lang.Object) (-1L));
        double double13 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint15 = grayPaintScale7.getPaint((double) 'a');
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        java.awt.Paint paint25 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double34 = grayPaintScale33.getLowerBound();
        double double35 = grayPaintScale33.getUpperBound();
        java.awt.Paint paint37 = grayPaintScale33.getPaint((double) 10L);
        double double38 = grayPaintScale33.getUpperBound();
        double double39 = grayPaintScale33.getLowerBound();
        boolean boolean40 = grayPaintScale28.equals((java.lang.Object) double39);
        double double41 = grayPaintScale28.getUpperBound();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) double41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale33", grayPaintScale7.equals(grayPaintScale33) ? grayPaintScale7.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj16", obj6.equals(obj16) ? obj6.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        java.lang.Object obj24 = grayPaintScale12.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj21", grayPaintScale12.equals(obj21) ? grayPaintScale12.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        java.lang.Object obj36 = grayPaintScale22.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj15", grayPaintScale10.equals(obj15) ? grayPaintScale10.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) (-1.0d));
        double double10 = grayPaintScale5.getLowerBound();
        java.lang.Object obj11 = grayPaintScale5.clone();
        java.awt.Paint paint13 = grayPaintScale5.getPaint((double) 100.0f);
        java.awt.Paint paint15 = grayPaintScale5.getPaint((-1.0d));
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        double double17 = grayPaintScale5.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass8 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj18", grayPaintScale6.equals(obj18) ? grayPaintScale6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        java.awt.Paint paint29 = grayPaintScale21.getPaint((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        double double33 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj22", grayPaintScale17.equals(obj22) ? grayPaintScale17.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        java.lang.Object obj23 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale15 and obj22", grayPaintScale15.equals(obj22) ? grayPaintScale15.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint(10.0d);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj9", obj5.equals(obj9) ? obj5.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj17", grayPaintScale10.equals(obj17) ? grayPaintScale10.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass29 = grayPaintScale28.getClass();
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) grayPaintScale28);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        java.lang.Class<?> wildcardClass32 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj18 and grayPaintScale22", obj18.equals(grayPaintScale22) ? obj18.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (byte) 100);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 100);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj14", obj5.equals(obj14) ? obj5.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (-1));
        double double8 = grayPaintScale2.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) 10L);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (byte) 1);
        double double13 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        double double19 = grayPaintScale16.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass23 = grayPaintScale22.getClass();
        boolean boolean24 = grayPaintScale16.equals((java.lang.Object) grayPaintScale22);
        java.awt.Paint paint26 = grayPaintScale16.getPaint((double) 1.0f);
        double double27 = grayPaintScale16.getLowerBound();
        java.lang.Object obj28 = null;
        boolean boolean29 = grayPaintScale16.equals(obj28);
        java.awt.Paint paint31 = grayPaintScale16.getPaint((double) 1L);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and grayPaintScale16", obj5.equals(grayPaintScale16) ? obj5.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        java.awt.Paint paint30 = grayPaintScale21.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        java.lang.Object obj34 = null;
        boolean boolean35 = grayPaintScale18.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (short) 1);
        double double6 = grayPaintScale5.getLowerBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        java.lang.Object obj12 = grayPaintScale4.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj7", grayPaintScale4.equals(obj7) ? grayPaintScale4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        java.lang.Object obj14 = grayPaintScale11.clone();
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) 0);
        double double17 = grayPaintScale11.getUpperBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale11.getClass();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj14", grayPaintScale11.equals(obj14) ? grayPaintScale11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (short) 100);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean21 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        java.awt.Paint paint23 = grayPaintScale19.getPaint(10.0d);
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint26 = grayPaintScale2.getPaint(52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint31 = grayPaintScale29.getPaint((double) (short) 0);
        double double32 = grayPaintScale29.getLowerBound();
        boolean boolean34 = grayPaintScale29.equals((java.lang.Object) 1);
        double double35 = grayPaintScale29.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double39 = grayPaintScale38.getLowerBound();
        java.awt.Paint paint41 = grayPaintScale38.getPaint((double) (short) 100);
        java.awt.Paint paint43 = grayPaintScale38.getPaint((double) (-1L));
        boolean boolean44 = grayPaintScale29.equals((java.lang.Object) grayPaintScale38);
        double double45 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint47 = grayPaintScale29.getPaint((double) '4');
        java.lang.Class<?> wildcardClass48 = paint47.getClass();
        boolean boolean49 = grayPaintScale2.equals((java.lang.Object) paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and grayPaintScale38", grayPaintScale11.equals(grayPaintScale38) ? grayPaintScale11.hashCode() == grayPaintScale38.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj8", obj3.equals(obj8) ? obj3.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10L);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = paint9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getUpperBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj10", obj3.equals(obj10) ? obj3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) 100);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj7", obj6.equals(obj7) ? obj6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10L);
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (-1.0d));
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 10);
        double double8 = grayPaintScale2.getLowerBound();
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        double double16 = grayPaintScale13.getLowerBound();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) 1);
        double double19 = grayPaintScale13.getLowerBound();
        double double20 = grayPaintScale13.getLowerBound();
        double double21 = grayPaintScale13.getLowerBound();
        double double22 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getUpperBound();
        java.awt.Paint paint29 = grayPaintScale25.getPaint((double) (byte) 10);
        boolean boolean31 = grayPaintScale25.equals((java.lang.Object) (short) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double35 = grayPaintScale34.getLowerBound();
        java.awt.Paint paint37 = grayPaintScale34.getPaint((double) (short) 100);
        boolean boolean38 = grayPaintScale25.equals((java.lang.Object) grayPaintScale34);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint43 = grayPaintScale41.getPaint((double) (short) 0);
        double double44 = grayPaintScale41.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass48 = grayPaintScale47.getClass();
        boolean boolean49 = grayPaintScale41.equals((java.lang.Object) grayPaintScale47);
        boolean boolean50 = grayPaintScale25.equals((java.lang.Object) boolean49);
        boolean boolean51 = grayPaintScale13.equals((java.lang.Object) grayPaintScale25);
        boolean boolean52 = grayPaintScale2.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale41", grayPaintScale13.equals(grayPaintScale41) ? grayPaintScale13.hashCode() == grayPaintScale41.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        double double19 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (short) 0);
        double double25 = grayPaintScale22.getUpperBound();
        double double26 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale22.getPaint((double) (short) 100);
        java.awt.Paint paint30 = grayPaintScale22.getPaint((double) 1);
        double double31 = grayPaintScale22.getUpperBound();
        double double32 = grayPaintScale22.getLowerBound();
        double double33 = grayPaintScale22.getUpperBound();
        boolean boolean34 = grayPaintScale5.equals((java.lang.Object) double33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and grayPaintScale22", obj14.equals(grayPaintScale22) ? obj14.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (-1.0f));
        double double5 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (short) 0);
        java.lang.Object obj16 = grayPaintScale13.clone();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (-1));
        double double19 = grayPaintScale13.getUpperBound();
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 10.0d);
        boolean boolean24 = grayPaintScale13.equals((java.lang.Object) 10.0d);
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) 0);
        double double27 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale13.getPaint((double) 100.0f);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj16", grayPaintScale13.equals(obj16) ? grayPaintScale13.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.awt.Paint paint12 = grayPaintScale9.getPaint(100.0d);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) '4');
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
        double double20 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj19", obj5.equals(obj19) ? obj5.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        java.awt.Paint paint21 = grayPaintScale5.getPaint((double) 100.0f);
        java.lang.Class<?> wildcardClass22 = paint21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj8", grayPaintScale5.equals(obj8) ? grayPaintScale5.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (-1));
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getLowerBound();
        double double16 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) grayPaintScale13);
        double double18 = grayPaintScale10.getLowerBound();
        double double19 = grayPaintScale10.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        java.awt.Paint paint22 = grayPaintScale2.getPaint(0.0d);
        double double23 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        java.awt.Paint paint28 = grayPaintScale26.getPaint(1.0d);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        java.lang.Class<?> wildcardClass30 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale26", grayPaintScale10.equals(grayPaintScale26) ? grayPaintScale10.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean44 = grayPaintScale42.equals((java.lang.Object) ' ');
        double double45 = grayPaintScale42.getLowerBound();
        double double46 = grayPaintScale42.getLowerBound();
        java.lang.Object obj47 = grayPaintScale42.clone();
        boolean boolean48 = grayPaintScale24.equals(obj47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale31 and grayPaintScale42", grayPaintScale31.equals(grayPaintScale42) ? grayPaintScale31.hashCode() == grayPaintScale42.hashCode() : true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        double double28 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj27", grayPaintScale5.equals(obj27) ? grayPaintScale5.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(100.0d);
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (short) 0);
        double double13 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale10.equals((java.lang.Object) 1);
        double double16 = grayPaintScale10.getLowerBound();
        java.lang.Object obj17 = grayPaintScale10.clone();
        double double18 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double22 = grayPaintScale21.getLowerBound();
        boolean boolean23 = grayPaintScale10.equals((java.lang.Object) double22);
        java.awt.Paint paint25 = grayPaintScale10.getPaint((double) ' ');
        java.lang.Object obj26 = grayPaintScale10.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj7", obj3.equals(obj7) ? obj3.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double35 = grayPaintScale34.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, 1.0d);
        double double39 = grayPaintScale38.getUpperBound();
        boolean boolean40 = grayPaintScale34.equals((java.lang.Object) grayPaintScale38);
        boolean boolean41 = grayPaintScale7.equals((java.lang.Object) grayPaintScale38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale34", grayPaintScale2.equals(grayPaintScale34) ? grayPaintScale2.hashCode() == grayPaintScale34.hashCode() : true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj10", grayPaintScale7.equals(obj10) ? grayPaintScale7.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        java.lang.Object obj22 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj17", grayPaintScale8.equals(obj17) ? grayPaintScale8.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        java.awt.Paint paint4 = grayPaintScale0.getPaint((-1.0d));
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0L);
        java.lang.Object obj10 = grayPaintScale9.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        double double10 = grayPaintScale7.getUpperBound();
        double double11 = grayPaintScale7.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj16 = grayPaintScale7.clone();
        boolean boolean17 = grayPaintScale0.equals(obj16);
        java.lang.Object obj18 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj16", grayPaintScale7.equals(obj16) ? grayPaintScale7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        java.lang.Class<?> wildcardClass24 = grayPaintScale6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) ' ');
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double9 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double13 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (short) 0);
        double double19 = grayPaintScale16.getUpperBound();
        boolean boolean21 = grayPaintScale16.equals((java.lang.Object) ' ');
        boolean boolean22 = grayPaintScale12.equals((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = grayPaintScale12.getClass();
        boolean boolean24 = grayPaintScale8.equals((java.lang.Object) wildcardClass23);
        java.awt.Paint paint26 = grayPaintScale8.getPaint((double) (short) 10);
        java.lang.Object obj27 = grayPaintScale8.clone();
        boolean boolean28 = grayPaintScale2.equals(obj27);
        double double29 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj27", grayPaintScale8.equals(obj27) ? grayPaintScale8.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 32.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) -1);
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) 100);
        java.awt.Paint paint12 = grayPaintScale2.getPaint(0.0d);
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0L);
        java.lang.Object obj11 = grayPaintScale6.clone();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (short) 0);
        double double18 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale15.equals((java.lang.Object) 1);
        double double21 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale15.getPaint((double) (byte) 1);
        java.awt.Paint paint25 = grayPaintScale15.getPaint((double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint30 = grayPaintScale28.getPaint((double) (short) 0);
        double double31 = grayPaintScale28.getLowerBound();
        java.lang.Class<?> wildcardClass32 = grayPaintScale28.getClass();
        boolean boolean33 = grayPaintScale15.equals((java.lang.Object) grayPaintScale28);
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj11", grayPaintScale6.equals(obj11) ? grayPaintScale6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 1L);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100.0f);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        java.awt.Paint paint23 = grayPaintScale2.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj20", grayPaintScale8.equals(obj20) ? grayPaintScale8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 100.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((-1.0d));
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1L));
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
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
        java.lang.Object obj23 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj22", obj5.equals(obj22) ? obj5.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj17", obj11.equals(obj17) ? obj11.hashCode() == obj17.hashCode() : true);
    }
}

