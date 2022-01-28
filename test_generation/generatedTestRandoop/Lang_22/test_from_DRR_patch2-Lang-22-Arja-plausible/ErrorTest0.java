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
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        java.lang.String str10 = fraction9.toString();
        java.lang.String str11 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.negate();
        java.lang.String str14 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '#');
        java.lang.String str19 = fraction18.toString();
        int int20 = fraction18.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction9.multiplyBy(fraction18);
        short short23 = fraction18.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction18 and fraction22", (fraction18.compareTo(fraction22) == 0) == fraction18.equals(fraction22));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean2 = fraction0.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        float float6 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean9 = fraction7.equals((java.lang.Object) '4');
        int int10 = fraction7.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean13 = fraction11.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction7.multiplyBy(fraction15);
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        float float20 = fraction19.floatValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean23 = fraction21.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction21.multiplyBy(fraction24);
        int int26 = fraction24.intValue();
        int int27 = fraction24.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction19.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction18.multiplyBy(fraction19);
        double double31 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction16.multiplyBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        float float34 = fraction33.floatValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean37 = fraction35.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction35.multiplyBy(fraction38);
        int int40 = fraction38.intValue();
        int int41 = fraction38.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction38.reduce();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction33.add(fraction42);
        int int44 = fraction42.getProperWhole();
        boolean boolean45 = fraction32.equals((java.lang.Object) fraction42);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str49 = fraction48.toString();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction32.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean53 = fraction51.equals((java.lang.Object) '4');
        int int54 = fraction51.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean57 = fraction55.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction51.multiplyBy(fraction59);
        java.lang.String str61 = fraction60.toString();
        java.lang.String str62 = fraction60.toString();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction60.reduce();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction60.negate();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction48.subtract(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction3.subtract(fraction64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction48 and fraction50", (fraction48.compareTo(fraction50) == 0) == fraction48.equals(fraction50));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-4), 8);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean5 = fraction3.equals((java.lang.Object) '4');
        int int6 = fraction3.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean9 = fraction7.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction3.multiplyBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE;
        float float16 = fraction15.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean19 = fraction17.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        int int22 = fraction20.intValue();
        int int23 = fraction20.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction15.add(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction14.multiplyBy(fraction15);
        double double27 = fraction14.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction12.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean31 = fraction29.equals((java.lang.Object) '4');
        int int32 = fraction29.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction29.invert();
        int int34 = fraction33.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction12.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.reduce();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction2.divideBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction(0, 0, (int) 'a');
        boolean boolean43 = fraction33.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction38", (fraction2.compareTo(fraction38) == 0) == fraction2.equals(fraction38));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        float float13 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean16 = fraction14.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction14.multiplyBy(fraction17);
        int int19 = fraction17.intValue();
        int int20 = fraction17.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction11.multiplyBy(fraction12);
        double double24 = fraction11.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction9.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        float float27 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean30 = fraction28.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction28.multiplyBy(fraction31);
        int int33 = fraction31.intValue();
        int int34 = fraction31.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.reduce();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.add(fraction35);
        int int37 = fraction35.getProperWhole();
        boolean boolean38 = fraction25.equals((java.lang.Object) fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str42 = fraction41.toString();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction25.multiplyBy(fraction41);
        short short44 = fraction25.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction41 and fraction43", (fraction41.compareTo(fraction43) == 0) == fraction41.equals(fraction43));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        float float13 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean16 = fraction14.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction14.multiplyBy(fraction17);
        int int19 = fraction17.intValue();
        int int20 = fraction17.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction11.multiplyBy(fraction12);
        double double24 = fraction11.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction9.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        float float27 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean30 = fraction28.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction28.multiplyBy(fraction31);
        int int33 = fraction31.intValue();
        int int34 = fraction31.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.reduce();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.add(fraction35);
        int int37 = fraction35.getProperWhole();
        boolean boolean38 = fraction25.equals((java.lang.Object) fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str42 = fraction41.toString();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction25.multiplyBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean46 = fraction44.equals((java.lang.Object) '4');
        int int47 = fraction44.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean50 = fraction48.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction48.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction44.multiplyBy(fraction52);
        java.lang.String str54 = fraction53.toString();
        java.lang.String str55 = fraction53.toString();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction53.reduce();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction53.negate();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction41.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean61 = fraction59.equals((java.lang.Object) '4');
        int int62 = fraction59.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean65 = fraction63.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction67 = fraction63.multiplyBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction59.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction70 = fraction68.divideBy(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean73 = fraction71.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction75 = fraction71.multiplyBy(fraction74);
        int int76 = fraction74.intValue();
        double double77 = fraction74.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction70.divideBy(fraction74);
        int int79 = fraction74.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction80 = fraction58.add(fraction74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction41 and fraction43", (fraction41.compareTo(fraction43) == 0) == fraction41.equals(fraction43));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean4 = fraction0.equals((java.lang.Object) fraction3);
        boolean boolean6 = fraction3.equals((java.lang.Object) (short) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.subtract(fraction8);
        java.lang.String str10 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE;
        float float14 = fraction13.floatValue();
        boolean boolean15 = fraction12.equals((java.lang.Object) fraction13);
        long long16 = fraction13.longValue();
        int int17 = fraction3.compareTo(fraction13);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean20 = fraction18.equals((java.lang.Object) '4');
        int int21 = fraction18.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean24 = fraction22.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction18.multiplyBy(fraction26);
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE;
        float float31 = fraction30.floatValue();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean34 = fraction32.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction32.multiplyBy(fraction35);
        int int37 = fraction35.intValue();
        int int38 = fraction35.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction35.reduce();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction30.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction29.multiplyBy(fraction30);
        double double42 = fraction29.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction27.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        float float45 = fraction44.floatValue();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean48 = fraction46.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction46.multiplyBy(fraction49);
        int int51 = fraction49.intValue();
        int int52 = fraction49.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction49.reduce();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction44.add(fraction53);
        int int55 = fraction53.getProperWhole();
        boolean boolean56 = fraction43.equals((java.lang.Object) fraction53);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str60 = fraction59.toString();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction43.multiplyBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean64 = fraction62.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction66 = fraction62.multiplyBy(fraction65);
        int int67 = fraction65.intValue();
        int int68 = fraction65.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction65.reduce();
        int int70 = fraction65.intValue();
        int int71 = fraction65.getProperNumerator();
        java.lang.String str72 = fraction65.toProperString();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction61.divideBy(fraction65);
        boolean boolean74 = fraction3.equals((java.lang.Object) fraction65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction59 and fraction61", (fraction59.compareTo(fraction61) == 0) == fraction59.equals(fraction61));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        float float13 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean16 = fraction14.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction14.multiplyBy(fraction17);
        int int19 = fraction17.intValue();
        int int20 = fraction17.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction11.multiplyBy(fraction12);
        double double24 = fraction11.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction9.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        float float27 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean30 = fraction28.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction28.multiplyBy(fraction31);
        int int33 = fraction31.intValue();
        int int34 = fraction31.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.reduce();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.add(fraction35);
        int int37 = fraction35.getProperWhole();
        boolean boolean38 = fraction25.equals((java.lang.Object) fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str42 = fraction41.toString();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction25.multiplyBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean46 = fraction44.equals((java.lang.Object) '4');
        int int47 = fraction44.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean50 = fraction48.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction48.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction44.multiplyBy(fraction52);
        java.lang.String str54 = fraction53.toString();
        java.lang.String str55 = fraction53.toString();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction53.reduce();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction53.negate();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction41.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean61 = fraction59.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE;
        float float63 = fraction62.floatValue();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction62.abs();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction59.divideBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.ONE;
        float float68 = fraction67.floatValue();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean71 = fraction69.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction73 = fraction69.multiplyBy(fraction72);
        int int74 = fraction72.intValue();
        int int75 = fraction72.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction72.reduce();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction67.add(fraction76);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction66.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction81 = fraction79.subtract(fraction80);
        boolean boolean82 = fraction78.equals((java.lang.Object) fraction80);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction59.add(fraction80);
        org.apache.commons.lang3.math.Fraction fraction84 = fraction59.reduce();
        int int85 = fraction58.compareTo(fraction59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction41 and fraction43", (fraction41.compareTo(fraction43) == 0) == fraction41.equals(fraction43));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        float float12 = fraction11.floatValue();
        boolean boolean13 = fraction10.equals((java.lang.Object) fraction11);
        long long14 = fraction11.longValue();
        int int15 = fraction0.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1));
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.pow((int) (short) 3);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean28 = fraction26.equals((java.lang.Object) '4');
        int int29 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean32 = fraction30.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction30.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction26.multiplyBy(fraction34);
        java.lang.String str36 = fraction35.toString();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.ONE;
        float float39 = fraction38.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean42 = fraction40.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction44 = fraction40.multiplyBy(fraction43);
        int int45 = fraction43.intValue();
        int int46 = fraction43.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction43.reduce();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction38.add(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction37.multiplyBy(fraction38);
        double double50 = fraction37.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction35.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.ONE;
        float float53 = fraction52.floatValue();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean56 = fraction54.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction54.multiplyBy(fraction57);
        int int59 = fraction57.intValue();
        int int60 = fraction57.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction57.reduce();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction52.add(fraction61);
        int int63 = fraction61.getProperWhole();
        boolean boolean64 = fraction51.equals((java.lang.Object) fraction61);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        java.lang.String str68 = fraction67.toString();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction51.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean72 = fraction70.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction74 = fraction70.multiplyBy(fraction73);
        int int75 = fraction73.intValue();
        int int76 = fraction73.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction73.reduce();
        int int78 = fraction73.intValue();
        int int79 = fraction73.getProperNumerator();
        java.lang.String str80 = fraction73.toProperString();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction69.divideBy(fraction73);
        boolean boolean82 = fraction25.equals((java.lang.Object) fraction69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction67 and fraction69", (fraction67.compareTo(fraction69) == 0) == fraction67.equals(fraction69));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1));
        int int2 = fraction1.getProperNumerator();
        float float3 = fraction1.floatValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        float float5 = fraction4.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean8 = fraction6.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.multiplyBy(fraction9);
        int int11 = fraction9.intValue();
        int int12 = fraction9.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction4.add(fraction13);
        int int15 = fraction13.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction13.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction(2, (int) (byte) 100, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction1.add(fraction20);
        int int23 = fraction1.getDenominator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction20 and fraction21", (fraction20.compareTo(fraction21) == 0) == fraction20.equals(fraction21));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.getNumerator();
        int int5 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, 10, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1));
        java.lang.String str13 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.negate();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction1.add(fraction9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction14 and fraction15", (fraction14.compareTo(fraction15) == 0) == fraction14.equals(fraction15));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) '4');
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean6 = fraction4.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction8);
        java.lang.String str10 = fraction9.toString();
        java.lang.String str11 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.negate();
        java.lang.String str14 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '#');
        java.lang.String str19 = fraction18.toString();
        int int20 = fraction18.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction9.multiplyBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction(12, (int) (byte) 23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction18.subtract(fraction25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction18 and fraction22", (fraction18.compareTo(fraction22) == 0) == fraction18.equals(fraction22));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("110");
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, (int) (byte) 10, 1);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean8 = fraction6.equals((java.lang.Object) '4');
        int int9 = fraction6.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean12 = fraction10.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.multiplyBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction6.multiplyBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        java.lang.String str17 = fraction15.toString();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction15.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction5.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 4, (int) (byte) 4, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.divideBy(fraction23);
        boolean boolean25 = fraction1.equals((java.lang.Object) fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 1);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1));
        org.apache.commons.lang3.math.Fraction fraction32 = fraction29.add(fraction31);
        double double33 = fraction29.doubleValue();
        int int34 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction1.subtract(fraction28);
        int int37 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, (int) ' ', 2);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        java.lang.String str43 = fraction41.toString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean46 = fraction44.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction48 = fraction44.multiplyBy(fraction47);
        int int49 = fraction47.intValue();
        int int50 = fraction47.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction47.reduce();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction51.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction41.divideBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction1.subtract(fraction51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction41 and fraction54", (fraction41.compareTo(fraction54) == 0) == fraction41.equals(fraction54));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-17));
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, (int) ' ', 2);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean11 = fraction9.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.multiplyBy(fraction12);
        long long14 = fraction9.longValue();
        java.lang.String str15 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean18 = fraction16.equals((java.lang.Object) '4');
        int int19 = fraction16.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction16.invert();
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE;
        boolean boolean24 = fraction22.equals((java.lang.Object) '4');
        int int25 = fraction22.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        boolean boolean28 = fraction26.equals((java.lang.Object) 52);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction22.multiplyBy(fraction30);
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction20.multiplyBy(fraction31);
        boolean boolean34 = fraction9.equals((java.lang.Object) fraction20);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) '4');
        int int37 = fraction36.getProperWhole();
        long long38 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction20.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction6.subtract(fraction20);
        int int41 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction1.subtract(fraction20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction1 and fraction6", (fraction1.compareTo(fraction6) == 0) == fraction1.equals(fraction6));
    }
}

