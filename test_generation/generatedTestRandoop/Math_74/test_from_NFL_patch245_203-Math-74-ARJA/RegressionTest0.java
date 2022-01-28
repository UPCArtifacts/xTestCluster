import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((-1), (double) (short) 0, (double) 0, (double) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double6 = adamsMoultonIntegrator5.getMinStep();
        double double7 = adamsMoultonIntegrator5.getMinStep();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator11 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double12 = adamsMoultonIntegrator11.getMinStep();
        adamsMoultonIntegrator5.setStarterIntegrator((org.apache.commons.math.ode.FirstOrderIntegrator) adamsMoultonIntegrator11);
        java.lang.String str14 = adamsMoultonIntegrator11.getName();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Adams-Moulton" + "'", str14, "Adams-Moulton");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator11 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double12 = adamsMoultonIntegrator11.getMinStep();
        adamsMoultonIntegrator5.setStarterIntegrator((org.apache.commons.math.ode.FirstOrderIntegrator) adamsMoultonIntegrator11);
        java.lang.String str14 = adamsMoultonIntegrator5.getName();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Adams-Moulton" + "'", str14, "Adams-Moulton");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double6 = adamsMoultonIntegrator5.getMinStep();
        double double7 = adamsMoultonIntegrator5.getCurrentSignedStepsize();
        adamsMoultonIntegrator5.setSafety((double) ' ');
        adamsMoultonIntegrator5.setSafety((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.848857801796104d + "'", double7 == 9.848857801796104d);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator11 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double12 = adamsMoultonIntegrator11.getMinStep();
        adamsMoultonIntegrator5.setStarterIntegrator((org.apache.commons.math.ode.FirstOrderIntegrator) adamsMoultonIntegrator11);
        adamsMoultonIntegrator11.setMinReduction((double) (-1L));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator5 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator11 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) ' ', (double) (-1), (double) 'a', 10.0d, (double) ' ');
        double double12 = adamsMoultonIntegrator11.getMinStep();
        adamsMoultonIntegrator5.setStarterIntegrator((org.apache.commons.math.ode.FirstOrderIntegrator) adamsMoultonIntegrator11);
        adamsMoultonIntegrator5.setSafety(0.0d);
        double double16 = adamsMoultonIntegrator5.getMinStep();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        double[] doubleArray8 = new double[] { 0, 100.0f, 1L, 0.0f, 0.0d };
        double[] doubleArray10 = new double[] { (byte) -1 };
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator11 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator((int) '#', (double) 10.0f, (-1.0d), doubleArray8, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
    }
}

