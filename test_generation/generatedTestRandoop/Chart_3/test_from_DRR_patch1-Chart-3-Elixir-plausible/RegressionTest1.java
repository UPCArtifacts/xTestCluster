import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setRangeDescription("Time");
        int int11 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        boolean boolean26 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((-1), (int) (byte) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries11.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection25 = timeSeries11.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener26);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update((int) (byte) 1, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        boolean boolean18 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries10.createCopy((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod39, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        timeSeries19.removeAgedItems((long) (byte) 1, true);
        boolean boolean33 = timeSeries19.getNotify();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        int int60 = timeSeries10.getItemCount();
        timeSeries10.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod63, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        timeSeries24.setRangeDescription("");
        java.lang.Class<?> wildcardClass27 = timeSeries24.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Value", "Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries3.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries10.removeChangeListener(seriesChangeListener60);
        java.lang.Object obj62 = timeSeries10.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod63, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod62, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod24, Double.NaN, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.addOrUpdate(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries3.addOrUpdate(timeSeriesDataItem41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        java.lang.String str11 = timeSeries3.getDescription();
        timeSeries3.setDescription("Time");
        java.lang.Class<?> wildcardClass14 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries26.addOrUpdate(regularTimePeriod27, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.String str2 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.setMaximumItemAge((long) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((int) '#', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries42.update((int) (short) -1, (java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Object obj9 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemAge(0L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(0, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 1, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, (int) '4', true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        timeSeries26.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries3.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        timeSeries21.removeAgedItems((long) (short) 0, true);
        timeSeries21.setDescription("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries3.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        java.lang.String str6 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        boolean boolean8 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries3.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries17.createCopy((int) 'a', (int) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = timeSeries36.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.add(regularTimePeriod46, (java.lang.Number) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.List list8 = timeSeries3.getItems();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        long long27 = timeSeries14.getMaximumItemAge();
        double double28 = timeSeries14.getMaxY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        java.lang.Object obj24 = timeSeries17.clone();
        long long25 = timeSeries17.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries17.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        int int30 = timeSeries19.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries19.getDataItem(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries12.removeAgedItems(true);
        int int15 = timeSeries12.getMaximumItemCount();
        timeSeries12.setKey((java.lang.Comparable) 100);
        int int18 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries19.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "Overwritten values from: 10", "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "", "Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = null; // flaky: timeSeries3.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(100, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Value", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMaxY();
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries10.removeChangeListener(seriesChangeListener60);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod62, (java.lang.Number) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        timeSeries8.removeAgedItems((long) '4', false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod15, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.List list21 = timeSeries17.getItems();
        java.lang.Object obj22 = null;
        boolean boolean23 = timeSeries17.equals(obj22);
        int int24 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class29 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str34 = timeSeries33.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        int int50 = timeSeries47.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries43.addAndOrUpdate(timeSeries47);
        boolean boolean52 = timeSeries51.getNotify();
        java.util.Collection collection53 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries28.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str60 = timeSeries59.getDomainDescription();
        timeSeries59.removeAgedItems(true);
        timeSeries59.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries28.addAndOrUpdate(timeSeries59);
        java.util.Collection collection66 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.util.Collection collection67 = timeSeries59.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries3.addAndOrUpdate(timeSeries59);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(regularTimePeriod69, 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = null; // flaky: timeSeries3.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10L + "'", comparable7, 10L);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        timeSeries13.setRangeDescription("hi!");
        java.util.Collection collection17 = timeSeries13.getTimePeriods();
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        java.util.List list33 = timeSeries29.getItems();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries13.addAndOrUpdate(timeSeries29);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        java.util.Collection collection42 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries8.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries43.add(timeSeriesDataItem44, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("Time");
        java.util.List list19 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.Object obj11 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: Overwritten values from: 10");
        boolean boolean2 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries19.addOrUpdate(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        java.lang.Comparable comparable73 = timeSeries22.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete((int) 'a', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + 10L + "'", comparable73, 10L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        int int34 = timeSeries19.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete(1, 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(0, 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        double double30 = timeSeries19.getMinY();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod29, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: timeSeries3.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        java.lang.Object obj13 = timeSeries10.clone();
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems((long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null; // flaky: timeSeries3.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        timeSeries8.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.update((int) (byte) 0, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        timeSeries3.setMaximumItemAge((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod19, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.util.List list18 = timeSeries17.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries17.addOrUpdate(regularTimePeriod19, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Object obj21 = timeSeries18.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(regularTimePeriod25, 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        timeSeries24.setRangeDescription("");
        timeSeries24.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        int int8 = timeSeries3.getMaximumItemCount();
        long long9 = timeSeries3.getMaximumItemAge();
        java.lang.Class<?> wildcardClass10 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10L + "'", comparable7, 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries45 = timeSeries3.createCopy(regularTimePeriod43, regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(false);
        double double6 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.removeChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries1.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10L + "'", comparable7, 10L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Overwritten values from: 10", "");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.fireSeriesChanged();
        java.lang.Class<?> wildcardClass32 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.lang.String str6 = timeSeries3.getDescription();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries3.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.setMaximumItemAge((long) 10);
        timeSeries14.setMaximumItemCount((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = timeSeries14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries25.removeAgedItems(true);
        int int28 = timeSeries25.getMaximumItemCount();
        timeSeries25.setKey((java.lang.Comparable) 100);
        java.lang.String str31 = timeSeries25.getRangeDescription();
        int int32 = timeSeries25.getItemCount();
        boolean boolean33 = timeSeries25.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries21.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries21.addOrUpdate(regularTimePeriod35, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries46.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries46.createCopy((int) (short) 10, (int) ' ');
        boolean boolean52 = timeSeries3.equals((java.lang.Object) timeSeries46);
        int int53 = timeSeries46.getMaximumItemCount();
        timeSeries46.removeAgedItems(true);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        int int22 = timeSeries19.getMaximumItemCount();
        timeSeries19.setKey((java.lang.Comparable) 100);
        java.lang.String str25 = timeSeries19.getRangeDescription();
        int int26 = timeSeries19.getItemCount();
        timeSeries19.removeAgedItems(true);
        timeSeries19.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list31 = timeSeries19.getItems();
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class37 = timeSeries36.getTimePeriodClass();
        timeSeries36.clear();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries39.delete(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(10L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod19, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        double double12 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.addOrUpdate(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int14 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        java.util.List list12 = timeSeries3.getItems();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries8.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        long long10 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Object obj25 = timeSeries21.clone();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null; // flaky: timeSeries21.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        java.lang.Object obj16 = timeSeries10.clone();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries10.getValue(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries17.getItems();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.String str29 = timeSeries26.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries26.createCopy(regularTimePeriod30, regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(true);
        timeSeries3.fireSeriesChanged();
        boolean boolean8 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.util.List list18 = timeSeries17.getItems();
        timeSeries17.setMaximumItemCount((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, number11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        timeSeries38.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = timeSeries38.getIndex(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.createCopy((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries25.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        long long8 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemAge((long) 100);
        timeSeries3.clear();
        java.lang.Class class15 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        timeSeries10.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        timeSeries3.fireSeriesChanged();
        boolean boolean9 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        long long15 = timeSeries13.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener16);
        timeSeries13.setRangeDescription("");
        java.lang.Object obj20 = timeSeries13.clone();
        timeSeries13.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        timeSeries26.setRangeDescription("hi!");
        timeSeries26.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries26.removeChangeListener(seriesChangeListener32);
        timeSeries26.fireSeriesChanged();
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries13.addAndOrUpdate(timeSeries26);
        boolean boolean40 = timeSeries3.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        java.lang.Object obj4 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(100, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        double double12 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean16 = timeSeries8.equals((java.lang.Object) timeSeries14);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        timeSeries52.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries52.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        int int17 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        timeSeries3.removeAgedItems((-1L), true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        timeSeries3.fireSeriesChanged();
        boolean boolean9 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.update((-1), (java.lang.Number) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.lang.Class class15 = timeSeries3.getTimePeriodClass();
        java.lang.String str16 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries3.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem73 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        timeSeries22.removeAgedItems((long) 1, false);
        timeSeries22.setDescription("Time");
        timeSeries22.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod80 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod80, (double) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries3.getDescription();
        int int14 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setDomainDescription("Time");
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str24 = timeSeries23.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries30.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries30);
        long long34 = timeSeries30.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.createCopy((int) (byte) 1, (int) '#');
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = timeSeries38.getValue(regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        boolean boolean11 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries17.createCopy((int) 'a', (int) (byte) 100);
        int int74 = timeSeries17.getMaximumItemCount();
        timeSeries17.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null; // flaky: timeSeries11.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        timeSeries13.setRangeDescription("hi!");
        java.util.Collection collection17 = timeSeries13.getTimePeriods();
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        java.util.List list33 = timeSeries29.getItems();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries13.addAndOrUpdate(timeSeries29);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        java.util.Collection collection42 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries8.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries19.addOrUpdate(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        java.util.List list31 = timeSeries27.getItems();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries27.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        java.lang.Number number36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries27.addOrUpdate(regularTimePeriod35, number36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        int int22 = timeSeries19.getMaximumItemCount();
        timeSeries19.setKey((java.lang.Comparable) 100);
        java.lang.String str25 = timeSeries19.getRangeDescription();
        int int26 = timeSeries19.getItemCount();
        timeSeries19.removeAgedItems(true);
        timeSeries19.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list31 = timeSeries19.getItems();
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class37 = timeSeries36.getTimePeriodClass();
        timeSeries36.clear();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries36);
        boolean boolean40 = timeSeries39.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries39.getDataItem(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 1, false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "", "Overwritten values from: Overwritten values from: 10");
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(2147483647, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = timeSeries3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(regularTimePeriod14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries54.update(0, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries64.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        timeSeries70.addPropertyChangeListener(propertyChangeListener72);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries77.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries70.addAndOrUpdate(timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries84.removeAgedItems(true);
        int int87 = timeSeries84.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries88 = timeSeries80.addAndOrUpdate(timeSeries84);
        java.util.Collection collection89 = timeSeries64.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.util.Collection collection90 = timeSeries80.getTimePeriods();
        int int91 = timeSeries80.getItemCount();
        java.util.Collection collection92 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.lang.Object obj93 = timeSeries80.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem94 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries80.add(timeSeriesDataItem94, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNotNull(obj93);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.update(regularTimePeriod46, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries3.setNotify(false);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries45 = timeSeries36.createCopy(regularTimePeriod43, regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        timeSeries3.clear();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection32 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.List list33 = timeSeries29.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.delete(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries9.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.createCopy((int) (short) 10, (int) ' ');
        timeSeries9.setDescription("hi!");
        java.lang.String str17 = timeSeries9.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries18.addOrUpdate(regularTimePeriod19, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries14.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        timeSeries1.setDescription("hi!");
        timeSeries1.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = timeSeries9.getValue(regularTimePeriod55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list15 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod29, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        java.lang.Class class38 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries27.addAndOrUpdate(timeSeries49);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.delete((int) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries53);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((-1), (int) '4', true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null; // flaky: timeSeries3.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        timeSeries40.removeAgedItems((long) '#', true);
        double double44 = timeSeries40.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.update((int) (short) 10, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Overwritten values from: Overwritten values from: 10", "Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        timeSeries3.setKey((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        timeSeries17.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries17.addOrUpdate(regularTimePeriod26, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setRangeDescription("Time");
        int int11 = timeSeries3.getItemCount();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries28.addOrUpdate(regularTimePeriod30, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Overwritten values from: 10", "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries26.addOrUpdate(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries3.addChangeListener(seriesChangeListener28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        long long2 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.Object obj9 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.lang.Class class28 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries32.removeAgedItems(true);
        int int35 = timeSeries32.getMaximumItemCount();
        timeSeries32.setKey((java.lang.Comparable) 100);
        boolean boolean38 = timeSeries23.equals((java.lang.Object) 100);
        java.lang.String str39 = timeSeries23.getRangeDescription();
        java.util.Collection collection40 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        int int22 = timeSeries19.getMaximumItemCount();
        timeSeries19.setKey((java.lang.Comparable) 100);
        java.lang.String str25 = timeSeries19.getRangeDescription();
        int int26 = timeSeries19.getItemCount();
        timeSeries19.removeAgedItems(true);
        timeSeries19.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list31 = timeSeries19.getItems();
        timeSeries19.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries19);
        timeSeries3.setRangeDescription("Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Overwritten values from: 10", "");
        timeSeries3.clear();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        boolean boolean29 = timeSeries19.equals((java.lang.Object) "Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries19.addOrUpdate(regularTimePeriod30, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str19 = timeSeries18.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries25.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.update(regularTimePeriod30, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries21.addChangeListener(seriesChangeListener24);
        timeSeries21.setKey((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries21.delete((int) (short) -1, (-1), false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class12 = timeSeries11.getTimePeriodClass();
        timeSeries11.removeAgedItems(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.lang.String str16 = timeSeries3.getDomainDescription();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        java.util.List list31 = timeSeries27.getItems();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries27.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null; // flaky: timeSeries34.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(0, 0);
        java.lang.Class<?> wildcardClass19 = timeSeries18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 9223372036854775807L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries17.removeChangeListener(seriesChangeListener33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod35, (java.lang.Number) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        int int14 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        timeSeries1.setRangeDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries21.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null; // flaky: timeSeries21.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Class<?> wildcardClass29 = collection28.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries10.delete((int) (short) -1, (int) (short) -1, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries1.delete((-1), (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        boolean boolean29 = timeSeries26.isEmpty();
        int int30 = timeSeries26.getMaximumItemCount();
        java.util.Collection collection31 = timeSeries26.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries26.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        boolean boolean29 = timeSeries19.equals((java.lang.Object) "Overwritten values from: Overwritten values from: 10");
        timeSeries19.setNotify(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        int int23 = timeSeries11.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.createCopy((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(2147483647, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Value", "hi!");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.Object obj5 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class12 = timeSeries11.getTimePeriodClass();
        timeSeries11.removeAgedItems(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.lang.String str16 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries3.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        long long13 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Object obj2 = timeSeries1.clone();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (java.lang.Number) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener33);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        java.lang.Class<?> wildcardClass41 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod12, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        int int9 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getMaximumItemCount();
        boolean boolean3 = timeSeries1.isEmpty();
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        timeSeries14.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries31 = timeSeries14.createCopy(regularTimePeriod29, regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        java.util.Collection collection64 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries67 = timeSeries62.createCopy(regularTimePeriod65, regularTimePeriod66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        timeSeries3.setRangeDescription("Value");
        java.lang.Class<?> wildcardClass13 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        int int19 = timeSeries3.getMaximumItemCount();
        long long20 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Time");
        timeSeries3.setDomainDescription("hi!");
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10L + "'", comparable11, 10L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        long long27 = timeSeries14.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries14.addChangeListener(seriesChangeListener28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Value", "Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        java.lang.String str30 = timeSeries19.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(1, (int) (byte) 10);
        java.lang.Comparable comparable34 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str48 = timeSeries47.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries54.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries54);
        java.util.List list58 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries38.addAndOrUpdate(timeSeries54);
        timeSeries59.setRangeDescription("");
        java.util.Collection collection62 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod63, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 10" + "'", comparable34, "Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.setKey((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "Value", "Value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        int int23 = timeSeries1.getItemCount();
        timeSeries1.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("");
        timeSeries3.setMaximumItemCount((int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) 'a', (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries54.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        boolean boolean5 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        timeSeries1.setDescription("hi!");
        timeSeries1.setDomainDescription("Overwritten values from: 10");
        timeSeries1.setDescription("Time");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        java.lang.Object obj16 = timeSeries10.clone();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.util.List list41 = timeSeries40.getItems();
        boolean boolean42 = timeSeries10.equals((java.lang.Object) list41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        timeSeries19.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass28 = timeSeries19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries25.removeAgedItems(true);
        int int28 = timeSeries25.getMaximumItemCount();
        timeSeries25.setKey((java.lang.Comparable) 100);
        java.lang.String str31 = timeSeries25.getRangeDescription();
        int int32 = timeSeries25.getItemCount();
        boolean boolean33 = timeSeries25.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries21.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod15, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class28 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries32.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries46.removeAgedItems(true);
        int int49 = timeSeries46.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries42.addAndOrUpdate(timeSeries46);
        boolean boolean51 = timeSeries50.getNotify();
        java.util.Collection collection52 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        timeSeries27.setDomainDescription("Overwritten values from: 10");
        boolean boolean55 = timeSeries3.equals((java.lang.Object) "Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries3.addOrUpdate(timeSeriesDataItem56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries3.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.util.Collection collection29 = timeSeries19.getTimePeriods();
        int int30 = timeSeries19.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str17 = timeSeries16.getDomainDescription();
        timeSeries16.setRangeDescription("hi!");
        timeSeries16.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries16.removeChangeListener(seriesChangeListener22);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDescription("Time");
        timeSeries16.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        int int15 = timeSeries10.getItemCount();
        timeSeries10.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries10.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod19, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        int int14 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries11.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.util.List list18 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str28 = timeSeries27.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries34.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries41.removeAgedItems(true);
        int int44 = timeSeries41.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.Collection collection47 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        timeSeries22.setDomainDescription("Overwritten values from: 10");
        timeSeries22.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries55.addPropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = timeSeries55.isEmpty();
        timeSeries55.clear();
        int int60 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries22.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries65.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.createCopy((int) (short) 10, (int) ' ');
        boolean boolean71 = timeSeries22.equals((java.lang.Object) timeSeries65);
        boolean boolean72 = timeSeries11.equals((java.lang.Object) timeSeries22);
        java.lang.Comparable comparable73 = timeSeries22.getKey();
        timeSeries22.removeAgedItems(100L, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(timeSeriesDataItem77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + 10L + "'", comparable73, 10L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        timeSeries3.setKey((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries12.removeAgedItems(true);
        int int15 = timeSeries12.getMaximumItemCount();
        timeSeries12.setKey((java.lang.Comparable) 100);
        int int18 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries10.removeChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null; // flaky: timeSeries10.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        java.util.List list29 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.fireSeriesChanged();
        java.lang.Object obj34 = timeSeries31.clone();
        timeSeries31.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries28.addOrUpdate(regularTimePeriod38, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        boolean boolean12 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.util.List list2 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries3.addOrUpdate(regularTimePeriod26, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Object obj25 = timeSeries21.clone();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod28, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        int int6 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries12.removeAgedItems(true);
        int int15 = timeSeries12.getMaximumItemCount();
        timeSeries12.setKey((java.lang.Comparable) 100);
        int int18 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries12.setDomainDescription("Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection6 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries20.addAndOrUpdate(timeSeries27);
        java.util.List list31 = timeSeries27.getItems();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries27.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod35, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.fireSeriesChanged();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        java.lang.String str27 = timeSeries23.getRangeDescription();
        java.lang.Comparable comparable28 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        boolean boolean36 = timeSeries23.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str41 = timeSeries40.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries47);
        java.util.List list51 = timeSeries47.getItems();
        java.lang.Object obj52 = null;
        boolean boolean53 = timeSeries47.equals(obj52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries23.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries3.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = timeSeries55.addOrUpdate(regularTimePeriod56, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10L + "'", comparable28, 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.String str22 = timeSeries13.getDomainDescription();
        timeSeries13.setMaximumItemAge((long) 0);
        java.lang.String str25 = timeSeries13.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries13.addOrUpdate(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.util.List list18 = timeSeries17.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod19, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        long long7 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null; // flaky: timeSeries3.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.fireSeriesChanged();
        java.util.List list12 = timeSeries9.getItems();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod38, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod24, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection32 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        int int33 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.update(regularTimePeriod34, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries12.removeAgedItems((-1L), false);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries10.removeChangeListener(seriesChangeListener60);
        java.lang.Object obj62 = timeSeries10.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod63, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        timeSeries8.setRangeDescription("Value");
        double double12 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("Time");
        java.util.List list19 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod20, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod13, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        timeSeries10.removeAgedItems(false);
        boolean boolean18 = timeSeries10.getNotify();
        java.util.List list19 = timeSeries10.getItems();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(regularTimePeriod46, (double) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        double double12 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) '#');
        java.lang.Class<?> wildcardClass15 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        long long9 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (short) -1, 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Value", "hi!");
        timeSeries3.removeAgedItems((long) (byte) -1, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries3.getItemCount();
        boolean boolean26 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        timeSeries40.setMaximumItemAge((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.delete((int) (short) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries25.removeAgedItems(true);
        int int28 = timeSeries25.getMaximumItemCount();
        timeSeries25.setKey((java.lang.Comparable) 100);
        java.lang.String str31 = timeSeries25.getRangeDescription();
        int int32 = timeSeries25.getItemCount();
        boolean boolean33 = timeSeries25.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries21.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries37 = timeSeries21.createCopy(regularTimePeriod35, regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        java.util.List list12 = timeSeries8.getItems();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection32 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        int int33 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries24.addOrUpdate(regularTimePeriod34, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Object obj2 = timeSeries1.clone();
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "Time");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) '#', (int) 'a');
        java.lang.String str7 = timeSeries3.getRangeDescription();
        long long8 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        boolean boolean14 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        int int4 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        timeSeries3.removeAgedItems((long) 'a', false);
        java.lang.Object obj12 = timeSeries3.clone();
        java.util.List list13 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str14 = timeSeries13.getDomainDescription();
        timeSeries13.setRangeDescription("hi!");
        java.util.Collection collection17 = timeSeries13.getTimePeriods();
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        java.util.List list33 = timeSeries29.getItems();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries13.addAndOrUpdate(timeSeries29);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries39.removeAgedItems(true);
        java.util.Collection collection42 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries8.addAndOrUpdate(timeSeries39);
        long long44 = timeSeries43.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = timeSeries43.getValue(regularTimePeriod45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9223372036854775807L + "'", long44 == 9223372036854775807L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        int int16 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Overwritten values from: Overwritten values from: 10", "Overwritten values from: 100");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        java.lang.Object obj13 = timeSeries10.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("hi!");
        boolean boolean16 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.List list21 = timeSeries17.getItems();
        java.lang.Object obj22 = null;
        boolean boolean23 = timeSeries17.equals(obj22);
        int int24 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class29 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str34 = timeSeries33.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        int int50 = timeSeries47.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries43.addAndOrUpdate(timeSeries47);
        boolean boolean52 = timeSeries51.getNotify();
        java.util.Collection collection53 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries28.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str60 = timeSeries59.getDomainDescription();
        timeSeries59.removeAgedItems(true);
        timeSeries59.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries28.addAndOrUpdate(timeSeries59);
        java.util.Collection collection66 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.util.Collection collection67 = timeSeries59.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries3.addAndOrUpdate(timeSeries59);
        timeSeries68.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries68.addOrUpdate(timeSeriesDataItem71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        java.util.Collection collection64 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries32.add(regularTimePeriod65, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str8 = timeSeries7.getDomainDescription();
        long long9 = timeSeries7.getMaximumItemAge();
        boolean boolean10 = timeSeries7.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries14.removeAgedItems(true);
        java.lang.Class class17 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries7.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.fireSeriesChanged();
        boolean boolean23 = timeSeries7.equals((java.lang.Object) timeSeries20);
        java.util.Collection collection24 = timeSeries20.getTimePeriods();
        boolean boolean25 = timeSeries1.equals((java.lang.Object) collection24);
        org.junit.Assert.assertNull(class2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        timeSeries3.removeAgedItems((long) (short) 1, true);
        long long16 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        timeSeries3.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass45 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDescription("");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 'a' + "'", comparable6, 'a');
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        int int7 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries3.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries11.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        java.lang.String str18 = timeSeries11.getDomainDescription();
        timeSeries11.setRangeDescription("Value");
        int int21 = timeSeries11.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries11.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod25, (double) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        boolean boolean18 = timeSeries10.getNotify();
        java.lang.String str19 = timeSeries10.getDomainDescription();
        int int20 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null; // flaky: timeSeries14.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.util.Collection collection29 = timeSeries19.getTimePeriods();
        double double30 = timeSeries19.getMinY();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        java.lang.String str24 = timeSeries17.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries17.addOrUpdate(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update(regularTimePeriod11, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        boolean boolean2 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.lang.Comparable comparable43 = timeSeries40.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.delete(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + "Overwritten values from: Overwritten values from: 10" + "'", comparable43, "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        timeSeries3.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy((int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.Comparable comparable31 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(regularTimePeriod32, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10L + "'", comparable31, 10L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        java.lang.String str5 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class10 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries21.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries28.removeAgedItems(true);
        int int31 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries24.addAndOrUpdate(timeSeries28);
        boolean boolean33 = timeSeries32.getNotify();
        java.util.Collection collection34 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str39 = timeSeries38.getDomainDescription();
        timeSeries38.setRangeDescription("hi!");
        java.util.Collection collection42 = timeSeries38.getTimePeriods();
        java.lang.Comparable comparable43 = timeSeries38.getKey();
        boolean boolean44 = timeSeries9.equals((java.lang.Object) comparable43);
        timeSeries9.removeAgedItems((long) 100, true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        timeSeries49.fireSeriesChanged();
        java.lang.String str52 = timeSeries49.getDescription();
        boolean boolean53 = timeSeries9.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.addChangeListener(seriesChangeListener61);
        java.util.Collection collection63 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries58.addOrUpdate(timeSeriesDataItem64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10L + "'", comparable43, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries3.addOrUpdate(regularTimePeriod29, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10L + "'", comparable11, 10L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.isEmpty();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.removeAgedItems(true);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.update((int) (byte) -1, (java.lang.Number) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str15 = timeSeries14.getDomainDescription();
        timeSeries14.setRangeDescription("hi!");
        timeSeries14.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        boolean boolean22 = timeSeries14.getNotify();
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries14.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries14.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries64.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        timeSeries70.addPropertyChangeListener(propertyChangeListener72);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries77.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries70.addAndOrUpdate(timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries84.removeAgedItems(true);
        int int87 = timeSeries84.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries88 = timeSeries80.addAndOrUpdate(timeSeries84);
        java.util.Collection collection89 = timeSeries64.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.util.Collection collection90 = timeSeries80.getTimePeriods();
        int int91 = timeSeries80.getItemCount();
        java.util.Collection collection92 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.lang.Object obj93 = timeSeries3.clone();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNotNull(obj93);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries10.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        timeSeries19.clear();
        boolean boolean30 = timeSeries19.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        int int10 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        int int16 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries20.removeAgedItems(true);
        int int23 = timeSeries20.getMaximumItemCount();
        timeSeries20.setKey((java.lang.Comparable) 100);
        java.lang.String str26 = timeSeries20.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str31 = timeSeries30.getDomainDescription();
        timeSeries30.setRangeDescription("");
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        boolean boolean35 = timeSeries3.equals((java.lang.Object) collection34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Object obj38 = timeSeries37.clone();
        java.util.List list39 = timeSeries37.getItems();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries37);
        java.lang.String str41 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.removeAgedItems((long) 100, false);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(0L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.addOrUpdate(regularTimePeriod16, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries1.getDataItem(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        boolean boolean15 = timeSeries3.getNotify();
        java.lang.String str16 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        long long67 = timeSeries17.getMaximumItemAge();
        timeSeries17.removeAgedItems((long) (byte) 0, false);
        boolean boolean71 = timeSeries17.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete((int) (byte) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9223372036854775807L + "'", long67 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str27 = timeSeries26.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries33.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        int int43 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean45 = timeSeries44.getNotify();
        java.util.Collection collection46 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries21.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str53 = timeSeries52.getDomainDescription();
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries21.addAndOrUpdate(timeSeries52);
        java.util.Collection collection59 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        java.lang.String str60 = timeSeries52.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries52.add(regularTimePeriod61, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries25.removeAgedItems(true);
        int int28 = timeSeries25.getMaximumItemCount();
        timeSeries25.setKey((java.lang.Comparable) 100);
        java.lang.String str31 = timeSeries25.getRangeDescription();
        int int32 = timeSeries25.getItemCount();
        boolean boolean33 = timeSeries25.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries21.addAndOrUpdate(timeSeries25);
        int int35 = timeSeries21.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "hi!", "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries1.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str10 = timeSeries9.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries16.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries19.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.String str29 = timeSeries19.getDescription();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null; // flaky: timeSeries19.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 10" + "'", comparable30, "Overwritten values from: 10");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null; // flaky: timeSeries1.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        int int6 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(0, (int) (byte) 0);
        int int10 = timeSeries9.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null; // flaky: timeSeries9.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        int int23 = timeSeries1.getItemCount();
        timeSeries1.setDomainDescription("Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod26, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.fireSeriesChanged();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries23.removeAgedItems(true);
        int int26 = timeSeries23.getMaximumItemCount();
        java.lang.String str27 = timeSeries23.getRangeDescription();
        java.lang.Comparable comparable28 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        boolean boolean36 = timeSeries23.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str41 = timeSeries40.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries40.addAndOrUpdate(timeSeries47);
        java.util.List list51 = timeSeries47.getItems();
        java.lang.Object obj52 = null;
        boolean boolean53 = timeSeries47.equals(obj52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries23.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries3.addAndOrUpdate(timeSeries23);
        boolean boolean56 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '4', (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10L + "'", comparable28, 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        int int10 = timeSeries8.getMaximumItemCount();
        timeSeries8.setDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        int int19 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection20 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 10);
        timeSeries13.setRangeDescription("Overwritten values from: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        boolean boolean9 = timeSeries8.isEmpty();
        boolean boolean10 = timeSeries8.getNotify();
        boolean boolean11 = timeSeries8.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy(regularTimePeriod19, regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        long long10 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.createCopy((int) (byte) 1, (int) '#');
        java.util.List list18 = timeSeries17.getItems();
        java.util.Collection collection19 = timeSeries17.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        double double16 = timeSeries3.getMaxY();
        java.lang.String str17 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries1.update((int) (byte) -1, (java.lang.Number) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Overwritten values from: Overwritten values from: 10", "Overwritten values from: Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        timeSeries3.clear();
        double double11 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 'a', true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        double double16 = timeSeries3.getMaxY();
        java.lang.String str17 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class12 = timeSeries11.getTimePeriodClass();
        timeSeries11.removeAgedItems(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.lang.String str16 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 100, true);
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        timeSeries24.setDomainDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(timeSeriesDataItem28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        boolean boolean11 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        long long14 = timeSeries12.getMaximumItemAge();
        boolean boolean15 = timeSeries12.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        java.lang.Class class22 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries12.addAndOrUpdate(timeSeries19);
        int int24 = timeSeries19.getItemCount();
        java.lang.Object obj25 = timeSeries19.clone();
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete((int) '4', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener38);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null; // flaky: timeSeries37.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Value", "hi!");
        timeSeries3.removeAgedItems((long) (byte) -1, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries1.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null; // flaky: timeSeries1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN, "", "Time");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.removeChangeListener(seriesChangeListener19);
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries3.getDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        timeSeries17.fireSeriesChanged();
        long long24 = timeSeries17.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries17.getValue(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.util.Collection collection12 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        java.lang.Object obj13 = timeSeries10.clone();
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        int int15 = timeSeries10.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from: 10");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        int int10 = timeSeries8.getMaximumItemCount();
        java.lang.Class<?> wildcardClass11 = timeSeries8.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        int int17 = timeSeries10.getMaximumItemCount();
        int int18 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str23 = timeSeries22.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries36.removeAgedItems(true);
        int int39 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries10.addOrUpdate(timeSeriesDataItem43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        boolean boolean7 = timeSeries3.isEmpty();
        java.lang.Object obj8 = timeSeries3.clone();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        boolean boolean25 = timeSeries19.getNotify();
        java.lang.String str26 = timeSeries19.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.createCopy((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str9 = timeSeries8.getDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        double double11 = timeSeries8.getMinY();
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        java.util.List list13 = timeSeries8.getItems();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        timeSeries3.setMaximumItemAge((long) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.fireSeriesChanged();
        boolean boolean5 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries9.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.createCopy((int) (short) 10, (int) ' ');
        timeSeries9.setDescription("hi!");
        java.lang.String str17 = timeSeries9.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (java.lang.Number) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        int int18 = timeSeries15.getMaximumItemCount();
        timeSeries15.setKey((java.lang.Comparable) 100);
        java.lang.String str21 = timeSeries15.getRangeDescription();
        int int22 = timeSeries15.getItemCount();
        timeSeries15.removeAgedItems(true);
        timeSeries15.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list27 = timeSeries15.getItems();
        int int28 = timeSeries15.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update((int) (byte) 0, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "hi!", "Overwritten values from: 100");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        double double7 = timeSeries3.getMinY();
        int int8 = timeSeries3.getItemCount();
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        boolean boolean10 = timeSeries3.getNotify();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        java.lang.Object obj24 = timeSeries17.clone();
        timeSeries17.setNotify(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str21 = timeSeries20.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        timeSeries20.setKey((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int27 = timeSeries10.getItemCount();
        java.lang.Comparable comparable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.setKey(comparable28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.util.List list3 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.lang.String str2 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(timeSeriesDataItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries13.removeAgedItems(true);
        int int16 = timeSeries13.getMaximumItemCount();
        double double17 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.fireSeriesChanged();
        java.util.List list22 = timeSeries19.getItems();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries19);
        timeSeries13.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries3.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries26.addOrUpdate(regularTimePeriod27, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        timeSeries26.setMaximumItemAge((long) (short) 10);
        timeSeries26.setMaximumItemAge((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.lang.String str29 = timeSeries26.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries26.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = timeSeries36.isEmpty();
        timeSeries36.clear();
        int int41 = timeSeries36.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries42.addOrUpdate(timeSeriesDataItem43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge(0L);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        int int11 = timeSeries3.getMaximumItemCount();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Overwritten values from: 10");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: 10" + "'", str4, "Overwritten values from: 10");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = timeSeries13.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null; // flaky: timeSeries3.getNextTimePeriod();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 100", "Overwritten values from: Overwritten values from: 10");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        timeSeries1.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int22 = timeSeries1.getItemCount();
        int int23 = timeSeries1.getItemCount();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str30 = timeSeries29.getDomainDescription();
        timeSeries29.setRangeDescription("");
        boolean boolean33 = timeSeries29.isEmpty();
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.lang.Class<?> wildcardClass37 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        timeSeries3.setRangeDescription("");
        java.lang.Object obj10 = timeSeries3.clone();
        java.lang.String str11 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str16 = timeSeries15.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        int int32 = timeSeries29.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries25.addAndOrUpdate(timeSeries29);
        java.util.List list34 = timeSeries33.getItems();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries38.fireSeriesChanged();
        java.lang.String str40 = timeSeries38.getDescription();
        timeSeries38.setRangeDescription("Time");
        java.util.Collection collection43 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries3.addAndOrUpdate(timeSeries33);
        boolean boolean45 = timeSeries44.getNotify();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.Class class31 = timeSeries3.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries3.addChangeListener(seriesChangeListener32);
        timeSeries3.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries3.addOrUpdate(regularTimePeriod36, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str33 = timeSeries32.getDomainDescription();
        timeSeries32.setRangeDescription("hi!");
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries3.equals((java.lang.Object) comparable37);
        timeSeries3.removeAgedItems((long) 100, true);
        boolean boolean42 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod43, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10L + "'", comparable37, 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.String str14 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) ' ', (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.Class class31 = timeSeries3.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries3.addChangeListener(seriesChangeListener32);
        timeSeries3.setDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem36, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        double double4 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        int int16 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries3.delete((int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        double double22 = timeSeries21.getMinY();
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries21.update((int) (byte) -1, number24);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        timeSeries3.setRangeDescription("");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        timeSeries3.setDescription("");
        timeSeries3.setKey((java.lang.Comparable) ' ');
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        timeSeries3.setDescription("hi!");
        java.lang.String str11 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) '4');
        java.lang.String str15 = timeSeries3.getDomainDescription();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.lang.String str14 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount(1);
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.removeChangeListener(seriesChangeListener19);
        timeSeries3.clear();
        java.util.Collection collection22 = timeSeries3.getTimePeriods();
        java.lang.Class class23 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class23);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        long long5 = timeSeries3.getMaximumItemAge();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        java.lang.Class class13 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries10);
        timeSeries3.setDescription("");
        timeSeries3.setMaximumItemAge((long) (short) 0);
        boolean boolean19 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy((int) (byte) 10, (int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener27);
        double double29 = timeSeries26.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount(2147483647);
        int int9 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.lang.Class class23 = timeSeries11.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNull(class23);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        java.util.List list14 = timeSeries10.getItems();
        java.lang.Object obj15 = null;
        boolean boolean16 = timeSeries10.equals(obj15);
        timeSeries10.fireSeriesChanged();
        timeSeries10.setNotify(true);
        long long20 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries10.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class class9 = timeSeries3.getTimePeriodClass();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        int int13 = timeSeries3.getItemCount();
        int int14 = timeSeries3.getItemCount();
        java.util.Collection collection15 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries3.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries3.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries27.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 10, (int) ' ');
        timeSeries27.setDescription("hi!");
        timeSeries27.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class42 = timeSeries41.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str47 = timeSeries46.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries46.addPropertyChangeListener(propertyChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries53.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries46.addAndOrUpdate(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries60.removeAgedItems(true);
        int int63 = timeSeries60.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries56.addAndOrUpdate(timeSeries60);
        boolean boolean65 = timeSeries64.getNotify();
        java.util.Collection collection66 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str71 = timeSeries70.getDomainDescription();
        timeSeries70.setRangeDescription("hi!");
        java.util.Collection collection74 = timeSeries70.getTimePeriods();
        java.lang.Comparable comparable75 = timeSeries70.getKey();
        boolean boolean76 = timeSeries41.equals((java.lang.Object) comparable75);
        java.util.Collection collection77 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.delete(regularTimePeriod78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertEquals("'" + comparable75 + "' != '" + 10L + "'", comparable75, 10L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.Object obj9 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy((int) ' ', 2147483647);
        timeSeries19.clear();
        timeSeries19.setKey((java.lang.Comparable) "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.addOrUpdate(regularTimePeriod32, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        boolean boolean22 = timeSeries21.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Object obj25 = timeSeries21.clone();
        double double26 = timeSeries21.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timeSeries21.update((int) (byte) -1, (java.lang.Number) (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class33 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str38 = timeSeries37.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries44.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries51.removeAgedItems(true);
        int int54 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries47.addAndOrUpdate(timeSeries51);
        boolean boolean56 = timeSeries55.getNotify();
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        timeSeries32.setDomainDescription("Overwritten values from: 10");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries3.setNotify(false);
        java.util.List list63 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int66 = timeSeries65.getMaximumItemCount();
        int int67 = timeSeries65.getItemCount();
        boolean boolean68 = timeSeries3.equals((java.lang.Object) timeSeries65);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries65.add(regularTimePeriod69, (double) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries29.removeAgedItems(true);
        java.util.Collection collection32 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries24.removeAgedItems((long) 10, false);
        timeSeries24.setDescription("Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        java.lang.Class class31 = timeSeries3.getTimePeriodClass();
        timeSeries3.clear();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.String str2 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.addOrUpdate(regularTimePeriod3, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        long long12 = timeSeries10.getMaximumItemAge();
        boolean boolean13 = timeSeries10.isEmpty();
        timeSeries10.setDomainDescription("hi!");
        timeSeries10.removeAgedItems(true);
        boolean boolean18 = timeSeries10.getNotify();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.isEmpty();
        timeSeries3.clear();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setDomainDescription("");
        java.lang.String str11 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection13 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Time");
        timeSeries3.removeAgedItems((long) (short) 1, true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str11 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries10.addAndOrUpdate(timeSeries17);
        java.util.List list21 = timeSeries17.getItems();
        java.lang.Object obj22 = null;
        boolean boolean23 = timeSeries17.equals(obj22);
        int int24 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class29 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str34 = timeSeries33.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries40.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries47.removeAgedItems(true);
        int int50 = timeSeries47.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries43.addAndOrUpdate(timeSeries47);
        boolean boolean52 = timeSeries51.getNotify();
        java.util.Collection collection53 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        timeSeries28.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str60 = timeSeries59.getDomainDescription();
        timeSeries59.removeAgedItems(true);
        timeSeries59.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries28.addAndOrUpdate(timeSeries59);
        java.util.Collection collection66 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.util.Collection collection67 = timeSeries59.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries3.addAndOrUpdate(timeSeries59);
        timeSeries68.setNotify(true);
        java.lang.Comparable comparable71 = timeSeries68.getKey();
        timeSeries68.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertEquals("'" + comparable71 + "' != '" + "Overwritten values from: 100" + "'", comparable71, "Overwritten values from: 100");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setKey((java.lang.Comparable) 100);
        java.lang.String str9 = timeSeries3.getRangeDescription();
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        java.util.List list15 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str9 = timeSeries8.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries8.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries22.removeAgedItems(true);
        int int25 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str35 = timeSeries34.getDomainDescription();
        timeSeries34.removeAgedItems(true);
        timeSeries34.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries34);
        timeSeries40.removeAgedItems((long) '#', true);
        double double44 = timeSeries40.getMaxY();
        double double45 = timeSeries40.getMinY();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.removeAgedItems(true);
        int int6 = timeSeries3.getMaximumItemCount();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10L + "'", comparable11, 10L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setMaximumItemAge((long) ' ');
        timeSeries3.setDomainDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries13.addOrUpdate(regularTimePeriod22, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str13 = timeSeries12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.addAndOrUpdate(timeSeries19);
        java.util.List list23 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod25, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries17.removeAgedItems(true);
        int int20 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries26.removeAgedItems(true);
        int int29 = timeSeries26.getMaximumItemCount();
        timeSeries26.setKey((java.lang.Comparable) 100);
        boolean boolean32 = timeSeries17.equals((java.lang.Object) 100);
        java.lang.String str33 = timeSeries17.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.Class class38 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        java.lang.String str43 = timeSeries42.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries49.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries42.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries56.removeAgedItems(true);
        int int59 = timeSeries56.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean61 = timeSeries60.getNotify();
        java.util.Collection collection62 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries60);
        timeSeries37.setDomainDescription("Overwritten values from: 10");
        timeSeries37.fireSeriesChanged();
        boolean boolean66 = timeSeries17.equals((java.lang.Object) timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod67, (java.lang.Number) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }
}
