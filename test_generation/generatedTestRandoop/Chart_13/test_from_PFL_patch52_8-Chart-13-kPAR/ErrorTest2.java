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
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean7 = borderArrangement5.equals((java.lang.Object) 10);
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 0.0f);
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) "hi!");
        boolean boolean15 = borderArrangement5.equals((java.lang.Object) boolean14);
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement5.equals(obj16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement5 and borderArrangement10", borderArrangement5.equals(borderArrangement10) ? borderArrangement5.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement23.add(block28, obj29);
        borderArrangement17.add(block22, obj29);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement17.getClass();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean37 = borderArrangement35.equals((java.lang.Object) 10);
        borderArrangement35.clear();
        borderArrangement35.clear();
        org.jfree.chart.block.Block block40 = null;
        java.lang.Object obj41 = null;
        borderArrangement35.add(block40, obj41);
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement49 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement49.clear();
        boolean boolean52 = borderArrangement49.equals((java.lang.Object) '#');
        borderArrangement49.clear();
        boolean boolean55 = borderArrangement49.equals((java.lang.Object) "");
        boolean boolean57 = borderArrangement49.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement58 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement58.clear();
        boolean boolean61 = borderArrangement58.equals((java.lang.Object) '#');
        boolean boolean62 = borderArrangement49.equals((java.lang.Object) '#');
        borderArrangement49.clear();
        borderArrangement49.clear();
        boolean boolean65 = borderArrangement35.equals((java.lang.Object) borderArrangement49);
        boolean boolean66 = borderArrangement0.equals((java.lang.Object) borderArrangement49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement23", borderArrangement17.equals(borderArrangement23) ? borderArrangement17.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement22.equals((java.lang.Object) (byte) -1);
        boolean boolean28 = borderArrangement8.equals((java.lang.Object) borderArrangement22);
        java.lang.Class<?> wildcardClass29 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) (byte) 100);
        borderArrangement27.clear();
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        boolean boolean43 = borderArrangement38.equals((java.lang.Object) (byte) -1);
        boolean boolean45 = borderArrangement38.equals((java.lang.Object) (-1));
        borderArrangement38.clear();
        borderArrangement38.clear();
        boolean boolean48 = borderArrangement27.equals((java.lang.Object) borderArrangement38);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement27", borderArrangement14.equals(borderArrangement27) ? borderArrangement14.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) 'a');
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) (byte) 100);
        borderArrangement33.clear();
        boolean boolean43 = borderArrangement30.equals((java.lang.Object) borderArrangement33);
        java.lang.Class<?> wildcardClass44 = borderArrangement30.getClass();
        boolean boolean45 = borderArrangement15.equals((java.lang.Object) wildcardClass44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement30", borderArrangement0.equals(borderArrangement30) ? borderArrangement0.hashCode() == borderArrangement30.hashCode() : true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        java.lang.Class<?> wildcardClass31 = borderArrangement19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) 10);
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement24.add(block29, obj30);
        borderArrangement24.clear();
        boolean boolean34 = borderArrangement24.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass35 = borderArrangement24.getClass();
        boolean boolean36 = borderArrangement8.equals((java.lang.Object) borderArrangement24);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) "");
        boolean boolean45 = borderArrangement37.equals((java.lang.Object) true);
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) "");
        boolean boolean59 = borderArrangement51.equals((java.lang.Object) true);
        boolean boolean60 = borderArrangement37.equals((java.lang.Object) borderArrangement51);
        borderArrangement51.clear();
        borderArrangement51.clear();
        java.lang.Class<?> wildcardClass63 = borderArrangement51.getClass();
        boolean boolean64 = borderArrangement8.equals((java.lang.Object) wildcardClass63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement24", borderArrangement0.equals(borderArrangement24) ? borderArrangement0.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        borderArrangement11.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) true);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) 10);
        boolean boolean31 = borderArrangement19.equals((java.lang.Object) (byte) 0);
        boolean boolean32 = borderArrangement11.equals((java.lang.Object) borderArrangement19);
        java.lang.Class<?> wildcardClass33 = borderArrangement11.getClass();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean37 = borderArrangement35.equals((java.lang.Object) 10);
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) 'a');
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement45 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement45.clear();
        boolean boolean48 = borderArrangement45.equals((java.lang.Object) '#');
        borderArrangement45.clear();
        boolean boolean51 = borderArrangement45.equals((java.lang.Object) "");
        borderArrangement45.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement53.clear();
        boolean boolean56 = borderArrangement53.equals((java.lang.Object) '#');
        borderArrangement53.clear();
        boolean boolean59 = borderArrangement53.equals((java.lang.Object) "");
        boolean boolean61 = borderArrangement53.equals((java.lang.Object) (byte) 100);
        borderArrangement53.clear();
        boolean boolean63 = borderArrangement45.equals((java.lang.Object) borderArrangement53);
        borderArrangement53.clear();
        borderArrangement53.clear();
        boolean boolean66 = borderArrangement35.equals((java.lang.Object) borderArrangement53);
        boolean boolean67 = borderArrangement0.equals((java.lang.Object) borderArrangement53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement19", borderArrangement11.equals(borderArrangement19) ? borderArrangement11.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement16.add(block21, obj22);
        borderArrangement16.clear();
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) borderArrangement16);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        java.lang.Class<?> wildcardClass27 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement16", borderArrangement13.equals(borderArrangement16) ? borderArrangement13.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) (byte) 100);
        borderArrangement28.clear();
        boolean boolean38 = borderArrangement20.equals((java.lang.Object) borderArrangement28);
        borderArrangement20.clear();
        boolean boolean40 = borderArrangement7.equals((java.lang.Object) borderArrangement20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement28", borderArrangement0.equals(borderArrangement28) ? borderArrangement0.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) 100.0f);
        borderArrangement29.clear();
        boolean boolean44 = borderArrangement16.equals((java.lang.Object) borderArrangement29);
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement46 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement46.clear();
        java.lang.Class<?> wildcardClass48 = borderArrangement46.getClass();
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) wildcardClass48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement16 and borderArrangement29", borderArrangement16.equals(borderArrangement29) ? borderArrangement16.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        java.lang.Class<?> wildcardClass31 = borderArrangement14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) 1L);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) "");
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        boolean boolean38 = borderArrangement33.equals((java.lang.Object) (byte) -1);
        boolean boolean39 = borderArrangement25.equals((java.lang.Object) borderArrangement33);
        java.lang.Class<?> wildcardClass40 = borderArrangement33.getClass();
        boolean boolean41 = borderArrangement17.equals((java.lang.Object) borderArrangement33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement25", borderArrangement0.equals(borderArrangement25) ? borderArrangement0.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) (byte) 100);
        borderArrangement17.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement17.equals(obj27);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) true);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean41 = borderArrangement17.equals((java.lang.Object) borderArrangement29);
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement29.equals(obj42);
        boolean boolean45 = borderArrangement29.equals((java.lang.Object) (-1.0d));
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement29", borderArrangement17.equals(borderArrangement29) ? borderArrangement17.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        borderArrangement18.clear();
        boolean boolean26 = borderArrangement11.equals((java.lang.Object) borderArrangement18);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        java.lang.Class<?> wildcardClass31 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement18", borderArrangement11.equals(borderArrangement18) ? borderArrangement11.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement3.equals(obj13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement3.equals((java.lang.Object) borderArrangement15);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement3.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 10);
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement18.add(block23, obj24);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement18.getClass();
        boolean boolean33 = borderArrangement5.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) 0L);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean26 = borderArrangement13.equals((java.lang.Object) 100.0f);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) (byte) 100);
        borderArrangement38.clear();
        boolean boolean48 = borderArrangement30.equals((java.lang.Object) borderArrangement38);
        borderArrangement38.clear();
        java.lang.Object obj50 = null;
        boolean boolean51 = borderArrangement38.equals(obj50);
        boolean boolean52 = borderArrangement0.equals((java.lang.Object) borderArrangement38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement30", borderArrangement13.equals(borderArrangement30) ? borderArrangement13.hashCode() == borderArrangement30.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement22.equals((java.lang.Object) (byte) -1);
        boolean boolean28 = borderArrangement14.equals((java.lang.Object) borderArrangement22);
        java.lang.Class<?> wildcardClass29 = borderArrangement14.getClass();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement22", borderArrangement14.equals(borderArrangement22) ? borderArrangement14.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) true);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) 'a');
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) true);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass46 = borderArrangement33.getClass();
        boolean boolean47 = borderArrangement25.equals((java.lang.Object) borderArrangement33);
        borderArrangement25.clear();
        boolean boolean50 = borderArrangement25.equals((java.lang.Object) (short) -1);
        boolean boolean51 = borderArrangement10.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement25", borderArrangement0.equals(borderArrangement25) ? borderArrangement0.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement26", borderArrangement8.equals(borderArrangement26) ? borderArrangement8.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement15.getClass();
        boolean boolean27 = borderArrangement8.equals((java.lang.Object) borderArrangement15);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        java.lang.Class<?> wildcardClass37 = borderArrangement32.getClass();
        boolean boolean38 = borderArrangement28.equals((java.lang.Object) borderArrangement32);
        java.lang.Class<?> wildcardClass39 = borderArrangement28.getClass();
        boolean boolean40 = borderArrangement8.equals((java.lang.Object) borderArrangement28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        boolean boolean11 = borderArrangement6.equals((java.lang.Object) (byte) -1);
        boolean boolean13 = borderArrangement6.equals((java.lang.Object) (-1));
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement15.equals(obj25);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement15.getClass();
        boolean boolean33 = borderArrangement6.equals((java.lang.Object) wildcardClass32);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement15", borderArrangement6.equals(borderArrangement15) ? borderArrangement6.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) 0L);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 1.0f);
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        java.lang.Class<?> wildcardClass36 = borderArrangement22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement3.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement21.equals(obj31);
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass34 = borderArrangement21.getClass();
        boolean boolean35 = borderArrangement14.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement3", borderArrangement0.equals(borderArrangement3) ? borderArrangement0.hashCode() == borderArrangement3.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean35 = borderArrangement11.equals((java.lang.Object) borderArrangement23);
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean39 = borderArrangement37.equals((java.lang.Object) 10);
        borderArrangement37.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) 'a');
        boolean boolean49 = borderArrangement41.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass50 = borderArrangement41.getClass();
        boolean boolean51 = borderArrangement37.equals((java.lang.Object) wildcardClass50);
        borderArrangement37.clear();
        boolean boolean53 = borderArrangement0.equals((java.lang.Object) borderArrangement37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement23", borderArrangement11.equals(borderArrangement23) ? borderArrangement11.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement0.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean22 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement20.add(block25, obj26);
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        borderArrangement29.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement29.equals(obj39);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) "");
        boolean boolean49 = borderArrangement41.equals((java.lang.Object) true);
        borderArrangement41.clear();
        borderArrangement41.clear();
        borderArrangement41.clear();
        boolean boolean53 = borderArrangement29.equals((java.lang.Object) borderArrangement41);
        java.lang.Object obj54 = null;
        boolean boolean55 = borderArrangement41.equals(obj54);
        borderArrangement41.clear();
        boolean boolean57 = borderArrangement20.equals((java.lang.Object) borderArrangement41);
        boolean boolean58 = borderArrangement0.equals((java.lang.Object) boolean57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement5 and borderArrangement20", borderArrangement5.equals(borderArrangement20) ? borderArrangement5.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass13 = borderArrangement8.getClass();
        boolean boolean14 = borderArrangement4.equals((java.lang.Object) borderArrangement8);
        borderArrangement4.clear();
        borderArrangement4.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement4.equals(obj17);
        borderArrangement4.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        boolean boolean32 = borderArrangement4.equals((java.lang.Object) borderArrangement20);
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement20", borderArrangement8.equals(borderArrangement20) ? borderArrangement8.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        borderArrangement20.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 10);
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 0.0f);
        boolean boolean27 = borderArrangement23.equals((java.lang.Object) "hi!");
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) boolean27);
        java.lang.Class<?> wildcardClass29 = borderArrangement18.getClass();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement18", borderArrangement9.equals(borderArrangement18) ? borderArrangement9.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        borderArrangement26.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) true);
        boolean boolean44 = borderArrangement34.equals((java.lang.Object) 10);
        boolean boolean46 = borderArrangement34.equals((java.lang.Object) (byte) 0);
        boolean boolean47 = borderArrangement26.equals((java.lang.Object) borderArrangement34);
        java.lang.Object obj48 = null;
        boolean boolean49 = borderArrangement34.equals(obj48);
        borderArrangement34.clear();
        borderArrangement34.clear();
        boolean boolean52 = borderArrangement0.equals((java.lang.Object) borderArrangement34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement26", borderArrangement14.equals(borderArrangement26) ? borderArrangement14.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        boolean boolean33 = borderArrangement28.equals((java.lang.Object) 1L);
        boolean boolean35 = borderArrangement28.equals((java.lang.Object) 100);
        boolean boolean36 = borderArrangement14.equals((java.lang.Object) borderArrangement28);
        borderArrangement14.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement28", borderArrangement0.equals(borderArrangement28) ? borderArrangement0.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean8 = borderArrangement6.equals((java.lang.Object) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement12.add(block17, obj18);
        borderArrangement6.add(block11, obj18);
        borderArrangement6.clear();
        boolean boolean23 = borderArrangement6.equals((java.lang.Object) 1.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement6.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) (byte) 100);
        borderArrangement34.clear();
        borderArrangement34.clear();
        org.jfree.chart.block.Block block45 = null;
        java.lang.Object obj46 = null;
        borderArrangement34.add(block45, obj46);
        boolean boolean48 = borderArrangement0.equals((java.lang.Object) block45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement20", borderArrangement13.equals(borderArrangement20) ? borderArrangement13.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) 0L);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean26 = borderArrangement13.equals((java.lang.Object) 100.0f);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) (byte) -1);
        boolean boolean37 = borderArrangement30.equals((java.lang.Object) (-1));
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        borderArrangement39.clear();
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement39.equals(obj49);
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        boolean boolean54 = borderArrangement30.equals((java.lang.Object) borderArrangement39);
        borderArrangement39.clear();
        java.lang.Class<?> wildcardClass56 = borderArrangement39.getClass();
        boolean boolean57 = borderArrangement0.equals((java.lang.Object) wildcardClass56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement30", borderArrangement13.equals(borderArrangement30) ? borderArrangement13.hashCode() == borderArrangement30.hashCode() : true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) 100.0f);
        borderArrangement29.clear();
        boolean boolean44 = borderArrangement16.equals((java.lang.Object) borderArrangement29);
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement46 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean48 = borderArrangement46.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement49 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean51 = borderArrangement49.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement52 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean54 = borderArrangement52.equals((java.lang.Object) 10);
        borderArrangement52.clear();
        borderArrangement52.clear();
        org.jfree.chart.block.Block block57 = null;
        java.lang.Object obj58 = null;
        borderArrangement52.add(block57, obj58);
        borderArrangement52.clear();
        boolean boolean61 = borderArrangement49.equals((java.lang.Object) borderArrangement52);
        boolean boolean62 = borderArrangement46.equals((java.lang.Object) borderArrangement52);
        boolean boolean63 = borderArrangement0.equals((java.lang.Object) borderArrangement52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement16 and borderArrangement29", borderArrangement16.equals(borderArrangement29) ? borderArrangement16.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) 'a');
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement14.getClass();
        boolean boolean28 = borderArrangement6.equals((java.lang.Object) borderArrangement14);
        borderArrangement6.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        java.lang.Class<?> wildcardClass31 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement14", borderArrangement6.equals(borderArrangement14) ? borderArrangement6.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 'a');
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (byte) 100);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement16.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement16", borderArrangement4.equals(borderArrangement16) ? borderArrangement4.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) true);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) 10);
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) 0L);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean37 = borderArrangement24.equals((java.lang.Object) 100.0f);
        borderArrangement24.clear();
        boolean boolean39 = borderArrangement11.equals((java.lang.Object) borderArrangement24);
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) 'a');
        borderArrangement41.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement49 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement49.clear();
        boolean boolean52 = borderArrangement49.equals((java.lang.Object) '#');
        boolean boolean54 = borderArrangement49.equals((java.lang.Object) (byte) -1);
        boolean boolean56 = borderArrangement49.equals((java.lang.Object) (-1));
        borderArrangement49.clear();
        borderArrangement49.clear();
        boolean boolean59 = borderArrangement41.equals((java.lang.Object) borderArrangement49);
        java.lang.Class<?> wildcardClass60 = borderArrangement41.getClass();
        boolean boolean61 = borderArrangement24.equals((java.lang.Object) wildcardClass60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) 0L);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean36 = borderArrangement23.equals((java.lang.Object) 100.0f);
        borderArrangement23.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) (byte) 100);
        borderArrangement38.clear();
        boolean boolean48 = borderArrangement23.equals((java.lang.Object) borderArrangement38);
        boolean boolean50 = borderArrangement23.equals((java.lang.Object) (-1.0d));
        boolean boolean51 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement38", borderArrangement11.equals(borderArrangement38) ? borderArrangement11.hashCode() == borderArrangement38.hashCode() : true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        boolean boolean21 = borderArrangement8.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 10);
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) (byte) 0);
        borderArrangement22.clear();
        org.jfree.chart.block.Block block36 = null;
        java.lang.Object obj37 = null;
        borderArrangement22.add(block36, obj37);
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        borderArrangement40.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement48 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement48.clear();
        boolean boolean51 = borderArrangement48.equals((java.lang.Object) '#');
        borderArrangement48.clear();
        boolean boolean54 = borderArrangement48.equals((java.lang.Object) "");
        boolean boolean56 = borderArrangement48.equals((java.lang.Object) true);
        boolean boolean58 = borderArrangement48.equals((java.lang.Object) 10);
        boolean boolean60 = borderArrangement48.equals((java.lang.Object) (byte) 0);
        boolean boolean61 = borderArrangement40.equals((java.lang.Object) borderArrangement48);
        boolean boolean62 = borderArrangement22.equals((java.lang.Object) borderArrangement40);
        boolean boolean63 = borderArrangement8.equals((java.lang.Object) borderArrangement40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement7.equals((java.lang.Object) borderArrangement10);
        borderArrangement10.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement10", borderArrangement7.equals(borderArrangement10) ? borderArrangement7.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement7.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        boolean boolean20 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) 'a');
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) (byte) 100);
        borderArrangement27.clear();
        boolean boolean37 = borderArrangement24.equals((java.lang.Object) borderArrangement27);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        boolean boolean43 = borderArrangement38.equals((java.lang.Object) (byte) -1);
        boolean boolean45 = borderArrangement38.equals((java.lang.Object) (-1));
        borderArrangement38.clear();
        borderArrangement38.clear();
        borderArrangement38.clear();
        borderArrangement38.clear();
        boolean boolean50 = borderArrangement27.equals((java.lang.Object) borderArrangement38);
        boolean boolean51 = borderArrangement7.equals((java.lang.Object) borderArrangement27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement16", borderArrangement0.equals(borderArrangement16) ? borderArrangement0.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement0.add(block24, obj25);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        java.lang.Class<?> wildcardClass37 = borderArrangement32.getClass();
        boolean boolean38 = borderArrangement28.equals((java.lang.Object) borderArrangement32);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement45 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean47 = borderArrangement45.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass48 = borderArrangement45.getClass();
        boolean boolean49 = borderArrangement28.equals((java.lang.Object) borderArrangement45);
        boolean boolean50 = borderArrangement0.equals((java.lang.Object) borderArrangement28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement32", borderArrangement8.equals(borderArrangement32) ? borderArrangement8.hashCode() == borderArrangement32.hashCode() : true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass38 = borderArrangement33.getClass();
        boolean boolean39 = borderArrangement20.equals((java.lang.Object) borderArrangement33);
        java.lang.Class<?> wildcardClass40 = borderArrangement33.getClass();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement20", borderArrangement9.equals(borderArrangement20) ? borderArrangement9.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) 0L);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        boolean boolean37 = borderArrangement32.equals((java.lang.Object) (byte) -1);
        boolean boolean38 = borderArrangement24.equals((java.lang.Object) borderArrangement32);
        borderArrangement32.clear();
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) borderArrangement32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement24", borderArrangement12.equals(borderArrangement24) ? borderArrangement12.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) true);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) 10);
        boolean boolean31 = borderArrangement19.equals((java.lang.Object) (-1));
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean34 = borderArrangement8.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) 0L);
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean49 = borderArrangement47.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement50 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement50.clear();
        boolean boolean53 = borderArrangement50.equals((java.lang.Object) '#');
        borderArrangement50.clear();
        boolean boolean56 = borderArrangement50.equals((java.lang.Object) 'a');
        boolean boolean58 = borderArrangement50.equals((java.lang.Object) (byte) 100);
        borderArrangement50.clear();
        boolean boolean60 = borderArrangement47.equals((java.lang.Object) borderArrangement50);
        borderArrangement47.clear();
        borderArrangement47.clear();
        borderArrangement47.clear();
        boolean boolean64 = borderArrangement35.equals((java.lang.Object) borderArrangement47);
        boolean boolean65 = borderArrangement19.equals((java.lang.Object) borderArrangement47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) 'a');
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) (short) 10);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) true);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement42.getClass();
        boolean boolean48 = borderArrangement29.equals((java.lang.Object) borderArrangement42);
        org.jfree.chart.block.BorderArrangement borderArrangement49 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement49.clear();
        boolean boolean52 = borderArrangement49.equals((java.lang.Object) '#');
        borderArrangement49.clear();
        boolean boolean55 = borderArrangement49.equals((java.lang.Object) "");
        boolean boolean57 = borderArrangement49.equals((java.lang.Object) true);
        boolean boolean59 = borderArrangement49.equals((java.lang.Object) 10);
        borderArrangement49.clear();
        borderArrangement49.clear();
        boolean boolean62 = borderArrangement29.equals((java.lang.Object) borderArrangement49);
        boolean boolean63 = borderArrangement0.equals((java.lang.Object) boolean62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement18", borderArrangement9.equals(borderArrangement18) ? borderArrangement9.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean37 = borderArrangement8.equals((java.lang.Object) borderArrangement23);
        java.lang.Class<?> wildcardClass38 = borderArrangement8.getClass();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Class<?> wildcardClass40 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement23", borderArrangement8.equals(borderArrangement23) ? borderArrangement8.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) 'a');
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        boolean boolean42 = borderArrangement37.equals((java.lang.Object) (byte) -1);
        boolean boolean44 = borderArrangement37.equals((java.lang.Object) (-1));
        borderArrangement37.clear();
        borderArrangement37.clear();
        boolean boolean47 = borderArrangement29.equals((java.lang.Object) borderArrangement37);
        boolean boolean48 = borderArrangement17.equals((java.lang.Object) borderArrangement37);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) borderArrangement37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement29", borderArrangement17.equals(borderArrangement29) ? borderArrangement17.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean7 = borderArrangement5.equals((java.lang.Object) (short) 1);
        borderArrangement5.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement5.equals(obj9);
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement12.getClass();
        boolean boolean26 = borderArrangement5.equals((java.lang.Object) borderArrangement12);
        java.lang.Class<?> wildcardClass27 = borderArrangement5.getClass();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement5 and borderArrangement12", borderArrangement5.equals(borderArrangement12) ? borderArrangement5.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement10.add(block21, obj22);
        borderArrangement0.add(block9, (java.lang.Object) block21);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) 10);
        borderArrangement25.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean33 = borderArrangement31.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) 'a');
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) (byte) 100);
        borderArrangement34.clear();
        boolean boolean44 = borderArrangement31.equals((java.lang.Object) borderArrangement34);
        borderArrangement31.clear();
        org.jfree.chart.block.Block block46 = null;
        java.lang.Object obj47 = null;
        borderArrangement31.add(block46, obj47);
        borderArrangement25.add(block30, obj47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) true);
        boolean boolean37 = borderArrangement14.equals((java.lang.Object) borderArrangement28);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement28);
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        borderArrangement39.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        borderArrangement47.clear();
        boolean boolean53 = borderArrangement47.equals((java.lang.Object) "");
        boolean boolean55 = borderArrangement47.equals((java.lang.Object) true);
        boolean boolean57 = borderArrangement47.equals((java.lang.Object) 10);
        boolean boolean59 = borderArrangement47.equals((java.lang.Object) (byte) 0);
        boolean boolean60 = borderArrangement39.equals((java.lang.Object) borderArrangement47);
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement64 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean66 = borderArrangement64.equals((java.lang.Object) 0.0f);
        borderArrangement64.clear();
        java.lang.Class<?> wildcardClass68 = borderArrangement64.getClass();
        boolean boolean69 = borderArrangement39.equals((java.lang.Object) borderArrangement64);
        boolean boolean70 = borderArrangement28.equals((java.lang.Object) boolean69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) 'a');
        boolean boolean34 = borderArrangement16.equals((java.lang.Object) boolean33);
        borderArrangement16.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        borderArrangement16.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement27", borderArrangement0.equals(borderArrangement27) ? borderArrangement0.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement8.equals(obj20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) (byte) 100);
        borderArrangement22.clear();
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement22.equals(obj32);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) true);
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        boolean boolean46 = borderArrangement22.equals((java.lang.Object) borderArrangement34);
        boolean boolean48 = borderArrangement22.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass49 = borderArrangement22.getClass();
        boolean boolean50 = borderArrangement8.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement34", borderArrangement0.equals(borderArrangement34) ? borderArrangement0.hashCode() == borderArrangement34.hashCode() : true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 'a');
        borderArrangement16.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) 0.0f);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        boolean boolean40 = borderArrangement30.equals((java.lang.Object) 10);
        boolean boolean42 = borderArrangement30.equals((java.lang.Object) (-1));
        borderArrangement30.clear();
        java.lang.Class<?> wildcardClass44 = borderArrangement30.getClass();
        boolean boolean45 = borderArrangement24.equals((java.lang.Object) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = borderArrangement24.getClass();
        boolean boolean47 = borderArrangement16.equals((java.lang.Object) borderArrangement24);
        boolean boolean48 = borderArrangement3.equals((java.lang.Object) borderArrangement16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement24", borderArrangement0.equals(borderArrangement24) ? borderArrangement0.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement27.equals(obj36);
        java.lang.Class<?> wildcardClass38 = borderArrangement27.getClass();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement27", borderArrangement14.equals(borderArrangement27) ? borderArrangement14.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.Block block40 = null;
        java.lang.Object obj41 = null;
        borderArrangement26.add(block40, obj41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean22 = borderArrangement20.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) 'a');
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement20.equals((java.lang.Object) borderArrangement23);
        boolean boolean34 = borderArrangement9.equals((java.lang.Object) borderArrangement23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement13.add(block24, obj25);
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement13.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement8.equals(obj22);
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        boolean boolean30 = borderArrangement25.equals((java.lang.Object) 1L);
        boolean boolean31 = borderArrangement8.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.Block block32 = null;
        java.lang.Object obj33 = null;
        borderArrangement25.add(block32, obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement0.equals(obj18);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (byte) -1);
        boolean boolean28 = borderArrangement21.equals((java.lang.Object) (-1));
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement21.getClass();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        java.lang.Class<?> wildcardClass34 = borderArrangement21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement6", borderArrangement0.equals(borderArrangement6) ? borderArrangement0.hashCode() == borderArrangement6.hashCode() : true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement3.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement21.equals(obj31);
        borderArrangement21.clear();
        boolean boolean34 = borderArrangement14.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement3", borderArrangement0.equals(borderArrangement3) ? borderArrangement0.hashCode() == borderArrangement3.hashCode() : true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement13.equals((java.lang.Object) borderArrangement27);
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement42.getClass();
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) borderArrangement42);
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement38.equals(obj49);
        borderArrangement38.clear();
        boolean boolean52 = borderArrangement0.equals((java.lang.Object) borderArrangement38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement27", borderArrangement13.equals(borderArrangement27) ? borderArrangement13.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean33 = borderArrangement31.equals((java.lang.Object) 10);
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.Block block36 = null;
        java.lang.Object obj37 = null;
        borderArrangement31.add(block36, obj37);
        borderArrangement31.clear();
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        boolean boolean48 = borderArrangement42.equals((java.lang.Object) 'a');
        borderArrangement42.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement50 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement50.clear();
        boolean boolean53 = borderArrangement50.equals((java.lang.Object) '#');
        boolean boolean55 = borderArrangement50.equals((java.lang.Object) (byte) -1);
        boolean boolean57 = borderArrangement50.equals((java.lang.Object) (-1));
        borderArrangement50.clear();
        borderArrangement50.clear();
        boolean boolean60 = borderArrangement42.equals((java.lang.Object) borderArrangement50);
        boolean boolean61 = borderArrangement31.equals((java.lang.Object) borderArrangement42);
        boolean boolean62 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement42", borderArrangement11.equals(borderArrangement42) ? borderArrangement11.hashCode() == borderArrangement42.hashCode() : true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 10);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement26.equals((java.lang.Object) 10);
        boolean boolean38 = borderArrangement26.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass39 = borderArrangement26.getClass();
        boolean boolean40 = borderArrangement13.equals((java.lang.Object) wildcardClass39);
        borderArrangement13.clear();
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        java.lang.Class<?> wildcardClass43 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement26", borderArrangement13.equals(borderArrangement26) ? borderArrangement13.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) (byte) 100);
        borderArrangement17.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement17.equals(obj27);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) true);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean41 = borderArrangement17.equals((java.lang.Object) borderArrangement29);
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement29.equals(obj42);
        boolean boolean45 = borderArrangement29.equals((java.lang.Object) (-1.0d));
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        java.lang.Class<?> wildcardClass47 = borderArrangement29.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) 0L);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean26 = borderArrangement13.equals((java.lang.Object) 100.0f);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) (short) 1);
        borderArrangement30.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement30.equals(obj34);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) "");
        boolean boolean44 = borderArrangement36.equals((java.lang.Object) true);
        boolean boolean46 = borderArrangement36.equals((java.lang.Object) 10);
        boolean boolean48 = borderArrangement36.equals((java.lang.Object) (-1));
        borderArrangement36.clear();
        borderArrangement36.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass52 = borderArrangement51.getClass();
        boolean boolean53 = borderArrangement36.equals((java.lang.Object) wildcardClass52);
        boolean boolean54 = borderArrangement30.equals((java.lang.Object) borderArrangement36);
        boolean boolean55 = borderArrangement0.equals((java.lang.Object) borderArrangement36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement30", borderArrangement13.equals(borderArrangement30) ? borderArrangement13.hashCode() == borderArrangement30.hashCode() : true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement10.add(block21, obj22);
        borderArrangement0.add(block9, (java.lang.Object) block21);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) 10);
        borderArrangement25.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) 'a');
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) true);
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) 10);
        boolean boolean50 = borderArrangement38.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass51 = borderArrangement38.getClass();
        boolean boolean52 = borderArrangement30.equals((java.lang.Object) wildcardClass51);
        boolean boolean53 = borderArrangement25.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        boolean boolean47 = borderArrangement42.equals((java.lang.Object) (byte) -1);
        boolean boolean48 = borderArrangement34.equals((java.lang.Object) borderArrangement42);
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement42.equals(obj49);
        boolean boolean51 = borderArrangement0.equals(obj49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement20", borderArrangement13.equals(borderArrangement20) ? borderArrangement13.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (-1));
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) true);
        boolean boolean43 = borderArrangement33.equals((java.lang.Object) 10);
        boolean boolean45 = borderArrangement33.equals((java.lang.Object) (byte) 0);
        borderArrangement33.clear();
        org.jfree.chart.block.Block block47 = null;
        java.lang.Object obj48 = null;
        borderArrangement33.add(block47, obj48);
        borderArrangement33.clear();
        java.lang.Object obj51 = null;
        boolean boolean52 = borderArrangement33.equals(obj51);
        java.lang.Class<?> wildcardClass53 = borderArrangement33.getClass();
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) borderArrangement33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement16", borderArrangement4.equals(borderArrangement16) ? borderArrangement4.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) 'a');
        borderArrangement31.clear();
        org.jfree.chart.block.Block block39 = null;
        java.lang.Object obj40 = null;
        borderArrangement31.add(block39, obj40);
        org.jfree.chart.block.Block block42 = null;
        java.lang.Object obj43 = null;
        borderArrangement31.add(block42, obj43);
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement19", borderArrangement10.equals(borderArrangement19) ? borderArrangement10.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass20 = borderArrangement17.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement17", borderArrangement4.equals(borderArrangement17) ? borderArrangement4.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement22.equals((java.lang.Object) (byte) -1);
        boolean boolean29 = borderArrangement22.equals((java.lang.Object) (-1));
        borderArrangement22.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement0.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement22", borderArrangement13.equals(borderArrangement22) ? borderArrangement13.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) 10);
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement24.add(block29, obj30);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        java.lang.Object obj37 = null;
        boolean boolean38 = borderArrangement24.equals(obj37);
        borderArrangement24.clear();
        boolean boolean40 = borderArrangement12.equals((java.lang.Object) borderArrangement24);
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement12", borderArrangement4.equals(borderArrangement12) ? borderArrangement4.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) 0L);
        boolean boolean27 = borderArrangement13.equals((java.lang.Object) borderArrangement18);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        borderArrangement39.clear();
        boolean boolean47 = borderArrangement32.equals((java.lang.Object) borderArrangement39);
        boolean boolean48 = borderArrangement18.equals((java.lang.Object) borderArrangement32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement7.add(block22, obj23);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement7.equals(obj25);
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        java.lang.Class<?> wildcardClass30 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass23 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement15", borderArrangement4.equals(borderArrangement15) ? borderArrangement4.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 'a');
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass20 = borderArrangement10.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) 0L);
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean35 = borderArrangement22.equals((java.lang.Object) 100.0f);
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement22.equals(obj36);
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        boolean boolean44 = borderArrangement39.equals((java.lang.Object) 1L);
        boolean boolean45 = borderArrangement22.equals((java.lang.Object) borderArrangement39);
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) borderArrangement39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement22", borderArrangement10.equals(borderArrangement22) ? borderArrangement10.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean26 = borderArrangement8.equals((java.lang.Object) boolean25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Class<?> wildcardClass28 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement19", borderArrangement8.equals(borderArrangement19) ? borderArrangement8.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        boolean boolean30 = borderArrangement25.equals((java.lang.Object) (byte) -1);
        boolean boolean32 = borderArrangement25.equals((java.lang.Object) (-1));
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) (byte) 100);
        borderArrangement34.clear();
        java.lang.Object obj44 = null;
        boolean boolean45 = borderArrangement34.equals(obj44);
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        boolean boolean49 = borderArrangement25.equals((java.lang.Object) borderArrangement34);
        borderArrangement34.clear();
        org.jfree.chart.block.Block block51 = null;
        java.lang.Object obj52 = null;
        borderArrangement34.add(block51, obj52);
        borderArrangement34.clear();
        java.lang.Class<?> wildcardClass55 = borderArrangement34.getClass();
        boolean boolean56 = borderArrangement0.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement25", borderArrangement9.equals(borderArrangement25) ? borderArrangement9.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        boolean boolean25 = borderArrangement14.equals((java.lang.Object) 10L);
        org.jfree.chart.block.Block block26 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        boolean boolean40 = borderArrangement27.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block41 = null;
        java.lang.Object obj42 = null;
        borderArrangement27.add(block41, obj42);
        borderArrangement14.add(block26, obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement27", borderArrangement0.equals(borderArrangement27) ? borderArrangement0.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        borderArrangement40.clear();
        boolean boolean48 = borderArrangement34.equals((java.lang.Object) borderArrangement40);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement20", borderArrangement13.equals(borderArrangement20) ? borderArrangement13.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (byte) -1);
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) (-1));
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) true);
        boolean boolean42 = borderArrangement32.equals((java.lang.Object) 10);
        boolean boolean44 = borderArrangement32.equals((java.lang.Object) (byte) 0);
        boolean boolean45 = borderArrangement24.equals((java.lang.Object) borderArrangement32);
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        borderArrangement47.clear();
        boolean boolean53 = borderArrangement47.equals((java.lang.Object) "");
        boolean boolean55 = borderArrangement47.equals((java.lang.Object) true);
        boolean boolean57 = borderArrangement47.equals((java.lang.Object) 10);
        borderArrangement47.clear();
        boolean boolean59 = borderArrangement24.equals((java.lang.Object) borderArrangement47);
        boolean boolean60 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement32", borderArrangement11.equals(borderArrangement32) ? borderArrangement11.hashCode() == borderArrangement32.hashCode() : true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (byte) 100);
        borderArrangement16.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement16.equals(obj26);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean37 = borderArrangement35.equals((java.lang.Object) 10);
        borderArrangement35.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) 'a');
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass48 = borderArrangement39.getClass();
        boolean boolean49 = borderArrangement35.equals((java.lang.Object) wildcardClass48);
        boolean boolean50 = borderArrangement16.equals((java.lang.Object) boolean49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement35", borderArrangement0.equals(borderArrangement35) ? borderArrangement0.hashCode() == borderArrangement35.hashCode() : true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        borderArrangement35.clear();
        boolean boolean43 = borderArrangement29.equals((java.lang.Object) borderArrangement35);
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean47 = borderArrangement29.equals((java.lang.Object) (-1L));
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean52 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement15 and borderArrangement35", borderArrangement15.equals(borderArrangement35) ? borderArrangement15.hashCode() == borderArrangement35.hashCode() : true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement9.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) (byte) 100);
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement28);
        java.lang.Class<?> wildcardClass40 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement28", borderArrangement9.equals(borderArrangement28) ? borderArrangement9.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement14.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) 10);
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement24.add(block29, obj30);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement24.getClass();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement24", borderArrangement14.equals(borderArrangement24) ? borderArrangement14.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean11 = borderArrangement9.equals((java.lang.Object) 0.0f);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) 'a');
        borderArrangement23.clear();
        org.jfree.chart.block.Block block31 = null;
        java.lang.Object obj32 = null;
        borderArrangement23.add(block31, obj32);
        borderArrangement23.clear();
        boolean boolean35 = borderArrangement14.equals((java.lang.Object) borderArrangement23);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean38 = borderArrangement9.equals((java.lang.Object) borderArrangement14);
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement14", borderArrangement9.equals(borderArrangement14) ? borderArrangement9.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement18.getClass();
        boolean boolean24 = borderArrangement14.equals((java.lang.Object) borderArrangement18);
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement14.equals(obj27);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (byte) 100);
        borderArrangement32.clear();
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement32.equals(obj42);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        boolean boolean50 = borderArrangement44.equals((java.lang.Object) "");
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) true);
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        boolean boolean56 = borderArrangement32.equals((java.lang.Object) borderArrangement44);
        java.lang.Object obj57 = null;
        boolean boolean58 = borderArrangement44.equals(obj57);
        borderArrangement44.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement60 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement60.clear();
        boolean boolean63 = borderArrangement60.equals((java.lang.Object) '#');
        borderArrangement60.clear();
        boolean boolean66 = borderArrangement60.equals((java.lang.Object) 'a');
        boolean boolean68 = borderArrangement60.equals((java.lang.Object) (byte) 100);
        borderArrangement60.clear();
        borderArrangement60.clear();
        borderArrangement60.clear();
        boolean boolean72 = borderArrangement44.equals((java.lang.Object) borderArrangement60);
        boolean boolean73 = borderArrangement14.equals((java.lang.Object) borderArrangement60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement8.equals((java.lang.Object) borderArrangement21);
        java.lang.Class<?> wildcardClass32 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement18.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean33 = borderArrangement31.equals((java.lang.Object) (short) 1);
        borderArrangement31.clear();
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement31.equals(obj35);
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) true);
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) 10);
        borderArrangement38.clear();
        borderArrangement38.clear();
        java.lang.Class<?> wildcardClass51 = borderArrangement38.getClass();
        boolean boolean52 = borderArrangement31.equals((java.lang.Object) borderArrangement38);
        boolean boolean53 = borderArrangement0.equals((java.lang.Object) borderArrangement38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement18 and borderArrangement31", borderArrangement18.equals(borderArrangement31) ? borderArrangement18.hashCode() == borderArrangement31.hashCode() : true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        borderArrangement24.clear();
        boolean boolean32 = borderArrangement17.equals((java.lang.Object) borderArrangement24);
        boolean boolean34 = borderArrangement24.equals((java.lang.Object) 100.0d);
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement17", borderArrangement6.equals(borderArrangement17) ? borderArrangement6.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement15.getClass();
        boolean boolean27 = borderArrangement8.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass28 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement10.add(block21, obj22);
        borderArrangement0.add(block9, (java.lang.Object) block21);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) 10);
        borderArrangement25.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        boolean boolean46 = borderArrangement43.equals((java.lang.Object) '#');
        borderArrangement43.clear();
        java.lang.Class<?> wildcardClass48 = borderArrangement43.getClass();
        boolean boolean49 = borderArrangement30.equals((java.lang.Object) borderArrangement43);
        borderArrangement30.clear();
        boolean boolean52 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean54 = borderArrangement25.equals((java.lang.Object) borderArrangement30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass16 = borderArrangement8.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) true);
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement5.equals((java.lang.Object) wildcardClass21);
        borderArrangement5.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) 'a');
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass38 = borderArrangement29.getClass();
        boolean boolean39 = borderArrangement25.equals((java.lang.Object) wildcardClass38);
        boolean boolean40 = borderArrangement5.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean7 = borderArrangement5.equals((java.lang.Object) 0.0f);
        boolean boolean9 = borderArrangement5.equals((java.lang.Object) "hi!");
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) boolean9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 10);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (byte) 0);
        borderArrangement13.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement13.add(block27, obj28);
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        borderArrangement31.clear();
        boolean boolean43 = borderArrangement13.equals((java.lang.Object) borderArrangement31);
        boolean boolean44 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement5 and borderArrangement13", borderArrangement5.equals(borderArrangement13) ? borderArrangement5.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        boolean boolean37 = borderArrangement27.equals((java.lang.Object) 10);
        boolean boolean39 = borderArrangement27.equals((java.lang.Object) (byte) 0);
        boolean boolean40 = borderArrangement19.equals((java.lang.Object) borderArrangement27);
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.Block block43 = null;
        java.lang.Object obj44 = null;
        borderArrangement19.add(block43, obj44);
        boolean boolean46 = borderArrangement6.equals(obj44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = borderArrangement9.equals(obj25);
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        borderArrangement35.clear();
        boolean boolean43 = borderArrangement29.equals((java.lang.Object) borderArrangement35);
        org.jfree.chart.block.Block block44 = null;
        java.lang.Object obj45 = null;
        borderArrangement29.add(block44, obj45);
        java.lang.Object obj47 = null;
        boolean boolean48 = borderArrangement29.equals(obj47);
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean51 = borderArrangement9.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement35", borderArrangement0.equals(borderArrangement35) ? borderArrangement0.hashCode() == borderArrangement35.hashCode() : true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement8.equals(obj18);
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement8.add(block20, obj21);
        borderArrangement0.add(block7, obj21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        java.lang.Class<?> wildcardClass44 = borderArrangement39.getClass();
        boolean boolean45 = borderArrangement26.equals((java.lang.Object) borderArrangement39);
        borderArrangement26.clear();
        boolean boolean48 = borderArrangement26.equals((java.lang.Object) '#');
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement26.equals(obj49);
        java.lang.Class<?> wildcardClass51 = borderArrangement26.getClass();
        boolean boolean52 = borderArrangement0.equals((java.lang.Object) wildcardClass51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement26", borderArrangement8.equals(borderArrangement26) ? borderArrangement8.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) 10);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) 0L);
        boolean boolean25 = borderArrangement11.equals((java.lang.Object) borderArrangement16);
        borderArrangement16.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) (byte) 100);
        borderArrangement28.clear();
        java.lang.Object obj38 = null;
        boolean boolean39 = borderArrangement28.equals(obj38);
        org.jfree.chart.block.Block block40 = null;
        java.lang.Object obj41 = null;
        borderArrangement28.add(block40, obj41);
        borderArrangement28.clear();
        boolean boolean44 = borderArrangement16.equals((java.lang.Object) borderArrangement28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) (byte) 100);
        borderArrangement14.clear();
        boolean boolean24 = borderArrangement11.equals((java.lang.Object) borderArrangement14);
        java.lang.Class<?> wildcardClass25 = borderArrangement11.getClass();
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement14", borderArrangement11.equals(borderArrangement14) ? borderArrangement11.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) 0L);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) 0L);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 1.0f);
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        java.lang.Class<?> wildcardClass36 = borderArrangement22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement7.add(block19, obj20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        borderArrangement28.clear();
        boolean boolean36 = borderArrangement22.equals((java.lang.Object) borderArrangement28);
        borderArrangement28.clear();
        boolean boolean38 = borderArrangement7.equals((java.lang.Object) borderArrangement28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) true);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) 10);
        boolean boolean31 = borderArrangement19.equals((java.lang.Object) (byte) 0);
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) true);
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        boolean boolean48 = borderArrangement19.equals((java.lang.Object) borderArrangement34);
        boolean boolean49 = borderArrangement8.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement34", borderArrangement0.equals(borderArrangement34) ? borderArrangement0.hashCode() == borderArrangement34.hashCode() : true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        boolean boolean27 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) true);
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) 10);
        boolean boolean50 = borderArrangement38.equals((java.lang.Object) (byte) 0);
        boolean boolean51 = borderArrangement30.equals((java.lang.Object) borderArrangement38);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean55 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement38", borderArrangement17.equals(borderArrangement38) ? borderArrangement17.hashCode() == borderArrangement38.hashCode() : true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement7.equals((java.lang.Object) true);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement17.getClass();
        boolean boolean24 = borderArrangement7.equals((java.lang.Object) wildcardClass23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        java.lang.Class<?> wildcardClass26 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement17", borderArrangement7.equals(borderArrangement17) ? borderArrangement7.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) 'a');
        boolean boolean30 = borderArrangement12.equals((java.lang.Object) boolean29);
        boolean boolean32 = borderArrangement12.equals((java.lang.Object) 0L);
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement12.equals(obj33);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) true);
        boolean boolean45 = borderArrangement35.equals((java.lang.Object) 10);
        boolean boolean47 = borderArrangement35.equals((java.lang.Object) (byte) 0);
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean50 = borderArrangement12.equals((java.lang.Object) borderArrangement35);
        boolean boolean51 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement23", borderArrangement4.equals(borderArrangement23) ? borderArrangement4.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        borderArrangement29.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement29.equals(obj39);
        java.lang.Object obj41 = null;
        boolean boolean42 = borderArrangement29.equals(obj41);
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        boolean boolean46 = borderArrangement43.equals((java.lang.Object) '#');
        boolean boolean48 = borderArrangement43.equals((java.lang.Object) 1L);
        borderArrangement43.clear();
        boolean boolean50 = borderArrangement29.equals((java.lang.Object) borderArrangement43);
        boolean boolean52 = borderArrangement29.equals((java.lang.Object) 100L);
        boolean boolean53 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement43", borderArrangement11.equals(borderArrangement43) ? borderArrangement11.hashCode() == borderArrangement43.hashCode() : true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) true);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) 10);
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) 0L);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean37 = borderArrangement24.equals((java.lang.Object) 100.0f);
        borderArrangement24.clear();
        boolean boolean39 = borderArrangement11.equals((java.lang.Object) borderArrangement24);
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement24", borderArrangement11.equals(borderArrangement24) ? borderArrangement11.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 10);
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement18.add(block23, obj24);
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement15.equals((java.lang.Object) borderArrangement18);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement15 and borderArrangement18", borderArrangement15.equals(borderArrangement18) ? borderArrangement15.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        boolean boolean17 = borderArrangement12.equals((java.lang.Object) (byte) -1);
        boolean boolean19 = borderArrangement12.equals((java.lang.Object) (-1));
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) 0L);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean35 = borderArrangement12.equals((java.lang.Object) borderArrangement23);
        boolean boolean37 = borderArrangement12.equals((java.lang.Object) 10L);
        borderArrangement12.clear();
        boolean boolean40 = borderArrangement12.equals((java.lang.Object) 0);
        borderArrangement12.clear();
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement23", borderArrangement12.equals(borderArrangement23) ? borderArrangement12.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (short) 1);
        borderArrangement16.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement16.equals(obj20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 10);
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) (-1));
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass38 = borderArrangement37.getClass();
        boolean boolean39 = borderArrangement22.equals((java.lang.Object) wildcardClass38);
        boolean boolean40 = borderArrangement16.equals((java.lang.Object) borderArrangement22);
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement16", borderArrangement6.equals(borderArrangement16) ? borderArrangement6.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass38 = borderArrangement33.getClass();
        boolean boolean39 = borderArrangement29.equals((java.lang.Object) borderArrangement33);
        java.lang.Object obj40 = null;
        boolean boolean41 = borderArrangement29.equals(obj40);
        boolean boolean43 = borderArrangement29.equals((java.lang.Object) 10L);
        boolean boolean44 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement15 and borderArrangement33", borderArrangement15.equals(borderArrangement33) ? borderArrangement15.hashCode() == borderArrangement33.hashCode() : true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) 'a');
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) true);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        java.lang.Class<?> wildcardClass41 = borderArrangement28.getClass();
        boolean boolean42 = borderArrangement20.equals((java.lang.Object) borderArrangement28);
        borderArrangement20.clear();
        boolean boolean45 = borderArrangement20.equals((java.lang.Object) (short) -1);
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement3 and borderArrangement20", borderArrangement3.equals(borderArrangement20) ? borderArrangement3.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) (byte) 100);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean32 = borderArrangement6.equals((java.lang.Object) borderArrangement18);
        borderArrangement6.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        boolean boolean33 = borderArrangement28.equals((java.lang.Object) false);
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean36 = borderArrangement14.equals((java.lang.Object) borderArrangement28);
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement23", borderArrangement14.equals(borderArrangement23) ? borderArrangement14.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        boolean boolean33 = borderArrangement28.equals((java.lang.Object) 1L);
        boolean boolean35 = borderArrangement28.equals((java.lang.Object) 100);
        boolean boolean36 = borderArrangement14.equals((java.lang.Object) borderArrangement28);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        borderArrangement37.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        boolean boolean46 = borderArrangement43.equals((java.lang.Object) '#');
        borderArrangement43.clear();
        boolean boolean49 = borderArrangement43.equals((java.lang.Object) "");
        borderArrangement43.clear();
        boolean boolean51 = borderArrangement37.equals((java.lang.Object) borderArrangement43);
        boolean boolean53 = borderArrangement43.equals((java.lang.Object) (-1));
        borderArrangement43.clear();
        boolean boolean55 = borderArrangement28.equals((java.lang.Object) borderArrangement43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement9.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) (byte) 100);
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement28);
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        boolean boolean48 = borderArrangement40.equals((java.lang.Object) 0L);
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        boolean boolean53 = borderArrangement40.equals((java.lang.Object) 100.0f);
        borderArrangement40.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement55 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement55.clear();
        boolean boolean58 = borderArrangement55.equals((java.lang.Object) '#');
        borderArrangement55.clear();
        boolean boolean61 = borderArrangement55.equals((java.lang.Object) "");
        boolean boolean63 = borderArrangement55.equals((java.lang.Object) (byte) 100);
        borderArrangement55.clear();
        boolean boolean65 = borderArrangement40.equals((java.lang.Object) borderArrangement55);
        borderArrangement40.clear();
        boolean boolean67 = borderArrangement0.equals((java.lang.Object) borderArrangement40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement28", borderArrangement9.equals(borderArrangement28) ? borderArrangement9.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement13.equals((java.lang.Object) borderArrangement27);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) "");
        boolean boolean45 = borderArrangement37.equals((java.lang.Object) true);
        boolean boolean47 = borderArrangement37.equals((java.lang.Object) 10);
        boolean boolean48 = borderArrangement27.equals((java.lang.Object) borderArrangement37);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) borderArrangement27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement37", borderArrangement13.equals(borderArrangement37) ? borderArrangement13.hashCode() == borderArrangement37.hashCode() : true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        borderArrangement33.clear();
        boolean boolean41 = borderArrangement27.equals((java.lang.Object) borderArrangement33);
        boolean boolean43 = borderArrangement27.equals((java.lang.Object) (-1L));
        borderArrangement27.clear();
        boolean boolean45 = borderArrangement15.equals((java.lang.Object) borderArrangement27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement33", borderArrangement0.equals(borderArrangement33) ? borderArrangement0.hashCode() == borderArrangement33.hashCode() : true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement0.equals(obj24);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement0.add(block27, obj28);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        boolean boolean40 = borderArrangement30.equals((java.lang.Object) 10);
        boolean boolean42 = borderArrangement30.equals((java.lang.Object) (-1));
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        borderArrangement30.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        borderArrangement11.clear();
        boolean boolean19 = borderArrangement5.equals((java.lang.Object) borderArrangement11);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) 1.0f);
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement11.equals(obj22);
        java.lang.Class<?> wildcardClass24 = borderArrangement11.getClass();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement5 and borderArrangement11", borderArrangement5.equals(borderArrangement11) ? borderArrangement5.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 10);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement12.equals(obj23);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) 10);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.chart.block.Block block35 = null;
        java.lang.Object obj36 = null;
        borderArrangement30.add(block35, obj36);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean44 = borderArrangement42.equals((java.lang.Object) 10);
        borderArrangement42.clear();
        borderArrangement42.clear();
        org.jfree.chart.block.Block block47 = null;
        java.lang.Object obj48 = null;
        borderArrangement42.add(block47, obj48);
        borderArrangement42.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass52 = borderArrangement51.getClass();
        boolean boolean53 = borderArrangement42.equals((java.lang.Object) borderArrangement51);
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement30", borderArrangement12.equals(borderArrangement30) ? borderArrangement12.hashCode() == borderArrangement30.hashCode() : true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        borderArrangement31.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean46 = borderArrangement44.equals((java.lang.Object) 10);
        borderArrangement44.clear();
        borderArrangement44.clear();
        org.jfree.chart.block.Block block49 = null;
        java.lang.Object obj50 = null;
        borderArrangement44.add(block49, obj50);
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement58 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement58.clear();
        boolean boolean61 = borderArrangement58.equals((java.lang.Object) '#');
        borderArrangement58.clear();
        boolean boolean64 = borderArrangement58.equals((java.lang.Object) 'a');
        borderArrangement58.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement66 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement66.clear();
        boolean boolean69 = borderArrangement66.equals((java.lang.Object) '#');
        borderArrangement66.clear();
        boolean boolean72 = borderArrangement66.equals((java.lang.Object) "");
        boolean boolean74 = borderArrangement66.equals((java.lang.Object) true);
        borderArrangement66.clear();
        borderArrangement66.clear();
        borderArrangement66.clear();
        borderArrangement66.clear();
        java.lang.Class<?> wildcardClass79 = borderArrangement66.getClass();
        boolean boolean80 = borderArrangement58.equals((java.lang.Object) borderArrangement66);
        borderArrangement58.clear();
        boolean boolean83 = borderArrangement58.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass84 = borderArrangement58.getClass();
        boolean boolean85 = borderArrangement44.equals((java.lang.Object) borderArrangement58);
        boolean boolean86 = borderArrangement31.equals((java.lang.Object) boolean85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) 'a');
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) (byte) -1);
        boolean boolean28 = borderArrangement21.equals((java.lang.Object) (-1));
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement13.equals((java.lang.Object) borderArrangement21);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        boolean boolean46 = borderArrangement41.equals((java.lang.Object) (byte) -1);
        boolean boolean47 = borderArrangement33.equals((java.lang.Object) borderArrangement41);
        java.lang.Object obj48 = null;
        boolean boolean49 = borderArrangement41.equals(obj48);
        borderArrangement41.clear();
        boolean boolean51 = borderArrangement0.equals((java.lang.Object) borderArrangement41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement21", borderArrangement13.equals(borderArrangement21) ? borderArrangement13.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) 'a');
        borderArrangement18.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement18.add(block26, obj27);
        borderArrangement18.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) (byte) 100);
        borderArrangement30.clear();
        java.lang.Object obj40 = null;
        boolean boolean41 = borderArrangement30.equals(obj40);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        boolean boolean48 = borderArrangement42.equals((java.lang.Object) "");
        boolean boolean50 = borderArrangement42.equals((java.lang.Object) true);
        borderArrangement42.clear();
        borderArrangement42.clear();
        borderArrangement42.clear();
        boolean boolean54 = borderArrangement30.equals((java.lang.Object) borderArrangement42);
        java.lang.Class<?> wildcardClass55 = borderArrangement42.getClass();
        boolean boolean56 = borderArrangement18.equals((java.lang.Object) borderArrangement42);
        boolean boolean57 = borderArrangement0.equals((java.lang.Object) borderArrangement42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement18", borderArrangement6.equals(borderArrangement18) ? borderArrangement6.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        boolean boolean14 = borderArrangement6.equals((java.lang.Object) true);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 10);
        boolean boolean18 = borderArrangement6.equals((java.lang.Object) (-1));
        borderArrangement6.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement6.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) 0L);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean37 = borderArrangement24.equals((java.lang.Object) 100.0f);
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        borderArrangement39.clear();
        boolean boolean49 = borderArrangement24.equals((java.lang.Object) borderArrangement39);
        org.jfree.chart.block.BorderArrangement borderArrangement50 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement50.clear();
        boolean boolean53 = borderArrangement50.equals((java.lang.Object) '#');
        boolean boolean55 = borderArrangement50.equals((java.lang.Object) 1L);
        borderArrangement50.clear();
        boolean boolean57 = borderArrangement24.equals((java.lang.Object) borderArrangement50);
        boolean boolean58 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement39", borderArrangement6.equals(borderArrangement39) ? borderArrangement6.hashCode() == borderArrangement39.hashCode() : true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass23 = borderArrangement15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement4", borderArrangement0.equals(borderArrangement4) ? borderArrangement0.hashCode() == borderArrangement4.hashCode() : true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement19.getClass();
        boolean boolean26 = borderArrangement9.equals((java.lang.Object) wildcardClass25);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        java.lang.Class<?> wildcardClass30 = borderArrangement9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) 'a');
        borderArrangement26.clear();
        boolean boolean34 = borderArrangement17.equals((java.lang.Object) borderArrangement26);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean38 = borderArrangement36.equals((java.lang.Object) 0.0f);
        boolean boolean40 = borderArrangement36.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) "");
        boolean boolean49 = borderArrangement41.equals((java.lang.Object) true);
        borderArrangement41.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        borderArrangement51.clear();
        java.lang.Class<?> wildcardClass57 = borderArrangement51.getClass();
        boolean boolean58 = borderArrangement41.equals((java.lang.Object) wildcardClass57);
        borderArrangement41.clear();
        boolean boolean60 = borderArrangement36.equals((java.lang.Object) borderArrangement41);
        boolean boolean61 = borderArrangement0.equals((java.lang.Object) borderArrangement41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement26", borderArrangement17.equals(borderArrangement26) ? borderArrangement17.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) (short) 1);
        borderArrangement25.clear();
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement25.equals(obj29);
        borderArrangement25.clear();
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement25.equals(obj32);
        borderArrangement25.clear();
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) "");
        boolean boolean44 = borderArrangement36.equals((java.lang.Object) true);
        borderArrangement36.clear();
        borderArrangement36.clear();
        borderArrangement36.clear();
        borderArrangement36.clear();
        boolean boolean50 = borderArrangement36.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) "");
        boolean boolean59 = borderArrangement51.equals((java.lang.Object) (byte) 100);
        borderArrangement51.clear();
        java.lang.Object obj61 = null;
        boolean boolean62 = borderArrangement51.equals(obj61);
        java.lang.Object obj63 = null;
        boolean boolean64 = borderArrangement51.equals(obj63);
        boolean boolean65 = borderArrangement36.equals(obj63);
        java.lang.Class<?> wildcardClass66 = borderArrangement36.getClass();
        boolean boolean67 = borderArrangement0.equals((java.lang.Object) borderArrangement36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement25", borderArrangement11.equals(borderArrangement25) ? borderArrangement11.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean37 = borderArrangement23.equals((java.lang.Object) 100L);
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass39 = borderArrangement23.getClass();
        boolean boolean40 = borderArrangement8.equals((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        borderArrangement39.clear();
        boolean boolean49 = borderArrangement31.equals((java.lang.Object) borderArrangement39);
        borderArrangement39.clear();
        boolean boolean52 = borderArrangement39.equals((java.lang.Object) 0L);
        borderArrangement39.clear();
        boolean boolean54 = borderArrangement18.equals((java.lang.Object) borderArrangement39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement31", borderArrangement0.equals(borderArrangement31) ? borderArrangement0.hashCode() == borderArrangement31.hashCode() : true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        java.lang.Class<?> wildcardClass37 = borderArrangement23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) 0.0f);
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement5.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement5", borderArrangement0.equals(borderArrangement5) ? borderArrangement0.hashCode() == borderArrangement5.hashCode() : true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement3.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) (short) 1);
        borderArrangement21.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement21.equals(obj25);
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        boolean boolean37 = borderArrangement27.equals((java.lang.Object) 10);
        boolean boolean39 = borderArrangement27.equals((java.lang.Object) (-1));
        borderArrangement27.clear();
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass43 = borderArrangement42.getClass();
        boolean boolean44 = borderArrangement27.equals((java.lang.Object) wildcardClass43);
        boolean boolean45 = borderArrangement21.equals((java.lang.Object) borderArrangement27);
        boolean boolean46 = borderArrangement14.equals((java.lang.Object) borderArrangement27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement3", borderArrangement0.equals(borderArrangement3) ? borderArrangement0.hashCode() == borderArrangement3.hashCode() : true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement19.getClass();
        boolean boolean26 = borderArrangement9.equals((java.lang.Object) wildcardClass25);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        boolean boolean50 = borderArrangement44.equals((java.lang.Object) "");
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) true);
        boolean boolean53 = borderArrangement30.equals((java.lang.Object) borderArrangement44);
        borderArrangement30.clear();
        borderArrangement30.clear();
        java.lang.Class<?> wildcardClass56 = borderArrangement30.getClass();
        boolean boolean57 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement19", borderArrangement9.equals(borderArrangement19) ? borderArrangement9.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) 'a');
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement18.equals((java.lang.Object) borderArrangement21);
        borderArrangement18.clear();
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass34 = borderArrangement18.getClass();
        boolean boolean35 = borderArrangement9.equals((java.lang.Object) borderArrangement18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement23.getClass();
        boolean boolean30 = borderArrangement9.equals((java.lang.Object) wildcardClass29);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        java.lang.Class<?> wildcardClass34 = borderArrangement9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        boolean boolean33 = borderArrangement23.equals((java.lang.Object) 10);
        boolean boolean35 = borderArrangement23.equals((java.lang.Object) (byte) 0);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (byte) 100);
        borderArrangement16.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement16.equals(obj26);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        borderArrangement35.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) "");
        borderArrangement41.clear();
        boolean boolean49 = borderArrangement35.equals((java.lang.Object) borderArrangement41);
        borderArrangement35.clear();
        java.lang.Class<?> wildcardClass51 = borderArrangement35.getClass();
        boolean boolean52 = borderArrangement16.equals((java.lang.Object) borderArrangement35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement41", borderArrangement0.equals(borderArrangement41) ? borderArrangement0.hashCode() == borderArrangement41.hashCode() : true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement8.equals((java.lang.Object) borderArrangement21);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) true);
        boolean boolean42 = borderArrangement32.equals((java.lang.Object) 10);
        java.lang.Object obj43 = null;
        boolean boolean44 = borderArrangement32.equals(obj43);
        java.lang.Object obj45 = null;
        boolean boolean46 = borderArrangement32.equals(obj45);
        borderArrangement32.clear();
        boolean boolean49 = borderArrangement32.equals((java.lang.Object) 0.0f);
        borderArrangement32.clear();
        boolean boolean51 = borderArrangement21.equals((java.lang.Object) borderArrangement32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass19 = borderArrangement14.getClass();
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) borderArrangement14);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) 10);
        borderArrangement25.clear();
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) 0L);
        boolean boolean39 = borderArrangement25.equals((java.lang.Object) borderArrangement30);
        borderArrangement30.clear();
        org.jfree.chart.block.Block block41 = null;
        java.lang.Object obj42 = null;
        borderArrangement30.add(block41, obj42);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement30.getClass();
        boolean boolean48 = borderArrangement0.equals((java.lang.Object) wildcardClass47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement14", borderArrangement10.equals(borderArrangement14) ? borderArrangement10.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement14.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) (byte) 100);
        borderArrangement24.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement24.equals(obj34);
        borderArrangement24.clear();
        borderArrangement24.clear();
        java.lang.Class<?> wildcardClass38 = borderArrangement24.getClass();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean42 = borderArrangement40.equals((java.lang.Object) 10);
        borderArrangement40.clear();
        borderArrangement40.clear();
        org.jfree.chart.block.Block block45 = null;
        java.lang.Object obj46 = null;
        borderArrangement40.add(block45, obj46);
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement54 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement54.clear();
        boolean boolean57 = borderArrangement54.equals((java.lang.Object) '#');
        borderArrangement54.clear();
        boolean boolean60 = borderArrangement54.equals((java.lang.Object) "");
        boolean boolean62 = borderArrangement54.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement63 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement63.clear();
        boolean boolean66 = borderArrangement63.equals((java.lang.Object) '#');
        boolean boolean67 = borderArrangement54.equals((java.lang.Object) '#');
        borderArrangement54.clear();
        borderArrangement54.clear();
        boolean boolean70 = borderArrangement40.equals((java.lang.Object) borderArrangement54);
        boolean boolean71 = borderArrangement24.equals((java.lang.Object) borderArrangement40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement15", borderArrangement4.equals(borderArrangement15) ? borderArrangement4.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        boolean boolean32 = borderArrangement20.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass33 = borderArrangement20.getClass();
        boolean boolean34 = borderArrangement12.equals((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = borderArrangement12.getClass();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement20", borderArrangement12.equals(borderArrangement20) ? borderArrangement12.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        boolean boolean10 = borderArrangement4.equals((java.lang.Object) 'a');
        boolean boolean12 = borderArrangement4.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass13 = borderArrangement4.getClass();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) wildcardClass13);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) (byte) -1);
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) (-1));
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) (byte) 100);
        borderArrangement24.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement24.equals(obj34);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        java.lang.Class<?> wildcardClass41 = borderArrangement24.getClass();
        boolean boolean42 = borderArrangement15.equals((java.lang.Object) wildcardClass41);
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass44 = borderArrangement15.getClass();
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) wildcardClass44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement15", borderArrangement4.equals(borderArrangement15) ? borderArrangement4.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean10 = borderArrangement8.equals((java.lang.Object) 0.0f);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean24 = borderArrangement14.equals((java.lang.Object) 10);
        boolean boolean26 = borderArrangement14.equals((java.lang.Object) (-1));
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement14.getClass();
        boolean boolean29 = borderArrangement8.equals((java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = borderArrangement8.getClass();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Class<?> wildcardClass32 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement14", borderArrangement8.equals(borderArrangement14) ? borderArrangement8.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement9.add(block26, obj27);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) "");
        borderArrangement36.clear();
        boolean boolean44 = borderArrangement29.equals((java.lang.Object) borderArrangement36);
        borderArrangement29.clear();
        borderArrangement29.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement29.getClass();
        boolean boolean48 = borderArrangement9.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement36", borderArrangement0.equals(borderArrangement36) ? borderArrangement0.hashCode() == borderArrangement36.hashCode() : true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement7.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement21.equals(obj31);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) true);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        boolean boolean45 = borderArrangement21.equals((java.lang.Object) borderArrangement33);
        java.lang.Class<?> wildcardClass46 = borderArrangement21.getClass();
        boolean boolean47 = borderArrangement7.equals((java.lang.Object) wildcardClass46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean14 = borderArrangement9.equals((java.lang.Object) 1L);
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement9.equals(obj15);
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean30 = borderArrangement9.equals((java.lang.Object) borderArrangement19);
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement9.getClass();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement19", borderArrangement9.equals(borderArrangement19) ? borderArrangement9.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement7.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.Block block32 = null;
        java.lang.Object obj33 = null;
        borderArrangement21.add(block32, obj33);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) 0L);
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean48 = borderArrangement35.equals((java.lang.Object) 100.0f);
        boolean boolean49 = borderArrangement21.equals((java.lang.Object) borderArrangement35);
        borderArrangement35.clear();
        java.lang.Object obj51 = null;
        boolean boolean52 = borderArrangement35.equals(obj51);
        boolean boolean53 = borderArrangement19.equals((java.lang.Object) borderArrangement35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement12.equals(obj22);
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) true);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean36 = borderArrangement12.equals((java.lang.Object) borderArrangement24);
        java.lang.Class<?> wildcardClass37 = borderArrangement24.getClass();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) 'a');
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        java.lang.Class<?> wildcardClass49 = borderArrangement39.getClass();
        boolean boolean50 = borderArrangement24.equals((java.lang.Object) borderArrangement39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        boolean boolean35 = borderArrangement12.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean37 = borderArrangement12.equals((java.lang.Object) borderArrangement36);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement26", borderArrangement12.equals(borderArrangement26) ? borderArrangement12.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) (byte) -1);
        boolean boolean34 = borderArrangement27.equals((java.lang.Object) (-1));
        borderArrangement27.clear();
        borderArrangement27.clear();
        boolean boolean37 = borderArrangement19.equals((java.lang.Object) borderArrangement27);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) true);
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) 1.0f);
        borderArrangement38.clear();
        boolean boolean50 = borderArrangement19.equals((java.lang.Object) borderArrangement38);
        boolean boolean51 = borderArrangement8.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement27", borderArrangement0.equals(borderArrangement27) ? borderArrangement0.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement20.getClass();
        boolean boolean34 = borderArrangement12.equals((java.lang.Object) borderArrangement20);
        borderArrangement12.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        java.lang.Class<?> wildcardClass37 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement20", borderArrangement12.equals(borderArrangement20) ? borderArrangement12.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement7.equals(obj23);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        borderArrangement31.clear();
        boolean boolean39 = borderArrangement25.equals((java.lang.Object) borderArrangement31);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement31.equals(obj42);
        borderArrangement31.clear();
        boolean boolean45 = borderArrangement7.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement25", borderArrangement0.equals(borderArrangement25) ? borderArrangement0.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement12.equals((java.lang.Object) borderArrangement15);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.Block block44 = null;
        java.lang.Object obj45 = null;
        borderArrangement31.add(block44, obj45);
        borderArrangement0.add(block30, (java.lang.Object) block44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement15", borderArrangement12.equals(borderArrangement15) ? borderArrangement12.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement23.add(block28, obj29);
        borderArrangement17.add(block22, obj29);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement17.getClass();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        java.lang.Class<?> wildcardClass35 = borderArrangement17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        borderArrangement31.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement31", borderArrangement11.equals(borderArrangement31) ? borderArrangement11.hashCode() == borderArrangement31.hashCode() : true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement22.getClass();
        boolean boolean36 = borderArrangement14.equals((java.lang.Object) borderArrangement22);
        borderArrangement14.clear();
        boolean boolean39 = borderArrangement14.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass40 = borderArrangement14.getClass();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass10 = borderArrangement9.getClass();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) true);
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) true);
        boolean boolean47 = borderArrangement24.equals((java.lang.Object) borderArrangement38);
        boolean boolean48 = borderArrangement12.equals((java.lang.Object) borderArrangement24);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement12", borderArrangement9.equals(borderArrangement12) ? borderArrangement9.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (byte) 100);
        borderArrangement32.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) borderArrangement32);
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean45 = borderArrangement16.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement4", borderArrangement0.equals(borderArrangement4) ? borderArrangement0.hashCode() == borderArrangement4.hashCode() : true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean40 = borderArrangement38.equals((java.lang.Object) 10);
        borderArrangement38.clear();
        borderArrangement38.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        boolean boolean46 = borderArrangement43.equals((java.lang.Object) '#');
        borderArrangement43.clear();
        boolean boolean49 = borderArrangement43.equals((java.lang.Object) "");
        boolean boolean51 = borderArrangement43.equals((java.lang.Object) 0L);
        boolean boolean52 = borderArrangement38.equals((java.lang.Object) borderArrangement43);
        borderArrangement43.clear();
        borderArrangement43.clear();
        boolean boolean55 = borderArrangement23.equals((java.lang.Object) borderArrangement43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) (short) 1);
        borderArrangement23.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement23.equals(obj27);
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement23", borderArrangement11.equals(borderArrangement23) ? borderArrangement11.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) (byte) 100);
        borderArrangement27.clear();
        boolean boolean37 = borderArrangement19.equals((java.lang.Object) borderArrangement27);
        boolean boolean38 = borderArrangement12.equals((java.lang.Object) borderArrangement27);
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement19", borderArrangement12.equals(borderArrangement19) ? borderArrangement12.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) false);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) 'a');
        borderArrangement23.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        boolean boolean36 = borderArrangement31.equals((java.lang.Object) (byte) -1);
        boolean boolean38 = borderArrangement31.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass39 = borderArrangement31.getClass();
        boolean boolean40 = borderArrangement23.equals((java.lang.Object) borderArrangement31);
        boolean boolean41 = borderArrangement14.equals((java.lang.Object) borderArrangement23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement9", borderArrangement0.equals(borderArrangement9) ? borderArrangement0.hashCode() == borderArrangement9.hashCode() : true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement16.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block30 = null;
        java.lang.Object obj31 = null;
        borderArrangement16.add(block30, obj31);
        borderArrangement16.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        java.lang.Class<?> wildcardClass35 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement16 and borderArrangement25", borderArrangement16.equals(borderArrangement25) ? borderArrangement16.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) 0L);
        borderArrangement3.clear();
        borderArrangement3.clear();
        borderArrangement3.clear();
        boolean boolean16 = borderArrangement3.equals((java.lang.Object) 100.0f);
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement3.equals(obj17);
        borderArrangement3.clear();
        borderArrangement3.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 10);
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) true);
        boolean boolean45 = borderArrangement35.equals((java.lang.Object) 10);
        boolean boolean47 = borderArrangement35.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass48 = borderArrangement35.getClass();
        boolean boolean49 = borderArrangement22.equals((java.lang.Object) wildcardClass48);
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) "");
        boolean boolean59 = borderArrangement51.equals((java.lang.Object) 0L);
        boolean boolean60 = borderArrangement22.equals((java.lang.Object) borderArrangement51);
        boolean boolean61 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement3 and borderArrangement35", borderArrangement3.equals(borderArrangement35) ? borderArrangement3.hashCode() == borderArrangement35.hashCode() : true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement9.equals((java.lang.Object) borderArrangement13);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) (byte) -1);
        boolean boolean31 = borderArrangement24.equals((java.lang.Object) (-1));
        borderArrangement24.clear();
        borderArrangement24.clear();
        java.lang.Class<?> wildcardClass34 = borderArrangement24.getClass();
        boolean boolean35 = borderArrangement9.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement20", borderArrangement13.equals(borderArrangement20) ? borderArrangement13.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement8.add(block16, obj17);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) 10);
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) (byte) -1);
        boolean boolean34 = borderArrangement27.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass35 = borderArrangement27.getClass();
        boolean boolean36 = borderArrangement19.equals((java.lang.Object) borderArrangement27);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        boolean boolean42 = borderArrangement37.equals((java.lang.Object) (byte) -1);
        boolean boolean44 = borderArrangement37.equals((java.lang.Object) (-1));
        borderArrangement37.clear();
        boolean boolean46 = borderArrangement19.equals((java.lang.Object) borderArrangement37);
        boolean boolean47 = borderArrangement8.equals((java.lang.Object) borderArrangement37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement6.add(block17, obj18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) 'a');
        borderArrangement20.clear();
        boolean boolean29 = borderArrangement20.equals((java.lang.Object) (short) 10);
        boolean boolean30 = borderArrangement6.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) "");
        borderArrangement37.clear();
        boolean boolean45 = borderArrangement31.equals((java.lang.Object) borderArrangement37);
        org.jfree.chart.block.Block block46 = null;
        java.lang.Object obj47 = null;
        borderArrangement31.add(block46, obj47);
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement31.equals(obj49);
        boolean boolean51 = borderArrangement6.equals((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement20", borderArrangement0.equals(borderArrangement20) ? borderArrangement0.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) 10);
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.Block block34 = null;
        java.lang.Object obj35 = null;
        borderArrangement29.add(block34, obj35);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement29.equals(obj42);
        borderArrangement29.clear();
        boolean boolean45 = borderArrangement17.equals((java.lang.Object) borderArrangement29);
        borderArrangement29.clear();
        boolean boolean47 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        java.lang.Class<?> wildcardClass48 = borderArrangement29.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement17", borderArrangement0.equals(borderArrangement17) ? borderArrangement0.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        org.jfree.chart.block.Block block33 = null;
        java.lang.Object obj34 = null;
        borderArrangement23.add(block33, obj34);
        boolean boolean36 = borderArrangement14.equals((java.lang.Object) borderArrangement23);
        java.lang.Class<?> wildcardClass37 = borderArrangement23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) 0.0f);
        borderArrangement15.clear();
        boolean boolean19 = borderArrangement5.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass20 = borderArrangement5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) 0L);
        boolean boolean30 = borderArrangement16.equals((java.lang.Object) borderArrangement21);
        borderArrangement21.clear();
        org.jfree.chart.block.Block block32 = null;
        java.lang.Object obj33 = null;
        borderArrangement21.add(block32, obj33);
        java.lang.Class<?> wildcardClass35 = borderArrangement21.getClass();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement16 and borderArrangement21", borderArrangement16.equals(borderArrangement21) ? borderArrangement16.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement23.getClass();
        boolean boolean30 = borderArrangement9.equals((java.lang.Object) wildcardClass29);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        boolean boolean48 = borderArrangement42.equals((java.lang.Object) "");
        boolean boolean50 = borderArrangement42.equals((java.lang.Object) true);
        boolean boolean52 = borderArrangement42.equals((java.lang.Object) 10);
        boolean boolean54 = borderArrangement42.equals((java.lang.Object) (byte) 0);
        boolean boolean55 = borderArrangement34.equals((java.lang.Object) borderArrangement42);
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement57 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement57.clear();
        boolean boolean60 = borderArrangement57.equals((java.lang.Object) '#');
        borderArrangement57.clear();
        boolean boolean63 = borderArrangement57.equals((java.lang.Object) "");
        boolean boolean65 = borderArrangement57.equals((java.lang.Object) true);
        boolean boolean67 = borderArrangement57.equals((java.lang.Object) 10);
        borderArrangement57.clear();
        boolean boolean69 = borderArrangement34.equals((java.lang.Object) borderArrangement57);
        boolean boolean70 = borderArrangement9.equals((java.lang.Object) borderArrangement34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement13.equals((java.lang.Object) borderArrangement27);
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement27", borderArrangement13.equals(borderArrangement27) ? borderArrangement13.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) borderArrangement23);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        java.lang.Class<?> wildcardClass35 = borderArrangement23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement10.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) wildcardClass16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) true);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        borderArrangement47.clear();
        boolean boolean53 = borderArrangement47.equals((java.lang.Object) "");
        boolean boolean55 = borderArrangement47.equals((java.lang.Object) true);
        boolean boolean56 = borderArrangement33.equals((java.lang.Object) borderArrangement47);
        boolean boolean57 = borderArrangement20.equals((java.lang.Object) borderArrangement33);
        boolean boolean58 = borderArrangement0.equals((java.lang.Object) borderArrangement33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement20", borderArrangement10.equals(borderArrangement20) ? borderArrangement10.hashCode() == borderArrangement20.hashCode() : true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) 1L);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        boolean boolean22 = borderArrangement13.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean34 = borderArrangement13.equals((java.lang.Object) borderArrangement23);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean37 = borderArrangement3.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 10);
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) (-1));
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) 'a');
        borderArrangement36.clear();
        org.jfree.chart.block.Block block44 = null;
        java.lang.Object obj45 = null;
        borderArrangement36.add(block44, obj45);
        boolean boolean47 = borderArrangement22.equals((java.lang.Object) borderArrangement36);
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean50 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement36", borderArrangement6.equals(borderArrangement36) ? borderArrangement6.hashCode() == borderArrangement36.hashCode() : true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) (byte) 100);
        borderArrangement33.clear();
        java.lang.Object obj43 = null;
        boolean boolean44 = borderArrangement33.equals(obj43);
        org.jfree.chart.block.BorderArrangement borderArrangement45 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement45.clear();
        boolean boolean48 = borderArrangement45.equals((java.lang.Object) '#');
        borderArrangement45.clear();
        boolean boolean51 = borderArrangement45.equals((java.lang.Object) "");
        boolean boolean53 = borderArrangement45.equals((java.lang.Object) true);
        borderArrangement45.clear();
        borderArrangement45.clear();
        borderArrangement45.clear();
        boolean boolean57 = borderArrangement33.equals((java.lang.Object) borderArrangement45);
        boolean boolean58 = borderArrangement22.equals((java.lang.Object) borderArrangement33);
        boolean boolean59 = borderArrangement14.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement33", borderArrangement0.equals(borderArrangement33) ? borderArrangement0.hashCode() == borderArrangement33.hashCode() : true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement10.equals(obj19);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement0.add(block24, obj25);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) 'a');
        borderArrangement28.clear();
        boolean boolean37 = borderArrangement28.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass38 = borderArrangement28.getClass();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement28", borderArrangement10.equals(borderArrangement28) ? borderArrangement10.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement16.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block30 = null;
        java.lang.Object obj31 = null;
        borderArrangement16.add(block30, obj31);
        borderArrangement16.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        borderArrangement16.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement25", borderArrangement0.equals(borderArrangement25) ? borderArrangement0.hashCode() == borderArrangement25.hashCode() : true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) 0L);
        boolean boolean27 = borderArrangement13.equals((java.lang.Object) borderArrangement18);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        java.lang.Class<?> wildcardClass32 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement18", borderArrangement13.equals(borderArrangement18) ? borderArrangement13.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement28.getClass();
        boolean boolean34 = borderArrangement15.equals((java.lang.Object) borderArrangement28);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass40 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement15 and borderArrangement28", borderArrangement15.equals(borderArrangement28) ? borderArrangement15.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement10.equals(obj20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean34 = borderArrangement10.equals((java.lang.Object) borderArrangement22);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        boolean boolean41 = borderArrangement36.equals((java.lang.Object) 1L);
        boolean boolean42 = borderArrangement10.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) 'a');
        borderArrangement26.clear();
        boolean boolean34 = borderArrangement17.equals((java.lang.Object) borderArrangement26);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.Block block36 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) "");
        boolean boolean45 = borderArrangement37.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block46 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        borderArrangement47.clear();
        boolean boolean53 = borderArrangement47.equals((java.lang.Object) "");
        boolean boolean55 = borderArrangement47.equals((java.lang.Object) (byte) 100);
        borderArrangement47.clear();
        borderArrangement47.clear();
        org.jfree.chart.block.Block block58 = null;
        java.lang.Object obj59 = null;
        borderArrangement47.add(block58, obj59);
        borderArrangement37.add(block46, (java.lang.Object) block58);
        borderArrangement0.add(block36, (java.lang.Object) block58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement26", borderArrangement17.equals(borderArrangement26) ? borderArrangement17.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) 10);
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) 'a');
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass38 = borderArrangement29.getClass();
        boolean boolean39 = borderArrangement25.equals((java.lang.Object) wildcardClass38);
        java.lang.Class<?> wildcardClass40 = borderArrangement25.getClass();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement29", borderArrangement14.equals(borderArrangement29) ? borderArrangement14.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) (byte) 100);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) 'a');
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement42.getClass();
        boolean boolean48 = borderArrangement38.equals((java.lang.Object) borderArrangement42);
        borderArrangement38.clear();
        borderArrangement38.clear();
        borderArrangement38.clear();
        boolean boolean52 = borderArrangement29.equals((java.lang.Object) borderArrangement38);
        boolean boolean53 = borderArrangement0.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement29", borderArrangement14.equals(borderArrangement29) ? borderArrangement14.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        borderArrangement10.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) (byte) 100);
        borderArrangement18.clear();
        boolean boolean28 = borderArrangement10.equals((java.lang.Object) borderArrangement18);
        borderArrangement10.clear();
        boolean boolean31 = borderArrangement10.equals((java.lang.Object) 1.0f);
        boolean boolean32 = borderArrangement0.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement18", borderArrangement10.equals(borderArrangement18) ? borderArrangement10.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass28 = borderArrangement19.getClass();
        boolean boolean29 = borderArrangement15.equals((java.lang.Object) wildcardClass28);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement19", borderArrangement0.equals(borderArrangement19) ? borderArrangement0.hashCode() == borderArrangement19.hashCode() : true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        borderArrangement18.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement26.equals((java.lang.Object) 10);
        boolean boolean38 = borderArrangement26.equals((java.lang.Object) (byte) 0);
        boolean boolean39 = borderArrangement18.equals((java.lang.Object) borderArrangement26);
        boolean boolean40 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        java.lang.Class<?> wildcardClass41 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement18 and borderArrangement26", borderArrangement18.equals(borderArrangement26) ? borderArrangement18.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement18.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) (short) 1);
        borderArrangement30.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        java.lang.Class<?> wildcardClass35 = borderArrangement30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement18", borderArrangement0.equals(borderArrangement18) ? borderArrangement0.hashCode() == borderArrangement18.hashCode() : true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement7.equals((java.lang.Object) borderArrangement10);
        borderArrangement10.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement22.equals((java.lang.Object) (byte) -1);
        boolean boolean29 = borderArrangement22.equals((java.lang.Object) (-1));
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) 0L);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        boolean boolean45 = borderArrangement22.equals((java.lang.Object) borderArrangement33);
        boolean boolean47 = borderArrangement22.equals((java.lang.Object) 10L);
        borderArrangement22.clear();
        boolean boolean50 = borderArrangement22.equals((java.lang.Object) 0);
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement53.clear();
        boolean boolean56 = borderArrangement53.equals((java.lang.Object) '#');
        borderArrangement53.clear();
        boolean boolean59 = borderArrangement53.equals((java.lang.Object) "");
        boolean boolean61 = borderArrangement53.equals((java.lang.Object) true);
        boolean boolean63 = borderArrangement53.equals((java.lang.Object) 1.0f);
        borderArrangement53.clear();
        boolean boolean65 = borderArrangement22.equals((java.lang.Object) borderArrangement53);
        boolean boolean66 = borderArrangement10.equals((java.lang.Object) boolean65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (byte) -1);
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) (-1));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement11.equals(obj19);
        java.lang.Class<?> wildcardClass21 = borderArrangement11.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        boolean boolean36 = borderArrangement26.equals((java.lang.Object) 10);
        boolean boolean38 = borderArrangement26.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) 0L);
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        boolean boolean52 = borderArrangement39.equals((java.lang.Object) 100.0f);
        borderArrangement39.clear();
        boolean boolean54 = borderArrangement26.equals((java.lang.Object) borderArrangement39);
        boolean boolean55 = borderArrangement0.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement26", borderArrangement11.equals(borderArrangement26) ? borderArrangement11.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement5.add(block16, obj17);
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        borderArrangement23.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 10);
        boolean boolean43 = borderArrangement31.equals((java.lang.Object) (byte) 0);
        boolean boolean44 = borderArrangement23.equals((java.lang.Object) borderArrangement31);
        boolean boolean45 = borderArrangement5.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement23", borderArrangement0.equals(borderArrangement23) ? borderArrangement0.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (byte) -1);
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) (-1));
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean26 = borderArrangement3.equals((java.lang.Object) borderArrangement14);
        borderArrangement3.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement14", borderArrangement0.equals(borderArrangement14) ? borderArrangement0.hashCode() == borderArrangement14.hashCode() : true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        borderArrangement29.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement29.equals(obj39);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) "");
        boolean boolean49 = borderArrangement41.equals((java.lang.Object) 0L);
        boolean boolean50 = borderArrangement29.equals((java.lang.Object) 0L);
        boolean boolean51 = borderArrangement0.equals((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement29", borderArrangement11.equals(borderArrangement29) ? borderArrangement11.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (byte) -1);
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) (-1));
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement11.equals(obj19);
        java.lang.Class<?> wildcardClass21 = borderArrangement11.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) 0L);
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        java.lang.Class<?> wildcardClass36 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement24", borderArrangement11.equals(borderArrangement24) ? borderArrangement11.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement7.add(block22, obj23);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement7.equals(obj25);
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        java.lang.Class<?> wildcardClass30 = borderArrangement7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement13", borderArrangement0.equals(borderArrangement13) ? borderArrangement0.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        boolean boolean48 = borderArrangement40.equals((java.lang.Object) true);
        boolean boolean50 = borderArrangement40.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) 'a');
        boolean boolean58 = borderArrangement40.equals((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = borderArrangement40.getClass();
        boolean boolean60 = borderArrangement26.equals((java.lang.Object) borderArrangement40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement8", borderArrangement0.equals(borderArrangement8) ? borderArrangement0.hashCode() == borderArrangement8.hashCode() : true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean8 = borderArrangement6.equals((java.lang.Object) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement6.add(block11, obj12);
        borderArrangement6.clear();
        boolean boolean15 = borderArrangement3.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        java.lang.Class<?> wildcardClass17 = borderArrangement6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement3", borderArrangement0.equals(borderArrangement3) ? borderArrangement0.hashCode() == borderArrangement3.hashCode() : true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean10 = borderArrangement8.equals((java.lang.Object) (short) 1);
        borderArrangement8.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement8.equals(obj12);
        borderArrangement8.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement23.add(block28, obj29);
        borderArrangement17.add(block22, obj29);
        borderArrangement17.clear();
        boolean boolean34 = borderArrangement17.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass35 = borderArrangement17.getClass();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement8 and borderArrangement17", borderArrangement8.equals(borderArrangement17) ? borderArrangement8.hashCode() == borderArrangement17.hashCode() : true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement0.equals(obj24);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement0.add(block27, obj28);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) (byte) 100);
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.Block block42 = null;
        java.lang.Object obj43 = null;
        borderArrangement31.add(block42, obj43);
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) block42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement31", borderArrangement11.equals(borderArrangement31) ? borderArrangement11.hashCode() == borderArrangement31.hashCode() : true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        boolean boolean31 = borderArrangement26.equals((java.lang.Object) 1L);
        borderArrangement26.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        java.lang.Class<?> wildcardClass34 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement11 and borderArrangement26", borderArrangement11.equals(borderArrangement26) ? borderArrangement11.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        boolean boolean25 = borderArrangement14.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) 0L);
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean37 = borderArrangement14.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        borderArrangement38.clear();
        boolean boolean44 = borderArrangement38.equals((java.lang.Object) "");
        boolean boolean46 = borderArrangement38.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj47 = null;
        boolean boolean48 = borderArrangement38.equals(obj47);
        java.lang.Class<?> wildcardClass49 = borderArrangement38.getClass();
        boolean boolean50 = borderArrangement14.equals((java.lang.Object) borderArrangement38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement26", borderArrangement0.equals(borderArrangement26) ? borderArrangement0.hashCode() == borderArrangement26.hashCode() : true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement12.add(block17, obj18);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        borderArrangement12.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) (byte) -1);
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        borderArrangement30.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement12", borderArrangement0.equals(borderArrangement12) ? borderArrangement0.hashCode() == borderArrangement12.hashCode() : true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) 'a');
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) 'a');
        borderArrangement24.clear();
        boolean boolean33 = borderArrangement24.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean36 = borderArrangement34.equals((java.lang.Object) (short) 1);
        borderArrangement34.clear();
        boolean boolean38 = borderArrangement24.equals((java.lang.Object) borderArrangement34);
        borderArrangement24.clear();
        java.lang.Class<?> wildcardClass40 = borderArrangement24.getClass();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement34", borderArrangement13.equals(borderArrangement34) ? borderArrangement13.hashCode() == borderArrangement34.hashCode() : true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement7.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        boolean boolean34 = borderArrangement29.equals((java.lang.Object) (byte) -1);
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement29);
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement29.equals(obj36);
        borderArrangement29.clear();
        boolean boolean39 = borderArrangement19.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement7", borderArrangement0.equals(borderArrangement7) ? borderArrangement0.hashCode() == borderArrangement7.hashCode() : true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement8.equals(obj20);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        borderArrangement29.clear();
        boolean boolean37 = borderArrangement22.equals((java.lang.Object) borderArrangement29);
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean41 = borderArrangement8.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement29", borderArrangement0.equals(borderArrangement29) ? borderArrangement0.hashCode() == borderArrangement29.hashCode() : true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) (byte) 100);
        borderArrangement18.clear();
        java.lang.Object obj28 = null;
        boolean boolean29 = borderArrangement18.equals(obj28);
        borderArrangement18.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement18.equals(obj31);
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) true);
        boolean boolean43 = borderArrangement33.equals((java.lang.Object) 10);
        boolean boolean45 = borderArrangement33.equals((java.lang.Object) (byte) 0);
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement33.getClass();
        boolean boolean48 = borderArrangement18.equals((java.lang.Object) wildcardClass47);
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BorderArrangement borderArrangement50 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement50.clear();
        boolean boolean53 = borderArrangement50.equals((java.lang.Object) '#');
        borderArrangement50.clear();
        boolean boolean56 = borderArrangement50.equals((java.lang.Object) "");
        boolean boolean58 = borderArrangement50.equals((java.lang.Object) (byte) 100);
        borderArrangement50.clear();
        java.lang.Object obj60 = null;
        boolean boolean61 = borderArrangement50.equals(obj60);
        org.jfree.chart.block.Block block62 = null;
        java.lang.Object obj63 = null;
        borderArrangement50.add(block62, obj63);
        java.lang.Class<?> wildcardClass65 = borderArrangement50.getClass();
        boolean boolean66 = borderArrangement18.equals((java.lang.Object) wildcardClass65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement33", borderArrangement0.equals(borderArrangement33) ? borderArrangement0.hashCode() == borderArrangement33.hashCode() : true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement9.equals((java.lang.Object) borderArrangement15);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        java.lang.Class<?> wildcardClass26 = borderArrangement15.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) true);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        boolean boolean48 = borderArrangement42.equals((java.lang.Object) "");
        boolean boolean50 = borderArrangement42.equals((java.lang.Object) true);
        boolean boolean51 = borderArrangement28.equals((java.lang.Object) borderArrangement42);
        borderArrangement28.clear();
        java.lang.Class<?> wildcardClass53 = borderArrangement28.getClass();
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement9 and borderArrangement15", borderArrangement9.equals(borderArrangement15) ? borderArrangement9.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement23.add(block28, obj29);
        borderArrangement17.add(block22, obj29);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement17.getClass();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.jfree.chart.block.Block block35 = null;
        java.lang.Object obj36 = null;
        borderArrangement0.add(block35, obj36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement17 and borderArrangement23", borderArrangement17.equals(borderArrangement23) ? borderArrangement17.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) 'a');
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) (byte) 100);
        borderArrangement24.clear();
        boolean boolean34 = borderArrangement21.equals((java.lang.Object) borderArrangement24);
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement6 and borderArrangement24", borderArrangement6.equals(borderArrangement24) ? borderArrangement6.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass17 = borderArrangement16.getClass();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement4 and borderArrangement16", borderArrangement4.equals(borderArrangement16) ? borderArrangement4.hashCode() == borderArrangement16.hashCode() : true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) true);
        boolean boolean37 = borderArrangement14.equals((java.lang.Object) borderArrangement28);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement28);
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean41 = borderArrangement39.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        boolean boolean45 = borderArrangement42.equals((java.lang.Object) '#');
        borderArrangement42.clear();
        boolean boolean48 = borderArrangement42.equals((java.lang.Object) "");
        boolean boolean50 = borderArrangement42.equals((java.lang.Object) (byte) 100);
        borderArrangement42.clear();
        java.lang.Object obj52 = null;
        boolean boolean53 = borderArrangement42.equals(obj52);
        org.jfree.chart.block.Block block54 = null;
        java.lang.Object obj55 = null;
        borderArrangement42.add(block54, obj55);
        boolean boolean57 = borderArrangement39.equals((java.lang.Object) block54);
        boolean boolean58 = borderArrangement0.equals((java.lang.Object) borderArrangement39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement14 and borderArrangement28", borderArrangement14.equals(borderArrangement28) ? borderArrangement14.hashCode() == borderArrangement28.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) true);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) 'a');
        borderArrangement36.clear();
        boolean boolean44 = borderArrangement27.equals((java.lang.Object) borderArrangement36);
        java.lang.Class<?> wildcardClass45 = borderArrangement36.getClass();
        boolean boolean46 = borderArrangement10.equals((java.lang.Object) borderArrangement36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement27", borderArrangement0.equals(borderArrangement27) ? borderArrangement0.hashCode() == borderArrangement27.hashCode() : true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement21.equals(obj31);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean39 = borderArrangement8.equals((java.lang.Object) borderArrangement21);
        java.lang.Class<?> wildcardClass40 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement21", borderArrangement0.equals(borderArrangement21) ? borderArrangement0.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) 'a');
        boolean boolean33 = borderArrangement25.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement25.equals(obj34);
        borderArrangement25.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) "");
        boolean boolean45 = borderArrangement37.equals((java.lang.Object) true);
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement50 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement50.clear();
        boolean boolean53 = borderArrangement50.equals((java.lang.Object) '#');
        borderArrangement50.clear();
        java.lang.Class<?> wildcardClass55 = borderArrangement50.getClass();
        boolean boolean56 = borderArrangement37.equals((java.lang.Object) borderArrangement50);
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        borderArrangement37.clear();
        java.lang.Class<?> wildcardClass61 = borderArrangement37.getClass();
        boolean boolean62 = borderArrangement25.equals((java.lang.Object) borderArrangement37);
        boolean boolean63 = borderArrangement12.equals((java.lang.Object) borderArrangement25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement37", borderArrangement0.equals(borderArrangement37) ? borderArrangement0.hashCode() == borderArrangement37.hashCode() : true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        boolean boolean33 = borderArrangement23.equals((java.lang.Object) 10);
        boolean boolean35 = borderArrangement23.equals((java.lang.Object) (byte) 0);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        boolean boolean44 = borderArrangement39.equals((java.lang.Object) 1L);
        java.lang.Object obj45 = null;
        boolean boolean46 = borderArrangement39.equals(obj45);
        borderArrangement39.clear();
        borderArrangement39.clear();
        boolean boolean49 = borderArrangement23.equals((java.lang.Object) borderArrangement39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement11", borderArrangement0.equals(borderArrangement11) ? borderArrangement0.hashCode() == borderArrangement11.hashCode() : true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement12.equals(obj22);
        borderArrangement12.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        java.lang.Class<?> wildcardClass27 = borderArrangement12.getClass();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) wildcardClass27);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass38 = borderArrangement33.getClass();
        boolean boolean39 = borderArrangement29.equals((java.lang.Object) borderArrangement33);
        borderArrangement29.clear();
        borderArrangement29.clear();
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement29.equals(obj42);
        borderArrangement29.clear();
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement12 and borderArrangement33", borderArrangement12.equals(borderArrangement33) ? borderArrangement12.hashCode() == borderArrangement33.hashCode() : true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean28 = borderArrangement23.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass29 = borderArrangement23.getClass();
        boolean boolean30 = borderArrangement10.equals((java.lang.Object) wildcardClass29);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement23", borderArrangement10.equals(borderArrangement23) ? borderArrangement10.hashCode() == borderArrangement23.hashCode() : true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement22.equals((java.lang.Object) (byte) -1);
        boolean boolean28 = borderArrangement8.equals((java.lang.Object) borderArrangement22);
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) (short) 1);
        boolean boolean32 = borderArrangement8.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement22", borderArrangement0.equals(borderArrangement22) ? borderArrangement0.hashCode() == borderArrangement22.hashCode() : true);
    }
}

