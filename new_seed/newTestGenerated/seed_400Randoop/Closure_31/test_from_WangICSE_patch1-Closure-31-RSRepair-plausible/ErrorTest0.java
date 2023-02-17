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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node17 = node16.removeChildren();
        com.google.javascript.rhino.Node node18 = node1.useSourceInfoIfMissingFrom(node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) '4');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node2 = node1.removeChildren();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        java.lang.String str6 = node1.checkTreeEquals(node4);
        boolean boolean7 = node1.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = node1.getJSDocInfo();
        boolean boolean9 = node1.isDebugger();
        boolean boolean10 = node1.isTrue();
        boolean boolean11 = node1.isVoid();
        boolean boolean12 = node1.isIf();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int15 = node14.getChildCount();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node18 = node17.removeChildren();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node21 = node20.removeChildren();
        java.lang.String str22 = node17.checkTreeEquals(node20);
        boolean boolean23 = node17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = node17.getJSDocInfo();
        boolean boolean25 = node17.isDebugger();
        boolean boolean26 = node17.isTrue();
        com.google.javascript.rhino.Node node27 = node14.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node28 = node1.clonePropsFrom(node14);
        boolean boolean29 = node1.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node33 = node32.removeChildren();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node36 = node35.removeChildren();
        java.lang.String str37 = node32.checkTreeEquals(node35);
        boolean boolean38 = node32.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = node32.getJSDocInfo();
        boolean boolean40 = node32.isDebugger();
        boolean boolean41 = node32.isTrue();
        boolean boolean42 = node32.isVoid();
        boolean boolean43 = node32.isIf();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int46 = node45.getChildCount();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node49 = node48.removeChildren();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node52 = node51.removeChildren();
        java.lang.String str53 = node48.checkTreeEquals(node51);
        boolean boolean54 = node48.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = node48.getJSDocInfo();
        boolean boolean56 = node48.isDebugger();
        boolean boolean57 = node48.isTrue();
        com.google.javascript.rhino.Node node58 = node45.copyInformationFrom(node48);
        com.google.javascript.rhino.Node node59 = node32.clonePropsFrom(node45);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 40);
        boolean boolean62 = node61.isGetProp();
        boolean boolean63 = node61.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node45, node61);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int17 = node16.getChildCount();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node20 = node19.removeChildren();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        java.lang.String str24 = node19.checkTreeEquals(node22);
        boolean boolean25 = node19.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node19.getJSDocInfo();
        boolean boolean27 = node19.isDebugger();
        boolean boolean28 = node19.isTrue();
        com.google.javascript.rhino.Node node29 = node16.copyInformationFrom(node19);
        node29.setSourceEncodedPositionForTree((int) (short) 0);
        node29.setLineno((int) ' ');
        boolean boolean34 = node29.isCatch();
        boolean boolean35 = node29.isDebugger();
        com.google.javascript.rhino.Node node36 = node4.srcrefTree(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node4.getChildAtIndex(1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node1.siblings();
        boolean boolean4 = node1.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node1.getChildAtIndex(45);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node17 = node16.removeChildren();
        com.google.javascript.rhino.Node node18 = node1.useSourceInfoIfMissingFrom(node16);
        boolean boolean19 = node16.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node16.getChildAtIndex(10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(41);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        boolean boolean15 = node4.isNE();
        boolean boolean16 = node4.isArrayLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("NUMBER 40.0", 36, (int) (short) 100);
        int int21 = node20.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node4.getChildBefore(node20);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int5 = node4.getChildCount();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node11 = node10.removeChildren();
        java.lang.String str12 = node7.checkTreeEquals(node10);
        boolean boolean13 = node7.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = node7.getJSDocInfo();
        boolean boolean15 = node7.isDebugger();
        boolean boolean16 = node7.isTrue();
        com.google.javascript.rhino.Node node17 = node4.copyInformationFrom(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int20 = node19.getChildCount();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node26 = node25.removeChildren();
        java.lang.String str27 = node22.checkTreeEquals(node25);
        boolean boolean28 = node22.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = node22.getJSDocInfo();
        boolean boolean30 = node22.isDebugger();
        boolean boolean31 = node22.isTrue();
        com.google.javascript.rhino.Node node32 = node19.copyInformationFrom(node22);
        node32.setSourceEncodedPositionForTree((int) (short) 0);
        node32.setLineno((int) ' ');
        boolean boolean37 = node32.isCatch();
        boolean boolean38 = node32.isDebugger();
        com.google.javascript.rhino.Node node39 = node7.srcrefTree(node32);
        boolean boolean40 = node7.isString();
        boolean boolean41 = node7.isQualifiedName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node7.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node1.getChildBefore(node7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node17 = node16.removeChildren();
        com.google.javascript.rhino.Node node18 = node1.useSourceInfoIfMissingFrom(node16);
        boolean boolean19 = node1.isQuotedString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node22 = node21.removeChildren();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node25 = node24.removeChildren();
        java.lang.String str26 = node21.checkTreeEquals(node24);
        boolean boolean27 = node21.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = node21.getJSDocInfo();
        boolean boolean29 = node21.isDebugger();
        boolean boolean30 = node21.isTrue();
        boolean boolean31 = node21.isFromExterns();
        boolean boolean32 = node21.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node21);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        boolean boolean15 = node14.isComma();
        node14.putIntProp(37, 36);
        node14.setDouble(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node14.getChildAtIndex(29);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber(40.0d);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node4 = node3.removeChildren();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node7 = node6.removeChildren();
        java.lang.String str8 = node3.checkTreeEquals(node6);
        boolean boolean9 = node3.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = node3.getJSDocInfo();
        boolean boolean11 = node3.isDebugger();
        boolean boolean12 = node3.isTrue();
        boolean boolean13 = node3.isVoid();
        boolean boolean14 = node3.isIf();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int17 = node16.getChildCount();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node20 = node19.removeChildren();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        java.lang.String str24 = node19.checkTreeEquals(node22);
        boolean boolean25 = node19.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node19.getJSDocInfo();
        boolean boolean27 = node19.isDebugger();
        boolean boolean28 = node19.isTrue();
        com.google.javascript.rhino.Node node29 = node16.copyInformationFrom(node19);
        com.google.javascript.rhino.Node node30 = node3.clonePropsFrom(node16);
        com.google.javascript.rhino.jstype.JSType jSType31 = node16.getJSType();
        boolean boolean32 = node16.isVar();
        java.lang.String str36 = node16.toString(false, false, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node1.getChildBefore(node16);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        node14.setSourceEncodedPositionForTree((int) (short) 0);
        node14.setLineno((int) ' ');
        boolean boolean19 = node14.isCatch();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node22 = node21.removeChildren();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node25 = node24.removeChildren();
        java.lang.String str26 = node21.checkTreeEquals(node24);
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node21);
        node21.putIntProp(51, 8);
        boolean boolean31 = node21.isCatch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int34 = node33.getChildCount();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node37 = node36.removeChildren();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node40 = node39.removeChildren();
        java.lang.String str41 = node36.checkTreeEquals(node39);
        boolean boolean42 = node36.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = node36.getJSDocInfo();
        boolean boolean44 = node36.isDebugger();
        boolean boolean45 = node36.isTrue();
        com.google.javascript.rhino.Node node46 = node33.copyInformationFrom(node36);
        boolean boolean47 = node36.isHook();
        boolean boolean48 = node36.isCall();
        java.lang.String str49 = node36.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node36);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int17 = node16.getChildCount();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node20 = node19.removeChildren();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        java.lang.String str24 = node19.checkTreeEquals(node22);
        boolean boolean25 = node19.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node19.getJSDocInfo();
        boolean boolean27 = node19.isDebugger();
        boolean boolean28 = node19.isTrue();
        com.google.javascript.rhino.Node node29 = node16.copyInformationFrom(node19);
        node29.setSourceEncodedPositionForTree((int) (short) 0);
        node29.setLineno((int) ' ');
        boolean boolean34 = node29.isCatch();
        boolean boolean35 = node29.isDebugger();
        com.google.javascript.rhino.Node node36 = node4.srcrefTree(node29);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int41 = node40.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node40.siblings();
        node40.setSourceFileForTesting("");
        com.google.javascript.rhino.Node[] nodeArray45 = new com.google.javascript.rhino.Node[] { node40 };
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) '#', nodeArray45, (int) (short) 1, 1);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int52 = node51.getChildCount();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node55 = node54.removeChildren();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node58 = node57.removeChildren();
        java.lang.String str59 = node54.checkTreeEquals(node57);
        boolean boolean60 = node54.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = node54.getJSDocInfo();
        boolean boolean62 = node54.isDebugger();
        boolean boolean63 = node54.isTrue();
        com.google.javascript.rhino.Node node64 = node51.copyInformationFrom(node54);
        node64.setSourceEncodedPositionForTree((int) (short) 0);
        node64.setLineno((int) ' ');
        boolean boolean69 = node64.isCatch();
        boolean boolean70 = node64.isDebugger();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int73 = node72.getChildCount();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node76 = node75.removeChildren();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node79 = node78.removeChildren();
        java.lang.String str80 = node75.checkTreeEquals(node78);
        boolean boolean81 = node75.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = node75.getJSDocInfo();
        boolean boolean83 = node75.isDebugger();
        boolean boolean84 = node75.isTrue();
        com.google.javascript.rhino.Node node85 = node72.copyInformationFrom(node75);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node88 = node87.removeChildren();
        com.google.javascript.rhino.Node node89 = node72.useSourceInfoIfMissingFrom(node87);
        boolean boolean90 = node72.isTypeOf();
        com.google.javascript.rhino.Node node91 = node64.copyInformationFromForTree(node72);
        node48.putProp((int) (byte) 1, (java.lang.Object) node64);
        node29.putProp(40, (java.lang.Object) node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node95 = node64.getChildAtIndex(46);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node2 = node1.removeChildren();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        java.lang.String str6 = node1.checkTreeEquals(node4);
        boolean boolean7 = node1.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = node1.getJSDocInfo();
        boolean boolean9 = node1.isDebugger();
        boolean boolean10 = node1.isTrue();
        boolean boolean11 = node1.isVoid();
        boolean boolean12 = node1.isIf();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int15 = node14.getChildCount();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node18 = node17.removeChildren();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node21 = node20.removeChildren();
        java.lang.String str22 = node17.checkTreeEquals(node20);
        boolean boolean23 = node17.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = node17.getJSDocInfo();
        boolean boolean25 = node17.isDebugger();
        boolean boolean26 = node17.isTrue();
        com.google.javascript.rhino.Node node27 = node14.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node28 = node1.clonePropsFrom(node14);
        node28.setCharno(1);
        boolean boolean32 = node28.getBooleanProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node35 = node34.removeChildren();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node38 = node37.removeChildren();
        java.lang.String str39 = node34.checkTreeEquals(node37);
        boolean boolean40 = node34.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = node34.getJSDocInfo();
        boolean boolean42 = node34.isDebugger();
        boolean boolean43 = node34.isTrue();
        boolean boolean44 = node34.isVoid();
        boolean boolean45 = node34.isIf();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int48 = node47.getChildCount();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node51 = node50.removeChildren();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node54 = node53.removeChildren();
        java.lang.String str55 = node50.checkTreeEquals(node53);
        boolean boolean56 = node50.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = node50.getJSDocInfo();
        boolean boolean58 = node50.isDebugger();
        boolean boolean59 = node50.isTrue();
        com.google.javascript.rhino.Node node60 = node47.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node61 = node34.clonePropsFrom(node47);
        boolean boolean62 = node47.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node28.getChildBefore(node47);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        boolean boolean15 = node4.isHook();
        boolean boolean16 = node4.isCall();
        java.lang.String str17 = node4.toStringTree();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int20 = node19.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node19.siblings();
        node19.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node26 = node25.removeChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node29 = node28.removeChildren();
        java.lang.String str30 = node25.checkTreeEquals(node28);
        boolean boolean31 = node25.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = node25.getJSDocInfo();
        boolean boolean33 = node25.isDebugger();
        boolean boolean34 = node25.isTrue();
        boolean boolean35 = node25.isFromExterns();
        boolean boolean36 = node25.isOptionalArg();
        com.google.javascript.rhino.Node node37 = node19.copyInformationFrom(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node37);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING ", 1, 8);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node3.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int17 = node16.getChildCount();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node20 = node19.removeChildren();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        java.lang.String str24 = node19.checkTreeEquals(node22);
        boolean boolean25 = node19.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node19.getJSDocInfo();
        boolean boolean27 = node19.isDebugger();
        boolean boolean28 = node19.isTrue();
        com.google.javascript.rhino.Node node29 = node16.copyInformationFrom(node19);
        node29.setSourceEncodedPositionForTree((int) (short) 0);
        node29.setLineno((int) ' ');
        boolean boolean34 = node29.isCatch();
        boolean boolean35 = node29.isDebugger();
        com.google.javascript.rhino.Node node36 = node4.srcrefTree(node29);
        boolean boolean37 = node4.isString();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 40);
        boolean boolean40 = node39.isGetProp();
        boolean boolean41 = node39.isUnscopedQualifiedName();
        boolean boolean42 = node39.isAssignAdd();
        java.lang.String str43 = node39.toString();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int46 = node45.getChildCount();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node49 = node48.removeChildren();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node52 = node51.removeChildren();
        java.lang.String str53 = node48.checkTreeEquals(node51);
        boolean boolean54 = node48.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = node48.getJSDocInfo();
        boolean boolean56 = node48.isDebugger();
        boolean boolean57 = node48.isTrue();
        com.google.javascript.rhino.Node node58 = node45.copyInformationFrom(node48);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node61 = node60.removeChildren();
        com.google.javascript.rhino.Node node62 = node45.useSourceInfoIfMissingFrom(node60);
        com.google.javascript.rhino.Node node63 = node39.copyInformationFrom(node45);
        boolean boolean64 = node39.isIf();
        int int66 = node39.getIntProp(0);
        boolean boolean67 = node39.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node39);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NUMBER 1.0\n", 49, 30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(32);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        node14.setSourceEncodedPositionForTree((int) (short) 0);
        node14.setLineno((int) ' ');
        boolean boolean19 = node14.isAnd();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(44, 37, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node14.getChildBefore(node23);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        boolean boolean15 = node4.isDelProp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int18 = node17.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node17.siblings();
        node17.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node24 = node23.removeChildren();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node27 = node26.removeChildren();
        java.lang.String str28 = node23.checkTreeEquals(node26);
        boolean boolean29 = node23.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = node23.getJSDocInfo();
        boolean boolean31 = node23.isDebugger();
        boolean boolean32 = node23.isTrue();
        boolean boolean33 = node23.isFromExterns();
        boolean boolean34 = node23.isOptionalArg();
        com.google.javascript.rhino.Node node35 = node17.copyInformationFrom(node23);
        node17.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node4.getChildBefore(node17);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        boolean boolean3 = node1.isNew();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "STRING ");
        int int4 = node2.getIntProp(12);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int7 = node6.getChildCount();
        boolean boolean8 = node6.isThrow();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int12 = node11.getChildCount();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node15 = node14.removeChildren();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node18 = node17.removeChildren();
        java.lang.String str19 = node14.checkTreeEquals(node17);
        boolean boolean20 = node14.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = node14.getJSDocInfo();
        boolean boolean22 = node14.isDebugger();
        boolean boolean23 = node14.isTrue();
        com.google.javascript.rhino.Node node24 = node11.copyInformationFrom(node14);
        double double25 = node14.getDouble();
        boolean boolean26 = node14.isNull();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int29 = node28.getChildCount();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node32 = node31.removeChildren();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node35 = node34.removeChildren();
        java.lang.String str36 = node31.checkTreeEquals(node34);
        boolean boolean37 = node31.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = node31.getJSDocInfo();
        boolean boolean39 = node31.isDebugger();
        boolean boolean40 = node31.isTrue();
        com.google.javascript.rhino.Node node41 = node28.copyInformationFrom(node31);
        boolean boolean42 = node31.isNE();
        node31.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40);
        boolean boolean47 = node46.isGetProp();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int50 = node49.getChildCount();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node53 = node52.removeChildren();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node56 = node55.removeChildren();
        java.lang.String str57 = node52.checkTreeEquals(node55);
        boolean boolean58 = node52.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = node52.getJSDocInfo();
        boolean boolean60 = node52.isDebugger();
        boolean boolean61 = node52.isTrue();
        com.google.javascript.rhino.Node node62 = node49.copyInformationFrom(node52);
        node62.setSourceEncodedPositionForTree((int) (short) 0);
        int int66 = node62.getIntProp((int) (short) 100);
        com.google.javascript.rhino.Node node67 = node46.useSourceInfoFromForTree(node62);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node70 = node69.removeChildren();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node73 = node72.removeChildren();
        java.lang.String str74 = node69.checkTreeEquals(node72);
        boolean boolean75 = node69.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = node69.getJSDocInfo();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) 100, node14, node31, node62, node69, 46, (int) (byte) 1);
        boolean boolean80 = node31.isIn();
        com.google.javascript.rhino.Node node81 = node6.copyInformationFrom(node31);
        node6.setLineno(4);
        int int84 = node6.getSourceOffset();
        boolean boolean85 = node6.isLabel();
        boolean boolean86 = node6.isContinue();
        node6.addSuppression("NUMBER 1.0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node2.getChildBefore(node6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        double double15 = node4.getDouble();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node18 = node17.removeChildren();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node21 = node20.removeChildren();
        java.lang.String str22 = node17.checkTreeEquals(node20);
        java.util.Set<java.lang.String> strSet23 = node17.getDirectives();
        int int24 = node4.getIndexOfChild(node17);
        boolean boolean25 = node4.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node4.getChildAtIndex(38);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node1.siblings();
        boolean boolean4 = node1.isComma();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int7 = node6.getChildCount();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node10 = node9.removeChildren();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node13 = node12.removeChildren();
        java.lang.String str14 = node9.checkTreeEquals(node12);
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = node9.getJSDocInfo();
        boolean boolean17 = node9.isDebugger();
        boolean boolean18 = node9.isTrue();
        com.google.javascript.rhino.Node node19 = node6.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node22 = node21.removeChildren();
        com.google.javascript.rhino.Node node23 = node6.useSourceInfoIfMissingFrom(node21);
        boolean boolean24 = node23.isQualifiedName();
        boolean boolean25 = node23.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node23);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node2 = node1.removeChildren();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        java.lang.String str6 = node1.checkTreeEquals(node4);
        boolean boolean7 = node1.isEmpty();
        boolean boolean8 = node1.isNull();
        boolean boolean9 = node1.isIn();
        boolean boolean10 = node1.hasChildren();
        node1.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int16 = node15.getChildCount();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node19 = node18.removeChildren();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node22 = node21.removeChildren();
        java.lang.String str23 = node18.checkTreeEquals(node21);
        boolean boolean24 = node18.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = node18.getJSDocInfo();
        boolean boolean26 = node18.isDebugger();
        boolean boolean27 = node18.isTrue();
        com.google.javascript.rhino.Node node28 = node15.copyInformationFrom(node18);
        node28.setSourceEncodedPositionForTree((int) (short) 0);
        node28.setLineno((int) ' ');
        boolean boolean33 = node28.isAnd();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int36 = node35.getChildCount();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node39 = node38.removeChildren();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node42 = node41.removeChildren();
        java.lang.String str43 = node38.checkTreeEquals(node41);
        boolean boolean44 = node38.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = node38.getJSDocInfo();
        boolean boolean46 = node38.isDebugger();
        boolean boolean47 = node38.isTrue();
        com.google.javascript.rhino.Node node48 = node35.copyInformationFrom(node38);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int51 = node50.getChildCount();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node54 = node53.removeChildren();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node57 = node56.removeChildren();
        java.lang.String str58 = node53.checkTreeEquals(node56);
        boolean boolean59 = node53.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = node53.getJSDocInfo();
        boolean boolean61 = node53.isDebugger();
        boolean boolean62 = node53.isTrue();
        com.google.javascript.rhino.Node node63 = node50.copyInformationFrom(node53);
        node63.setSourceEncodedPositionForTree((int) (short) 0);
        node63.setLineno((int) ' ');
        boolean boolean68 = node63.isCatch();
        boolean boolean69 = node63.isDebugger();
        com.google.javascript.rhino.Node node70 = node38.srcrefTree(node63);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node73 = node72.removeChildren();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node76 = node75.removeChildren();
        java.lang.String str77 = node72.checkTreeEquals(node75);
        boolean boolean78 = node72.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = node72.getJSDocInfo();
        boolean boolean80 = node72.isDebugger();
        boolean boolean81 = node72.isTrue();
        boolean boolean82 = node72.isFromExterns();
        boolean boolean83 = node72.isOptionalArg();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node28, node70, node72, 15, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node70);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node17 = node16.removeChildren();
        com.google.javascript.rhino.Node node18 = node1.useSourceInfoIfMissingFrom(node16);
        boolean boolean19 = node1.isQuotedString();
        boolean boolean20 = node1.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node1.getChildAtIndex(54);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int3 = node2.getChildCount();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node6 = node5.removeChildren();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node9 = node8.removeChildren();
        java.lang.String str10 = node5.checkTreeEquals(node8);
        boolean boolean11 = node5.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = node5.getJSDocInfo();
        boolean boolean13 = node5.isDebugger();
        boolean boolean14 = node5.isTrue();
        com.google.javascript.rhino.Node node15 = node2.copyInformationFrom(node5);
        double double16 = node5.getDouble();
        boolean boolean17 = node5.isNull();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int20 = node19.getChildCount();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node26 = node25.removeChildren();
        java.lang.String str27 = node22.checkTreeEquals(node25);
        boolean boolean28 = node22.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = node22.getJSDocInfo();
        boolean boolean30 = node22.isDebugger();
        boolean boolean31 = node22.isTrue();
        com.google.javascript.rhino.Node node32 = node19.copyInformationFrom(node22);
        boolean boolean33 = node22.isNE();
        node22.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 40);
        boolean boolean38 = node37.isGetProp();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int41 = node40.getChildCount();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node44 = node43.removeChildren();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node47 = node46.removeChildren();
        java.lang.String str48 = node43.checkTreeEquals(node46);
        boolean boolean49 = node43.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = node43.getJSDocInfo();
        boolean boolean51 = node43.isDebugger();
        boolean boolean52 = node43.isTrue();
        com.google.javascript.rhino.Node node53 = node40.copyInformationFrom(node43);
        node53.setSourceEncodedPositionForTree((int) (short) 0);
        int int57 = node53.getIntProp((int) (short) 100);
        com.google.javascript.rhino.Node node58 = node37.useSourceInfoFromForTree(node53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node61 = node60.removeChildren();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node64 = node63.removeChildren();
        java.lang.String str65 = node60.checkTreeEquals(node63);
        boolean boolean66 = node60.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = node60.getJSDocInfo();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (byte) 100, node5, node22, node53, node60, 46, (int) (byte) 1);
        com.google.javascript.rhino.Node node71 = node70.cloneNode();
        com.google.javascript.rhino.Node node72 = node71.cloneNode();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(0, "STRING ");
        int int77 = node75.getIntProp(12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node72.removeChild(node75);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        node14.setSourceEncodedPositionForTree((int) (short) 0);
        node14.setLineno((int) ' ');
        boolean boolean19 = node14.isCatch();
        boolean boolean20 = node14.isDebugger();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int23 = node22.getChildCount();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node26 = node25.removeChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node29 = node28.removeChildren();
        java.lang.String str30 = node25.checkTreeEquals(node28);
        boolean boolean31 = node25.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = node25.getJSDocInfo();
        boolean boolean33 = node25.isDebugger();
        boolean boolean34 = node25.isTrue();
        com.google.javascript.rhino.Node node35 = node22.copyInformationFrom(node25);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node38 = node37.removeChildren();
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoIfMissingFrom(node37);
        boolean boolean40 = node22.isTypeOf();
        com.google.javascript.rhino.Node node41 = node14.copyInformationFromForTree(node22);
        boolean boolean42 = node14.isNot();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node45 = node44.removeChildren();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node48 = node47.removeChildren();
        java.lang.String str49 = node44.checkTreeEquals(node47);
        boolean boolean50 = node44.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = node44.getJSDocInfo();
        boolean boolean52 = node44.isDebugger();
        boolean boolean53 = node44.isTrue();
        boolean boolean54 = node44.isVoid();
        boolean boolean55 = node44.isIf();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int58 = node57.getChildCount();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node61 = node60.removeChildren();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node64 = node63.removeChildren();
        java.lang.String str65 = node60.checkTreeEquals(node63);
        boolean boolean66 = node60.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = node60.getJSDocInfo();
        boolean boolean68 = node60.isDebugger();
        boolean boolean69 = node60.isTrue();
        com.google.javascript.rhino.Node node70 = node57.copyInformationFrom(node60);
        com.google.javascript.rhino.Node node71 = node44.clonePropsFrom(node57);
        boolean boolean72 = node57.isRegExp();
        com.google.javascript.rhino.Node node73 = node57.getLastSibling();
        boolean boolean74 = node73.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node73);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        double double15 = node4.getDouble();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node18 = node17.removeChildren();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node21 = node20.removeChildren();
        java.lang.String str22 = node17.checkTreeEquals(node20);
        java.util.Set<java.lang.String> strSet23 = node17.getDirectives();
        int int24 = node4.getIndexOfChild(node17);
        com.google.javascript.rhino.Node node26 = node4.getAncestor((int) ' ');
        boolean boolean27 = node4.isWhile();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int30 = node29.getChildCount();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node33 = node32.removeChildren();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node36 = node35.removeChildren();
        java.lang.String str37 = node32.checkTreeEquals(node35);
        boolean boolean38 = node32.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = node32.getJSDocInfo();
        boolean boolean40 = node32.isDebugger();
        boolean boolean41 = node32.isTrue();
        com.google.javascript.rhino.Node node42 = node29.copyInformationFrom(node32);
        boolean boolean43 = node32.isNE();
        node32.detachChildren();
        int int45 = node32.getLength();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int48 = node47.getChildCount();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node51 = node50.removeChildren();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node54 = node53.removeChildren();
        java.lang.String str55 = node50.checkTreeEquals(node53);
        boolean boolean56 = node50.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = node50.getJSDocInfo();
        boolean boolean58 = node50.isDebugger();
        boolean boolean59 = node50.isTrue();
        com.google.javascript.rhino.Node node60 = node47.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node63 = node62.removeChildren();
        com.google.javascript.rhino.Node node64 = node47.useSourceInfoIfMissingFrom(node62);
        boolean boolean65 = node64.isQualifiedName();
        node64.putIntProp((int) 'a', (int) (short) 1);
        boolean boolean69 = node64.isFromExterns();
        boolean boolean70 = node64.isRegExp();
        boolean boolean71 = node64.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node32, node64);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        int int2 = node1.getChildCount();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node8 = node7.removeChildren();
        java.lang.String str9 = node4.checkTreeEquals(node7);
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isDebugger();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFrom(node4);
        node14.setSourceEncodedPositionForTree((int) (short) 0);
        int int18 = node14.getIntProp((int) (short) 100);
        boolean boolean19 = node14.isDefaultCase();
        boolean boolean20 = node14.isNot();
        com.google.javascript.rhino.jstype.JSType jSType21 = node14.getJSType();
        boolean boolean22 = node14.isSyntheticBlock();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "NUMBER 40.0\n    NUMBER 40.0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node14.getChildBefore(node25);
    }
}

