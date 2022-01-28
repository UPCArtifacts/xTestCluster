import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) 1.0f);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement13.equals(obj21);
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) range28);
        borderArrangement24.clear();
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = range33.equals(obj34);
        boolean boolean36 = borderArrangement24.equals(obj34);
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean39 = borderArrangement13.equals((java.lang.Object) borderArrangement24);
        boolean boolean40 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        borderArrangement7.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement24", borderArrangement13.equals(borderArrangement24) ? borderArrangement13.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        double double34 = range31.getCentralValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        double double34 = range31.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.data.Range range36 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = range36.equals(obj37);
        boolean boolean41 = range36.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range36, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range36, (double) (short) -1);
        boolean boolean47 = borderArrangement7.equals((java.lang.Object) range36);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range36, 16.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range31, (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = range31.equals(obj32);
        boolean boolean36 = range31.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range31, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range31, (double) (short) -1);
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range44.getLength();
        double double47 = range44.constrain(0.0d);
        java.lang.String str48 = range44.toString();
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range44, (double) (short) 1, true);
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range51, (double) '4');
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range31, range53);
        double double55 = range31.getLowerBound();
        boolean boolean56 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range31, (double) (byte) 0, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 10);
        double double35 = range34.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean38 = borderArrangement36.equals((java.lang.Object) (-1L));
        boolean boolean40 = borderArrangement36.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = range34.equals((java.lang.Object) borderArrangement36);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean47 = borderArrangement42.equals((java.lang.Object) range46);
        borderArrangement42.clear();
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj52 = new java.lang.Object();
        boolean boolean53 = range51.equals(obj52);
        boolean boolean54 = borderArrangement42.equals(obj52);
        boolean boolean55 = borderArrangement36.equals((java.lang.Object) borderArrangement42);
        boolean boolean57 = borderArrangement36.equals((java.lang.Object) 50.0d);
        boolean boolean58 = borderArrangement0.equals((java.lang.Object) boolean57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement36 and borderArrangement42", borderArrangement36.equals(borderArrangement42) ? borderArrangement36.hashCode() == borderArrangement42.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1L));
        borderArrangement19.clear();
        boolean boolean23 = range18.equals((java.lang.Object) borderArrangement19);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) (short) 10);
        double double31 = range30.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean34 = borderArrangement32.equals((java.lang.Object) (-1L));
        boolean boolean36 = borderArrangement32.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = range30.equals((java.lang.Object) borderArrangement32);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean43 = borderArrangement38.equals((java.lang.Object) range42);
        boolean boolean45 = borderArrangement38.equals((java.lang.Object) 1.0f);
        java.lang.Object obj46 = null;
        boolean boolean47 = borderArrangement38.equals(obj46);
        borderArrangement38.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement49 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement49.clear();
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean54 = borderArrangement49.equals((java.lang.Object) range53);
        borderArrangement49.clear();
        org.jfree.data.Range range58 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = range58.equals(obj59);
        boolean boolean61 = borderArrangement49.equals(obj59);
        borderArrangement49.clear();
        borderArrangement49.clear();
        boolean boolean64 = borderArrangement38.equals((java.lang.Object) borderArrangement49);
        boolean boolean65 = borderArrangement32.equals((java.lang.Object) borderArrangement38);
        boolean boolean66 = borderArrangement0.equals((java.lang.Object) borderArrangement32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement19 and borderArrangement38", borderArrangement19.equals(borderArrangement38) ? borderArrangement19.hashCode() == borderArrangement38.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean48 = borderArrangement43.equals((java.lang.Object) range47);
        borderArrangement43.clear();
        borderArrangement43.clear();
        org.jfree.data.Range range53 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double54 = range53.getCentralValue();
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 1);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range53, (double) 'a');
        boolean boolean59 = borderArrangement43.equals((java.lang.Object) range58);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range58, (double) (-1));
        boolean boolean62 = borderArrangement0.equals((java.lang.Object) range61);
        double double63 = range61.getCentralValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement43", borderArrangement0.equals(borderArrangement43) ? borderArrangement0.hashCode() == borderArrangement43.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) 1.0f);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement13.equals(obj21);
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) range28);
        borderArrangement24.clear();
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = range33.equals(obj34);
        boolean boolean36 = borderArrangement24.equals(obj34);
        borderArrangement24.clear();
        borderArrangement24.clear();
        boolean boolean39 = borderArrangement13.equals((java.lang.Object) borderArrangement24);
        boolean boolean40 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        java.lang.Class<?> wildcardClass41 = borderArrangement7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement13 and borderArrangement24", borderArrangement13.equals(borderArrangement24) ? borderArrangement13.hashCode() == borderArrangement24.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        org.jfree.data.Range range29 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 0);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) range31);
        org.jfree.data.Range range36 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = range36.equals(obj37);
        boolean boolean41 = range36.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range36, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range36, (double) (short) -1);
        boolean boolean47 = borderArrangement7.equals((java.lang.Object) range36);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range36, (double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = range10.equals(obj11);
        boolean boolean15 = range10.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean25 = range10.equals((java.lang.Object) 100L);
        boolean boolean27 = range10.contains((double) (byte) 100);
        double double28 = range10.getLowerBound();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) double28);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) range34);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double41 = range40.getCentralValue();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range40, (double) 'a');
        boolean boolean46 = borderArrangement30.equals((java.lang.Object) range45);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (-1));
        boolean boolean49 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.data.Range range52 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double53 = range52.getLength();
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range52, (double) (short) 10);
        double double56 = range55.getLowerBound();
        org.jfree.data.Range range58 = org.jfree.data.Range.expandToInclude(range55, (double) 100L);
        boolean boolean61 = range58.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range64 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double65 = range64.getLength();
        org.jfree.data.Range range67 = org.jfree.data.Range.expandToInclude(range64, (double) (short) 10);
        double double68 = range67.getLowerBound();
        boolean boolean70 = range67.contains((double) (byte) 0);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range67, (double) 1.0f, false);
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range58, range73);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range58, (double) 0.0f, false);
        java.lang.String str78 = range58.toString();
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range58, 530.0d, false);
        org.jfree.data.Range range83 = org.jfree.data.Range.shift(range81, (double) 10L);
        boolean boolean84 = borderArrangement0.equals((java.lang.Object) range81);
        org.jfree.chart.block.BorderArrangement borderArrangement85 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean87 = borderArrangement85.equals((java.lang.Object) (-1L));
        borderArrangement85.clear();
        java.lang.Class<?> wildcardClass89 = borderArrangement85.getClass();
        boolean boolean90 = borderArrangement0.equals((java.lang.Object) wildcardClass89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement30 and borderArrangement85", borderArrangement30.equals(borderArrangement85) ? borderArrangement30.hashCode() == borderArrangement85.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) ' ');
        double double9 = range8.getCentralValue();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean15 = borderArrangement10.equals((java.lang.Object) range14);
        boolean boolean17 = borderArrangement10.equals((java.lang.Object) 1.0f);
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement10.equals(obj18);
        borderArrangement10.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean26 = borderArrangement21.equals((java.lang.Object) range25);
        borderArrangement21.clear();
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = range30.equals(obj31);
        boolean boolean33 = borderArrangement21.equals(obj31);
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean36 = borderArrangement10.equals((java.lang.Object) borderArrangement21);
        boolean boolean37 = range8.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement10 and borderArrangement21", borderArrangement10.equals(borderArrangement21) ? borderArrangement10.hashCode() == borderArrangement21.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = range9.equals(obj10);
        boolean boolean14 = range9.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double18 = range17.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range17, (double) (short) 10);
        double double21 = range20.getLowerBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range20, (double) 100L);
        boolean boolean24 = range9.equals((java.lang.Object) 100L);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) (short) 10);
        double double31 = range30.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean34 = borderArrangement32.equals((java.lang.Object) (-1L));
        boolean boolean36 = borderArrangement32.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = range30.equals((java.lang.Object) borderArrangement32);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean43 = borderArrangement38.equals((java.lang.Object) range42);
        borderArrangement38.clear();
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj48 = new java.lang.Object();
        boolean boolean49 = range47.equals(obj48);
        boolean boolean50 = borderArrangement38.equals(obj48);
        boolean boolean51 = borderArrangement32.equals((java.lang.Object) borderArrangement38);
        boolean boolean53 = borderArrangement32.equals((java.lang.Object) 50.0d);
        borderArrangement32.clear();
        boolean boolean55 = range9.equals((java.lang.Object) borderArrangement32);
        boolean boolean56 = borderArrangement0.equals((java.lang.Object) boolean55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement32 and borderArrangement38", borderArrangement32.equals(borderArrangement38) ? borderArrangement32.hashCode() == borderArrangement38.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range19.constrain(10.0d);
        boolean boolean24 = range19.intersects((double) 10.0f, (double) (-1.0f));
        boolean boolean26 = range19.contains((double) 0);
        double double27 = range19.getCentralValue();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range19);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 10);
        double double35 = range34.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean38 = borderArrangement36.equals((java.lang.Object) (-1L));
        boolean boolean40 = borderArrangement36.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = range34.equals((java.lang.Object) borderArrangement36);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement42.clear();
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean47 = borderArrangement42.equals((java.lang.Object) range46);
        boolean boolean49 = borderArrangement42.equals((java.lang.Object) 1.0f);
        java.lang.Object obj50 = null;
        boolean boolean51 = borderArrangement42.equals(obj50);
        borderArrangement42.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement53.clear();
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean58 = borderArrangement53.equals((java.lang.Object) range57);
        borderArrangement53.clear();
        org.jfree.data.Range range62 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj63 = new java.lang.Object();
        boolean boolean64 = range62.equals(obj63);
        boolean boolean65 = borderArrangement53.equals(obj63);
        borderArrangement53.clear();
        borderArrangement53.clear();
        boolean boolean68 = borderArrangement42.equals((java.lang.Object) borderArrangement53);
        boolean boolean69 = borderArrangement36.equals((java.lang.Object) borderArrangement42);
        boolean boolean70 = borderArrangement0.equals((java.lang.Object) borderArrangement42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement36 and borderArrangement53", borderArrangement36.equals(borderArrangement53) ? borderArrangement36.hashCode() == borderArrangement53.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        double double9 = range7.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range12, (double) (short) 10);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range7, range12);
        double double20 = range7.constrain((double) (byte) 1);
        double double21 = range7.getCentralValue();
        double double22 = range7.getCentralValue();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) double22);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 100L, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, (double) 100, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, 35.0d, true);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range41);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range45.constrain(10.0d);
        boolean boolean50 = range45.intersects((double) 10.0f, (double) (-1.0f));
        double double52 = range45.constrain(0.0d);
        double double54 = range45.constrain((double) (short) 10);
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range45, (-6400.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.expandToInclude(range45, 52.0d);
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range41, range45);
        double double60 = range59.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement61 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement61.clear();
        org.jfree.data.Range range65 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean66 = borderArrangement61.equals((java.lang.Object) range65);
        borderArrangement61.clear();
        boolean boolean69 = borderArrangement61.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range72 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double73 = range72.getLength();
        org.jfree.data.Range range75 = org.jfree.data.Range.expandToInclude(range72, (double) (short) 10);
        double double76 = range75.getLowerBound();
        org.jfree.data.Range range78 = org.jfree.data.Range.expandToInclude(range75, (double) 100L);
        org.jfree.data.Range range81 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range84 = org.jfree.data.Range.expand(range81, 100.0d, (double) 100);
        boolean boolean85 = range78.equals((java.lang.Object) range81);
        org.jfree.data.Range range88 = org.jfree.data.Range.expand(range78, (double) 1.0f, (double) 'a');
        boolean boolean89 = borderArrangement61.equals((java.lang.Object) range78);
        org.jfree.data.Range range91 = org.jfree.data.Range.shift(range78, 108.0d);
        org.jfree.data.Range range94 = org.jfree.data.Range.shift(range78, (double) 0L, false);
        boolean boolean95 = range59.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement61", borderArrangement0.equals(borderArrangement61) ? borderArrangement0.hashCode() == borderArrangement61.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double10 = range9.getLength();
        double double12 = range9.constrain(0.0d);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range9, (double) (short) 1, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range9, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, (double) (byte) 1, (double) (-1));
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) range25);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, 100.0d, (double) 100);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range29, (double) ' ');
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, 10.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double40 = range39.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range39, (double) (short) 10);
        double double43 = range42.getLowerBound();
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range42, (double) 100L);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range48, 100.0d, (double) 100);
        boolean boolean52 = range45.equals((java.lang.Object) range48);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range45, (double) 1.0f, (double) 'a');
        boolean boolean56 = range36.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement57 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement57.clear();
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean62 = borderArrangement57.equals((java.lang.Object) range61);
        borderArrangement57.clear();
        org.jfree.data.Range range66 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj67 = new java.lang.Object();
        boolean boolean68 = range66.equals(obj67);
        boolean boolean69 = borderArrangement57.equals(obj67);
        boolean boolean70 = range36.equals((java.lang.Object) borderArrangement57);
        org.jfree.data.Range range71 = org.jfree.data.Range.combine(range25, range36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement57", borderArrangement0.equals(borderArrangement57) ? borderArrangement0.hashCode() == borderArrangement57.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        boolean boolean13 = range7.intersects(0.0d, (double) (byte) 0);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean20 = borderArrangement15.equals((java.lang.Object) range19);
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range26, (double) (short) 10);
        double double30 = range29.getLowerBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) 100L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean39 = range32.equals((java.lang.Object) range35);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range32, (double) 1.0f, (double) 'a');
        boolean boolean43 = borderArrangement15.equals((java.lang.Object) range32);
        borderArrangement15.clear();
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double48 = range47.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range47, (double) (short) 10);
        double double51 = range50.getLowerBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range50, (double) 100L);
        double double54 = range53.getUpperBound();
        boolean boolean55 = borderArrangement15.equals((java.lang.Object) range53);
        boolean boolean56 = borderArrangement0.equals((java.lang.Object) range53);
        java.lang.String str57 = range53.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement15", borderArrangement0.equals(borderArrangement15) ? borderArrangement0.hashCode() == borderArrangement15.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1L));
        boolean boolean11 = borderArrangement7.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = range5.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) range17);
        borderArrangement13.clear();
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = range22.equals(obj23);
        boolean boolean25 = borderArrangement13.equals(obj23);
        boolean boolean26 = borderArrangement7.equals((java.lang.Object) borderArrangement13);
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) 50.0d);
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = range31.equals(obj32);
        boolean boolean36 = range31.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range31, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range31, (double) (short) -1);
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double45 = range44.getLength();
        double double47 = range44.constrain(0.0d);
        java.lang.String str48 = range44.toString();
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range44, (double) (short) 1, true);
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range51, (double) '4');
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range31, range53);
        double double55 = range31.getLowerBound();
        boolean boolean56 = borderArrangement7.equals((java.lang.Object) range31);
        double double57 = range31.getCentralValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement7 and borderArrangement13", borderArrangement7.equals(borderArrangement13) ? borderArrangement7.hashCode() == borderArrangement13.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement0.equals(obj31);
        org.jfree.data.Range range35 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double36 = range35.getLength();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (double) (short) 10);
        double double39 = range38.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean42 = borderArrangement40.equals((java.lang.Object) (-1L));
        boolean boolean44 = borderArrangement40.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = range38.equals((java.lang.Object) borderArrangement40);
        org.jfree.chart.block.BorderArrangement borderArrangement46 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement46.clear();
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean51 = borderArrangement46.equals((java.lang.Object) range50);
        borderArrangement46.clear();
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = range55.equals(obj56);
        boolean boolean58 = borderArrangement46.equals(obj56);
        boolean boolean59 = borderArrangement40.equals((java.lang.Object) borderArrangement46);
        boolean boolean61 = borderArrangement40.equals((java.lang.Object) 50.0d);
        borderArrangement40.clear();
        org.jfree.data.Range range65 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double67 = range65.constrain(10.0d);
        boolean boolean70 = range65.intersects((double) 10.0f, (double) (-1.0f));
        double double72 = range65.constrain(0.0d);
        org.jfree.data.Range range75 = org.jfree.data.Range.expand(range65, (double) 0.0f, (double) ' ');
        double double76 = range75.getUpperBound();
        org.jfree.data.Range range79 = new org.jfree.data.Range(142.0d, 0.0d);
        boolean boolean80 = range75.equals((java.lang.Object) range79);
        boolean boolean81 = borderArrangement40.equals((java.lang.Object) boolean80);
        borderArrangement40.clear();
        boolean boolean83 = borderArrangement0.equals((java.lang.Object) borderArrangement40);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement40 and borderArrangement46", borderArrangement40.equals(borderArrangement46) ? borderArrangement40.hashCode() == borderArrangement46.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1L));
        borderArrangement10.clear();
        boolean boolean14 = range9.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (-1));
        double double23 = range22.getUpperBound();
        boolean boolean26 = range22.intersects(50.0d, 5.0d);
        org.jfree.data.Range range29 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range29.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) (short) 10);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range22, range29);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range22, (double) (byte) 10);
        boolean boolean36 = borderArrangement10.equals((java.lang.Object) range22);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double40 = range39.getUpperBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getCentralValue();
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range43, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range39, range46);
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range46, (double) '4');
        boolean boolean53 = borderArrangement10.equals((java.lang.Object) '4');
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.data.Range range57 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj58 = new java.lang.Object();
        boolean boolean59 = range57.equals(obj58);
        boolean boolean62 = range57.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range65 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double67 = range65.constrain(10.0d);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range57, range65);
        org.jfree.data.Range range71 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj72 = new java.lang.Object();
        boolean boolean73 = range71.equals(obj72);
        boolean boolean76 = range71.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range79 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double81 = range79.constrain(10.0d);
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range71, range79);
        org.jfree.data.Range range83 = org.jfree.data.Range.combine(range57, range71);
        boolean boolean84 = borderArrangement10.equals((java.lang.Object) range57);
        org.jfree.data.Range range87 = org.jfree.data.Range.shift(range57, 48845.0d, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement0 and borderArrangement10", borderArrangement0.equals(borderArrangement10) ? borderArrangement0.hashCode() == borderArrangement10.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 50.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 630.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, 137.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (-1L));
        borderArrangement15.clear();
        boolean boolean19 = range14.equals((java.lang.Object) borderArrangement15);
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement15.add(block20, obj21);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (-1));
        double double28 = range27.getUpperBound();
        boolean boolean31 = range27.intersects(50.0d, 5.0d);
        org.jfree.data.Range range34 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double35 = range34.getLength();
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range34, (double) (short) 10);
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range27, range34);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range27, (double) (byte) 10);
        boolean boolean41 = borderArrangement15.equals((java.lang.Object) range27);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean49 = borderArrangement44.equals((java.lang.Object) range48);
        borderArrangement44.clear();
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double56 = range55.getLength();
        org.jfree.data.Range range58 = org.jfree.data.Range.expandToInclude(range55, (double) (short) 10);
        double double59 = range58.getLowerBound();
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range58, (double) 100L);
        org.jfree.data.Range range64 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range64, 100.0d, (double) 100);
        boolean boolean68 = range61.equals((java.lang.Object) range64);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range61, (double) 1.0f, (double) 'a');
        boolean boolean72 = borderArrangement44.equals((java.lang.Object) range61);
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        org.jfree.data.Range range78 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range81 = org.jfree.data.Range.expand(range78, 100.0d, (double) 100);
        boolean boolean82 = borderArrangement44.equals((java.lang.Object) range81);
        double double84 = range81.constrain((-1.0d));
        double double85 = range81.getCentralValue();
        boolean boolean86 = borderArrangement15.equals((java.lang.Object) double85);
        org.jfree.chart.block.Block block87 = null;
        java.lang.Object obj88 = null;
        borderArrangement15.add(block87, obj88);
        boolean boolean90 = range11.equals((java.lang.Object) block87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement15 and borderArrangement44", borderArrangement15.equals(borderArrangement44) ? borderArrangement15.hashCode() == borderArrangement44.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) 100L);
        boolean boolean17 = range2.equals((java.lang.Object) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double21 = range20.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range20, (double) (short) 10);
        double double24 = range23.getLowerBound();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) (-1L));
        boolean boolean29 = borderArrangement25.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = range23.equals((java.lang.Object) borderArrangement25);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean36 = borderArrangement31.equals((java.lang.Object) range35);
        borderArrangement31.clear();
        org.jfree.data.Range range40 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = range40.equals(obj41);
        boolean boolean43 = borderArrangement31.equals(obj41);
        boolean boolean44 = borderArrangement25.equals((java.lang.Object) borderArrangement31);
        boolean boolean46 = borderArrangement25.equals((java.lang.Object) 50.0d);
        borderArrangement25.clear();
        boolean boolean48 = range2.equals((java.lang.Object) borderArrangement25);
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range2, (-6400.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on borderArrangement25 and borderArrangement31", borderArrangement25.equals(borderArrangement31) ? borderArrangement25.hashCode() == borderArrangement31.hashCode() : true);
    }
}

